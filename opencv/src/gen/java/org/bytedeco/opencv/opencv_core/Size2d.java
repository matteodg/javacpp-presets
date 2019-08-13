// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("cv::Size_<double>") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Size2d extends DoublePointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Size2d(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Size2d(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Size2d position(long position) {
        return (Size2d)super.position(position);
    }


    /** default constructor */
    public Size2d() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Size2d(double _width, double _height) { super((Pointer)null); allocate(_width, _height); }
    private native void allocate(double _width, double _height);
    public Size2d(@Const @ByRef Size2d sz) { super((Pointer)null); allocate(sz); }
    private native void allocate(@Const @ByRef Size2d sz);
    public Size2d(@Const @ByRef Point2d pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point2d pt);

    public native @ByRef @Name("operator =") Size2d put(@Const @ByRef Size2d sz);
    /** the area (width*height) */
    public native double area();
    /** aspect ratio (width/height) */
    public native double aspectRatio();
    /** true if empty */
    public native @Cast("bool") boolean empty();

    /** conversion of another data type. */

    /** the width */
    public native double width(); public native Size2d width(double setter);
    /** the height */
    public native double height(); public native Size2d height(double setter);
}
