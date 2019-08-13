// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@NoOffset @Name("std::pair<google::protobuf::uint64,google::protobuf::uint64>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class LongLongPair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LongLongPair(Pointer p) { super(p); }
    public LongLongPair(long firstValue, long secondValue) { this(); put(firstValue, secondValue); }
    public LongLongPair()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef LongLongPair put(@ByRef LongLongPair x);


    @MemberGetter public native @Cast("google::protobuf::uint64") long first(); public native LongLongPair first(long first);
    @MemberGetter public native @Cast("google::protobuf::uint64") long second();  public native LongLongPair second(long second);

    public LongLongPair put(long firstValue, long secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

