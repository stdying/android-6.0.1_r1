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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/external/opencv3/modules/rsobjdetect/src/rs/detectAt.rs
 */

package unused;

import android.renderscript.*;
import unused.detectAtBitCode;

/**
 * @hide
 */
public class ScriptC_detectAt extends ScriptC {
    private static final String __rs_resource_name = "detectat";
    // Constructor
    public  ScriptC_detectAt(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              detectAtBitCode.getBitCode32(),
              detectAtBitCode.getBitCode64());
        __I32 = Element.I32(rs);
        __U32_4 = Element.U32_4(rs);
        __F32 = Element.F32(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __BOOLEAN = Element.BOOLEAN(rs);
    }

    private Element __ALLOCATION;
    private Element __BOOLEAN;
    private Element __F32;
    private Element __I32;
    private Element __U32_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_I32;
    private FieldPacker __rs_fp_U32_4;
    private final static int mExportVarIdx_sqofs = 0;
    private int mExportVar_sqofs;
    public synchronized void set_sqofs(int v) {
        setVar(mExportVarIdx_sqofs, v);
        mExportVar_sqofs = v;
    }

    public int get_sqofs() {
        return mExportVar_sqofs;
    }

    public Script.FieldID getFieldID_sqofs() {
        return createFieldID(mExportVarIdx_sqofs, null);
    }

    private final static int mExportVarIdx_nrect = 1;
    private Long4 mExportVar_nrect;
    public synchronized void set_nrect(Long4 v) {
        mExportVar_nrect = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_nrect, fp, __U32_4, __dimArr);
    }

    public Long4 get_nrect() {
        return mExportVar_nrect;
    }

    public Script.FieldID getFieldID_nrect() {
        return createFieldID(mExportVarIdx_nrect, null);
    }

    private final static int mExportVarIdx_normRectArea = 2;
    private float mExportVar_normRectArea;
    public synchronized void set_normRectArea(float v) {
        setVar(mExportVarIdx_normRectArea, v);
        mExportVar_normRectArea = v;
    }

    public float get_normRectArea() {
        return mExportVar_normRectArea;
    }

    public Script.FieldID getFieldID_normRectArea() {
        return createFieldID(mExportVarIdx_normRectArea, null);
    }

    private final static int mExportVarIdx_stagesSize = 3;
    private int mExportVar_stagesSize;
    public synchronized void set_stagesSize(int v) {
        setVar(mExportVarIdx_stagesSize, v);
        mExportVar_stagesSize = v;
    }

    public int get_stagesSize() {
        return mExportVar_stagesSize;
    }

    public Script.FieldID getFieldID_stagesSize() {
        return createFieldID(mExportVarIdx_stagesSize, null);
    }

    private final static int mExportVarIdx_width = 4;
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

    private final static int mExportVarIdx_height = 5;
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

    private final static int mExportVarIdx_origWidth = 6;
    private int mExportVar_origWidth;
    public synchronized void set_origWidth(int v) {
        setVar(mExportVarIdx_origWidth, v);
        mExportVar_origWidth = v;
    }

    public int get_origWidth() {
        return mExportVar_origWidth;
    }

    public Script.FieldID getFieldID_origWidth() {
        return createFieldID(mExportVarIdx_origWidth, null);
    }

    private final static int mExportVarIdx_origHeight = 7;
    private int mExportVar_origHeight;
    public synchronized void set_origHeight(int v) {
        setVar(mExportVarIdx_origHeight, v);
        mExportVar_origHeight = v;
    }

    public int get_origHeight() {
        return mExportVar_origHeight;
    }

    public Script.FieldID getFieldID_origHeight() {
        return createFieldID(mExportVarIdx_origHeight, null);
    }

    private final static int mExportVarIdx_yStep = 8;
    private int mExportVar_yStep;
    public synchronized void set_yStep(int v) {
        setVar(mExportVarIdx_yStep, v);
        mExportVar_yStep = v;
    }

    public int get_yStep() {
        return mExportVar_yStep;
    }

    public Script.FieldID getFieldID_yStep() {
        return createFieldID(mExportVarIdx_yStep, null);
    }

    private final static int mExportVarIdx_inAlloc = 9;
    private Allocation mExportVar_inAlloc;
    public synchronized void set_inAlloc(Allocation v) {
        setVar(mExportVarIdx_inAlloc, v);
        mExportVar_inAlloc = v;
    }

    public Allocation get_inAlloc() {
        return mExportVar_inAlloc;
    }

    public Script.FieldID getFieldID_inAlloc() {
        return createFieldID(mExportVarIdx_inAlloc, null);
    }

    private final static int mExportVarIdx_inAllocSq = 10;
    private Allocation mExportVar_inAllocSq;
    public synchronized void set_inAllocSq(Allocation v) {
        setVar(mExportVarIdx_inAllocSq, v);
        mExportVar_inAllocSq = v;
    }

    public Allocation get_inAllocSq() {
        return mExportVar_inAllocSq;
    }

    public Script.FieldID getFieldID_inAllocSq() {
        return createFieldID(mExportVarIdx_inAllocSq, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_runAtHaarKernel = 1;
    public Script.KernelID getKernelID_runAtHaarKernel() {
        return createKernelID(mExportForEachIdx_runAtHaarKernel, 43, null, null);
    }

    public void forEach_runAtHaarKernel(Allocation ain, Allocation aout) {
        forEach_runAtHaarKernel(ain, aout, null);
    }

    public void forEach_runAtHaarKernel(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
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

        forEach(mExportForEachIdx_runAtHaarKernel, ain, aout, null, sc);
    }

    private final static int mExportFuncIdx_initCurr = 0;
    public Script.InvokeID getInvokeID_initCurr() {
        return createInvokeID(mExportFuncIdx_initCurr);
    }

    public void invoke_initCurr() {
        invoke(mExportFuncIdx_initCurr);
    }

    private final static int mExportFuncIdx_addStage = 1;
    public Script.InvokeID getInvokeID_addStage() {
        return createInvokeID(mExportFuncIdx_addStage);
    }

    public void invoke_addStage(int first, int ntrees, float threshold) {
        FieldPacker addStage_fp = new FieldPacker(12);
        addStage_fp.addI32(first);
        addStage_fp.addI32(ntrees);
        addStage_fp.addF32(threshold);
        invoke(mExportFuncIdx_addStage, addStage_fp);
    }

    private final static int mExportFuncIdx_addStump = 2;
    public Script.InvokeID getInvokeID_addStump() {
        return createInvokeID(mExportFuncIdx_addStump);
    }

    public void invoke_addStump(int featureIdx, float threshold, float left, float right) {
        FieldPacker addStump_fp = new FieldPacker(16);
        addStump_fp.addI32(featureIdx);
        addStump_fp.addF32(threshold);
        addStump_fp.addF32(left);
        addStump_fp.addF32(right);
        invoke(mExportFuncIdx_addStump, addStump_fp);
    }

    private final static int mExportFuncIdx_addHF = 3;
    public Script.InvokeID getInvokeID_addHF() {
        return createInvokeID(mExportFuncIdx_addHF);
    }

    public void invoke_addHF(int x0, int y0, int w0, int h0, int x1, int y1, int w1, int h1, int x2, int y2, int w2, int h2, float we0, float we1, float we2) {
        FieldPacker addHF_fp = new FieldPacker(60);
        addHF_fp.addI32(x0);
        addHF_fp.addI32(y0);
        addHF_fp.addI32(w0);
        addHF_fp.addI32(h0);
        addHF_fp.addI32(x1);
        addHF_fp.addI32(y1);
        addHF_fp.addI32(w1);
        addHF_fp.addI32(h1);
        addHF_fp.addI32(x2);
        addHF_fp.addI32(y2);
        addHF_fp.addI32(w2);
        addHF_fp.addI32(h2);
        addHF_fp.addF32(we0);
        addHF_fp.addF32(we1);
        addHF_fp.addF32(we2);
        invoke(mExportFuncIdx_addHF, addHF_fp);
    }

}

