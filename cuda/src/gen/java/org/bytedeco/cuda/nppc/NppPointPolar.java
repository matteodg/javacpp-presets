// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;


/** 
 * 2D Polar Point
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class NppPointPolar extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppPointPolar() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppPointPolar(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppPointPolar(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppPointPolar position(long position) {
        return (NppPointPolar)super.position(position);
    }

    public native @Cast("Npp32f") float rho(); public native NppPointPolar rho(float setter);
    public native @Cast("Npp32f") float theta(); public native NppPointPolar theta(float setter);
}
