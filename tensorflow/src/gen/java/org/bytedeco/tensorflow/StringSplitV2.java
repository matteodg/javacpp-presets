// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Split elements of {@code source} based on {@code sep} into a {@code SparseTensor}.
 * 
 *  Let N be the size of source (typically N will be the batch size). Split each
 *  element of {@code source} based on {@code sep} and return a {@code SparseTensor}
 *  containing the split tokens. Empty tokens are ignored.
 * 
 *  For example, N = 2, source[0] is 'hello world' and source[1] is 'a b c',
 *  then the output will be
 *  <pre>{@code
 *  st.indices = [0, 0;
 *                0, 1;
 *                1, 0;
 *                1, 1;
 *                1, 2]
 *  st.shape = [2, 3]
 *  st.values = ['hello', 'world', 'a', 'b', 'c']
 *  }</pre>
 * 
 *  If {@code sep} is given, consecutive delimiters are not grouped together and are
 *  deemed to delimit empty strings. For example, source of {@code "1<>2<><>3"} and
 *  sep of {@code "<>"} returns {@code ["1", "2", "", "3"]}. If {@code sep} is None or an empty
 *  string, consecutive whitespace are regarded as a single separator, and the
 *  result will contain no empty strings at the startor end if the string has
 *  leading or trailing whitespace.
 * 
 *  Note that the above mentioned behavior matches python's str.split.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: {@code 1-D} string {@code Tensor}, the strings to split.
 *  * sep: {@code 0-D} string {@code Tensor}, the delimiter character.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * maxsplit: An {@code int}. If {@code maxsplit > 0}, limit of the split of the result.
 * 
 *  Returns:
 *  * {@code Output} indices
 *  * {@code Output} values
 *  * {@code Output} shape */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringSplitV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringSplitV2(Pointer p) { super(p); }

  /** Optional attribute setters for StringSplitV2 */
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
  
    /** An {@code int}. If {@code maxsplit > 0}, limit of the split of the result.
     * 
     *  Defaults to -1 */
    public native @ByVal Attrs Maxsplit(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long maxsplit_(); public native Attrs maxsplit_(long setter);
  }
  public StringSplitV2(@Const @ByRef Scope scope, @ByVal Input input,
                @ByVal Input sep) { super((Pointer)null); allocate(scope, input, sep); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                @ByVal Input sep);
  public StringSplitV2(@Const @ByRef Scope scope, @ByVal Input input,
                @ByVal Input sep, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, sep, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                @ByVal Input sep, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs Maxsplit(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native StringSplitV2 operation(Operation setter);
  public native @ByRef Output indices(); public native StringSplitV2 indices(Output setter);
  public native @ByRef Output values(); public native StringSplitV2 values(Output setter);
  public native @ByRef Output shape(); public native StringSplitV2 shape(Output setter);
}
