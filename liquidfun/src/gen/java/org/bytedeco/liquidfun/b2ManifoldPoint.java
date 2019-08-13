// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A manifold point is a contact point belonging to a contact
 *  manifold. It holds details related to the geometry and dynamics
 *  of the contact points.
 *  The local point usage depends on the manifold type:
 *  -e_circles: the local center of circleB
 *  -e_faceA: the local center of cirlceB or the clip point of polygonB
 *  -e_faceB: the clip point of polygonA
 *  This structure is stored across time steps, so we keep it small.
 *  Note: the impulses are used for internal caching and may not
 *  provide reliable contact forces, especially for high speed collisions. */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2ManifoldPoint extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2ManifoldPoint() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2ManifoldPoint(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2ManifoldPoint(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2ManifoldPoint position(long position) {
        return (b2ManifoldPoint)super.position(position);
    }

	/** usage depends on manifold type */
	public native @ByRef b2Vec2 localPoint(); public native b2ManifoldPoint localPoint(b2Vec2 setter);
	/** the non-penetration impulse */
	public native @Cast("float32") float normalImpulse(); public native b2ManifoldPoint normalImpulse(float setter);
	/** the friction impulse */
	public native @Cast("float32") float tangentImpulse(); public native b2ManifoldPoint tangentImpulse(float setter);
	/** uniquely identifies a contact point between two shapes */
	public native @ByRef b2ContactID id(); public native b2ManifoldPoint id(b2ContactID setter);
}
