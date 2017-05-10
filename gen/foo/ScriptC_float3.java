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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_float3/float3.rs
 */

package foo;

import android.renderscript.*;
import foo.float3BitCode;

/**
 * @hide
 */
public class ScriptC_float3 extends ScriptC {
    private static final String __rs_resource_name = "float3";
    // Constructor
    public  ScriptC_float3(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              float3BitCode.getBitCode32(),
              float3BitCode.getBitCode64());
        __F32_3 = Element.F32_3(rs);
        __ScriptField_s = ScriptField_s.createElement(rs);
    }

    private Element __F32_3;
    private Element __ScriptField_s;
    private FieldPacker __rs_fp_F32_3;
    private FieldPacker __rs_fp_ScriptField_s;
    private final static int mExportVarIdx_f = 0;
    private Float3 mExportVar_f;
    public synchronized void set_f(Float3 v) {
        mExportVar_f = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_f, fp, __F32_3, __dimArr);
    }

    public Float3 get_f() {
        return mExportVar_f;
    }

    public Script.FieldID getFieldID_f() {
        return createFieldID(mExportVarIdx_f, null);
    }

    private final static int mExportVarIdx_f1 = 1;
    private Float3[] mExportVar_f1;
    public synchronized void set_f1(Float3[] v) {
        mExportVar_f1 = v;
        FieldPacker fp = new FieldPacker(16);
        for (int ct1 = 0; ct1 < 1; ct1++) {
            fp.addF32(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_f1, fp, __F32_3, __dimArr);
    }

    public Float3[] get_f1() {
        return mExportVar_f1;
    }

    public Script.FieldID getFieldID_f1() {
        return createFieldID(mExportVarIdx_f1, null);
    }

    private final static int mExportVarIdx_myStruct = 2;
    private ScriptField_s.Item mExportVar_myStruct;
    public synchronized void set_myStruct(ScriptField_s.Item v) {
        mExportVar_myStruct = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addF32(v.f);
        fp.skip(4);
        for (int ct2 = 0; ct2 < 1; ct2++) {
            fp.addF32(v.f1[ct2]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_myStruct, fp, __ScriptField_s, __dimArr);
    }

    public ScriptField_s.Item get_myStruct() {
        return mExportVar_myStruct;
    }

    public Script.FieldID getFieldID_myStruct() {
        return createFieldID(mExportVarIdx_myStruct, null);
    }

}

