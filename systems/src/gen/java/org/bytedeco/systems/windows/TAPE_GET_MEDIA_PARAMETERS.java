// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
// IOCTL_TAPE_GET_MEDIA_PARAMETERS definitions
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TAPE_GET_MEDIA_PARAMETERS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TAPE_GET_MEDIA_PARAMETERS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TAPE_GET_MEDIA_PARAMETERS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TAPE_GET_MEDIA_PARAMETERS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TAPE_GET_MEDIA_PARAMETERS position(long position) {
        return (TAPE_GET_MEDIA_PARAMETERS)super.position(position);
    }

    public native @ByRef LARGE_INTEGER Capacity(); public native TAPE_GET_MEDIA_PARAMETERS Capacity(LARGE_INTEGER setter);
    public native @ByRef LARGE_INTEGER Remaining(); public native TAPE_GET_MEDIA_PARAMETERS Remaining(LARGE_INTEGER setter);
    public native @Cast("DWORD") int BlockSize(); public native TAPE_GET_MEDIA_PARAMETERS BlockSize(int setter);
    public native @Cast("DWORD") int PartitionCount(); public native TAPE_GET_MEDIA_PARAMETERS PartitionCount(int setter);
    public native @Cast("BOOLEAN") boolean WriteProtected(); public native TAPE_GET_MEDIA_PARAMETERS WriteProtected(boolean setter);
}
