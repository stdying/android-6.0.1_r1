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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/Refocus/src/com/android/rs/test/layered_filter_fast_f32.rs
 */

package com.android.rs.refocus.renderscript;

import android.renderscript.*;
import com.android.rs.refocus.renderscript.layered_filter_fast_f32BitCode;

/**
 * @hide
 */
public class ScriptC_layered_filter_fast_f32 extends ScriptC {
    private static final String __rs_resource_name = "layered_filter_fast_f32";
    // Constructor
    public  ScriptC_layered_filter_fast_f32(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              layered_filter_fast_f32BitCode.getBitCode32(),
              layered_filter_fast_f32BitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __U8_4 = Element.U8_4(rs);
    }

    private Element __ALLOCATION;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private final static int mExportVarIdx_g_lut_apply_crf_float = 0;
    private Allocation mExportVar_g_lut_apply_crf_float;
    public synchronized void set_g_lut_apply_crf_float(Allocation v) {
        setVar(mExportVarIdx_g_lut_apply_crf_float, v);
        mExportVar_g_lut_apply_crf_float = v;
    }

    public Allocation get_g_lut_apply_crf_float() {
        return mExportVar_g_lut_apply_crf_float;
    }

    public Script.FieldID getFieldID_g_lut_apply_crf_float() {
        return createFieldID(mExportVarIdx_g_lut_apply_crf_float, null);
    }

    private final static int mExportVarIdx_g_lut_remove_crf_float = 1;
    private Allocation mExportVar_g_lut_remove_crf_float;
    public synchronized void set_g_lut_remove_crf_float(Allocation v) {
        setVar(mExportVarIdx_g_lut_remove_crf_float, v);
        mExportVar_g_lut_remove_crf_float = v;
    }

    public Allocation get_g_lut_remove_crf_float() {
        return mExportVar_g_lut_remove_crf_float;
    }

    public Script.FieldID getFieldID_g_lut_remove_crf_float() {
        return createFieldID(mExportVarIdx_g_lut_remove_crf_float, null);
    }

    private final static int mExportVarIdx_g_sharp_image_buffer = 2;
    private Allocation mExportVar_g_sharp_image_buffer;
    public void bind_g_sharp_image_buffer(Allocation v) {
        mExportVar_g_sharp_image_buffer = v;
        if (v == null) bindAllocation(null, mExportVarIdx_g_sharp_image_buffer);
        else bindAllocation(v, mExportVarIdx_g_sharp_image_buffer);
    }

    public Allocation get_g_sharp_image_buffer() {
        return mExportVar_g_sharp_image_buffer;
    }

    private final static int mExportVarIdx_g_fuzzy_image_buffer = 3;
    private Allocation mExportVar_g_fuzzy_image_buffer;
    public void bind_g_fuzzy_image_buffer(Allocation v) {
        mExportVar_g_fuzzy_image_buffer = v;
        if (v == null) bindAllocation(null, mExportVarIdx_g_fuzzy_image_buffer);
        else bindAllocation(v, mExportVarIdx_g_fuzzy_image_buffer);
    }

    public Allocation get_g_fuzzy_image_buffer() {
        return mExportVar_g_fuzzy_image_buffer;
    }

    private final static int mExportVarIdx_g_integral_image_buffer = 4;
    private Allocation mExportVar_g_integral_image_buffer;
    public void bind_g_integral_image_buffer(Allocation v) {
        mExportVar_g_integral_image_buffer = v;
        if (v == null) bindAllocation(null, mExportVarIdx_g_integral_image_buffer);
        else bindAllocation(v, mExportVarIdx_g_integral_image_buffer);
    }

    public Allocation get_g_integral_image_buffer() {
        return mExportVar_g_integral_image_buffer;
    }

    private final static int mExportVarIdx_g_kernel_stack = 5;
    private Allocation mExportVar_g_kernel_stack;
    public void bind_g_kernel_stack(Allocation v) {
        mExportVar_g_kernel_stack = v;
        if (v == null) bindAllocation(null, mExportVarIdx_g_kernel_stack);
        else bindAllocation(v, mExportVarIdx_g_kernel_stack);
    }

    public Allocation get_g_kernel_stack() {
        return mExportVar_g_kernel_stack;
    }

    private final static int mExportVarIdx_g_kernel_info = 6;
    private ScriptField_KernelInfo mExportVar_g_kernel_info;
    public void bind_g_kernel_info(ScriptField_KernelInfo v) {
        mExportVar_g_kernel_info = v;
        if (v == null) bindAllocation(null, mExportVarIdx_g_kernel_info);
        else bindAllocation(v.getAllocation(), mExportVarIdx_g_kernel_info);
    }

    public ScriptField_KernelInfo get_g_kernel_info() {
        return mExportVar_g_kernel_info;
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_UnpackInputImage = 1;
    public Script.KernelID getKernelID_UnpackInputImage() {
        return createKernelID(mExportForEachIdx_UnpackInputImage, 57, null, null);
    }

    public void forEach_UnpackInputImage(Allocation ain) {
        forEach_UnpackInputImage(ain, null);
    }

    public void forEach_UnpackInputImage(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_UnpackInputImage, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_MarkLayerMask = 2;
    public Script.KernelID getKernelID_MarkLayerMask() {
        return createKernelID(mExportForEachIdx_MarkLayerMask, 57, null, null);
    }

    public void forEach_MarkLayerMask(Allocation ain) {
        forEach_MarkLayerMask(ain, null);
    }

    public void forEach_MarkLayerMask(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_MarkLayerMask, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_ComputeLayerMatteBehindFocalDepth = 3;
    public Script.KernelID getKernelID_ComputeLayerMatteBehindFocalDepth() {
        return createKernelID(mExportForEachIdx_ComputeLayerMatteBehindFocalDepth, 57, null, null);
    }

    public void forEach_ComputeLayerMatteBehindFocalDepth(Allocation ain) {
        forEach_ComputeLayerMatteBehindFocalDepth(ain, null);
    }

    public void forEach_ComputeLayerMatteBehindFocalDepth(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_ComputeLayerMatteBehindFocalDepth, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_ComputeLayerMatteInFrontOfFocalDepth = 4;
    public Script.KernelID getKernelID_ComputeLayerMatteInFrontOfFocalDepth() {
        return createKernelID(mExportForEachIdx_ComputeLayerMatteInFrontOfFocalDepth, 57, null, null);
    }

    public void forEach_ComputeLayerMatteInFrontOfFocalDepth(Allocation ain) {
        forEach_ComputeLayerMatteInFrontOfFocalDepth(ain, null);
    }

    public void forEach_ComputeLayerMatteInFrontOfFocalDepth(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_ComputeLayerMatteInFrontOfFocalDepth, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_ComputeIntegralImageForLayerBehindFocalDepth = 5;
    public Script.KernelID getKernelID_ComputeIntegralImageForLayerBehindFocalDepth() {
        return createKernelID(mExportForEachIdx_ComputeIntegralImageForLayerBehindFocalDepth, 57, null, null);
    }

    public void forEach_ComputeIntegralImageForLayerBehindFocalDepth(Allocation ain) {
        forEach_ComputeIntegralImageForLayerBehindFocalDepth(ain, null);
    }

    public void forEach_ComputeIntegralImageForLayerBehindFocalDepth(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_ComputeIntegralImageForLayerBehindFocalDepth, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_ComputeIntegralImageForLayerInFrontOfFocalDepth = 6;
    public Script.KernelID getKernelID_ComputeIntegralImageForLayerInFrontOfFocalDepth() {
        return createKernelID(mExportForEachIdx_ComputeIntegralImageForLayerInFrontOfFocalDepth, 57, null, null);
    }

    public void forEach_ComputeIntegralImageForLayerInFrontOfFocalDepth(Allocation ain) {
        forEach_ComputeIntegralImageForLayerInFrontOfFocalDepth(ain, null);
    }

    public void forEach_ComputeIntegralImageForLayerInFrontOfFocalDepth(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_ComputeIntegralImageForLayerInFrontOfFocalDepth, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_FilterLayerBehindFocalDepth = 7;
    public Script.KernelID getKernelID_FilterLayerBehindFocalDepth() {
        return createKernelID(mExportForEachIdx_FilterLayerBehindFocalDepth, 57, null, null);
    }

    public void forEach_FilterLayerBehindFocalDepth(Allocation ain) {
        forEach_FilterLayerBehindFocalDepth(ain, null);
    }

    public void forEach_FilterLayerBehindFocalDepth(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_FilterLayerBehindFocalDepth, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_FilterLayerInFrontOfFocalDepth = 8;
    public Script.KernelID getKernelID_FilterLayerInFrontOfFocalDepth() {
        return createKernelID(mExportForEachIdx_FilterLayerInFrontOfFocalDepth, 57, null, null);
    }

    public void forEach_FilterLayerInFrontOfFocalDepth(Allocation ain) {
        forEach_FilterLayerInFrontOfFocalDepth(ain, null);
    }

    public void forEach_FilterLayerInFrontOfFocalDepth(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_FilterLayerInFrontOfFocalDepth, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_UpdateSharpImageUsingFuzzyImage = 9;
    public Script.KernelID getKernelID_UpdateSharpImageUsingFuzzyImage() {
        return createKernelID(mExportForEachIdx_UpdateSharpImageUsingFuzzyImage, 57, null, null);
    }

    public void forEach_UpdateSharpImageUsingFuzzyImage(Allocation ain) {
        forEach_UpdateSharpImageUsingFuzzyImage(ain, null);
    }

    public void forEach_UpdateSharpImageUsingFuzzyImage(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_UpdateSharpImageUsingFuzzyImage, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_FinalizeFuzzyImageUsingSharpImage = 10;
    public Script.KernelID getKernelID_FinalizeFuzzyImageUsingSharpImage() {
        return createKernelID(mExportForEachIdx_FinalizeFuzzyImageUsingSharpImage, 57, null, null);
    }

    public void forEach_FinalizeFuzzyImageUsingSharpImage(Allocation ain) {
        forEach_FinalizeFuzzyImageUsingSharpImage(ain, null);
    }

    public void forEach_FinalizeFuzzyImageUsingSharpImage(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_FinalizeFuzzyImageUsingSharpImage, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_PackOutputImage = 11;
    public Script.KernelID getKernelID_PackOutputImage() {
        return createKernelID(mExportForEachIdx_PackOutputImage, 58, null, null);
    }

    public void forEach_PackOutputImage(Allocation aout) {
        forEach_PackOutputImage(aout, null);
    }

    public void forEach_PackOutputImage(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_PackOutputImage, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_PackSharpImage = 12;
    public Script.KernelID getKernelID_PackSharpImage() {
        return createKernelID(mExportForEachIdx_PackSharpImage, 58, null, null);
    }

    public void forEach_PackSharpImage(Allocation aout) {
        forEach_PackSharpImage(aout, null);
    }

    public void forEach_PackSharpImage(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_PackSharpImage, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_PackFuzzyImage = 13;
    public Script.KernelID getKernelID_PackFuzzyImage() {
        return createKernelID(mExportForEachIdx_PackFuzzyImage, 58, null, null);
    }

    public void forEach_PackFuzzyImage(Allocation aout) {
        forEach_PackFuzzyImage(aout, null);
    }

    public void forEach_PackFuzzyImage(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_PackFuzzyImage, (Allocation) null, aout, null, sc);
    }

    private final static int mExportFuncIdx_SetTargetLayer = 0;
    public Script.InvokeID getInvokeID_SetTargetLayer() {
        return createInvokeID(mExportFuncIdx_SetTargetLayer);
    }

    public void invoke_SetTargetLayer(int front, int back) {
        FieldPacker SetTargetLayer_fp = new FieldPacker(8);
        SetTargetLayer_fp.addI32(front);
        SetTargetLayer_fp.addI32(back);
        invoke(mExportFuncIdx_SetTargetLayer, SetTargetLayer_fp);
    }

    private final static int mExportFuncIdx_SetBlendInfo = 1;
    public Script.InvokeID getInvokeID_SetBlendInfo() {
        return createInvokeID(mExportFuncIdx_SetBlendInfo);
    }

    public void invoke_SetBlendInfo(int radius) {
        FieldPacker SetBlendInfo_fp = new FieldPacker(4);
        SetBlendInfo_fp.addI32(radius);
        invoke(mExportFuncIdx_SetBlendInfo, SetBlendInfo_fp);
    }

    private final static int mExportFuncIdx_SetUseIntegralImage = 2;
    public Script.InvokeID getInvokeID_SetUseIntegralImage() {
        return createInvokeID(mExportFuncIdx_SetUseIntegralImage);
    }

    public void invoke_SetUseIntegralImage(int use_integral_image) {
        FieldPacker SetUseIntegralImage_fp = new FieldPacker(4);
        SetUseIntegralImage_fp.addI32(use_integral_image);
        invoke(mExportFuncIdx_SetUseIntegralImage, SetUseIntegralImage_fp);
    }

    private final static int mExportFuncIdx_InitializeF32 = 3;
    public Script.InvokeID getInvokeID_InitializeF32() {
        return createInvokeID(mExportFuncIdx_InitializeF32);
    }

    public void invoke_InitializeF32(int width, int height, int margin, int front, int back) {
        FieldPacker InitializeF32_fp = new FieldPacker(20);
        InitializeF32_fp.addI32(width);
        InitializeF32_fp.addI32(height);
        InitializeF32_fp.addI32(margin);
        InitializeF32_fp.addI32(front);
        InitializeF32_fp.addI32(back);
        invoke(mExportFuncIdx_InitializeF32, InitializeF32_fp);
    }

}

