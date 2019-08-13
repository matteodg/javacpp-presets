// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* iteration solver type */
@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_splinalg_itersolve_type extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_splinalg_itersolve_type() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_splinalg_itersolve_type(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_splinalg_itersolve_type(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_splinalg_itersolve_type position(long position) {
        return (gsl_splinalg_itersolve_type)super.position(position);
    }

  public native @Cast("const char*") BytePointer name(); public native gsl_splinalg_itersolve_type name(BytePointer setter);
  public static class Alloc_long_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Alloc_long_long(Pointer p) { super(p); }
      protected Alloc_long_long() { allocate(); }
      private native void allocate();
      public native Pointer call(@Cast("const size_t") long n, @Cast("const size_t") long m);
  }
  public native Alloc_long_long alloc(); public native gsl_splinalg_itersolve_type alloc(Alloc_long_long setter);
  public static class Iterate_gsl_spmatrix_gsl_vector_double_gsl_vector_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Iterate_gsl_spmatrix_gsl_vector_double_gsl_vector_Pointer(Pointer p) { super(p); }
      protected Iterate_gsl_spmatrix_gsl_vector_double_gsl_vector_Pointer() { allocate(); }
      private native void allocate();
      public native int call(@Const gsl_spmatrix A, @Const gsl_vector b,
                    double tol, gsl_vector x, Pointer arg4);
  }
  public native Iterate_gsl_spmatrix_gsl_vector_double_gsl_vector_Pointer iterate(); public native gsl_splinalg_itersolve_type iterate(Iterate_gsl_spmatrix_gsl_vector_double_gsl_vector_Pointer setter);
  public static class Normr_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Normr_Pointer(Pointer p) { super(p); }
      protected Normr_Pointer() { allocate(); }
      private native void allocate();
      public native double call(@Const Pointer arg0);
  }
  public native Normr_Pointer normr(); public native gsl_splinalg_itersolve_type normr(Normr_Pointer setter);
  public static class Free_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Free_Pointer(Pointer p) { super(p); }
      protected Free_Pointer() { allocate(); }
      private native void allocate();
      public native void call(Pointer arg0);
  }
  public native Free_Pointer free(); public native gsl_splinalg_itersolve_type free(Free_Pointer setter);
}
