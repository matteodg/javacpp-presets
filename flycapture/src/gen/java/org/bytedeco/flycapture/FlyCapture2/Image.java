// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


	/**
	 * The Image class is used to retrieve images from a camera, convert
	 * between multiple pixel formats and save images to disk. Operations on
	 * Image objects are not guaranteed to be thread safe. It is recommended
	 * that operations on Image objects be protected by thread synchronization
	 * constructs such as mutexes.
	 */
	@Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class Image extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public Image(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public Image(long size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(long size);
	    @Override public Image position(long position) {
	        return (Image)super.position(position);
	    }
	

			/**
			 * Set the default color processing algorithm.  This method will be
			 * used for any image with the DEFAULT algorithm set. The method used
			 * is determined at the time of the Convert() call, therefore the most
			 * recent execution of this function will take precedence. The default
			 * setting is shared within the current process.
			 *
			 * @param defaultMethod The color processing algorithm to set.
			 *
			 * @see GetDefaultColorProcessing()
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public static native @ByVal Error SetDefaultColorProcessing(
								@Cast("FlyCapture2::ColorProcessingAlgorithm") int defaultMethod );

			/**
			 * Get the default color processing algorithm.
			 *
			 * @see SetDefaultColorProcessing()
			 *
			 * @return The default color processing algorithm.
			 */
			public static native @Cast("FlyCapture2::ColorProcessingAlgorithm") int GetDefaultColorProcessing();

			/**
			 * Set the default output pixel format. This format will be used for any
			 * call to Convert() that does not specify an output format. The format
			 * used will be determined at the time of the Convert() call, therefore
			 * the most recent execution of this function will take precedence.
			 * The default is shared within the current process.
			 *
			 * @param format The output pixel format to set.
			 *
			 * @see GetDefaultOutputFormat()
			 *
			 * @return The default color processing algorithm.
			 */
			public static native @ByVal Error SetDefaultOutputFormat( @Cast("FlyCapture2::PixelFormat") int format );

			/**
			 * Get the default output pixel format.
			 *
			 * @see SetDefaultOutputFormat()
			 *
			 * @return The default pixel format.
			 */
			public static native @Cast("FlyCapture2::PixelFormat") int GetDefaultOutputFormat();

			/**
			 * Calculate the bits per pixel for the specified pixel format.
			 *
			 * @param format The pixel format.
			 *
			 * @return The bits per pixel.
			 */
			public static native @Cast("unsigned int") int DetermineBitsPerPixel( @Cast("FlyCapture2::PixelFormat") int format );

			/**
			 * Default constructor.
			 */
			public Image() { super((Pointer)null); allocate(); }
			private native void allocate();

			/**
			 * Construct an Image object with the specified arguments.
			 * Ownership of the image buffer is not transferred to the Image object.
			 * It is the user's responsibility to delete the buffer when it is
			 * no longer in use.
			 *
			 * @param rows Rows in the image.
			 * @param cols Columns in the image.
			 * @param stride Stride of the image buffer.
			 * @param pData Pointer to the image buffer.
			 * @param dataSize Size of the image buffer.
			 * @param format Pixel format.
			 * @param bayerFormat Format of the Bayer tiled raw image.
			 */
			public Image(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") BytePointer pData,
								@Cast("unsigned int") int dataSize,
								@Cast("FlyCapture2::PixelFormat") int format,
								@Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, format, bayerFormat); }
			private native void allocate(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") BytePointer pData,
								@Cast("unsigned int") int dataSize,
								@Cast("FlyCapture2::PixelFormat") int format,
								@Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ );
			public Image(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") BytePointer pData,
								@Cast("unsigned int") int dataSize,
								@Cast("FlyCapture2::PixelFormat") int format ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, format); }
			private native void allocate(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") BytePointer pData,
								@Cast("unsigned int") int dataSize,
								@Cast("FlyCapture2::PixelFormat") int format );
			public Image(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") ByteBuffer pData,
								@Cast("unsigned int") int dataSize,
								@Cast("FlyCapture2::PixelFormat") int format,
								@Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, format, bayerFormat); }
			private native void allocate(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") ByteBuffer pData,
								@Cast("unsigned int") int dataSize,
								@Cast("FlyCapture2::PixelFormat") int format,
								@Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ );
			public Image(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") ByteBuffer pData,
								@Cast("unsigned int") int dataSize,
								@Cast("FlyCapture2::PixelFormat") int format ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, format); }
			private native void allocate(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") ByteBuffer pData,
								@Cast("unsigned int") int dataSize,
								@Cast("FlyCapture2::PixelFormat") int format );
			public Image(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") byte[] pData,
								@Cast("unsigned int") int dataSize,
								@Cast("FlyCapture2::PixelFormat") int format,
								@Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, format, bayerFormat); }
			private native void allocate(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") byte[] pData,
								@Cast("unsigned int") int dataSize,
								@Cast("FlyCapture2::PixelFormat") int format,
								@Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ );
			public Image(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") byte[] pData,
								@Cast("unsigned int") int dataSize,
								@Cast("FlyCapture2::PixelFormat") int format ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, format); }
			private native void allocate(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") byte[] pData,
								@Cast("unsigned int") int dataSize,
								@Cast("FlyCapture2::PixelFormat") int format );

			/**
			 * Construct an Image object with the specified arguments.
			 * Ownership of the image buffer is not transferred to the Image object.
			 * It is the user's responsibility to delete the buffer when it is
			 * no longer in use.
			 *
			 * @param rows Rows in the image.
			 * @param cols Columns in the image.
			 * @param stride Stride of the image buffer.
			 * @param pData Pointer to the image buffer.
			 * @param dataSize Size of the image buffer.
			 * @param receivedDataSize Actual size of data.
			 * @param format Pixel format.
			 * @param bayerFormat Format of the Bayer tiled raw image.
			 */
			public Image(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") BytePointer pData,
								@Cast("unsigned int") int dataSize,
								@Cast("unsigned int") int receivedDataSize,
								@Cast("FlyCapture2::PixelFormat") int format,
								@Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, receivedDataSize, format, bayerFormat); }
			private native void allocate(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") BytePointer pData,
								@Cast("unsigned int") int dataSize,
								@Cast("unsigned int") int receivedDataSize,
								@Cast("FlyCapture2::PixelFormat") int format,
								@Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ );
			public Image(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") ByteBuffer pData,
								@Cast("unsigned int") int dataSize,
								@Cast("unsigned int") int receivedDataSize,
								@Cast("FlyCapture2::PixelFormat") int format,
								@Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, receivedDataSize, format, bayerFormat); }
			private native void allocate(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") ByteBuffer pData,
								@Cast("unsigned int") int dataSize,
								@Cast("unsigned int") int receivedDataSize,
								@Cast("FlyCapture2::PixelFormat") int format,
								@Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ );
			public Image(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") byte[] pData,
								@Cast("unsigned int") int dataSize,
								@Cast("unsigned int") int receivedDataSize,
								@Cast("FlyCapture2::PixelFormat") int format,
								@Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, receivedDataSize, format, bayerFormat); }
			private native void allocate(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("unsigned char*") byte[] pData,
								@Cast("unsigned int") int dataSize,
								@Cast("unsigned int") int receivedDataSize,
								@Cast("FlyCapture2::PixelFormat") int format,
								@Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ );

			/**
			 * Construct an Image object with the specified arguments.
			 * Ownership of the image buffer is not transferred to the Image object.
			 * It is the user's responsibility to delete the buffer when it is
			 * no longer in use.
			 *
			 * @param pData Pointer to the image buffer.
			 * @param dataSize Size of the image buffer.
			 */
			public Image(
								@Cast("unsigned char*") BytePointer pData,
								@Cast("unsigned int") int dataSize) { super((Pointer)null); allocate(pData, dataSize); }
			private native void allocate(
								@Cast("unsigned char*") BytePointer pData,
								@Cast("unsigned int") int dataSize);
			public Image(
								@Cast("unsigned char*") ByteBuffer pData,
								@Cast("unsigned int") int dataSize) { super((Pointer)null); allocate(pData, dataSize); }
			private native void allocate(
								@Cast("unsigned char*") ByteBuffer pData,
								@Cast("unsigned int") int dataSize);
			public Image(
								@Cast("unsigned char*") byte[] pData,
								@Cast("unsigned int") int dataSize) { super((Pointer)null); allocate(pData, dataSize); }
			private native void allocate(
								@Cast("unsigned char*") byte[] pData,
								@Cast("unsigned int") int dataSize);

			/**
			 * Construct an Image object with the specified arguments.
			 *
			 * @param rows Rows in the image.
			 * @param cols Columns in the image.
			 * @param format Pixel format.
			 * @param bayerFormat Format of the Bayer tiled raw image.
			 */
			public Image(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("FlyCapture2::PixelFormat") int format,
								@Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ ) { super((Pointer)null); allocate(rows, cols, format, bayerFormat); }
			private native void allocate(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("FlyCapture2::PixelFormat") int format,
								@Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ );
			public Image(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("FlyCapture2::PixelFormat") int format ) { super((Pointer)null); allocate(rows, cols, format); }
			private native void allocate(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("FlyCapture2::PixelFormat") int format );

			/**
			 * Copy constructor. Both images will point to the same image buffer
			 * internally.
			 */
			public Image( @Const @ByRef Image image ) { super((Pointer)null); allocate(image); }
			private native void allocate( @Const @ByRef Image image );

			/**
			 * Default destructor. The internal image buffer will be released if
			 * there are no other Image objects holding a reference to it. This
			 * will also allow the buffer to be requeued internally.
			 */

			/**
			 * Assignment operator. Both images will point to the same image buffer
			 * internally. If the Image already has a buffer attached to it, it will
			 * will be released.
			 *
			 * @param image The image to copy from.
			 */
			public native @ByRef @Name("operator =") Image put( @Const @ByRef Image image );

			/**
			 * Indexing operator.
			 *
			 * @param index The index of the byte to return.
			 *
			 * @return The address of the specified byte from the image data.
			 */
			public native @Cast("unsigned char*") @Name("operator []") BytePointer get( @Cast("unsigned int") int index );

			/**
			 * Indexing operator.
			 *
			 * @param row The row of the pixel to return.
			 * @param col The column of the pixel to return.
			 *
			 * @return The address of the specified byte from the image data.
			 */
			public native @Cast("unsigned char*") @Name("operator ()") BytePointer apply(
								@Cast("unsigned int") int row,
								@Cast("unsigned int") int col );

			/**
			 * Perform a deep copy of the Image. After this operation, the image
			 * contents and member variables will be the same. The Images will not
			 * share a buffer. The Image's current buffer will not be released.
			 *
			 * @param pImage The Image to copy the data from.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error DeepCopy( @Const Image pImage );

			/**
			 * Sets the dimensions of the image object.
			 *
			 * @param rows Number of rows to set.
			 * @param cols Number of cols to set.
			 * @param stride Stride to set.
			 * @param pixelFormat Pixel format to set.
			 * @param bayerFormat Bayer tile format to set.
			 *
			 * @see GetDimensions()
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error SetDimensions(
								@Cast("unsigned int") int rows,
								@Cast("unsigned int") int cols,
								@Cast("unsigned int") int stride,
								@Cast("FlyCapture2::PixelFormat") int pixelFormat,
								@Cast("FlyCapture2::BayerTileFormat") int bayerFormat );

			/**
			 * Set the data of the Image object.
			 * Ownership of the image buffer is not transferred to the Image object.
			 * It is the user's responsibility to delete the buffer when it is
			 * no longer in use.
			 *
			 * @param pData Pointer to the image buffer.
			 * @param dataSize Size of the image buffer.
			 */
			public native @ByVal Error SetData(
								@Cast("const unsigned char*") BytePointer pData,
								@Cast("unsigned int") int dataSize );
			public native @ByVal Error SetData(
								@Cast("const unsigned char*") ByteBuffer pData,
								@Cast("unsigned int") int dataSize );
			public native @ByVal Error SetData(
								@Cast("const unsigned char*") byte[] pData,
								@Cast("unsigned int") int dataSize );

			/**
			 * Set the block id of the Image object.
			 *
			 * @param blockId The blockId to assign to the image.
			 */
			public native @ByVal Error SetBlockId( @Cast("const unsigned int") int blockId);

			/**
			 * get the block id of the Image object.
			 *
			 * @return The blockId assigned to the image.
			 */
			public native @Cast("unsigned int") int GetBlockId();

			/**
			 * Get the current pixel format.
			 *
			 * @return The current pixel format.
			 */
			public native @Cast("FlyCapture2::PixelFormat") int GetPixelFormat();

			/**
			 * Get the current color processing algorithm.
			 *
			 * @see SetColorProcessing()
			 *
			 * @return The current color processing algorithm.
			 */
			public native @Cast("FlyCapture2::ColorProcessingAlgorithm") int GetColorProcessing();

			/**
			 * Set the color processing algorithm. This should be set on the
			 * input Image object.
			 *
			 * @param colorProc The color processing algorithm to use.
			 *
			 * @see GetColorProcessing()
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error SetColorProcessing( @Cast("FlyCapture2::ColorProcessingAlgorithm") int colorProc );

			/**
			 * Get the number of columns in the image.
			 *
			 * @return The number of columns.
			 */
			public native @Cast("unsigned int") int GetCols();

			/**
			 * Get the number of rows in the image.
			 *
			 * @return The number of rows.
			 */
			public native @Cast("unsigned int") int GetRows();

			/**
			 * Get the stride in the image.
			 *
			 * @return The stride (The number of bytes between rows of the image).
			 */
			public native @Cast("unsigned int") int GetStride();

			/**
			 * Get the bits per pixel of the image.
			 *
			 * @return The bits per pixel.
			 */
			public native @Cast("unsigned int") int GetBitsPerPixel();

			/**
			 * Get the Bayer tile format of the image.
			 *
			 * @return The Bayer tile format.
			 */
			public native @Cast("FlyCapture2::BayerTileFormat") int GetBayerTileFormat();

			/**
			 * Get the size of the buffer associated with the image, in bytes.
			 *
			 * @return The size of the buffer, in bytes.
			 */
			public native @Cast("unsigned int") int GetDataSize();

			/**
			 * Get the size of the compressed data, in bytes. A compressed image
			 * will have a maximum size equal to GetDataSize(), but may actually
			 * contain less data, depending on the compression level.
			 * For uncompressed images, a value smaller than the data size may
			 * indicate lost data.
			 *
			 * @return The size of the compressed data, in bytes. 0 when camera
			 *         not sending compressed data.
			 */
			public native @Cast("unsigned int") int GetReceivedDataSize();

			/**
			 * Get the image dimensions associated with the image.
			 *
			 * @param pRows Number of rows.
			 * @param pCols Number of columns.
			 * @param pStride The stride.
			 * @param pPixelFormat Pixel format.
			 * @param pBayerFormat Bayer tile format.
			 */
			public native void GetDimensions(
								@Cast("unsigned int*") IntPointer pRows,
								@Cast("unsigned int*") IntPointer pCols/*=NULL*/,
								@Cast("unsigned int*") IntPointer pStride/*=NULL*/,
								@Cast("FlyCapture2::PixelFormat*") IntPointer pPixelFormat/*=NULL*/,
								@Cast("FlyCapture2::BayerTileFormat*") IntPointer pBayerFormat/*=NULL*/ );
			public native void GetDimensions(
								@Cast("unsigned int*") IntPointer pRows );
			public native void GetDimensions(
								@Cast("unsigned int*") IntBuffer pRows,
								@Cast("unsigned int*") IntBuffer pCols/*=NULL*/,
								@Cast("unsigned int*") IntBuffer pStride/*=NULL*/,
								@Cast("FlyCapture2::PixelFormat*") IntBuffer pPixelFormat/*=NULL*/,
								@Cast("FlyCapture2::BayerTileFormat*") IntBuffer pBayerFormat/*=NULL*/ );
			public native void GetDimensions(
								@Cast("unsigned int*") IntBuffer pRows );
			public native void GetDimensions(
								@Cast("unsigned int*") int[] pRows,
								@Cast("unsigned int*") int[] pCols/*=NULL*/,
								@Cast("unsigned int*") int[] pStride/*=NULL*/,
								@Cast("FlyCapture2::PixelFormat*") int[] pPixelFormat/*=NULL*/,
								@Cast("FlyCapture2::BayerTileFormat*") int[] pBayerFormat/*=NULL*/ );
			public native void GetDimensions(
								@Cast("unsigned int*") int[] pRows );

			/**
			 * Get a pointer to the data associated with the image. This function
			 * is considered unsafe. The pointer returned could be invalidated if
			 * the buffer is resized or released. The pointer may also be
			 * invalidated if the Image object is passed to
			 * Camera::RetrieveBuffer(). It is recommended that a Image::DeepCopy()
			 * be performed if a seperate copy of the Image data is required
			 * for further processing.
			 *
			 * @return A pointer to the image data.
			 */
			public native @Cast("unsigned char*") BytePointer GetData();

			/**
			 * Get the metadata associated with the image. This includes
			 * embedded image information.
			 *
			 * @return Metadata associated with the image.
			 */
			public native @ByVal ImageMetadata GetMetadata();

			/**
			 * Calculate statistics associated with the image. In order to collect
			 * statistics for a particular channel, the enabled flag for the
			 * channel must be set to true. Statistics can only be collected for
			 * images in Mono8, Mono16, RGB, RGBU, BGR and BGRU.
			 *
			 * @param pStatistics The ImageStatistics object to hold the statistics.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error CalculateStatistics( ImageStatistics pStatistics );

			/**
			 * Get the timestamp data associated with the image.
			 *
			 * @return Timestamp data associated with the image.
			 */
			public native @ByVal TimeStamp GetTimeStamp();

			/**
			 * Save the image to the specified file name with the file format
			 * specified.
			 *
			 * @param pFilename Filename to save image with.
			 * @param format File format to save in.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error Save(
								@Cast("const char*") BytePointer pFilename,
								@Cast("FlyCapture2::ImageFileFormat") int format/*=FlyCapture2::FROM_FILE_EXT*/ );
			public native @ByVal Error Save(
								@Cast("const char*") BytePointer pFilename );
			public native @ByVal Error Save(
								String pFilename,
								@Cast("FlyCapture2::ImageFileFormat") int format/*=FlyCapture2::FROM_FILE_EXT*/ );
			public native @ByVal Error Save(
								String pFilename );

			/**
			 * Save the image to the specified file name with the options specified.
			 *
			 * @param pFilename Filename to save image with.
			 * @param pOption Options to use while saving image.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error Save(
								@Cast("const char*") BytePointer pFilename,
								PNGOption pOption );
			public native @ByVal Error Save(
								String pFilename,
								PNGOption pOption );

			/**
			 * Save the image to the specified file name with the options specified.
			 *
			 * @param pFilename Filename to save image with.
			 * @param pOption Options to use while saving image.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error Save(
								@Cast("const char*") BytePointer pFilename,
								PPMOption pOption );
			public native @ByVal Error Save(
								String pFilename,
								PPMOption pOption );

			/**
			 * Save the image to the specified file name with the options specified.
			 *
			 * @param pFilename Filename to save image with.
			 * @param pOption Options to use while saving image.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error Save(
								@Cast("const char*") BytePointer pFilename,
								PGMOption pOption );
			public native @ByVal Error Save(
								String pFilename,
								PGMOption pOption );

			/**
			 * Save the image to the specified file name with the options specified.
			 *
			 * @param pFilename Filename to save image with.
			 * @param pOption Options to use while saving image.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error Save(
								@Cast("const char*") BytePointer pFilename,
								TIFFOption pOption );
			public native @ByVal Error Save(
								String pFilename,
								TIFFOption pOption );

			/**
			 * Save the image to the specified file name with the options specified.
			 *
			 * @param pFilename Filename to save image with.
			 * @param pOption Options to use while saving image.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error Save(
								@Cast("const char*") BytePointer pFilename,
								JPEGOption pOption );
			public native @ByVal Error Save(
								String pFilename,
								JPEGOption pOption );

			/**
			 * Save the image to the specified file name with the options specified.
			 *
			 * @param pFilename Filename to save image with.
			 * @param pOption Options to use while saving image.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error Save(
								@Cast("const char*") BytePointer pFilename,
								JPG2Option pOption );
			public native @ByVal Error Save(
								String pFilename,
								JPG2Option pOption );

			/**
			 * Save the image to the specified file name with the options specified.
			 *
			 * @param pFilename Filename to save image with.
			 * @param pOption Options to use while saving image.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error Save(
								@Cast("const char*") BytePointer pFilename,
								BMPOption pOption );
			public native @ByVal Error Save(
								String pFilename,
								BMPOption pOption );

			/**
			 * Converts the current image buffer to the specified output format and
			 * stores the result in the specified image. The destination image
			 * does not need to be configured in any way before the call is made.
			 *
			 * @param format Output format of the converted image.
			 * @param pDestImage Destination image.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error Convert(
								@Cast("FlyCapture2::PixelFormat") int format,
								Image pDestImage );

			/**
			 * Converts the current image buffer to the specified output format and
			 * stores the result in the specified image. The destination image
			 * does not need to be configured in anyway before the call is made.
			 *
			 * @param pDestImage Destination image.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error Convert( Image pDestImage );

			/**
			 * Release the buffer associated with the Image. If no buffer is
			 * associated, the function does nothing.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error ReleaseBuffer();
	}
