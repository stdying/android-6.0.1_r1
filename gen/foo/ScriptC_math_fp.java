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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_math_fp/math_fp.rs
 */

package foo;

import android.renderscript.*;
import foo.math_fpBitCode;

/**
 * @hide
 */
public class ScriptC_math_fp extends ScriptC {
    private static final String __rs_resource_name = "math_fp";
    // Constructor
    public  ScriptC_math_fp(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              math_fpBitCode.getBitCode32(),
              math_fpBitCode.getBitCode64());
        __I32 = Element.I32(rs);
        __I32_2 = Element.I32_2(rs);
        __I32_3 = Element.I32_3(rs);
        __I32_4 = Element.I32_4(rs);
        __F32 = Element.F32(rs);
        __F32_2 = Element.F32_2(rs);
        __F32_3 = Element.F32_3(rs);
        __F32_4 = Element.F32_4(rs);
    }

    private Element __F32;
    private Element __F32_2;
    private Element __F32_3;
    private Element __F32_4;
    private Element __I32;
    private Element __I32_2;
    private Element __I32_3;
    private Element __I32_4;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_F32_2;
    private FieldPacker __rs_fp_F32_3;
    private FieldPacker __rs_fp_F32_4;
    private FieldPacker __rs_fp_I32;
    private FieldPacker __rs_fp_I32_2;
    private FieldPacker __rs_fp_I32_3;
    private FieldPacker __rs_fp_I32_4;
    private final static int mExportVarIdx_i = 0;
    private int mExportVar_i;
    public synchronized void set_i(int v) {
        setVar(mExportVarIdx_i, v);
        mExportVar_i = v;
    }

    public int get_i() {
        return mExportVar_i;
    }

    public Script.FieldID getFieldID_i() {
        return createFieldID(mExportVarIdx_i, null);
    }

    private final static int mExportVarIdx_i2 = 1;
    private Int2 mExportVar_i2;
    public synchronized void set_i2(Int2 v) {
        mExportVar_i2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_i2, fp, __I32_2, __dimArr);
    }

    public Int2 get_i2() {
        return mExportVar_i2;
    }

    public Script.FieldID getFieldID_i2() {
        return createFieldID(mExportVarIdx_i2, null);
    }

    private final static int mExportVarIdx_i3 = 2;
    private Int3 mExportVar_i3;
    public synchronized void set_i3(Int3 v) {
        mExportVar_i3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_i3, fp, __I32_3, __dimArr);
    }

    public Int3 get_i3() {
        return mExportVar_i3;
    }

    public Script.FieldID getFieldID_i3() {
        return createFieldID(mExportVarIdx_i3, null);
    }

    private final static int mExportVarIdx_i4 = 3;
    private Int4 mExportVar_i4;
    public synchronized void set_i4(Int4 v) {
        mExportVar_i4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_i4, fp, __I32_4, __dimArr);
    }

    public Int4 get_i4() {
        return mExportVar_i4;
    }

    public Script.FieldID getFieldID_i4() {
        return createFieldID(mExportVarIdx_i4, null);
    }

    private final static int mExportVarIdx_f = 4;
    private float mExportVar_f;
    public synchronized void set_f(float v) {
        setVar(mExportVarIdx_f, v);
        mExportVar_f = v;
    }

    public float get_f() {
        return mExportVar_f;
    }

    public Script.FieldID getFieldID_f() {
        return createFieldID(mExportVarIdx_f, null);
    }

    private final static int mExportVarIdx_f2 = 5;
    private Float2 mExportVar_f2;
    public synchronized void set_f2(Float2 v) {
        mExportVar_f2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_f2, fp, __F32_2, __dimArr);
    }

    public Float2 get_f2() {
        return mExportVar_f2;
    }

    public Script.FieldID getFieldID_f2() {
        return createFieldID(mExportVarIdx_f2, null);
    }

    private final static int mExportVarIdx_f3 = 6;
    private Float3 mExportVar_f3;
    public synchronized void set_f3(Float3 v) {
        mExportVar_f3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_f3, fp, __F32_3, __dimArr);
    }

    public Float3 get_f3() {
        return mExportVar_f3;
    }

    public Script.FieldID getFieldID_f3() {
        return createFieldID(mExportVarIdx_f3, null);
    }

    private final static int mExportVarIdx_f4 = 7;
    private Float4 mExportVar_f4;
    public synchronized void set_f4(Float4 v) {
        mExportVar_f4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_f4, fp, __F32_4, __dimArr);
    }

    public Float4 get_f4() {
        return mExportVar_f4;
    }

    public Script.FieldID getFieldID_f4() {
        return createFieldID(mExportVarIdx_f4, null);
    }

    private final static int mExportFuncIdx_compile_all_math_fp_ops = 0;
    public Script.InvokeID getInvokeID_compile_all_math_fp_ops() {
        return createInvokeID(mExportFuncIdx_compile_all_math_fp_ops);
    }

    public void invoke_compile_all_math_fp_ops() {
        invoke(mExportFuncIdx_compile_all_math_fp_ops);
    }

}

