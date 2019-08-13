// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /**
     * The FlyCapture2Video class provides the functionality for the user to record
     * images to an AVI file.
     */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class FlyCapture2Video extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public FlyCapture2Video(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public FlyCapture2Video(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public FlyCapture2Video position(long position) {
            return (FlyCapture2Video)super.position(position);
        }
    

        /**
         * Default constructor.
         */
        public FlyCapture2Video() { super((Pointer)null); allocate(); }
        private native void allocate();

        /**
         * Default destructor.
         */

        /**
         * Open an AVI file in preparation for writing Images to disk.
         * The size of AVI files is limited to 2GB. The filenames are
         * automatically generated using the filename specified.
         *
         * @param pFileName The filename of the AVI file.
         * @param pOption Options to apply to the AVI file.
         *
         * @see SetMaximumFileSize()
         * @see Close()
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error Open(
                    @Cast("const char*") BytePointer pFileName,
                    AVIOption pOption);
        public native @ByVal Error Open(
                    String pFileName,
                    AVIOption pOption);

        /**
         * Open an MJPEG AVI file in preparation for writing Images to disk.
         * The size of AVI files is limited to 2GB. The filenames are
         * automatically generated using the filename specified.
         *
         * @param pFileName The filename of the AVI file.
         * @param pOption MJPEG options to apply to the AVI file.
         *
         * @see SetMaximumFileSize()
         * @see Close()
         * @see MJPGOption
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error Open(
                    @Cast("const char*") BytePointer pFileName,
                    MJPGOption pOption);
        public native @ByVal Error Open(
                    String pFileName,
                    MJPGOption pOption);


        /**
         * Open an H.264 video file in preparation for writing Images to disk.
         * If the file extension is not specified, MP4 will be used as the default
         * container. Consult ffmpeg documentation for a list of supported containers.
         *
         * @param pFileName The filename of the video file.
         * @param pOption H.264 options to apply to the video file.
         *
         * @see Close()
         * @see H264Option
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error Open(
                    @Cast("const char*") BytePointer pFileName,
                    H264Option pOption);
        public native @ByVal Error Open(
                    String pFileName,
                    H264Option pOption);


        /**
         * Append an image to the AVI/MP4 file.
         *
         * @param pImage The image to append.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error Append(Image pImage);

        /**
         * Close the AVI/MP4 file.
         *
         * @see Open()
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error Close();

        /**
        * Set the maximum file size (in megabytes) of a AVI/MP4 file. A new AVI/MP4 file
        * is created automatically when file size limit is reached. Setting
        * a maximum size of 0 indicates no limit on file size.
        *
        * @param size The maximum AVI file size in MB.
        *
        * @see Append()
        *
        */
        public native void SetMaximumFileSize(@Cast("unsigned int") int size);
    }
