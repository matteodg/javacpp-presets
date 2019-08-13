// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("std::vector<cv::Rect>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class RectVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RectVector(Pointer p) { super(p); }
    public RectVector(Rect value) { this(1); put(0, value); }
    public RectVector(Rect ... array) { this(array.length); put(array); }
    public RectVector()       { allocate();  }
    public RectVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef RectVector put(@ByRef RectVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef Rect get(@Cast("size_t") long i);
    public native RectVector put(@Cast("size_t") long i, Rect value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef Rect value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*") @ByRef @Const Rect get();
    }

    public Rect[] get() {
        Rect[] array = new Rect[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Rect pop_back() {
        long size = size();
        Rect value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public RectVector push_back(Rect value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public RectVector put(Rect value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public RectVector put(Rect ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

