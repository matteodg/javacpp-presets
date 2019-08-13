// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_photo;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_photo.*;


/** \brief The resulting HDR image is calculated as weighted average of the exposures considering exposure
values and camera response.
<p>
For more information see \cite DM97 .
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_photo.class)
public class MergeDebevec extends MergeExposures {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MergeDebevec(Pointer p) { super(p); }

    public native @Override void process(@ByVal MatVector src, @ByVal Mat dst,
                                     @ByVal Mat times, @ByVal Mat response);
    public native @Override void process(@ByVal UMatVector src, @ByVal Mat dst,
                                     @ByVal Mat times, @ByVal Mat response);
    public native @Override void process(@ByVal GpuMatVector src, @ByVal Mat dst,
                                     @ByVal Mat times, @ByVal Mat response);
    public native @Override void process(@ByVal MatVector src, @ByVal UMat dst,
                                     @ByVal UMat times, @ByVal UMat response);
    public native @Override void process(@ByVal UMatVector src, @ByVal UMat dst,
                                     @ByVal UMat times, @ByVal UMat response);
    public native @Override void process(@ByVal GpuMatVector src, @ByVal UMat dst,
                                     @ByVal UMat times, @ByVal UMat response);
    public native @Override void process(@ByVal MatVector src, @ByVal GpuMat dst,
                                     @ByVal GpuMat times, @ByVal GpuMat response);
    public native @Override void process(@ByVal UMatVector src, @ByVal GpuMat dst,
                                     @ByVal GpuMat times, @ByVal GpuMat response);
    public native @Override void process(@ByVal GpuMatVector src, @ByVal GpuMat dst,
                                     @ByVal GpuMat times, @ByVal GpuMat response);
    public native void process(@ByVal MatVector src, @ByVal Mat dst, @ByVal Mat times);
    public native void process(@ByVal UMatVector src, @ByVal Mat dst, @ByVal Mat times);
    public native void process(@ByVal GpuMatVector src, @ByVal Mat dst, @ByVal Mat times);
    public native void process(@ByVal MatVector src, @ByVal UMat dst, @ByVal UMat times);
    public native void process(@ByVal UMatVector src, @ByVal UMat dst, @ByVal UMat times);
    public native void process(@ByVal GpuMatVector src, @ByVal UMat dst, @ByVal UMat times);
    public native void process(@ByVal MatVector src, @ByVal GpuMat dst, @ByVal GpuMat times);
    public native void process(@ByVal UMatVector src, @ByVal GpuMat dst, @ByVal GpuMat times);
    public native void process(@ByVal GpuMatVector src, @ByVal GpuMat dst, @ByVal GpuMat times);
}
