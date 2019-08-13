// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;
 

@Convention("NTAPI") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PTP_CLEANUP_GROUP_CANCEL_CALLBACK extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PTP_CLEANUP_GROUP_CANCEL_CALLBACK(Pointer p) { super(p); }
    protected PTP_CLEANUP_GROUP_CANCEL_CALLBACK() { allocate(); }
    private native void allocate();
    public native void call(
    @Cast("PVOID") Pointer ObjectContext,
    @Cast("PVOID") Pointer CleanupContext
    );
}
