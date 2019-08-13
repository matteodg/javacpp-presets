// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Scatters tensor at indices in an input list.
 * 
 *  Each member of the TensorList corresponds to one row of the input tensor,
 *  specified by the given index (see {@code tf.gather}).
 * 
 *  input_handle: The list to scatter into.
 *  tensor: The input tensor.
 *  indices: The indices used to index into the list.
 *  output_handle: The TensorList.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The output_handle tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorListScatterIntoExistingList extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorListScatterIntoExistingList(Pointer p) { super(p); }

  public TensorListScatterIntoExistingList(@Const @ByRef Scope scope,
                                    @ByVal Input input_handle,
                                    @ByVal Input tensor,
                                    @ByVal Input indices) { super((Pointer)null); allocate(scope, input_handle, tensor, indices); }
  private native void allocate(@Const @ByRef Scope scope,
                                    @ByVal Input input_handle,
                                    @ByVal Input tensor,
                                    @ByVal Input indices);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native TensorListScatterIntoExistingList operation(Operation setter);
  public native @ByRef Output output_handle(); public native TensorListScatterIntoExistingList output_handle(Output setter);
}
