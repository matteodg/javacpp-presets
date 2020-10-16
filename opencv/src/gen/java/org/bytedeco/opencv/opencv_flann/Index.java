// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_flann;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_flann.*;


@Namespace("cv::flann") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_flann.class)
public class Index extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Index(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Index(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Index position(long position) {
        return (Index)super.position(position);
    }
    @Override public Index getPointer(long i) {
        return new Index(this).position(position + i);
    }

    public Index() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Index(@ByVal Mat features, @Const @ByRef IndexParams params, @Cast("cvflann::flann_distance_t") int distType/*=cvflann::FLANN_DIST_L2*/) { super((Pointer)null); allocate(features, params, distType); }
    private native void allocate(@ByVal Mat features, @Const @ByRef IndexParams params, @Cast("cvflann::flann_distance_t") int distType/*=cvflann::FLANN_DIST_L2*/);
    public Index(@ByVal Mat features, @Const @ByRef IndexParams params) { super((Pointer)null); allocate(features, params); }
    private native void allocate(@ByVal Mat features, @Const @ByRef IndexParams params);
    public Index(@ByVal UMat features, @Const @ByRef IndexParams params, @Cast("cvflann::flann_distance_t") int distType/*=cvflann::FLANN_DIST_L2*/) { super((Pointer)null); allocate(features, params, distType); }
    private native void allocate(@ByVal UMat features, @Const @ByRef IndexParams params, @Cast("cvflann::flann_distance_t") int distType/*=cvflann::FLANN_DIST_L2*/);
    public Index(@ByVal UMat features, @Const @ByRef IndexParams params) { super((Pointer)null); allocate(features, params); }
    private native void allocate(@ByVal UMat features, @Const @ByRef IndexParams params);
    public Index(@ByVal GpuMat features, @Const @ByRef IndexParams params, @Cast("cvflann::flann_distance_t") int distType/*=cvflann::FLANN_DIST_L2*/) { super((Pointer)null); allocate(features, params, distType); }
    private native void allocate(@ByVal GpuMat features, @Const @ByRef IndexParams params, @Cast("cvflann::flann_distance_t") int distType/*=cvflann::FLANN_DIST_L2*/);
    public Index(@ByVal GpuMat features, @Const @ByRef IndexParams params) { super((Pointer)null); allocate(features, params); }
    private native void allocate(@ByVal GpuMat features, @Const @ByRef IndexParams params);

    public native void build(@ByVal Mat features, @Const @ByRef IndexParams params, @Cast("cvflann::flann_distance_t") int distType/*=cvflann::FLANN_DIST_L2*/);
    public native void build(@ByVal Mat features, @Const @ByRef IndexParams params);
    public native void build(@ByVal UMat features, @Const @ByRef IndexParams params, @Cast("cvflann::flann_distance_t") int distType/*=cvflann::FLANN_DIST_L2*/);
    public native void build(@ByVal UMat features, @Const @ByRef IndexParams params);
    public native void build(@ByVal GpuMat features, @Const @ByRef IndexParams params, @Cast("cvflann::flann_distance_t") int distType/*=cvflann::FLANN_DIST_L2*/);
    public native void build(@ByVal GpuMat features, @Const @ByRef IndexParams params);
    public native void knnSearch(@ByVal Mat query, @ByVal Mat indices,
                       @ByVal Mat dists, int knn, @Const @ByRef(nullValue = "cv::flann::SearchParams()") SearchParams params);
    public native void knnSearch(@ByVal Mat query, @ByVal Mat indices,
                       @ByVal Mat dists, int knn);
    public native void knnSearch(@ByVal UMat query, @ByVal UMat indices,
                       @ByVal UMat dists, int knn, @Const @ByRef(nullValue = "cv::flann::SearchParams()") SearchParams params);
    public native void knnSearch(@ByVal UMat query, @ByVal UMat indices,
                       @ByVal UMat dists, int knn);
    public native void knnSearch(@ByVal GpuMat query, @ByVal GpuMat indices,
                       @ByVal GpuMat dists, int knn, @Const @ByRef(nullValue = "cv::flann::SearchParams()") SearchParams params);
    public native void knnSearch(@ByVal GpuMat query, @ByVal GpuMat indices,
                       @ByVal GpuMat dists, int knn);

    public native int radiusSearch(@ByVal Mat query, @ByVal Mat indices,
                                 @ByVal Mat dists, double radius, int maxResults,
                                 @Const @ByRef(nullValue = "cv::flann::SearchParams()") SearchParams params);
    public native int radiusSearch(@ByVal Mat query, @ByVal Mat indices,
                                 @ByVal Mat dists, double radius, int maxResults);
    public native int radiusSearch(@ByVal UMat query, @ByVal UMat indices,
                                 @ByVal UMat dists, double radius, int maxResults,
                                 @Const @ByRef(nullValue = "cv::flann::SearchParams()") SearchParams params);
    public native int radiusSearch(@ByVal UMat query, @ByVal UMat indices,
                                 @ByVal UMat dists, double radius, int maxResults);
    public native int radiusSearch(@ByVal GpuMat query, @ByVal GpuMat indices,
                                 @ByVal GpuMat dists, double radius, int maxResults,
                                 @Const @ByRef(nullValue = "cv::flann::SearchParams()") SearchParams params);
    public native int radiusSearch(@ByVal GpuMat query, @ByVal GpuMat indices,
                                 @ByVal GpuMat dists, double radius, int maxResults);

    public native void save(@Str BytePointer filename);
    public native void save(@Str String filename);
    public native @Cast("bool") boolean load(@ByVal Mat features, @Str BytePointer filename);
    public native @Cast("bool") boolean load(@ByVal Mat features, @Str String filename);
    public native @Cast("bool") boolean load(@ByVal UMat features, @Str String filename);
    public native @Cast("bool") boolean load(@ByVal UMat features, @Str BytePointer filename);
    public native @Cast("bool") boolean load(@ByVal GpuMat features, @Str BytePointer filename);
    public native @Cast("bool") boolean load(@ByVal GpuMat features, @Str String filename);
    public native void release();
    public native @Cast("cvflann::flann_distance_t") int getDistance();
    public native @Cast("cvflann::flann_algorithm_t") int getAlgorithm();
}
