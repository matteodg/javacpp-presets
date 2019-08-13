// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Opaque @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_OpDefinitionBuilder extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TF_OpDefinitionBuilder() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_OpDefinitionBuilder(Pointer p) { super(p); }
}
