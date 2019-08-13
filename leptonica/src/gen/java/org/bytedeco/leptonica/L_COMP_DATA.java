// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;



/* --------------------------------------------------------------- *
 *                    Compressed image data                        *
 * --------------------------------------------------------------- */
/*
 *  In use, either datacomp or data85 will be produced, depending
 *  on whether the data needs to be ascii85 encoded.  PostScript
 *  requires ascii85 encoding; pdf does not.
 *
 *  For the colormap (flate compression only), PostScript uses ascii85
 *  encoding and pdf uses a bracketed array of space-separated
 *  hex-encoded rgb triples.  Only tiff g4 (type == L_G4_ENCODE) uses
 *  the minisblack field.
 */

/** Compressed image data */
@Name("L_Compressed_Data") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class L_COMP_DATA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_COMP_DATA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_COMP_DATA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_COMP_DATA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_COMP_DATA position(long position) {
        return (L_COMP_DATA)super.position(position);
    }

    /** encoding type: L_JPEG_ENCODE, etc   */
    public native @Cast("l_int32") int type(); public native L_COMP_DATA type(int setter);
    /** gzipped raster data                 */
    public native @Cast("l_uint8*") BytePointer datacomp(); public native L_COMP_DATA datacomp(BytePointer setter);
    /** number of compressed bytes          */
    public native @Cast("size_t") long nbytescomp(); public native L_COMP_DATA nbytescomp(long setter);
    /** ascii85-encoded gzipped raster data */
    public native @Cast("char*") BytePointer data85(); public native L_COMP_DATA data85(BytePointer setter);
    /** number of ascii85 encoded bytes     */
    public native @Cast("size_t") long nbytes85(); public native L_COMP_DATA nbytes85(long setter);
    /** ascii85-encoded uncompressed cmap   */
    public native @Cast("char*") BytePointer cmapdata85(); public native L_COMP_DATA cmapdata85(BytePointer setter);
    /** hex pdf array for the cmap          */
    public native @Cast("char*") BytePointer cmapdatahex(); public native L_COMP_DATA cmapdatahex(BytePointer setter);
    /** number of colors in cmap            */
    public native @Cast("l_int32") int ncolors(); public native L_COMP_DATA ncolors(int setter);
    /** image width                         */
    public native @Cast("l_int32") int w(); public native L_COMP_DATA w(int setter);
    /** image height                        */
    public native @Cast("l_int32") int h(); public native L_COMP_DATA h(int setter);
    /** bits/sample; typ. 1, 2, 4 or 8      */
    public native @Cast("l_int32") int bps(); public native L_COMP_DATA bps(int setter);
    /** samples/pixel; typ. 1 or 3          */
    public native @Cast("l_int32") int spp(); public native L_COMP_DATA spp(int setter);
    /** tiff g4 photometry                  */
    public native @Cast("l_int32") int minisblack(); public native L_COMP_DATA minisblack(int setter);
    /** flate data has PNG predictors       */
    public native @Cast("l_int32") int predictor(); public native L_COMP_DATA predictor(int setter);
    /** number of uncompressed raster bytes */
    public native @Cast("size_t") long nbytes(); public native L_COMP_DATA nbytes(long setter);
    /** resolution (ppi)                    */
    public native @Cast("l_int32") int res(); public native L_COMP_DATA res(int setter);
}
