// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_imageinfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_imageinfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_imageinfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_imageinfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_imageinfo_t position(long position) {
        return (sk_imageinfo_t)super.position(position);
    }

    public native sk_colorspace_t colorspace(); public native sk_imageinfo_t colorspace(sk_colorspace_t setter);
    public native int width(); public native sk_imageinfo_t width(int setter);
    public native int height(); public native sk_imageinfo_t height(int setter);
    public native @Cast("sk_colortype_t") int colorType(); public native sk_imageinfo_t colorType(int setter);
    public native @Cast("sk_alphatype_t") int alphaType(); public native sk_imageinfo_t alphaType(int setter);
}
