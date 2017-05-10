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
 * The source Renderscript file: /media/li/old/asop/aosp/frameworks/rs/java/tests/VrDemo/src/com/example/android/rs/vr/engine/vr.rs
 */

package com.example.android.rs.vr.engine;

import android.renderscript.*;
import com.example.android.rs.vr.engine.vrBitCode;

/**
 * @hide
 */
public class ScriptC_vr extends ScriptC {
    private static final String __rs_resource_name = "vr";
    // Constructor
    public  ScriptC_vr(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              vrBitCode.getBitCode32(),
              vrBitCode.getBitCode64());
        __F32 = Element.F32(rs);
        __F32_3 = Element.F32_3(rs);
        __U8_4 = Element.U8_4(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __I32 = Element.I32(rs);
        mExportVar_debug = true;
        __BOOLEAN = Element.BOOLEAN(rs);
        __F32_2 = Element.F32_2(rs);
    }

    private Element __ALLOCATION;
    private Element __BOOLEAN;
    private Element __F32;
    private Element __F32_2;
    private Element __F32_3;
    private Element __I32;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_BOOLEAN;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_F32_3;
    private FieldPacker __rs_fp_I32;
    private FieldPacker __rs_fp_U8_4;
    private final static int mExportVarIdx_jitter = 0;
    private float[] mExportVar_jitter;
    public synchronized void set_jitter(float[] v) {
        mExportVar_jitter = v;
        FieldPacker fp = new FieldPacker(13828);
        for (int ct1 = 0; ct1 < 3457; ct1++) {
            fp.addF32(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 3457;
        setVar(mExportVarIdx_jitter, fp, __F32, __dimArr);
    }

    public float[] get_jitter() {
        return mExportVar_jitter;
    }

    public Script.FieldID getFieldID_jitter() {
        return createFieldID(mExportVarIdx_jitter, null);
    }

    private final static int mExportVarIdx_s = 1;
    private Float3 mExportVar_s;
    public synchronized void set_s(Float3 v) {
        mExportVar_s = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_s, fp, __F32_3, __dimArr);
    }

    public Float3 get_s() {
        return mExportVar_s;
    }

    public Script.FieldID getFieldID_s() {
        return createFieldID(mExportVarIdx_s, null);
    }

    private final static int mExportVarIdx_dx = 2;
    private Float3 mExportVar_dx;
    public synchronized void set_dx(Float3 v) {
        mExportVar_dx = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_dx, fp, __F32_3, __dimArr);
    }

    public Float3 get_dx() {
        return mExportVar_dx;
    }

    public Script.FieldID getFieldID_dx() {
        return createFieldID(mExportVarIdx_dx, null);
    }

    private final static int mExportVarIdx_dy = 3;
    private Float3 mExportVar_dy;
    public synchronized void set_dy(Float3 v) {
        mExportVar_dy = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_dy, fp, __F32_3, __dimArr);
    }

    public Float3 get_dy() {
        return mExportVar_dy;
    }

    public Script.FieldID getFieldID_dy() {
        return createFieldID(mExportVarIdx_dy, null);
    }

    private final static int mExportVarIdx_dz = 4;
    private Float3 mExportVar_dz;
    public synchronized void set_dz(Float3 v) {
        mExportVar_dz = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_dz, fp, __F32_3, __dimArr);
    }

    public Float3 get_dz() {
        return mExportVar_dz;
    }

    public Script.FieldID getFieldID_dz() {
        return createFieldID(mExportVarIdx_dz, null);
    }

    private final static int mExportVarIdx_zoomFactor = 5;
    private float mExportVar_zoomFactor;
    public synchronized void set_zoomFactor(float v) {
        setVar(mExportVarIdx_zoomFactor, v);
        mExportVar_zoomFactor = v;
    }

    public float get_zoomFactor() {
        return mExportVar_zoomFactor;
    }

    public Script.FieldID getFieldID_zoomFactor() {
        return createFieldID(mExportVarIdx_zoomFactor, null);
    }

    private final static int mExportVarIdx_matrix4 = 6;
    private Matrix4f mExportVar_matrix4;
    public synchronized void set_matrix4(Matrix4f v) {
        mExportVar_matrix4 = v;
        FieldPacker fp = new FieldPacker(64);
        fp.addMatrix(v);
        setVar(mExportVarIdx_matrix4, fp);
    }

    public Matrix4f get_matrix4() {
        return mExportVar_matrix4;
    }

    public Script.FieldID getFieldID_matrix4() {
        return createFieldID(mExportVarIdx_matrix4, null);
    }

    private final static int mExportVarIdx_matrix3 = 7;
    private Matrix3f mExportVar_matrix3;
    public synchronized void set_matrix3(Matrix3f v) {
        mExportVar_matrix3 = v;
        FieldPacker fp = new FieldPacker(36);
        fp.addMatrix(v);
        setVar(mExportVarIdx_matrix3, fp);
    }

    public Matrix3f get_matrix3() {
        return mExportVar_matrix3;
    }

    public Script.FieldID getFieldID_matrix3() {
        return createFieldID(mExportVarIdx_matrix3, null);
    }

    private final static int mExportVarIdx_base_color = 8;
    private Short4 mExportVar_base_color;
    public synchronized void set_base_color(Short4 v) {
        mExportVar_base_color = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_base_color, fp, __U8_4, __dimArr);
    }

    public Short4 get_base_color() {
        return mExportVar_base_color;
    }

    public Script.FieldID getFieldID_base_color() {
        return createFieldID(mExportVarIdx_base_color, null);
    }

    private final static int mExportVarIdx_opacity = 9;
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

    private final static int mExportVarIdx_color_map = 10;
    private Allocation mExportVar_color_map;
    public synchronized void set_color_map(Allocation v) {
        setVar(mExportVarIdx_color_map, v);
        mExportVar_color_map = v;
    }

    public Allocation get_color_map() {
        return mExportVar_color_map;
    }

    public Script.FieldID getFieldID_color_map() {
        return createFieldID(mExportVarIdx_color_map, null);
    }

    private final static int mExportVarIdx_bricks = 11;
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

    private final static int mExportVarIdx_brick_index = 12;
    private Allocation mExportVar_brick_index;
    public synchronized void set_brick_index(Allocation v) {
        setVar(mExportVarIdx_brick_index, v);
        mExportVar_brick_index = v;
    }

    public Allocation get_brick_index() {
        return mExportVar_brick_index;
    }

    public Script.FieldID getFieldID_brick_index() {
        return createFieldID(mExportVarIdx_brick_index, null);
    }

    private final static int mExportVarIdx_brick_dimx = 13;
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

    private final static int mExportVarIdx_brick_dimy = 14;
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

    private final static int mExportVarIdx_brick_dimz = 15;
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

    private final static int mExportVarIdx_volume = 16;
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

    private final static int mExportVarIdx_zbuff = 17;
    private Allocation mExportVar_zbuff;
    public synchronized void set_zbuff(Allocation v) {
        setVar(mExportVarIdx_zbuff, v);
        mExportVar_zbuff = v;
    }

    public Allocation get_zbuff() {
        return mExportVar_zbuff;
    }

    public Script.FieldID getFieldID_zbuff() {
        return createFieldID(mExportVarIdx_zbuff, null);
    }

    private final static int mExportVarIdx_debug = 18;
    private boolean mExportVar_debug;
    public synchronized void set_debug(boolean v) {
        if (__rs_fp_BOOLEAN!= null) {
            __rs_fp_BOOLEAN.reset();
        } else {
            __rs_fp_BOOLEAN = new FieldPacker(1);
        }
        __rs_fp_BOOLEAN.addBoolean(v);
        setVar(mExportVarIdx_debug, __rs_fp_BOOLEAN);
        mExportVar_debug = v;
    }

    public boolean get_debug() {
        return mExportVar_debug;
    }

    public Script.FieldID getFieldID_debug() {
        return createFieldID(mExportVarIdx_debug, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_draw_z_buffer = 1;
    public Script.KernelID getKernelID_draw_z_buffer() {
        return createKernelID(mExportForEachIdx_draw_z_buffer, 59, null, null);
    }

    public void forEach_draw_z_buffer(Allocation ain, Allocation aout) {
        forEach_draw_z_buffer(ain, aout, null);
    }

    public void forEach_draw_z_buffer(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
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

        forEach(mExportForEachIdx_draw_z_buffer, ain, aout, null, sc);
    }

    private final static int mExportFuncIdx_setup_vectors = 0;
    public Script.InvokeID getInvokeID_setup_vectors() {
        return createInvokeID(mExportFuncIdx_setup_vectors);
    }

    public void invoke_setup_vectors() {
        invoke(mExportFuncIdx_setup_vectors);
    }

}

