/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;

public class btConvexPenetrationDepthSolver {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected btConvexPenetrationDepthSolver (long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr (btConvexPenetrationDepthSolver obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btConvexPenetrationDepthSolver(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public boolean calcPenDepth (SWIGTYPE_p_btSimplexSolverInterface simplexSolver, btConvexShape convexA, btConvexShape convexB,
		btTransform transA, btTransform transB, Vector3 v, Vector3 pa, Vector3 pb, btIDebugDraw debugDraw, btStackAlloc stackAlloc) {
		return gdxBulletJNI.btConvexPenetrationDepthSolver_calcPenDepth(swigCPtr, this,
			SWIGTYPE_p_btSimplexSolverInterface.getCPtr(simplexSolver), btConvexShape.getCPtr(convexA), convexA,
			btConvexShape.getCPtr(convexB), convexB, btTransform.getCPtr(transA), transA, btTransform.getCPtr(transB), transB, v,
			pa, pb, btIDebugDraw.getCPtr(debugDraw), debugDraw, btStackAlloc.getCPtr(stackAlloc), stackAlloc);
	}

}
