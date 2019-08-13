// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A rope joint enforces a maximum distance between two points
 *  on two bodies. It has no other effect.
 *  Warning: if you attempt to change the maximum length during
 *  the simulation you will get some non-physical behavior.
 *  A model that would allow you to dynamically modify the length
 *  would have some sponginess, so I chose not to implement it
 *  that way. See b2DistanceJoint if you want to dynamically
 *  control length. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2RopeJoint extends b2Joint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2RopeJoint(Pointer p) { super(p); }

	public native @ByVal b2Vec2 GetAnchorA();
	public native @ByVal b2Vec2 GetAnchorB();

	public native @ByVal b2Vec2 GetReactionForce(@Cast("float32") float inv_dt);
	public native @Cast("float32") float GetReactionTorque(@Cast("float32") float inv_dt);

	/** The local anchor point relative to bodyA's origin. */
	public native @Const @ByRef b2Vec2 GetLocalAnchorA();

	/** The local anchor point relative to bodyB's origin. */
	public native @Const @ByRef b2Vec2 GetLocalAnchorB();

	/** Set/Get the maximum length of the rope. */
	public native void SetMaxLength(@Cast("float32") float length);
	public native @Cast("float32") float GetMaxLength();

	public native @Cast("b2LimitState") int GetLimitState();

	/** Dump joint to dmLog */
	public native void Dump();
}
