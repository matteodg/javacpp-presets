// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Opaque @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX(Pointer p) { super(p); }
}
