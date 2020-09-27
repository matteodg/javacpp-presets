// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libecl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libecl.global.libecl.*;

@Properties(inherit = org.bytedeco.libecl.presets.libecl.class)
public class double_ftype extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    double_ftype(Pointer p) { super(p); }
    protected double_ftype() { allocate(); }
    private native void allocate();
    public native double call(double arg0);
}
