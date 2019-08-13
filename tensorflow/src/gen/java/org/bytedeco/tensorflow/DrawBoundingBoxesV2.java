// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Draw bounding boxes on a batch of images.
 * 
 *  Outputs a copy of {@code images} but draws on top of the pixels zero or more bounding
 *  boxes specified by the locations in {@code boxes}. The coordinates of the each
 *  bounding box in {@code boxes} are encoded as {@code [y_min, x_min, y_max, x_max]}. The
 *  bounding box coordinates are floats in {@code [0.0, 1.0]} relative to the width and
 *  height of the underlying image.
 * 
 *  For example, if an image is 100 x 200 pixels (height x width) and the bounding
 *  box is {@code [0.1, 0.2, 0.5, 0.9]}, the upper-left and bottom-right coordinates of
 *  the bounding box will be {@code (40, 10)} to {@code (100, 50)} (in (x,y) coordinates).
 * 
 *  Parts of the bounding box may fall outside the image.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * images: 4-D with shape {@code [batch, height, width, depth]}. A batch of images.
 *  * boxes: 3-D with shape {@code [batch, num_bounding_boxes, 4]} containing bounding
 *  boxes.
 *  * colors: 2-D. A list of RGBA colors to cycle through for the boxes.
 * 
 *  Returns:
 *  * {@code Output}: 4-D with the same shape as {@code images}. The batch of input images with
 *  bounding boxes drawn on the images. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DrawBoundingBoxesV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DrawBoundingBoxesV2(Pointer p) { super(p); }

  public DrawBoundingBoxesV2(@Const @ByRef Scope scope, @ByVal Input images, @ByVal Input boxes, @ByVal Input colors) { super((Pointer)null); allocate(scope, images, boxes, colors); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input images, @ByVal Input boxes, @ByVal Input colors);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native DrawBoundingBoxesV2 operation(Operation setter);
  public native @ByRef Output output(); public native DrawBoundingBoxesV2 output(Output setter);
}
