// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_stitching;

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
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;
import org.bytedeco.opencv.opencv_xfeatures2d.*;
import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;

import static org.bytedeco.opencv.global.opencv_stitching.*;



@Name("cv::detail::PlaneWarperGpu") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class DetailPlaneWarperGpu extends RotationWarper {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DetailPlaneWarperGpu(Pointer p) { super(p); }

    public DetailPlaneWarperGpu(float scale/*=1.f*/) { super((Pointer)null); allocate(scale); }
    private native void allocate(float scale/*=1.f*/);
    public DetailPlaneWarperGpu() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal Mat K, @ByVal Mat R, @ByVal Mat xmap, @ByVal Mat ymap);
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal UMat K, @ByVal UMat R, @ByVal UMat xmap, @ByVal UMat ymap);
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal GpuMat K, @ByVal GpuMat R, @ByVal GpuMat xmap, @ByVal GpuMat ymap);

    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal Mat K, @ByVal Mat R, @ByVal Mat T, @ByVal Mat xmap, @ByVal Mat ymap);
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal UMat K, @ByVal UMat R, @ByVal UMat T, @ByVal UMat xmap, @ByVal UMat ymap);
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal GpuMat K, @ByVal GpuMat R, @ByVal GpuMat T, @ByVal GpuMat xmap, @ByVal GpuMat ymap);

    public native @ByVal Point warp(@ByVal Mat src, @ByVal Mat K, @ByVal Mat R, int interp_mode, int border_mode,
                   @ByVal Mat dst);
    public native @ByVal Point warp(@ByVal UMat src, @ByVal UMat K, @ByVal UMat R, int interp_mode, int border_mode,
                   @ByVal UMat dst);
    public native @ByVal Point warp(@ByVal GpuMat src, @ByVal GpuMat K, @ByVal GpuMat R, int interp_mode, int border_mode,
                   @ByVal GpuMat dst);

    public native @ByVal Point warp(@ByVal Mat src, @ByVal Mat K, @ByVal Mat R, @ByVal Mat T, int interp_mode, int border_mode,
                   @ByVal Mat dst);
    public native @ByVal Point warp(@ByVal UMat src, @ByVal UMat K, @ByVal UMat R, @ByVal UMat T, int interp_mode, int border_mode,
                   @ByVal UMat dst);
    public native @ByVal Point warp(@ByVal GpuMat src, @ByVal GpuMat K, @ByVal GpuMat R, @ByVal GpuMat T, int interp_mode, int border_mode,
                   @ByVal GpuMat dst);

    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal Mat K, @ByVal Mat R, @ByRef GpuMat xmap, @ByRef GpuMat ymap);
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal UMat K, @ByVal UMat R, @ByRef GpuMat xmap, @ByRef GpuMat ymap);

    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal Mat K, @ByVal Mat R, @ByVal Mat T, @ByRef GpuMat xmap, @ByRef GpuMat ymap);
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal UMat K, @ByVal UMat R, @ByVal UMat T, @ByRef GpuMat xmap, @ByRef GpuMat ymap);

    public native @ByVal Point warp(@Const @ByRef GpuMat src, @ByVal Mat K, @ByVal Mat R, int interp_mode, int border_mode,
                   @ByRef GpuMat dst);
    public native @ByVal Point warp(@Const @ByRef GpuMat src, @ByVal UMat K, @ByVal UMat R, int interp_mode, int border_mode,
                   @ByRef GpuMat dst);

    public native @ByVal Point warp(@Const @ByRef GpuMat src, @ByVal Mat K, @ByVal Mat R, @ByVal Mat T, int interp_mode, int border_mode,
                   @ByRef GpuMat dst);
    public native @ByVal Point warp(@Const @ByRef GpuMat src, @ByVal UMat K, @ByVal UMat R, @ByVal UMat T, int interp_mode, int border_mode,
                   @ByRef GpuMat dst);
}
