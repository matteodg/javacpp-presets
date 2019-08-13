// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

  @Name("tensorflow::EnumToDataType<tensorflow::DT_FLOAT>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EnumToDataType extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public EnumToDataType() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public EnumToDataType(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public EnumToDataType(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public EnumToDataType position(long position) {
          return (EnumToDataType)super.position(position);
      }
  
  }
