// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libecl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libecl.global.libecl.*;


    @Name("ERT::ecl_type<float>") @Properties(inherit = org.bytedeco.libecl.presets.libecl.class)
public class ecl_type extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public ecl_type() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public ecl_type(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ecl_type(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public ecl_type position(long position) {
            return (ecl_type)super.position(position);
        }
        @Override public ecl_type getPointer(long i) {
            return new ecl_type(this).position(position + i);
        }
     @MemberGetter public static native @Cast("const ecl_type_enum") int type();
public static final int type = type(); }
