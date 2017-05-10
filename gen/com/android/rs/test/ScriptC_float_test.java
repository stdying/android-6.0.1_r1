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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/RsTest/src/com/android/rs/test/float_test.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.float_testBitCode;

/**
 * @hide
 */
public class ScriptC_float_test extends ScriptC {
    private static final String __rs_resource_name = "float_test";
    // Constructor
    public  ScriptC_float_test(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              float_testBitCode.getBitCode32(),
              float_testBitCode.getBitCode64());
        __F32 = Element.F32(rs);
        __F64 = Element.F64(rs);
        __I64 = Element.I64(rs);
    }

    private Element __F32;
    private Element __F64;
    private Element __I64;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_F64;
    private FieldPacker __rs_fp_I64;
    private final static int mExportVarIdx_floatVal = 0;
    private float mExportVar_floatVal;
    public synchronized void set_floatVal(float v) {
        setVar(mExportVarIdx_floatVal, v);
        mExportVar_floatVal = v;
    }

    public float get_floatVal() {
        return mExportVar_floatVal;
    }

    public Script.FieldID getFieldID_floatVal() {
        return createFieldID(mExportVarIdx_floatVal, null);
    }

    private final static int mExportVarIdx_val = 1;
    private double mExportVar_val;
    public synchronized void set_val(double v) {
        setVar(mExportVarIdx_val, v);
        mExportVar_val = v;
    }

    public double get_val() {
        return mExportVar_val;
    }

    public Script.FieldID getFieldID_val() {
        return createFieldID(mExportVarIdx_val, null);
    }

    private final static int mExportVarIdx_valLong = 2;
    private long mExportVar_valLong;
    public synchronized void set_valLong(long v) {
        setVar(mExportVarIdx_valLong, v);
        mExportVar_valLong = v;
    }

    public long get_valLong() {
        return mExportVar_valLong;
    }

    public Script.FieldID getFieldID_valLong() {
        return createFieldID(mExportVarIdx_valLong, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_foo = 1;
    public Script.KernelID getKernelID_foo() {
        return createKernelID(mExportForEachIdx_foo, 35, null, null);
    }

    public void forEach_foo(Allocation ain, Allocation aout) {
        forEach_foo(ain, aout, null);
    }

    public void forEach_foo(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
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

        forEach(mExportForEachIdx_foo, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_goo = 2;
    public Script.KernelID getKernelID_goo() {
        return createKernelID(mExportForEachIdx_goo, 35, null, null);
    }

    public void forEach_goo(Allocation ain, Allocation aout) {
        forEach_goo(ain, aout, null);
    }

    public void forEach_goo(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
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

        forEach(mExportForEachIdx_goo, ain, aout, null, sc);
    }

}

