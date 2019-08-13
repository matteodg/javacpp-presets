// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class OSVERSIONINFOEXW extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OSVERSIONINFOEXW() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OSVERSIONINFOEXW(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OSVERSIONINFOEXW(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OSVERSIONINFOEXW position(long position) {
        return (OSVERSIONINFOEXW)super.position(position);
    }

    public native @Cast("DWORD") int dwOSVersionInfoSize(); public native OSVERSIONINFOEXW dwOSVersionInfoSize(int setter);
    public native @Cast("DWORD") int dwMajorVersion(); public native OSVERSIONINFOEXW dwMajorVersion(int setter);
    public native @Cast("DWORD") int dwMinorVersion(); public native OSVERSIONINFOEXW dwMinorVersion(int setter);
    public native @Cast("DWORD") int dwBuildNumber(); public native OSVERSIONINFOEXW dwBuildNumber(int setter);
    public native @Cast("DWORD") int dwPlatformId(); public native OSVERSIONINFOEXW dwPlatformId(int setter);
    public native @Cast("WCHAR") char szCSDVersion(int i); public native OSVERSIONINFOEXW szCSDVersion(int i, char setter);
    @MemberGetter public native @Cast("WCHAR*") CharPointer szCSDVersion();     // Maintenance string for PSS usage
    public native @Cast("WORD") short wServicePackMajor(); public native OSVERSIONINFOEXW wServicePackMajor(short setter);
    public native @Cast("WORD") short wServicePackMinor(); public native OSVERSIONINFOEXW wServicePackMinor(short setter);
    public native @Cast("WORD") short wSuiteMask(); public native OSVERSIONINFOEXW wSuiteMask(short setter);
    public native @Cast("BYTE") byte wProductType(); public native OSVERSIONINFOEXW wProductType(byte setter);
    public native @Cast("BYTE") byte wReserved(); public native OSVERSIONINFOEXW wReserved(byte setter);
}
