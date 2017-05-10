/*___Generated_by_IDEA___*/

/*
 * Copyright (C) 2011-2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is auto-generated. DO NOT MODIFY!
 * The source Renderscript file: /media/li/old/asop/aosp/frameworks/rs/java/tests/VrDemo/src/com/example/android/rs/vr/engine/bricked.rs
 */

package com.example.android.rs.vr.engine;

import android.renderscript.*;
import com.example.android.rs.vr.engine.brickedBitCode;

/**
 * @hide
 */
public class ScriptC_bricked extends ScriptC {
    private static final String __rs_resource_name = "bricked";
    // Constructor
    public  ScriptC_bricked(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              brickedBitCode.getBitCode32(),
              brickedBitCode.getBitCode64());
        __I32 = Element.I32(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __U32 = Element.U32(rs);
        __I16 = Element.I16(rs);
    }

    private Element __ALLOCATION;
    private Element __I16;
    private Element __I32;
    private Element __U32;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_brick_dimx = 0;
    private int mExportVar_brick_dimx;
    public synchronized void set_brick_dimx(int v) {
        setVar(mExportVarIdx_brick_dimx, v);
        mExportVar_brick_dimx = v;
    }

    public int get_brick_dimx() {
        return mExportVar_brick_dimx;
    }

    public Script.FieldID getFieldID_brick_dimx() {
        return createFieldID(mExportVarIdx_brick_dimx, null);
    }

    private final static int mExportVarIdx_brick_dimy = 1;
    private int mExportVar_brick_dimy;
    public synchronized void set_brick_dimy(int v) {
        setVar(mExportVarIdx_brick_dimy, v);
        mExportVar_brick_dimy = v;
    }

    public int get_brick_dimy() {
        return mExportVar_brick_dimy;
    }

    public Script.FieldID getFieldID_brick_dimy() {
        return createFieldID(mExportVarIdx_brick_dimy, null);
    }

    private final static int mExportVarIdx_brick_dimz = 2;
    private int mExportVar_brick_dimz;
    public synchronized void set_brick_dimz(int v) {
        setVar(mExportVarIdx_brick_dimz, v);
        mExportVar_brick_dimz = v;
    }

    public int get_brick_dimz() {
        return mExportVar_brick_dimz;
    }

    public Script.FieldID getFieldID_brick_dimz() {
        return createFieldID(mExportVarIdx_brick_dimz, null);
    }

    private final static int mExportVarIdx_volume = 3;
    private Allocation mExportVar_volume;
    public synchronized void set_volume(Allocation v) {
        setVar(mExportVarIdx_volume, v);
        mExportVar_volume = v;
    }

    public Allocation get_volume() {
        return mExportVar_volume;
    }

    public Script.FieldID getFieldID_volume() {
        return createFieldID(mExportVarIdx_volume, null);
    }

    private final static int mExportVarIdx_opacity = 4;
    private Allocation mExportVar_opacity;
    public synchronized void set_opacity(Allocation v) {
        setVar(mExportVarIdx_opacity, v);
        mExportVar_opacity = v;
    }

    public Allocation get_opacity() {
        return mExportVar_opacity;
    }

    public Script.FieldID getFieldID_opacity() {
        return createFieldID(mExportVarIdx_opacity, null);
    }

    private final static int mExportVarIdx_z_offset = 5;
    private int mExportVar_z_offset;
    public synchronized void set_z_offset(int v) {
        setVar(mExportVarIdx_z_offset, v);
        mExportVar_z_offset = v;
    }

    public int get_z_offset() {
        return mExportVar_z_offset;
    }

    public Script.FieldID getFieldID_z_offset() {
        return createFieldID(mExportVarIdx_z_offset, null);
    }

    private final static int mExportVarIdx_bricks = 6;
    private Allocation mExportVar_bricks;
    public synchronized void set_bricks(Allocation v) {
        setVar(mExportVarIdx_bricks, v);
        mExportVar_bricks = v;
    }

    public Allocation get_bricks() {
        return mExportVar_bricks;
    }

    public Script.FieldID getFieldID_bricks() {
        return createFieldID(mExportVarIdx_bricks, null);
    }

    private final static int mExportVarIdx_z = 7;
    private int mExportVar_z;
    public synchronized void set_z(int v) {
        setVar(mExportVarIdx_z, v);
        mExportVar_z = v;
    }

    public int get_z() {
        return mExportVar_z;
    }

    public Script.FieldID getFieldID_z() {
        return createFieldID(mExportVarIdx_z, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_pack_chunk = 1;
    public Script.KernelID getKernelID_pack_chunk() {
        return createKernelID(mExportForEachIdx_pack_chunk, 42, null, null);
    }

    public void forEach_pack_chunk(Allocation aout) {
        forEach_pack_chunk(aout, null);
    }

    public void forEach_pack_chunk(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        forEach(mExportForEachIdx_pack_chunk, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_dilate = 2;
    public Script.KernelID getKernelID_dilate() {
        return createKernelID(mExportForEachIdx_dilate, 43, null, null);
    }

    public void forEach_dilate(Allocation ain, Allocation aout) {
        forEach_dilate(ain, aout, null);
    }

    public void forEach_dilate(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_dilate, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_copy = 3;
    public Script.KernelID getKernelID_copy() {
        return createKernelID(mExportForEachIdx_copy, 57, null, null);
    }

    public void forEach_copy(Allocation ain) {
        forEach_copy(ain, null);
    }

    public void forEach_copy(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        forEach(mExportForEachIdx_copy, ain, null, null, sc);
    }

}

