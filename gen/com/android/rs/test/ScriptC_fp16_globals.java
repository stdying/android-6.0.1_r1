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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/RsTest/src/com/android/rs/test/fp16_globals.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.fp16_globalsBitCode;

/**
 * @hide
 */
public class ScriptC_fp16_globals extends ScriptC {
    private static final String __rs_resource_name = "fp16_globals";
    // Constructor
    public  ScriptC_fp16_globals(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              fp16_globalsBitCode.getBitCode32(),
              fp16_globalsBitCode.getBitCode64());
        __F16 = Element.F16(rs);
        __F16_2 = Element.F16_2(rs);
        __F16_3 = Element.F16_3(rs);
        __F16_4 = Element.F16_4(rs);
    }

    private Element __F16;
    private Element __F16_2;
    private Element __F16_3;
    private Element __F16_4;
    private FieldPacker __rs_fp_F16;
    private FieldPacker __rs_fp_F16_2;
    private FieldPacker __rs_fp_F16_3;
    private FieldPacker __rs_fp_F16_4;
    private final static int mExportVarIdx_gHalf = 0;
    private short mExportVar_gHalf;
    public synchronized void set_gHalf(short v) {
        if (__rs_fp_F16!= null) {
            __rs_fp_F16.reset();
        } else {
            __rs_fp_F16 = new FieldPacker(2);
        }
        __rs_fp_F16.addI16(v);
        setVar(mExportVarIdx_gHalf, __rs_fp_F16);
        mExportVar_gHalf = v;
    }

    public short get_gHalf() {
        return mExportVar_gHalf;
    }

    public Script.FieldID getFieldID_gHalf() {
        return createFieldID(mExportVarIdx_gHalf, null);
    }

    private final static int mExportVarIdx_gHalf2 = 1;
    private Short2 mExportVar_gHalf2;
    public synchronized void set_gHalf2(Short2 v) {
        mExportVar_gHalf2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_gHalf2, fp, __F16_2, __dimArr);
    }

    public Short2 get_gHalf2() {
        return mExportVar_gHalf2;
    }

    public Script.FieldID getFieldID_gHalf2() {
        return createFieldID(mExportVarIdx_gHalf2, null);
    }

    private final static int mExportVarIdx_gHalf3 = 2;
    private Short3 mExportVar_gHalf3;
    public synchronized void set_gHalf3(Short3 v) {
        mExportVar_gHalf3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_gHalf3, fp, __F16_3, __dimArr);
    }

    public Short3 get_gHalf3() {
        return mExportVar_gHalf3;
    }

    public Script.FieldID getFieldID_gHalf3() {
        return createFieldID(mExportVarIdx_gHalf3, null);
    }

    private final static int mExportVarIdx_gHalf4 = 3;
    private Short4 mExportVar_gHalf4;
    public synchronized void set_gHalf4(Short4 v) {
        mExportVar_gHalf4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_gHalf4, fp, __F16_4, __dimArr);
    }

    public Short4 get_gHalf4() {
        return mExportVar_gHalf4;
    }

    public Script.FieldID getFieldID_gHalf4() {
        return createFieldID(mExportVarIdx_gHalf4, null);
    }

    private final static int mExportFuncIdx_validateHalf = 0;
    public Script.InvokeID getInvokeID_validateHalf() {
        return createInvokeID(mExportFuncIdx_validateHalf);
    }

    public void invoke_validateHalf(short h) {
        FieldPacker validateHalf_fp = new FieldPacker(2);
        validateHalf_fp.addI16(h);
        invoke(mExportFuncIdx_validateHalf, validateHalf_fp);
    }

    private final static int mExportFuncIdx_validateHalf2 = 1;
    public Script.InvokeID getInvokeID_validateHalf2() {
        return createInvokeID(mExportFuncIdx_validateHalf2);
    }

    public void invoke_validateHalf2(Short2 h2) {
        FieldPacker validateHalf2_fp = new FieldPacker(4);
        validateHalf2_fp.addI16(h2);
        invoke(mExportFuncIdx_validateHalf2, validateHalf2_fp);
    }

    private final static int mExportFuncIdx_validateHalf3 = 2;
    public Script.InvokeID getInvokeID_validateHalf3() {
        return createInvokeID(mExportFuncIdx_validateHalf3);
    }

    public void invoke_validateHalf3(Short3 h3) {
        FieldPacker validateHalf3_fp = new FieldPacker(8);
        validateHalf3_fp.addI16(h3);
        validateHalf3_fp.skip(2);
        invoke(mExportFuncIdx_validateHalf3, validateHalf3_fp);
    }

    private final static int mExportFuncIdx_validateHalf4 = 3;
    public Script.InvokeID getInvokeID_validateHalf4() {
        return createInvokeID(mExportFuncIdx_validateHalf4);
    }

    public void invoke_validateHalf4(Short4 h4) {
        FieldPacker validateHalf4_fp = new FieldPacker(8);
        validateHalf4_fp.addI16(h4);
        invoke(mExportFuncIdx_validateHalf4, validateHalf4_fp);
    }

    private final static int mExportFuncIdx_test = 4;
    public Script.InvokeID getInvokeID_test() {
        return createInvokeID(mExportFuncIdx_test);
    }

    public void invoke_test(short h, Short2 h2, Short3 h3, Short4 h4) {
        FieldPacker test_fp = new FieldPacker(24);
        test_fp.addI16(h);
        test_fp.skip(2);
        test_fp.addI16(h2);
        test_fp.addI16(h3);
        test_fp.skip(2);
        test_fp.addI16(h4);
        invoke(mExportFuncIdx_test, test_fp);
    }

}

