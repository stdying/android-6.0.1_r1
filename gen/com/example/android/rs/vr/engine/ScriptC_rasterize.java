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
 * The source Renderscript file: /media/li/old/asop/aosp/frameworks/rs/java/tests/VrDemo/src/com/example/android/rs/vr/engine/rasterize.rs
 */

package com.example.android.rs.vr.engine;

import android.renderscript.*;
import com.example.android.rs.vr.engine.rasterizeBitCode;

/**
 * @hide
 */
public class ScriptC_rasterize extends ScriptC {
    private static final String __rs_resource_name = "rasterize";
    // Constructor
    public  ScriptC_rasterize(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              rasterizeBitCode.getBitCode32(),
              rasterizeBitCode.getBitCode64());
        __F32 = Element.F32(rs);
        __I32 = Element.I32(rs);
        __F32_2 = Element.F32_2(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        mExportVar_min_z = 1500.f;
        mExportVar_max_z = 2300.f;
        __U8_4 = Element.U8_4(rs);
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __F32_2;
    private Element __I32;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_F32_2;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_vert = 0;
    private float[] mExportVar_vert;
    public synchronized void set_vert(float[] v) {
        mExportVar_vert = v;
        FieldPacker fp = new FieldPacker(96);
        for (int ct1 = 0; ct1 < 24; ct1++) {
            fp.addF32(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 24;
        setVar(mExportVarIdx_vert, fp, __F32, __dimArr);
    }

    public float[] get_vert() {
        return mExportVar_vert;
    }

    public Script.FieldID getFieldID_vert() {
        return createFieldID(mExportVarIdx_vert, null);
    }

    private final static int mExportVarIdx_index = 1;
    private int[] mExportVar_index;
    public synchronized void set_index(int[] v) {
        mExportVar_index = v;
        FieldPacker fp = new FieldPacker(144);
        for (int ct1 = 0; ct1 < 36; ct1++) {
            fp.addI32(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 36;
        setVar(mExportVarIdx_index, fp, __I32, __dimArr);
    }

    public int[] get_index() {
        return mExportVar_index;
    }

    public Script.FieldID getFieldID_index() {
        return createFieldID(mExportVarIdx_index, null);
    }

    private final static int mExportVarIdx_width = 2;
    private int mExportVar_width;
    public synchronized void set_width(int v) {
        setVar(mExportVarIdx_width, v);
        mExportVar_width = v;
    }

    public int get_width() {
        return mExportVar_width;
    }

    public Script.FieldID getFieldID_width() {
        return createFieldID(mExportVarIdx_width, null);
    }

    private final static int mExportVarIdx_height = 3;
    private int mExportVar_height;
    public synchronized void set_height(int v) {
        setVar(mExportVarIdx_height, v);
        mExportVar_height = v;
    }

    public int get_height() {
        return mExportVar_height;
    }

    public Script.FieldID getFieldID_height() {
        return createFieldID(mExportVarIdx_height, null);
    }

    private final static int mExportVarIdx_d12 = 4;
    private Float2[] mExportVar_d12;
    public synchronized void set_d12(Float2[] v) {
        mExportVar_d12 = v;
        FieldPacker fp = new FieldPacker(96);
        for (int ct1 = 0; ct1 < 12; ct1++) {
            fp.addF32(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 12;
        setVar(mExportVarIdx_d12, fp, __F32_2, __dimArr);
    }

    public Float2[] get_d12() {
        return mExportVar_d12;
    }

    public Script.FieldID getFieldID_d12() {
        return createFieldID(mExportVarIdx_d12, null);
    }

    private final static int mExportVarIdx_d23 = 5;
    private Float2[] mExportVar_d23;
    public synchronized void set_d23(Float2[] v) {
        mExportVar_d23 = v;
        FieldPacker fp = new FieldPacker(96);
        for (int ct1 = 0; ct1 < 12; ct1++) {
            fp.addF32(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 12;
        setVar(mExportVarIdx_d23, fp, __F32_2, __dimArr);
    }

    public Float2[] get_d23() {
        return mExportVar_d23;
    }

    public Script.FieldID getFieldID_d23() {
        return createFieldID(mExportVarIdx_d23, null);
    }

    private final static int mExportVarIdx_d31 = 6;
    private Float2[] mExportVar_d31;
    public synchronized void set_d31(Float2[] v) {
        mExportVar_d31 = v;
        FieldPacker fp = new FieldPacker(96);
        for (int ct1 = 0; ct1 < 12; ct1++) {
            fp.addF32(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 12;
        setVar(mExportVarIdx_d31, fp, __F32_2, __dimArr);
    }

    public Float2[] get_d31() {
        return mExportVar_d31;
    }

    public Script.FieldID getFieldID_d31() {
        return createFieldID(mExportVarIdx_d31, null);
    }

    private final static int mExportVarIdx_z_range_buff = 7;
    private Allocation mExportVar_z_range_buff;
    public synchronized void set_z_range_buff(Allocation v) {
        setVar(mExportVarIdx_z_range_buff, v);
        mExportVar_z_range_buff = v;
    }

    public Allocation get_z_range_buff() {
        return mExportVar_z_range_buff;
    }

    public Script.FieldID getFieldID_z_range_buff() {
        return createFieldID(mExportVarIdx_z_range_buff, null);
    }

    private final static int mExportVarIdx_min_z = 8;
    private float mExportVar_min_z;
    public synchronized void set_min_z(float v) {
        setVar(mExportVarIdx_min_z, v);
        mExportVar_min_z = v;
    }

    public float get_min_z() {
        return mExportVar_min_z;
    }

    public Script.FieldID getFieldID_min_z() {
        return createFieldID(mExportVarIdx_min_z, null);
    }

    private final static int mExportVarIdx_max_z = 9;
    private float mExportVar_max_z;
    public synchronized void set_max_z(float v) {
        setVar(mExportVarIdx_max_z, v);
        mExportVar_max_z = v;
    }

    public float get_max_z() {
        return mExportVar_max_z;
    }

    public Script.FieldID getFieldID_max_z() {
        return createFieldID(mExportVarIdx_max_z, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_render_z = 1;
    public Script.KernelID getKernelID_render_z() {
        return createKernelID(mExportForEachIdx_render_z, 58, null, null);
    }

    public void forEach_render_z(Allocation aout) {
        forEach_render_z(aout, null);
    }

    public void forEach_render_z(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        forEach(mExportForEachIdx_render_z, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_draw_z_buffer = 2;
    public Script.KernelID getKernelID_draw_z_buffer() {
        return createKernelID(mExportForEachIdx_draw_z_buffer, 35, null, null);
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

    private final static int mExportFuncIdx_setup_triangles = 0;
    public Script.InvokeID getInvokeID_setup_triangles() {
        return createInvokeID(mExportFuncIdx_setup_triangles);
    }

    public void invoke_setup_triangles(int w, int h) {
        FieldPacker setup_triangles_fp = new FieldPacker(8);
        setup_triangles_fp.addI32(w);
        setup_triangles_fp.addI32(h);
        invoke(mExportFuncIdx_setup_triangles, setup_triangles_fp);
    }

    private final static int mExportFuncIdx_getMinMax = 1;
    public Script.InvokeID getInvokeID_getMinMax() {
        return createInvokeID(mExportFuncIdx_getMinMax);
    }

    public void invoke_getMinMax() {
        invoke(mExportFuncIdx_getMinMax);
    }

}

