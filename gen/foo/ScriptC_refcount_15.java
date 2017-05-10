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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/F_refcount_15/refcount_15.rs
 */

package foo;

import android.renderscript.*;
import foo.refcount_15BitCode;

/**
 * @hide
 */
public class ScriptC_refcount_15 extends ScriptC {
    private static final String __rs_resource_name = "refcount_15";
    // Constructor
    public  ScriptC_refcount_15(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              refcount_15BitCode.getBitCode32(),
              refcount_15BitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __ScriptField_rsStruct = ScriptField_rsStruct.createElement(rs);
    }

    private Element __ALLOCATION;
    private Element __ScriptField_rsStruct;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_ScriptField_rsStruct;
    private final static int mExportVarIdx_aFail = 0;
    private Allocation[] mExportVar_aFail;
    public synchronized void set_aFail(Allocation[] v) {
        mExportVar_aFail = v;
        FieldPacker fp = new FieldPacker(64);
        for (int ct1 = 0; ct1 < 2; ct1++) {
            fp.addObj(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 2;
        setVar(mExportVarIdx_aFail, fp, __ALLOCATION, __dimArr);
    }

    public Allocation[] get_aFail() {
        return mExportVar_aFail;
    }

    public Script.FieldID getFieldID_aFail() {
        return createFieldID(mExportVarIdx_aFail, null);
    }

    private final static int mExportVarIdx_sFail = 1;
    private ScriptField_rsStruct.Item mExportVar_sFail;
    public synchronized void set_sFail(ScriptField_rsStruct.Item v) {
        mExportVar_sFail = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addObj(v.a);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_sFail, fp, __ScriptField_rsStruct, __dimArr);
    }

    public ScriptField_rsStruct.Item get_sFail() {
        return mExportVar_sFail;
    }

    public Script.FieldID getFieldID_sFail() {
        return createFieldID(mExportVarIdx_sFail, null);
    }

    private final static int mExportVarIdx_ptrOk = 2;
    private ScriptField_onlyPtr mExportVar_ptrOk;
    public void bind_ptrOk(ScriptField_onlyPtr v) {
        mExportVar_ptrOk = v;
        if (v == null) bindAllocation(null, mExportVarIdx_ptrOk);
        else bindAllocation(v.getAllocation(), mExportVarIdx_ptrOk);
    }

    public ScriptField_onlyPtr get_ptrOk() {
        return mExportVar_ptrOk;
    }

}

