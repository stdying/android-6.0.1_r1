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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/RsTest/src/com/android/rs/test/small_struct.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.small_structBitCode;

/**
 * @hide
 */
public class ScriptC_small_struct extends ScriptC {
    private static final String __rs_resource_name = "small_struct";
    // Constructor
    public  ScriptC_small_struct(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              small_structBitCode.getBitCode32(),
              small_structBitCode.getBitCode64());
        __I32 = Element.I32(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __ScriptField_small_struct = ScriptField_small_struct.createElement(rs);
        __ScriptField_struct_of_struct = ScriptField_struct_of_struct.createElement(rs);
    }

    private Element __ALLOCATION;
    private Element __I32;
    private Element __ScriptField_small_struct;
    private Element __ScriptField_struct_of_struct;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_gDimX = 0;
    private int mExportVar_gDimX;
    public synchronized void set_gDimX(int v) {
        setVar(mExportVarIdx_gDimX, v);
        mExportVar_gDimX = v;
    }

    public int get_gDimX() {
        return mExportVar_gDimX;
    }

    public Script.FieldID getFieldID_gDimX() {
        return createFieldID(mExportVarIdx_gDimX, null);
    }

    private final static int mExportVarIdx_gDimY = 1;
    private int mExportVar_gDimY;
    public synchronized void set_gDimY(int v) {
        setVar(mExportVarIdx_gDimY, v);
        mExportVar_gDimY = v;
    }

    public int get_gDimY() {
        return mExportVar_gDimY;
    }

    public Script.FieldID getFieldID_gDimY() {
        return createFieldID(mExportVarIdx_gDimY, null);
    }

    private final static int mExportVarIdx_A = 2;
    private Allocation mExportVar_A;
    public synchronized void set_A(Allocation v) {
        setVar(mExportVarIdx_A, v);
        mExportVar_A = v;
    }

    public Allocation get_A() {
        return mExportVar_A;
    }

    public Script.FieldID getFieldID_A() {
        return createFieldID(mExportVarIdx_A, null);
    }

    private final static int mExportVarIdx_B = 3;
    private Allocation mExportVar_B;
    public synchronized void set_B(Allocation v) {
        setVar(mExportVarIdx_B, v);
        mExportVar_B = v;
    }

    public Allocation get_B() {
        return mExportVar_B;
    }

    public Script.FieldID getFieldID_B() {
        return createFieldID(mExportVarIdx_B, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_setStruct = 1;
    public Script.KernelID getKernelID_setStruct() {
        return createKernelID(mExportForEachIdx_setStruct, 58, null, null);
    }

    public void forEach_setStruct(Allocation aout) {
        forEach_setStruct(aout, null);
    }

    public void forEach_setStruct(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_small_struct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_small_struct!");
        }
        forEach(mExportForEachIdx_setStruct, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_setArrayOfStruct = 2;
    public Script.KernelID getKernelID_setArrayOfStruct() {
        return createKernelID(mExportForEachIdx_setArrayOfStruct, 58, null, null);
    }

    public void forEach_setArrayOfStruct(Allocation aout) {
        forEach_setArrayOfStruct(aout, null);
    }

    public void forEach_setArrayOfStruct(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_struct_of_struct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_struct_of_struct!");
        }
        forEach(mExportForEachIdx_setArrayOfStruct, (Allocation) null, aout, null, sc);
    }

    private final static int mExportFuncIdx_test = 0;
    public Script.InvokeID getInvokeID_test() {
        return createInvokeID(mExportFuncIdx_test);
    }

    public void invoke_test() {
        invoke(mExportFuncIdx_test);
    }

}

