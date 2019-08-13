// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;


/**
 * \file pix.h
 *
 * <pre>
 *   Valid image types in leptonica:
 *       Pix: 1 bpp, with and without colormap
 *       Pix: 2 bpp, with and without colormap
 *       Pix: 4 bpp, with and without colormap
 *       Pix: 8 bpp, with and without colormap
 *       Pix: 16 bpp (1 spp)
 *       Pix: 32 bpp (rgb, 3 spp)
 *       Pix: 32 bpp (rgba, 4 spp)
 *       FPix: 32 bpp float
 *       DPix: 64 bpp double
 *       Notes:
 *          (1) The only valid Pix image type with alpha is rgba.
 *              In particular, the alpha component is not used in
 *              cmapped images.
 *          (2) PixComp can hold any Pix with IFF_PNG encoding.
 *
 *   Contents:
 *
 *   (1) This file defines most of the image-related structs used in leptonica:
 *         struct Pix
 *         struct PixColormap
 *         struct RGBA_Quad
 *         struct Pixa
 *         struct Pixaa
 *         struct Box
 *         struct Boxa
 *         struct Boxaa
 *         struct Pta
 *         struct Ptaa
 *         struct Pixacc
 *         struct PixTiling
 *         struct FPix
 *         struct FPixa
 *         struct DPix
 *         struct PixComp
 *         struct PixaComp
 *
 *   (2) This file has definitions for:
 *         Colors for RGBA
 *         Colors for drawing boxes
 *         Perceptual color weights
 *         Colormap conversion flags
 *         Rasterop bit flags
 *         Structure access flags (for insert, copy, clone, copy-clone)
 *         Sorting flags (by type and direction)
 *         Blending flags
 *         Graphics pixel setting flags
 *         Size and location filter flags
 *         Color component selection flags
 *         16-bit conversion flags
 *         Rotation and shear flags
 *         Affine transform order flags
 *         Grayscale filling flags
 *         Flags for setting to white or black
 *         Flags for getting white or black pixel value
 *         Flags for 8 and 16 bit pixel sums
 *         Dithering flags
 *         Distance flags
 *         Value flags
 *         Statistical measures
 *         Set selection flags
 *         Text orientation flags
 *         Edge orientation flags
 *         Line orientation flags
 *         Image orientation flags
 *         Scan direction flags
 *         Box size adjustment flags
 *         Flags for modifying box boundaries using a second box
 *         Handling overlapping bounding boxes in boxa
 *         Flags for replacing invalid boxes
 *         Flags for box corners
 *         Horizontal warp
 *         Pixel selection for resampling
 *         Thinning flags
 *         Runlength flags
 *         Edge filter flags
 *         Subpixel color component ordering in LCD display
 *         HSV histogram flags
 *         Region flags (inclusion, exclusion)
 *         Flags for adding text to a pix
 *         Flags for plotting on a pix
 *         Flags for making simple masks
 *         Flags for selecting display program
 *         Flags in the 'special' pix field for non-default operations
 *         Handling negative values in conversion to unsigned int
 *         Relative to zero flags
 *         Flags for adding or removing trailing slash from string
 *
 *   (3) This file has typedefs for the pix allocator and deallocator functions
 *         alloc_fn()
 *         dealloc_fn().
 * </pre>
 */


/*-------------------------------------------------------------------------*
 *                              Basic Pix                                  *
 *-------------------------------------------------------------------------*/
    /* The 'special' field is by default 0, but it can hold integers
     * that direct non-default actions, e.g., in png and jpeg I/O. */

/** Basic Pix */
@Name("Pix") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class PIX extends AbstractPIX {
    static { Loader.load(); }
    /** Default native constructor. */
    public PIX() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PIX(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PIX(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PIX position(long position) {
        return (PIX)super.position(position);
    }

    /** width in pixels                   */
    public native @Cast("l_uint32") int w(); public native PIX w(int setter);
    /** height in pixels                  */
    public native @Cast("l_uint32") int h(); public native PIX h(int setter);
    /** depth in bits (bpp)               */
    public native @Cast("l_uint32") int d(); public native PIX d(int setter);
    /** number of samples per pixel       */
    public native @Cast("l_uint32") int spp(); public native PIX spp(int setter);
    /** 32-bit words/line                 */
    public native @Cast("l_uint32") int wpl(); public native PIX wpl(int setter);
    /** reference count (1 if no clones)  */
    public native @Cast("l_uint32") int refcount(); public native PIX refcount(int setter);
    /** image res (ppi) in x direction    */
    /** (use 0 if unknown)                */
    public native @Cast("l_int32") int xres(); public native PIX xres(int setter);
    /** image res (ppi) in y direction    */
    /** (use 0 if unknown)                */
    public native @Cast("l_int32") int yres(); public native PIX yres(int setter);
    /** input file format, IFF_*          */
    public native @Cast("l_int32") int informat(); public native PIX informat(int setter);
    /** special instructions for I/O, etc */
    public native @Cast("l_int32") int special(); public native PIX special(int setter);
    /** text string associated with pix   */
    public native @Cast("char*") BytePointer text(); public native PIX text(BytePointer setter);
    /** colormap (may be null)            */
    public native PIXCMAP colormap(); public native PIX colormap(PIXCMAP setter);
    /** the image data                    */
    public native @Cast("l_uint32*") IntPointer data(); public native PIX data(IntPointer setter);
}
