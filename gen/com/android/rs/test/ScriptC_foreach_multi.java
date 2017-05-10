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
 * The source Renderscript file: /media/li/old/asop/aosp/frameworks/rs/java/tests/RsTest/src/com/android/rs/test/foreach_multi.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.foreach_multiBitCode;

/**
 * @hide
 */
public class ScriptC_foreach_multi extends ScriptC {
    private static final String __rs_resource_name = "foreach_multi";
    // Constructor
    public  ScriptC_foreach_multi(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              foreach_multiBitCode.getBitCode32(),
              foreach_multiBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __U32 = Element.U32(rs);
        __U16 = Element.U16(rs);
        __ScriptField_RetStruct = ScriptField_RetStruct.createElement(rs);
    }

    private Element __ALLOCATION;
    private Element __ScriptField_RetStruct;
    private Element __U16;
    private Element __U32;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_U32;
    private final static int mExportVarIdx_ain0 = 0;
    private Allocation mExportVar_ain0;
    public synchronized void set_ain0(Allocation v) {
        setVar(mExportVarIdx_ain0, v);
        mExportVar_ain0 = v;
    }

    public Allocation get_ain0() {
        return mExportVar_ain0;
    }

    public Script.FieldID getFieldID_ain0() {
        return createFieldID(mExportVarIdx_ain0, null);
    }

    private final static int mExportVarIdx_ain1 = 1;
    private Allocation mExportVar_ain1;
    public synchronized void set_ain1(Allocation v) {
        setVar(mExportVarIdx_ain1, v);
        mExportVar_ain1 = v;
    }

    public Allocation get_ain1() {
        return mExportVar_ain1;
    }

    public Script.FieldID getFieldID_ain1() {
        return createFieldID(mExportVarIdx_ain1, null);
    }

    private final static int mExportVarIdx_ain2 = 2;
    private Allocation mExportVar_ain2;
    public synchronized void set_ain2(Allocation v) {
        setVar(mExportVarIdx_ain2, v);
        mExportVar_ain2 = v;
    }

    public Allocation get_ain2() {
        return mExportVar_ain2;
    }

    public Script.FieldID getFieldID_ain2() {
        return createFieldID(mExportVarIdx_ain2, null);
    }

    private final static int mExportVarIdx_ain3 = 3;
    private Allocation mExportVar_ain3;
    public synchronized void set_ain3(Allocation v) {
        setVar(mExportVarIdx_ain3, v);
        mExportVar_ain3 = v;
    }

    public Allocation get_ain3() {
        return mExportVar_ain3;
    }

    public Script.FieldID getFieldID_ain3() {
        return createFieldID(mExportVarIdx_ain3, null);
    }

    private final static int mExportVarIdx_aout0 = 4;
    private Allocation mExportVar_aout0;
    public synchronized void set_aout0(Allocation v) {
        setVar(mExportVarIdx_aout0, v);
        mExportVar_aout0 = v;
    }

    public Allocation get_aout0() {
        return mExportVar_aout0;
    }

    public Script.FieldID getFieldID_aout0() {
        return createFieldID(mExportVarIdx_aout0, null);
    }

    private final static int mExportVarIdx_aout1 = 5;
    private Allocation mExportVar_aout1;
    public synchronized void set_aout1(Allocation v) {
        setVar(mExportVarIdx_aout1, v);
        mExportVar_aout1 = v;
    }

    public Allocation get_aout1() {
        return mExportVar_aout1;
    }

    public Script.FieldID getFieldID_aout1() {
        return createFieldID(mExportVarIdx_aout1, null);
    }

    private final static int mExportVarIdx_aout2 = 6;
    private Allocation mExportVar_aout2;
    public synchronized void set_aout2(Allocation v) {
        setVar(mExportVarIdx_aout2, v);
        mExportVar_aout2 = v;
    }

    public Allocation get_aout2() {
        return mExportVar_aout2;
    }

    public Script.FieldID getFieldID_aout2() {
        return createFieldID(mExportVarIdx_aout2, null);
    }

    private final static int mExportVarIdx_aout3 = 7;
    private Allocation mExportVar_aout3;
    public synchronized void set_aout3(Allocation v) {
        setVar(mExportVarIdx_aout3, v);
        mExportVar_aout3 = v;
    }

    public Allocation get_aout3() {
        return mExportVar_aout3;
    }

    public Script.FieldID getFieldID_aout3() {
        return createFieldID(mExportVarIdx_aout3, null);
    }

    private final static int mExportVarIdx_dimX = 8;
    private long mExportVar_dimX;
    public synchronized void set_dimX(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_dimX, __rs_fp_U32);
        mExportVar_dimX = v;
    }

    public long get_dimX() {
        return mExportVar_dimX;
    }

    public Script.FieldID getFieldID_dimX() {
        return createFieldID(mExportVarIdx_dimX, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_init_uint32_alloc = 1;
    public Script.KernelID getKernelID_init_uint32_alloc() {
        return createKernelID(mExportForEachIdx_init_uint32_alloc, 42, null, null);
    }

    public void forEach_init_uint32_alloc(Allocation aout) {
        forEach_init_uint32_alloc(aout, null);
    }

    public void forEach_init_uint32_alloc(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        forEach(mExportForEachIdx_init_uint32_alloc, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_init_uint16_alloc = 2;
    public Script.KernelID getKernelID_init_uint16_alloc() {
        return createKernelID(mExportForEachIdx_init_uint16_alloc, 42, null, null);
    }

    public void forEach_init_uint16_alloc(Allocation aout) {
        forEach_init_uint16_alloc(aout, null);
    }

    public void forEach_init_uint16_alloc(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        forEach(mExportForEachIdx_init_uint16_alloc, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_sum2 = 3;
    public Script.KernelID getKernelID_sum2() {
        return createKernelID(mExportForEachIdx_sum2, 43, null, null);
    }

    public void forEach_sum2(Allocation ain_in0, Allocation ain_in1, Allocation aout) {
        forEach_sum2(ain_in0, ain_in1, aout, null);
    }

    public void forEach_sum2(Allocation ain_in0, Allocation ain_in1, Allocation aout, Script.LaunchOptions sc) {
        // check ain_in0
        if (!ain_in0.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        // check ain_in1
        if (!ain_in1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain_in0.getType();
        t1 = ain_in1.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain_in0 and ain_in1!");
        }

        // Verify dimensions
        t0 = ain_in0.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain_in0 and aout!");
        }

        forEach(mExportForEachIdx_sum2, new Allocation[]{ain_in0, ain_in1}, aout, null, sc);
    }

    private final static int mExportForEachIdx_sum2_struct = 4;
    public Script.KernelID getKernelID_sum2_struct() {
        return createKernelID(mExportForEachIdx_sum2_struct, 43, null, null);
    }

    public void forEach_sum2_struct(Allocation ain_in0, Allocation ain_in1, Allocation aout) {
        forEach_sum2_struct(ain_in0, ain_in1, aout, null);
    }

    public void forEach_sum2_struct(Allocation ain_in0, Allocation ain_in1, Allocation aout, Script.LaunchOptions sc) {
        // check ain_in0
        if (!ain_in0.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        // check ain_in1
        if (!ain_in1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_RetStruct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_RetStruct!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain_in0.getType();
        t1 = ain_in1.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain_in0 and ain_in1!");
        }

        // Verify dimensions
        t0 = ain_in0.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain_in0 and aout!");
        }

        forEach(mExportForEachIdx_sum2_struct, new Allocation[]{ain_in0, ain_in1}, aout, null, sc);
    }

    private final static int mExportForEachIdx_sum3 = 5;
    public Script.KernelID getKernelID_sum3() {
        return createKernelID(mExportForEachIdx_sum3, 43, null, null);
    }

    public void forEach_sum3(Allocation ain_in0, Allocation ain_in1, Allocation ain_in2, Allocation aout) {
        forEach_sum3(ain_in0, ain_in1, ain_in2, aout, null);
    }

    public void forEach_sum3(Allocation ain_in0, Allocation ain_in1, Allocation ain_in2, Allocation aout, Script.LaunchOptions sc) {
        // check ain_in0
        if (!ain_in0.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        // check ain_in1
        if (!ain_in1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        // check ain_in2
        if (!ain_in2.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain_in0.getType();
        t1 = ain_in1.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain_in0 and ain_in1!");
        }

        // Verify dimensions
        t0 = ain_in0.getType();
        t1 = ain_in2.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain_in0 and ain_in2!");
        }

        // Verify dimensions
        t0 = ain_in0.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain_in0 and aout!");
        }

        forEach(mExportForEachIdx_sum3, new Allocation[]{ain_in0, ain_in1, ain_in2}, aout, null, sc);
    }

    private final static int mExportForEachIdx_sum_mixed = 6;
    public Script.KernelID getKernelID_sum_mixed() {
        return createKernelID(mExportForEachIdx_sum_mixed, 43, null, null);
    }

    public void forEach_sum_mixed(Allocation ain_in0, Allocation ain_in1, Allocation aout) {
        forEach_sum_mixed(ain_in0, ain_in1, aout, null);
    }

    public void forEach_sum_mixed(Allocation ain_in0, Allocation ain_in1, Allocation aout, Script.LaunchOptions sc) {
        // check ain_in0
        if (!ain_in0.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        // check ain_in1
        if (!ain_in1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain_in0.getType();
        t1 = ain_in1.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain_in0 and ain_in1!");
        }

        // Verify dimensions
        t0 = ain_in0.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain_in0 and aout!");
        }

        forEach(mExportForEachIdx_sum_mixed, new Allocation[]{ain_in0, ain_in1}, aout, null, sc);
    }

    private final static int mExportFuncIdx_test_outputs = 0;
    public Script.InvokeID getInvokeID_test_outputs() {
        return createInvokeID(mExportFuncIdx_test_outputs);
    }

    public void invoke_test_outputs() {
        invoke(mExportFuncIdx_test_outputs);
    }

    private final static int mExportFuncIdx_check_test_results = 1;
    public Script.InvokeID getInvokeID_check_test_results() {
        return createInvokeID(mExportFuncIdx_check_test_results);
    }

    public void invoke_check_test_results() {
        invoke(mExportFuncIdx_check_test_results);
    }

}

