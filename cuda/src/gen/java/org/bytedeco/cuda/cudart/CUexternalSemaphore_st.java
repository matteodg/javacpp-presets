// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA external semaphore
 */
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUexternalSemaphore_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUexternalSemaphore_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUexternalSemaphore_st(Pointer p) { super(p); }
}
