// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class FILE_FULL_DIR_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FILE_FULL_DIR_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FILE_FULL_DIR_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FILE_FULL_DIR_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FILE_FULL_DIR_INFO position(long position) {
        return (FILE_FULL_DIR_INFO)super.position(position);
    }

    public native @Cast("ULONG") long NextEntryOffset(); public native FILE_FULL_DIR_INFO NextEntryOffset(long setter);
    public native @Cast("ULONG") long FileIndex(); public native FILE_FULL_DIR_INFO FileIndex(long setter);
    public native @ByRef LARGE_INTEGER CreationTime(); public native FILE_FULL_DIR_INFO CreationTime(LARGE_INTEGER setter);
    public native @ByRef LARGE_INTEGER LastAccessTime(); public native FILE_FULL_DIR_INFO LastAccessTime(LARGE_INTEGER setter);
    public native @ByRef LARGE_INTEGER LastWriteTime(); public native FILE_FULL_DIR_INFO LastWriteTime(LARGE_INTEGER setter);
    public native @ByRef LARGE_INTEGER ChangeTime(); public native FILE_FULL_DIR_INFO ChangeTime(LARGE_INTEGER setter);
    public native @ByRef LARGE_INTEGER EndOfFile(); public native FILE_FULL_DIR_INFO EndOfFile(LARGE_INTEGER setter);
    public native @ByRef LARGE_INTEGER AllocationSize(); public native FILE_FULL_DIR_INFO AllocationSize(LARGE_INTEGER setter);
    public native @Cast("ULONG") long FileAttributes(); public native FILE_FULL_DIR_INFO FileAttributes(long setter);
    public native @Cast("ULONG") long FileNameLength(); public native FILE_FULL_DIR_INFO FileNameLength(long setter);
    public native @Cast("ULONG") long EaSize(); public native FILE_FULL_DIR_INFO EaSize(long setter);
    public native @Cast("WCHAR") char FileName(int i); public native FILE_FULL_DIR_INFO FileName(int i, char setter);
    @MemberGetter public native @Cast("WCHAR*") CharPointer FileName();
}
