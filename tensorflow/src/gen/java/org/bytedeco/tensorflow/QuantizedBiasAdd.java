// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Adds Tensor 'bias' to Tensor 'input' for Quantized types.
 * 
 *  Broadcasts the values of bias on dimensions 0..N-2 of 'input'.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * bias: A 1D bias Tensor with size matching the last dimension of 'input'.
 *  * min_input: The float value that the lowest quantized input value represents.
 *  * max_input: The float value that the highest quantized input value represents.
 *  * min_bias: The float value that the lowest quantized bias value represents.
 *  * max_bias: The float value that the highest quantized bias value represents.
 * 
 *  Returns:
 *  * {@code Output} output
 *  * {@code Output} min_out: The float value that the lowest quantized output value represents.
 *  * {@code Output} max_out: The float value that the highest quantized output value represents. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QuantizedBiasAdd extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QuantizedBiasAdd(Pointer p) { super(p); }

  public QuantizedBiasAdd(@Const @ByRef Scope scope, @ByVal Input input,
                   @ByVal Input bias, @ByVal Input min_input,
                   @ByVal Input max_input, @ByVal Input min_bias,
                   @ByVal Input max_bias, @Cast("tensorflow::DataType") int out_type) { super((Pointer)null); allocate(scope, input, bias, min_input, max_input, min_bias, max_bias, out_type); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                   @ByVal Input bias, @ByVal Input min_input,
                   @ByVal Input max_input, @ByVal Input min_bias,
                   @ByVal Input max_bias, @Cast("tensorflow::DataType") int out_type);

  public native @ByRef Operation operation(); public native QuantizedBiasAdd operation(Operation setter);
  public native @ByRef Output output(); public native QuantizedBiasAdd output(Output setter);
  public native @ByRef Output min_out(); public native QuantizedBiasAdd min_out(Output setter);
  public native @ByRef Output max_out(); public native QuantizedBiasAdd max_out(Output setter);
}
