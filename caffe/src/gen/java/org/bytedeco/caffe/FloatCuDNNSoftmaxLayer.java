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


// #ifdef USE_CUDNN
/**
 * \brief cuDNN implementation of SoftmaxLayer.
 *        Fallback to SoftmaxLayer for CPU mode.
 */
@Platform(value = {"linux-x86_64", "macosx-x86_64"}, extension = "-gpu") @Name("caffe::CuDNNSoftmaxLayer<float>") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class FloatCuDNNSoftmaxLayer extends FloatSoftmaxLayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatCuDNNSoftmaxLayer(Pointer p) { super(p); }

  public FloatCuDNNSoftmaxLayer(@Const @ByRef LayerParameter param) { super((Pointer)null); allocate(param); }
  private native @Platform(value = {"linux-x86_64", "macosx-x86_64"}, extension = "-gpu") void allocate(@Const @ByRef LayerParameter param);
  @Virtual public native void LayerSetUp(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);
  @Virtual public native void Reshape(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);
  @Virtual protected native void Forward_gpu(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);
  @Virtual protected native void Backward_gpu(@Const @ByRef FloatBlobVector top,
       @Const @ByRef BoolVector propagate_down, @Const @ByRef FloatBlobVector bottom);
}
