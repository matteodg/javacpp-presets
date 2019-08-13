// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Holds a tensor or tensor reference. For tensor references, we need
// a mutex to prevent concurrent access to the tensor.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorValue extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorValue(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorValue(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorValue position(long position) {
        return (TensorValue)super.position(position);
    }

  public TensorValue() { super((Pointer)null); allocate(); }
  private native void allocate();
  public TensorValue(Tensor t) { super((Pointer)null); allocate(t); }
  private native void allocate(Tensor t);
  public TensorValue(@Cast("tensorflow::mutex*") Pointer mu, Tensor t) { super((Pointer)null); allocate(mu, t); }
  private native void allocate(@Cast("tensorflow::mutex*") Pointer mu, Tensor t);
  public native @Name("operator ->") Tensor access();
  public native @Cast("bool") boolean is_ref();

  public native @Cast("tensorflow::mutex*") Pointer mutex_if_ref(); public native TensorValue mutex_if_ref(Pointer setter);  // nullptr if not a ref, != nullptr if a ref
  public native Tensor tensor(); public native TensorValue tensor(Tensor setter);
}
