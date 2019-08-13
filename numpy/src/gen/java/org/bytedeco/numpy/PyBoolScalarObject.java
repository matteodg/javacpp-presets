// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


// #ifndef _MULTIARRAYMODULE
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyBoolScalarObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyBoolScalarObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyBoolScalarObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyBoolScalarObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyBoolScalarObject position(long position) {
        return (PyBoolScalarObject)super.position(position);
    }

        public native @ByRef PyObject ob_base(); public native PyBoolScalarObject ob_base(PyObject setter);
        public native @Cast("npy_bool") byte obval(); public native PyBoolScalarObject obval(byte setter);
}
