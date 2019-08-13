// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Opaque @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class _ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public _ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION(Pointer p) { super(p); }
}
