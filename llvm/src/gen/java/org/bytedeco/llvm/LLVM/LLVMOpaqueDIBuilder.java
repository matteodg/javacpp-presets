// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * Represents an LLVM debug info builder.
 *
 * This models llvm::DIBuilder.
 */
@Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMOpaqueDIBuilder extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMOpaqueDIBuilder() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMOpaqueDIBuilder(Pointer p) { super(p); }
}
