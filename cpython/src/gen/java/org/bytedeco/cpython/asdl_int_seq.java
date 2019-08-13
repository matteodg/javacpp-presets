// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class asdl_int_seq extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public asdl_int_seq() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public asdl_int_seq(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public asdl_int_seq(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public asdl_int_seq position(long position) {
        return (asdl_int_seq)super.position(position);
    }

    public native @Cast("Py_ssize_t") long size(); public native asdl_int_seq size(long setter);
    public native int elements(int i); public native asdl_int_seq elements(int i, int setter);
    @MemberGetter public native IntPointer elements();
}
