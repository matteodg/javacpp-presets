// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes softplus gradients for a softplus operation.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * gradients: The backpropagated gradients to the corresponding softplus operation.
 *  * features: The features passed as input to the corresponding softplus operation.
 * 
 *  Returns:
 *  * {@code Output}: The gradients: {@code gradients / (1 + exp(-features))}. */
@Namespace("tensorflow::ops::internal") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SoftplusGrad extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftplusGrad(Pointer p) { super(p); }

  public SoftplusGrad(@Const @ByRef Scope scope, @ByVal Input gradients,
               @ByVal Input features) { super((Pointer)null); allocate(scope, gradients, features); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input gradients,
               @ByVal Input features);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native SoftplusGrad operation(Operation setter);
  public native @ByRef Output backprops(); public native SoftplusGrad backprops(Output setter);
}
