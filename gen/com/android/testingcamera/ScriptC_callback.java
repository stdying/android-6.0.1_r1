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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/pdk/apps/TestingCamera/src/com/android/testingcamera/callback.rs
 */

package com.android.testingcamera;

import android.renderscript.*;
import com.android.testingcamera.callbackBitCode;

/**
 * @hide
 */
public class ScriptC_callback extends ScriptC {
    private static final String __rs_resource_name = "callback";
    // Constructor
    public  ScriptC_callback(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              callbackBitCode.getBitCode32(),
              callbackBitCode.getBitCode64());
        __U32 = Element.U32(rs);
        __F32 = Element.F32(rs);
        __U8_4 = Element.U8_4(rs);
    }

    private Element __F32;
    private Element __U32;
    private Element __U8_4;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_U32;
    private final static int mExportVarIdx_yuv_in = 0;
    private Allocation mExportVar_yuv_in;
    public void bind_yuv_in(Allocation v) {
        mExportVar_yuv_in = v;
        if (v == null) bindAllocation(null, mExportVarIdx_yuv_in);
        else bindAllocation(v, mExportVarIdx_yuv_in);
    }

    public Allocation get_yuv_in() {
        return mExportVar_yuv_in;
    }

    private final static int mExportVarIdx_yuv_height = 1;
    private long mExportVar_yuv_height;
    public synchronized void set_yuv_height(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_yuv_height, __rs_fp_U32);
        mExportVar_yuv_height = v;
    }

    public long get_yuv_height() {
        return mExportVar_yuv_height;
    }

    public Script.FieldID getFieldID_yuv_height() {
        return createFieldID(mExportVarIdx_yuv_height, null);
    }

    private final static int mExportVarIdx_yuv_width = 2;
    private long mExportVar_yuv_width;
    public synchronized void set_yuv_width(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_yuv_width, __rs_fp_U32);
        mExportVar_yuv_width = v;
    }

    public long get_yuv_width() {
        return mExportVar_yuv_width;
    }

    public Script.FieldID getFieldID_yuv_width() {
        return createFieldID(mExportVarIdx_yuv_width, null);
    }

    private final static int mExportVarIdx_out_width = 3;
    private long mExportVar_out_width;
    public synchronized void set_out_width(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_out_width, __rs_fp_U32);
        mExportVar_out_width = v;
    }

    public long get_out_width() {
        return mExportVar_out_width;
    }

    public Script.FieldID getFieldID_out_width() {
        return createFieldID(mExportVarIdx_out_width, null);
    }

    private final static int mExportVarIdx_out_height = 4;
    private long mExportVar_out_height;
    public synchronized void set_out_height(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_out_height, __rs_fp_U32);
        mExportVar_out_height = v;
    }

    public long get_out_height() {
        return mExportVar_out_height;
    }

    public Script.FieldID getFieldID_out_height() {
        return createFieldID(mExportVarIdx_out_height, null);
    }

    private final static int mExportVarIdx_y_stride = 5;
    private long mExportVar_y_stride;
    public synchronized void set_y_stride(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_y_stride, __rs_fp_U32);
        mExportVar_y_stride = v;
    }

    public long get_y_stride() {
        return mExportVar_y_stride;
    }

    public Script.FieldID getFieldID_y_stride() {
        return createFieldID(mExportVarIdx_y_stride, null);
    }

    private final static int mExportVarIdx_uv_stride = 6;
    private long mExportVar_uv_stride;
    public synchronized void set_uv_stride(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_uv_stride, __rs_fp_U32);
        mExportVar_uv_stride = v;
    }

    public long get_uv_stride() {
        return mExportVar_uv_stride;
    }

    public Script.FieldID getFieldID_uv_stride() {
        return createFieldID(mExportVarIdx_uv_stride, null);
    }

    private final static int mExportVarIdx_u_start = 7;
    private long mExportVar_u_start;
    public synchronized void set_u_start(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_u_start, __rs_fp_U32);
        mExportVar_u_start = v;
    }

    public long get_u_start() {
        return mExportVar_u_start;
    }

    public Script.FieldID getFieldID_u_start() {
        return createFieldID(mExportVarIdx_u_start, null);
    }

    private final static int mExportVarIdx_v_start = 8;
    private long mExportVar_v_start;
    public synchronized void set_v_start(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_v_start, __rs_fp_U32);
        mExportVar_v_start = v;
    }

    public long get_v_start() {
        return mExportVar_v_start;
    }

    public Script.FieldID getFieldID_v_start() {
        return createFieldID(mExportVarIdx_v_start, null);
    }

    private final static int mExportVarIdx_x_scale = 9;
    private float mExportVar_x_scale;
    public synchronized void set_x_scale(float v) {
        setVar(mExportVarIdx_x_scale, v);
        mExportVar_x_scale = v;
    }

    public float get_x_scale() {
        return mExportVar_x_scale;
    }

    public Script.FieldID getFieldID_x_scale() {
        return createFieldID(mExportVarIdx_x_scale, null);
    }

    private final static int mExportVarIdx_y_scale = 10;
    private float mExportVar_y_scale;
    public synchronized void set_y_scale(float v) {
        setVar(mExportVarIdx_y_scale, v);
        mExportVar_y_scale = v;
    }

    public float get_y_scale() {
        return mExportVar_y_scale;
    }

    public Script.FieldID getFieldID_y_scale() {
        return createFieldID(mExportVarIdx_y_scale, null);
    }

    private final static int mExportVarIdx_yuv2rgb_matrix = 11;
    private Matrix4f mExportVar_yuv2rgb_matrix;
    public synchronized void set_yuv2rgb_matrix(Matrix4f v) {
        mExportVar_yuv2rgb_matrix = v;
        FieldPacker fp = new FieldPacker(64);
        fp.addMatrix(v);
        setVar(mExportVarIdx_yuv2rgb_matrix, fp);
    }

    public Matrix4f get_yuv2rgb_matrix() {
        return mExportVar_yuv2rgb_matrix;
    }

    public Script.FieldID getFieldID_yuv2rgb_matrix() {
        return createFieldID(mExportVarIdx_yuv2rgb_matrix, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_convert_unknown = 1;
    public Script.KernelID getKernelID_convert_unknown() {
        return createKernelID(mExportForEachIdx_convert_unknown, 58, null, null);
    }

    public void forEach_convert_unknown(Allocation aout) {
        forEach_convert_unknown(aout, null);
    }

    public void forEach_convert_unknown(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_convert_unknown, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_convert_semiplanar = 2;
    public Script.KernelID getKernelID_convert_semiplanar() {
        return createKernelID(mExportForEachIdx_convert_semiplanar, 58, null, null);
    }

    public void forEach_convert_semiplanar(Allocation aout) {
        forEach_convert_semiplanar(aout, null);
    }

    public void forEach_convert_semiplanar(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_convert_semiplanar, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_convert_planar = 3;
    public Script.KernelID getKernelID_convert_planar() {
        return createKernelID(mExportForEachIdx_convert_planar, 58, null, null);
    }

    public void forEach_convert_planar(Allocation aout) {
        forEach_convert_planar(aout, null);
    }

    public void forEach_convert_planar(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_convert_planar, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_convert_interleaved = 4;
    public Script.KernelID getKernelID_convert_interleaved() {
        return createKernelID(mExportForEachIdx_convert_interleaved, 58, null, null);
    }

    public void forEach_convert_interleaved(Allocation aout) {
        forEach_convert_interleaved(aout, null);
    }

    public void forEach_convert_interleaved(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_convert_interleaved, (Allocation) null, aout, null, sc);
    }

    private final static int mExportFuncIdx_init_convert = 0;
    public Script.InvokeID getInvokeID_init_convert() {
        return createInvokeID(mExportFuncIdx_init_convert);
    }

    public void invoke_init_convert(long yw, long yh, long format, long ow, long oh) {
        FieldPacker init_convert_fp = new FieldPacker(20);
        init_convert_fp.addU32(yw);
        init_convert_fp.addU32(yh);
        init_convert_fp.addU32(format);
        init_convert_fp.addU32(ow);
        init_convert_fp.addU32(oh);
        invoke(mExportFuncIdx_init_convert, init_convert_fp);
    }

}

