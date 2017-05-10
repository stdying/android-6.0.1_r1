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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_struct_matrix/struct_matrix.rs
 */

package foo;

import android.renderscript.*;
import foo.struct_matrixBitCode;

/**
 * @hide
 */
public class ScriptC_struct_matrix extends ScriptC {
    private static final String __rs_resource_name = "struct_matrix";
    // Constructor
    public  ScriptC_struct_matrix(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              struct_matrixBitCode.getBitCode32(),
              struct_matrixBitCode.getBitCode64());
        __ScriptField_hasMatrix = ScriptField_hasMatrix.createElement(rs);
        __ScriptField_new_struct = ScriptField_new_struct.createElement(rs);
    }

    private Element __ScriptField_hasMatrix;
    private Element __ScriptField_new_struct;
    private FieldPacker __rs_fp_ScriptField_hasMatrix;
    private FieldPacker __rs_fp_ScriptField_new_struct;
    private final static int mExportVarIdx_ghm = 0;
    private ScriptField_hasMatrix.Item mExportVar_ghm;
    public synchronized void set_ghm(ScriptField_hasMatrix.Item v) {
        mExportVar_ghm = v;
        FieldPacker fp = new FieldPacker(44);
        fp.addI32(v.j);
        fp.addMatrix(v.m);
        fp.addI32(v.i);
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

    private final static int mExportVarIdx_newm = 1;
    private ScriptField_new_struct.Item mExportVar_newm;
    public synchronized void set_newm(ScriptField_new_struct.Item v) {
        mExportVar_newm = v;
        FieldPacker fp = new FieldPacker(48);
        for (int ct3 = 0; ct3 < 2; ct3++) {
            fp.addF32(v.m.f[ct3]);
        }

        fp.addMatrix(v.t);
        fp.addI32(v.i);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_newm, fp, __ScriptField_new_struct, __dimArr);
    }

    public ScriptField_new_struct.Item get_newm() {
        return mExportVar_newm;
    }

    public Script.FieldID getFieldID_newm() {
        return createFieldID(mExportVarIdx_newm, null);
    }

    private final static int mExportFuncIdx_singleStmt = 0;
    public Script.InvokeID getInvokeID_singleStmt() {
        return createInvokeID(mExportFuncIdx_singleStmt);
    }

    public void invoke_singleStmt() {
        invoke(mExportFuncIdx_singleStmt);
    }

    private final static int mExportFuncIdx_newstmt = 1;
    public Script.InvokeID getInvokeID_newstmt() {
        return createInvokeID(mExportFuncIdx_newstmt);
    }

    public void invoke_newstmt() {
        invoke(mExportFuncIdx_newstmt);
    }

}

