// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns a tensor that may be mutated, but only persists within a single step.
 * 
 *  This is an experimental op for internal use only and it is possible to use this
 *  op in unsafe ways.  DO NOT USE unless you fully understand the risks.
 * 
 *  It is the caller's responsibility to ensure that 'ref' is eventually passed to a
 *  matching 'DestroyTemporaryVariable' op after all other uses have completed.
 * 
 *  Outputs a ref to the tensor state so it may be read or modified.
 * 
 *    E.g.
 *        var = state_ops._temporary_variable([1, 2], types.float_)
 *        var_name = var.op.name
 *        var = state_ops.assign(var, [[4.0, 5.0]])
 *        var = state_ops.assign_add(var, [[6.0, 7.0]])
 *        final = state_ops._destroy_temporary_variable(var, var_name=var_name)
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * shape: The shape of the variable tensor.
 *  * dtype: The type of elements in the variable tensor.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * var_name: Overrides the name used for the temporary variable resource. Default
 *  value is the name of the 'TemporaryVariable' op (which is guaranteed unique).
 * 
 *  Returns:
 *  * {@code Output}: A reference to the variable tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TemporaryVariable extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TemporaryVariable(Pointer p) { super(p); }

  /** Optional attribute setters for TemporaryVariable */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** Overrides the name used for the temporary variable resource. Default
     *  value is the name of the 'TemporaryVariable' op (which is guaranteed unique).
     * 
     *  Defaults to "" */
    public native @ByVal Attrs VarName(@StringPiece BytePointer x);
    public native @ByVal Attrs VarName(@StringPiece String x);

    public native @StringPiece BytePointer var_name_(); public native Attrs var_name_(BytePointer setter);
  }
  public TemporaryVariable(@Const @ByRef Scope scope, @ByVal PartialTensorShape shape,
                    @Cast("tensorflow::DataType") int dtype) { super((Pointer)null); allocate(scope, shape, dtype); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal PartialTensorShape shape,
                    @Cast("tensorflow::DataType") int dtype);
  public TemporaryVariable(@Const @ByRef Scope scope, @ByVal PartialTensorShape shape,
                    @Cast("tensorflow::DataType") int dtype, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, shape, dtype, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal PartialTensorShape shape,
                    @Cast("tensorflow::DataType") int dtype, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs VarName(@StringPiece BytePointer x);
  public static native @ByVal Attrs VarName(@StringPiece String x);

  public native @ByRef Operation operation(); public native TemporaryVariable operation(Operation setter);
  public native @ByRef Output ref(); public native TemporaryVariable ref(Output setter);
}
