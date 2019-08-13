// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Compute the regularized incomplete beta integral \(I_x(a, b)\).
 * 
 *  The regularized incomplete beta integral is defined as:
 * 
 * 
 *  \(I_x(a, b) = \frac{B(x; a, b)}{B(a, b)}\)
 * 
 *  where
 * 
 * 
 *  \(B(x; a, b) = \int_0^x t^{a-1} (1 - t)^{b-1} dt\)
 * 
 * 
 *  is the incomplete beta function and \(B(a, b)\) is the *complete*
 *  beta function.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The z tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Betainc extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Betainc(Pointer p) { super(p); }

  public Betainc(@Const @ByRef Scope scope, @ByVal Input a,
          @ByVal Input b, @ByVal Input x) { super((Pointer)null); allocate(scope, a, b, x); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input a,
          @ByVal Input b, @ByVal Input x);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Betainc operation(Operation setter);
  public native @ByRef Output z(); public native Betainc z(Output setter);
}
