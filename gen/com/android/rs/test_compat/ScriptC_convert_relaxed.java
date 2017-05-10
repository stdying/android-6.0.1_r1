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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/convert_relaxed.rs
 */

package com.android.rs.test_compat;

import android.renderscript.*;
import com.android.rs.test_compat.convert_relaxedBitCode;

/**
 * @hide
 */
public class ScriptC_convert_relaxed extends ScriptC {
    private static final String __rs_resource_name = "convert_relaxed";
    // Constructor
    public  ScriptC_convert_relaxed(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              convert_relaxedBitCode.getBitCode32(),
              convert_relaxedBitCode.getBitCode64());
        mExportVar_f4 = new Float4();
        mExportVar_f4.x = 2.f;
        mExportVar_f4.y = 4.f;
        mExportVar_f4.z = 6.f;
        mExportVar_f4.w = 8.f;
        __F32_4 = Element.F32_4(rs);
        mExportVar_i8_4 = new Byte4();
        mExportVar_i8_4.x = -1;
        mExportVar_i8_4.y = -2;
        mExportVar_i8_4.z = -3;
        mExportVar_i8_4.w = 4;
        __I8_4 = Element.I8_4(rs);
    }

    private Element __F32_4;
    private Element __I8_4;
    private FieldPacker __rs_fp_F32_4;
    private FieldPacker __rs_fp_I8_4;
    private final static int mExportVarIdx_f4 = 0;
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

    private final static int mExportVarIdx_i8_4 = 1;
    private Byte4 mExportVar_i8_4;
    public synchronized void set_i8_4(Byte4 v) {
        mExportVar_i8_4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_i8_4, fp, __I8_4, __dimArr);
    }

    public Byte4 get_i8_4() {
        return mExportVar_i8_4;
    }

    public Script.FieldID getFieldID_i8_4() {
        return createFieldID(mExportVarIdx_i8_4, null);
    }

    private final static int mExportFuncIdx_convert_test = 0;
    public Script.InvokeID getInvokeID_convert_test() {
        return createInvokeID(mExportFuncIdx_convert_test);
    }

    public void invoke_convert_test() {
        invoke(mExportFuncIdx_convert_test);
    }

}

