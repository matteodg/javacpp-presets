// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Replaces matches of the {@code pattern} regular expression in {@code input} with the
 *  replacement string provided in {@code rewrite}.
 * 
 *  It follows the re2 syntax (https://github.com/google/re2/wiki/Syntax)
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: The text to be processed.
 *  * pattern: The regular expression to be matched in the {@code input} strings.
 *  * rewrite: The rewrite string to be substituted for the {@code pattern} expression where it is
 *  matched in the {@code input} strings.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * replace_global: If True, the replacement is global (that is, all matches of the {@code pattern} regular
 *  expression in each input string are rewritten), otherwise the {@code rewrite}
 *  substitution is only made for the first {@code pattern} match.
 * 
 *  Returns:
 *  * {@code Output}: The text after applying pattern match and rewrite substitution. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RegexReplace extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RegexReplace(Pointer p) { super(p); }

  /** Optional attribute setters for RegexReplace */
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
  
    /** If True, the replacement is global (that is, all matches of the {@code pattern} regular
     *  expression in each input string are rewritten), otherwise the {@code rewrite}
     *  substitution is only made for the first {@code pattern} match.
     * 
     *  Defaults to true */
    public native @ByVal Attrs ReplaceGlobal(@Cast("bool") boolean x);

    public native @Cast("bool") boolean replace_global_(); public native Attrs replace_global_(boolean setter);
  }
  public RegexReplace(@Const @ByRef Scope scope, @ByVal Input input,
               @ByVal Input pattern, @ByVal Input rewrite) { super((Pointer)null); allocate(scope, input, pattern, rewrite); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
               @ByVal Input pattern, @ByVal Input rewrite);
  public RegexReplace(@Const @ByRef Scope scope, @ByVal Input input,
               @ByVal Input pattern, @ByVal Input rewrite, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, pattern, rewrite, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
               @ByVal Input pattern, @ByVal Input rewrite, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs ReplaceGlobal(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native RegexReplace operation(Operation setter);
  public native @ByRef Output output(); public native RegexReplace output(Output setter);
}
