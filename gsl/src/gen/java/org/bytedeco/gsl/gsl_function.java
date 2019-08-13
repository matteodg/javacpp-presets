// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* Definition of an arbitrary function with parameters */

@Name("gsl_function_struct") @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_function extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_function() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_function(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_function(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_function position(long position) {
        return (gsl_function)super.position(position);
    }

  public static class Function_double_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Function_double_Pointer(Pointer p) { super(p); }
      protected Function_double_Pointer() { allocate(); }
      private native void allocate();
      public native double call(double x, Pointer params);
  }
  public native Function_double_Pointer function(); public native gsl_function function(Function_double_Pointer setter);
  public native Pointer params(); public native gsl_function params(Pointer setter);
}
