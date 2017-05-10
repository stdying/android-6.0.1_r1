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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/RsTest/src/com/android/rs/test/single_source_script.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.single_source_scriptBitCode;

/**
 * @hide
 */
public class ScriptC_single_source_script extends ScriptC {
    private static final String __rs_resource_name = "single_source_script";
    // Constructor
    public  ScriptC_single_source_script(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              single_source_scriptBitCode.getBitCode32(),
              single_source_scriptBitCode.getBitCode64());
        __I32 = Element.I32(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
    }

    private Element __ALLOCATION;
    private Element __I32;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_dimX = 0;
    private int mExportVar_dimX;
    public synchronized void set_dimX(int v) {
        setVar(mExportVarIdx_dimX, v);
        mExportVar_dimX = v;
    }

    public int get_dimX() {
        return mExportVar_dimX;
    }

    public Script.FieldID getFieldID_dimX() {
        return createFieldID(mExportVarIdx_dimX, null);
    }

    private final static int mExportVarIdx_dimY = 1;
    private int mExportVar_dimY;
    public synchronized void set_dimY(int v) {
        setVar(mExportVarIdx_dimY, v);
        mExportVar_dimY = v;
    }

    public int get_dimY() {
        return mExportVar_dimY;
    }

    public Script.FieldID getFieldID_dimY() {
        return createFieldID(mExportVarIdx_dimY, null);
    }

    private final static int mExportVarIdx_gAllocOut = 2;
    private Allocation mExportVar_gAllocOut;
    public synchronized void set_gAllocOut(Allocation v) {
        setVar(mExportVarIdx_gAllocOut, v);
        mExportVar_gAllocOut = v;
    }

    public Allocation get_gAllocOut() {
        return mExportVar_gAllocOut;
    }

    public Script.FieldID getFieldID_gAllocOut() {
        return createFieldID(mExportVarIdx_gAllocOut, null);
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
        if (!ain.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
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

    public void forEach_goo(Allocation ain_a, Allocation ain_b, Allocation aout) {
        forEach_goo(ain_a, ain_b, aout, null);
    }

    public void forEach_goo(Allocation ain_a, Allocation ain_b, Allocation aout, Script.LaunchOptions sc) {
        // check ain_a
        if (!ain_a.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        // check ain_b
        if (!ain_b.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain_a.getType();
        t1 = ain_b.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain_a and ain_b!");
        }

        // Verify dimensions
        t0 = ain_a.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain_a and aout!");
        }

        forEach(mExportForEachIdx_goo, new Allocation[]{ain_a, ain_b}, aout, null, sc);
    }

    private final static int mExportForEachIdx_bar = 3;
    public Script.KernelID getKernelID_bar() {
        return createKernelID(mExportForEachIdx_bar, 56, null, null);
    }

    public void forEach_bar(Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_bar, (Allocation) null, null, null, sc);
    }

    private final static int mExportForEachIdx_oldGoo = 4;
    public Script.KernelID getKernelID_oldGoo() {
        return createKernelID(mExportForEachIdx_oldGoo, 3, null, null);
    }

    public void forEach_oldGoo(Allocation ain, Allocation aout) {
        forEach_oldGoo(ain, aout, null);
    }

    public void forEach_oldGoo(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
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

        forEach(mExportForEachIdx_oldGoo, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_oldFoo = 5;
    public Script.KernelID getKernelID_oldFoo() {
        return createKernelID(mExportForEachIdx_oldFoo, 27, null, null);
    }

    public void forEach_oldFoo(Allocation ain, Allocation aout) {
        forEach_oldFoo(ain, aout, null);
    }

    public void forEach_oldFoo(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
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

        forEach(mExportForEachIdx_oldFoo, ain, aout, null, sc);
    }

    private final static int mExportFuncIdx_validate = 0;
    public Script.InvokeID getInvokeID_validate() {
        return createInvokeID(mExportFuncIdx_validate);
    }

    public void invoke_validate(Allocation out) {
        FieldPacker validate_fp = new FieldPacker(32);
        validate_fp.addObj(out);
        invoke(mExportFuncIdx_validate, validate_fp);
    }

    private final static int mExportFuncIdx_entrypoint = 1;
    public Script.InvokeID getInvokeID_entrypoint() {
        return createInvokeID(mExportFuncIdx_entrypoint);
    }

    public void invoke_entrypoint(Allocation in, Allocation out) {
        FieldPacker entrypoint_fp = new FieldPacker(64);
        entrypoint_fp.addObj(in);
        entrypoint_fp.addObj(out);
        invoke(mExportFuncIdx_entrypoint, entrypoint_fp);
    }

}

