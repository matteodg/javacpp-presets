// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libecl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libecl.global.libecl.*;

// #endif


/*
  These ifdefs are an attempt to support large files (> 2GB)
  transparently on both Windows and Linux. See source file
  libert_util/src/util_lfs.c for more details.

  During the configure step CMAKE should check the size of (void *)
  and set the ERT_WINDOWS_LFS variable to true if a 64 bit platform is
  detected.
*/

// #ifdef ERT_WINDOWS_LFS
@Opaque @Properties(inherit = org.bytedeco.libecl.presets.libecl.class)
public class stat_type extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public stat_type() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public stat_type(Pointer p) { super(p); }
}
