// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


/** \brief Abstract class for the allocator */
@Name("ngraph::runtime::Allocator") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class Allocator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Allocator(Pointer p) { super(p); }

    /** \brief allocates memory with the given size and alignment requirement
     *  @param size exact size of bytes to allocate
     *  @param alignment specifies the alignment. Must be a valid alignment supported by the implementation. */
    public native Pointer malloc(@Cast("size_t") long size, @Cast("size_t") long alignment);

    /** \brief deallocates the memory pointed by ptr
     *  @param ptr pointer to the aligned memory to be released */
    public native @Name("free") void _free(Pointer ptr);
}
