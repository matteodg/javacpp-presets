// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.librealsense.global.RealSense.*;

@Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class rs_log_callback_ptr extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    rs_log_callback_ptr(Pointer p) { super(p); }
    protected rs_log_callback_ptr() { allocate(); }
    private native void allocate();
    public native void call(@Cast("rs_log_severity") int min_severity, @Cast("const char*") BytePointer message, Pointer user);
}
