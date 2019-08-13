// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_jpegencoder_options_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_jpegencoder_options_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_jpegencoder_options_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_jpegencoder_options_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_jpegencoder_options_t position(long position) {
        return (sk_jpegencoder_options_t)super.position(position);
    }

    public native int fQuality(); public native sk_jpegencoder_options_t fQuality(int setter);
    public native @Cast("sk_jpegencoder_downsample_t") int fDownsample(); public native sk_jpegencoder_options_t fDownsample(int setter);
    public native @Cast("sk_jpegencoder_alphaoption_t") int fAlphaOption(); public native sk_jpegencoder_options_t fAlphaOption(int setter);
    public native @Cast("sk_transfer_function_behavior_t") int fBlendBehavior(); public native sk_jpegencoder_options_t fBlendBehavior(int setter);
}
