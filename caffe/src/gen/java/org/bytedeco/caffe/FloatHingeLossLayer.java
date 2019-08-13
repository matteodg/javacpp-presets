// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;


/**
 * \brief Computes the hinge loss for a one-of-many classification task.
 *
 * @param bottom input Blob vector (length 2)
 *   -# {@code  (N \times C \times H \times W) }
 *      the predictions {@code  t }, a Blob with values in
 *      {@code  [-\infty, +\infty] } indicating the predicted score for each of
 *      the {@code  K = CHW } classes. In an SVM, {@code  t } is the result of
 *      taking the inner product {@code  X^T W } of the D-dimensional features
 *      {@code  X \in \mathcal{R}^{D \times N} } and the learned hyperplane
 *      parameters {@code  W \in \mathcal{R}^{D \times K} }, so a Net with just
 *      an InnerProductLayer (with num_output = D) providing predictions to a
 *      HingeLossLayer and no other learnable parameters or losses is
 *      equivalent to an SVM.
 *   -# {@code  (N \times 1 \times 1 \times 1) }
 *      the labels {@code  l }, an integer-valued Blob with values
 *      {@code  l_n \in [0, 1, 2, ..., K - 1] }
 *      indicating the correct class label among the {@code  K } classes
 * @param top output Blob vector (length 1)
 *   -# {@code  (1 \times 1 \times 1 \times 1) }
 *      the computed hinge loss: {@code  E =
 *        \frac{1}{N} \sum\limits_{n=1}^N \sum\limits_{k=1}^K
 *        [\max(0, 1 - \delta\{l_n = k\} t_{nk})] ^ p
 *      }, for the {@code  L^p } norm
 *      (defaults to {@code  p = 1 }, the L1 norm; L2 norm, as in L2-SVM,
 *      is also available), and {@code 
 *      \delta\{\mathrm{condition}\} = \left\{
 *         \begin{array}{lr}
 *            1 & \mbox{if condition} \\
 *           -1 & \mbox{otherwise}
 *         \end{array} \right.
 *      }
 *
 * In an SVM, {@code  t \in \mathcal{R}^{N \times K} } is the result of taking
 * the inner product {@code  X^T W } of the features
 * {@code  X \in \mathcal{R}^{D \times N} }
 * and the learned hyperplane parameters
 * {@code  W \in \mathcal{R}^{D \times K} }. So, a Net with just an
 * InnerProductLayer (with num_output = {@code k}) providing predictions to a
 * HingeLossLayer is equivalent to an SVM (assuming it has no other learned
 * outside the InnerProductLayer and no other losses outside the
 * HingeLossLayer).
 */
@Name("caffe::HingeLossLayer<float>") @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class FloatHingeLossLayer extends FloatLossLayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatHingeLossLayer(Pointer p) { super(p); }

  public FloatHingeLossLayer(@Const @ByRef LayerParameter param) { super((Pointer)null); allocate(param); }
  private native void allocate(@Const @ByRef LayerParameter param);

  @Virtual public native @Const({false, false, true}) @Cast("const char*") BytePointer type();
  @Virtual protected native void Forward_cpu(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);
  @Virtual protected native void Backward_cpu(@Const @ByRef FloatBlobVector top,
        @Const @ByRef BoolVector propagate_down, @Const @ByRef FloatBlobVector bottom);
}
