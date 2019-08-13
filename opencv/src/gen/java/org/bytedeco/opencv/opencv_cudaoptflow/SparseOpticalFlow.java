// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudaoptflow;

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
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_ximgproc.*;
import static org.bytedeco.opencv.global.opencv_ximgproc.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_optflow.*;
import static org.bytedeco.opencv.global.opencv_optflow.*;
import org.bytedeco.opencv.opencv_cudaarithm.*;
import static org.bytedeco.opencv.global.opencv_cudaarithm.*;
import org.bytedeco.opencv.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudafilters.*;
import org.bytedeco.opencv.opencv_cudaimgproc.*;
import static org.bytedeco.opencv.global.opencv_cudaimgproc.*;
import static org.bytedeco.opencv.global.opencv_cudawarping.*;

import static org.bytedeco.opencv.global.opencv_cudaoptflow.*;


/** \brief Base interface for sparse optical flow algorithms.
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudaoptflow.class)
public class SparseOpticalFlow extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseOpticalFlow(Pointer p) { super(p); }

    /** \brief Calculates a sparse optical flow.
    <p>
    @param prevImg First input image.
    @param nextImg Second input image of the same size and the same type as prevImg.
    @param prevPts Vector of 2D points for which the flow needs to be found.
    @param nextPts Output vector of 2D points containing the calculated new positions of input features in the second image.
    @param status Output status vector. Each element of the vector is set to 1 if the
                  flow for the corresponding features has been found. Otherwise, it is set to 0.
    @param err Optional output vector that contains error response for each point (inverse confidence).
    @param stream Stream for the asynchronous version.
     */
    public native void calc(@ByVal Mat prevImg, @ByVal Mat nextImg,
                          @ByVal Mat prevPts, @ByVal Mat nextPts,
                          @ByVal Mat status,
                          @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat err,
                          @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void calc(@ByVal Mat prevImg, @ByVal Mat nextImg,
                          @ByVal Mat prevPts, @ByVal Mat nextPts,
                          @ByVal Mat status);
    public native void calc(@ByVal UMat prevImg, @ByVal UMat nextImg,
                          @ByVal UMat prevPts, @ByVal UMat nextPts,
                          @ByVal UMat status,
                          @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat err,
                          @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void calc(@ByVal UMat prevImg, @ByVal UMat nextImg,
                          @ByVal UMat prevPts, @ByVal UMat nextPts,
                          @ByVal UMat status);
    public native void calc(@ByVal GpuMat prevImg, @ByVal GpuMat nextImg,
                          @ByVal GpuMat prevPts, @ByVal GpuMat nextPts,
                          @ByVal GpuMat status,
                          @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat err,
                          @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void calc(@ByVal GpuMat prevImg, @ByVal GpuMat nextImg,
                          @ByVal GpuMat prevPts, @ByVal GpuMat nextPts,
                          @ByVal GpuMat status);
}
