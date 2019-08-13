// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Gradients for Local Response Normalization.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input_grads: 4-D with shape {@code [batch, height, width, channels]}.
 *  * input_image: 4-D with shape {@code [batch, height, width, channels]}.
 *  * output_image: 4-D with shape {@code [batch, height, width, channels]}.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * depth_radius: A depth radius.
 *  * bias: An offset (usually > 0 to avoid dividing by 0).
 *  * alpha: A scale factor, usually positive.
 *  * beta: An exponent.
 * 
 *  Returns:
 *  * {@code Output}: The gradients for LRN. */
@Namespace("tensorflow::ops::internal") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class LRNGrad extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LRNGrad(Pointer p) { super(p); }

  /** Optional attribute setters for LRNGrad */
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
  
    /** A depth radius.
     * 
     *  Defaults to 5 */
    
    ///
    public native @ByVal Attrs DepthRadius(@Cast("tensorflow::int64") long x);

    /** An offset (usually > 0 to avoid dividing by 0).
     * 
     *  Defaults to 1 */
    
    ///
    public native @ByVal Attrs Bias(float x);

    /** A scale factor, usually positive.
     * 
     *  Defaults to 1 */
    
    ///
    public native @ByVal Attrs Alpha(float x);

    /** An exponent.
     * 
     *  Defaults to 0.5 */
    public native @ByVal Attrs Beta(float x);

    public native @Cast("tensorflow::int64") long depth_radius_(); public native Attrs depth_radius_(long setter);
    public native float bias_(); public native Attrs bias_(float setter);
    public native float alpha_(); public native Attrs alpha_(float setter);
    public native float beta_(); public native Attrs beta_(float setter);
  }
  public LRNGrad(@Const @ByRef Scope scope, @ByVal Input input_grads,
          @ByVal Input input_image, @ByVal Input output_image) { super((Pointer)null); allocate(scope, input_grads, input_image, output_image); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_grads,
          @ByVal Input input_image, @ByVal Input output_image);
  public LRNGrad(@Const @ByRef Scope scope, @ByVal Input input_grads,
          @ByVal Input input_image, @ByVal Input output_image,
          @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input_grads, input_image, output_image, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_grads,
          @ByVal Input input_image, @ByVal Input output_image,
          @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs DepthRadius(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Bias(float x);
  public static native @ByVal Attrs Alpha(float x);
  public static native @ByVal Attrs Beta(float x);

  public native @ByRef Operation operation(); public native LRNGrad operation(Operation setter);
  public native @ByRef Output output(); public native LRNGrad output(Output setter);
}
