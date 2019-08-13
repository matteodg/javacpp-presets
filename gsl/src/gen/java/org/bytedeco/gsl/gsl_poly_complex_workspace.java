// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;



/* Solve for the complex roots of a general real polynomial */

 @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_poly_complex_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_poly_complex_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_poly_complex_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_poly_complex_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_poly_complex_workspace position(long position) {
        return (gsl_poly_complex_workspace)super.position(position);
    }
 
  public native @Cast("size_t") long nc(); public native gsl_poly_complex_workspace nc(long setter);
  public native DoublePointer matrix(); public native gsl_poly_complex_workspace matrix(DoublePointer setter); 
} 
