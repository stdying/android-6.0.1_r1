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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_refcount/refcount.rs
 */

package foo;

import android.renderscript.*;
import foo.refcountBitCode;

/**
 * @hide
 */
public class ScriptC_refcount extends ScriptC {
    private static final String __rs_resource_name = "refcount";
    // Constructor
    public  ScriptC_refcount(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              refcountBitCode.getBitCode32(),
              refcountBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __ScriptField_hasMatrix = ScriptField_hasMatrix.createElement(rs);
    }

    private Element __ALLOCATION;
    private Element __ScriptField_hasMatrix;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_ScriptField_hasMatrix;
    private final static int mExportVarIdx_globalAlloc = 0;
    private Allocation mExportVar_globalAlloc;
    public synchronized void set_globalAlloc(Allocation v) {
        setVar(mExportVarIdx_globalAlloc, v);
        mExportVar_globalAlloc = v;
    }

    public Allocation get_globalAlloc() {
        return mExportVar_globalAlloc;
    }

    public Script.FieldID getFieldID_globalAlloc() {
        return createFieldID(mExportVarIdx_globalAlloc, null);
    }

    private final static int mExportVarIdx_globalAlloc2 = 1;
    private Allocation mExportVar_globalAlloc2;
    public synchronized void set_globalAlloc2(Allocation v) {
        setVar(mExportVarIdx_globalAlloc2, v);
        mExportVar_globalAlloc2 = v;
    }

    public Allocation get_globalAlloc2() {
        return mExportVar_globalAlloc2;
    }

    public Script.FieldID getFieldID_globalAlloc2() {
        return createFieldID(mExportVarIdx_globalAlloc2, null);
    }

    private final static int mExportVarIdx_ghm = 2;
    private ScriptField_hasMatrix.Item mExportVar_ghm;
    public synchronized void set_ghm(ScriptField_hasMatrix.Item v) {
        mExportVar_ghm = v;
        FieldPacker fp = new FieldPacker(36);
        fp.addMatrix(v.m);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_ghm, fp, __ScriptField_hasMatrix, __dimArr);
    }

    public ScriptField_hasMatrix.Item get_ghm() {
        return mExportVar_ghm;
    }

    public Script.FieldID getFieldID_ghm() {
        return createFieldID(mExportVarIdx_ghm, null);
    }

    private final static int mExportFuncIdx_singleStmt = 0;
    public Script.InvokeID getInvokeID_singleStmt() {
        return createInvokeID(mExportFuncIdx_singleStmt);
    }

    public void invoke_singleStmt() {
        invoke(mExportFuncIdx_singleStmt);
    }

}

