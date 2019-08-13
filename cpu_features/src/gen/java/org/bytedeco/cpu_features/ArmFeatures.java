// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpu_features;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpu_features.global.cpu_features.*;


@Namespace("cpu_features") @Properties(inherit = org.bytedeco.cpu_features.presets.cpu_features.class)
public class ArmFeatures extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ArmFeatures() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ArmFeatures(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ArmFeatures(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ArmFeatures position(long position) {
        return (ArmFeatures)super.position(position);
    }

  public native @NoOffset int swp(); public native ArmFeatures swp(int setter);       // SWP instruction (atomic read-modify-write)
  public native @NoOffset int half(); public native ArmFeatures half(int setter);      // Half-word loads and stores
  public native @NoOffset int thumb(); public native ArmFeatures thumb(int setter);     // Thumb (16-bit instruction set)
  public native @NoOffset int _26bit(); public native ArmFeatures _26bit(int setter);    // "26 Bit" Model (Processor status register folded into program counter)
  public native @NoOffset int fastmult(); public native ArmFeatures fastmult(int setter);  // 32x32->64-bit multiplication
  public native @NoOffset int fpa(); public native ArmFeatures fpa(int setter);       // Floating point accelerator
  public native @NoOffset int vfp(); public native ArmFeatures vfp(int setter);       // Vector Floating Point.
  public native @NoOffset int edsp(); public native ArmFeatures edsp(int setter);      // DSP extensions (the 'e' variant of the ARM9 CPUs, and all others above)
  public native @NoOffset int java(); public native ArmFeatures java(int setter);      // Jazelle (Java bytecode accelerator)
  public native @NoOffset int iwmmxt(); public native ArmFeatures iwmmxt(int setter);    // Intel Wireless MMX Technology.
  public native @NoOffset int crunch(); public native ArmFeatures crunch(int setter);    // MaverickCrunch coprocessor
  public native @NoOffset int thumbee(); public native ArmFeatures thumbee(int setter);   // ThumbEE
  public native @NoOffset int neon(); public native ArmFeatures neon(int setter);      // Advanced SIMD.
  public native @NoOffset int vfpv3(); public native ArmFeatures vfpv3(int setter);     // VFP version 3
  public native @NoOffset int vfpv3d16(); public native ArmFeatures vfpv3d16(int setter);  // VFP version 3 with 16 D-registers
  public native @NoOffset int tls(); public native ArmFeatures tls(int setter);       // TLS register
  public native @NoOffset int vfpv4(); public native ArmFeatures vfpv4(int setter);     // VFP version 4 with fast context switching
  public native @NoOffset int idiva(); public native ArmFeatures idiva(int setter);     // SDIV and UDIV hardware division in ARM mode.
  public native @NoOffset int idivt(); public native ArmFeatures idivt(int setter);     // SDIV and UDIV hardware division in Thumb mode.
  public native @NoOffset int vfpd32(); public native ArmFeatures vfpd32(int setter);    // VFP with 32 D-registers
  public native @NoOffset int lpae(); public native ArmFeatures lpae(int setter);      // Large Physical Address Extension (>4GB physical memory on 32-bit architecture)
  public native @NoOffset int evtstrm(); public native ArmFeatures evtstrm(int setter);   // kernel event stream using generic architected timer
  public native @NoOffset int aes(); public native ArmFeatures aes(int setter);       // Hardware-accelerated Advanced Encryption Standard.
  public native @NoOffset int pmull(); public native ArmFeatures pmull(int setter);     // Polynomial multiply long.
  public native @NoOffset int sha1(); public native ArmFeatures sha1(int setter);      // Hardware-accelerated SHA1.
  public native @NoOffset int sha2(); public native ArmFeatures sha2(int setter);      // Hardware-accelerated SHA2-256.
  public native @NoOffset int crc32(); public native ArmFeatures crc32(int setter);     // Hardware-accelerated CRC-32.

  // Make sure to update ArmFeaturesEnum below if you add a field here.
}
