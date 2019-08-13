// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/* Typedef for H5Aiterate2() callbacks */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5A_operator2_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5A_operator2_t(Pointer p) { super(p); }
    protected H5A_operator2_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(@Cast("hid_t") long location_id,
    @Cast("const char*") BytePointer attr_name, @Const H5A_info_t ainfo, Pointer op_data);
}
