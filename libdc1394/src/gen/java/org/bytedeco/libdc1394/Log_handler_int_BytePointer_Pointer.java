// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.libdc1394;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libdc1394.global.dc1394.*;

// #endif

/**
 * dc1394_log_register_handler: register log handler for reporting error, warning or debug statements
 * Passing NULL as argument turns off this log level.
 * @param log_handler [in] : pointer to a function which takes a character string as argument
 *             type: the type of log
 * @param type [in] : message type (\a debug, \a err or \a warning)
 * @param message [in] : log message
 */
@Properties(inherit = org.bytedeco.libdc1394.presets.dc1394.class)
public class Log_handler_int_BytePointer_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Log_handler_int_BytePointer_Pointer(Pointer p) { super(p); }
    protected Log_handler_int_BytePointer_Pointer() { allocate(); }
    private native void allocate();
    public native void call(@Cast("dc1394log_t") int type,
                                          @Cast("const char*") BytePointer message, Pointer user);
}
