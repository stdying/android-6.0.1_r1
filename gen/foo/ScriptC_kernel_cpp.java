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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_kernel_cpp/kernel_cpp.rs
 */

package foo;

import android.renderscript.*;
import foo.kernel_cppBitCode;

/**
 * @hide
 */
public class ScriptC_kernel_cpp extends ScriptC {
    private static final String __rs_resource_name = "kernel_cpp";
    // Constructor
    public  ScriptC_kernel_cpp(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              kernel_cppBitCode.getBitCode32(),
              kernel_cppBitCode.getBitCode64());
        mExportVar_i1 = 5;
        __I32 = Element.I32(rs);
        mExportVar_bt = true;
        __BOOLEAN = Element.BOOLEAN(rs);
        mExportVar_bf = false;
        mExportVar_i2 = new Int2();
        mExportVar_i2.x = 2;
        mExportVar_i2.y = 2;
        __I32_2 = Element.I32_2(rs);
        mExportVar_i3 = new Int3();
        mExportVar_i3.x = 1;
        mExportVar_i3.y = 2;
        mExportVar_i3.z = 3;
        __I32_3 = Element.I32_3(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __ELEMENT = Element.ELEMENT(rs);
        __TYPE = Element.TYPE(rs);
        __SCRIPT = Element.SCRIPT(rs);
        __SAMPLER = Element.SAMPLER(rs);
        __U32 = Element.U32(rs);
    }

    private Element __ALLOCATION;
    private Element __BOOLEAN;
    private Element __ELEMENT;
    private Element __I32;
    private Element __I32_2;
    private Element __I32_3;
    private Element __SAMPLER;
    private Element __SCRIPT;
    private Element __TYPE;
    private Element __U32;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_BOOLEAN;
    private FieldPacker __rs_fp_ELEMENT;
    private FieldPacker __rs_fp_I32;
    private FieldPacker __rs_fp_I32_2;
    private FieldPacker __rs_fp_I32_3;
    private FieldPacker __rs_fp_SAMPLER;
    private FieldPacker __rs_fp_SCRIPT;
    private FieldPacker __rs_fp_TYPE;
    private final static int mExportVarIdx_i1 = 0;
    private int mExportVar_i1;
    public synchronized void set_i1(int v) {
        setVar(mExportVarIdx_i1, v);
        mExportVar_i1 = v;
    }

    public int get_i1() {
        return mExportVar_i1;
    }

    public Script.FieldID getFieldID_i1() {
        return createFieldID(mExportVarIdx_i1, null);
    }

    private final static int mExportVarIdx_bt = 1;
    private boolean mExportVar_bt;
    public synchronized void set_bt(boolean v) {
        if (__rs_fp_BOOLEAN!= null) {
            __rs_fp_BOOLEAN.reset();
        } else {
            __rs_fp_BOOLEAN = new FieldPacker(1);
        }
        __rs_fp_BOOLEAN.addBoolean(v);
        setVar(mExportVarIdx_bt, __rs_fp_BOOLEAN);
        mExportVar_bt = v;
    }

    public boolean get_bt() {
        return mExportVar_bt;
    }

    public Script.FieldID getFieldID_bt() {
        return createFieldID(mExportVarIdx_bt, null);
    }

    private final static int mExportVarIdx_bf = 2;
    private boolean mExportVar_bf;
    public synchronized void set_bf(boolean v) {
        if (__rs_fp_BOOLEAN!= null) {
            __rs_fp_BOOLEAN.reset();
        } else {
            __rs_fp_BOOLEAN = new FieldPacker(1);
        }
        __rs_fp_BOOLEAN.addBoolean(v);
        setVar(mExportVarIdx_bf, __rs_fp_BOOLEAN);
        mExportVar_bf = v;
    }

    public boolean get_bf() {
        return mExportVar_bf;
    }

    public Script.FieldID getFieldID_bf() {
        return createFieldID(mExportVarIdx_bf, null);
    }

    private final static int mExportVarIdx_i2 = 3;
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

    private final static int mExportVarIdx_i3 = 4;
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

    private final static int mExportVarIdx_alloc = 5;
    private Allocation mExportVar_alloc;
    public synchronized void set_alloc(Allocation v) {
        setVar(mExportVarIdx_alloc, v);
        mExportVar_alloc = v;
    }

    public Allocation get_alloc() {
        return mExportVar_alloc;
    }

    public Script.FieldID getFieldID_alloc() {
        return createFieldID(mExportVarIdx_alloc, null);
    }

    private final static int mExportVarIdx_elem = 6;
    private Element mExportVar_elem;
    public synchronized void set_elem(Element v) {
        setVar(mExportVarIdx_elem, v);
        mExportVar_elem = v;
    }

    public Element get_elem() {
        return mExportVar_elem;
    }

    public Script.FieldID getFieldID_elem() {
        return createFieldID(mExportVarIdx_elem, null);
    }

    private final static int mExportVarIdx_type = 7;
    private Type mExportVar_type;
    public synchronized void set_type(Type v) {
        setVar(mExportVarIdx_type, v);
        mExportVar_type = v;
    }

    public Type get_type() {
        return mExportVar_type;
    }

    public Script.FieldID getFieldID_type() {
        return createFieldID(mExportVarIdx_type, null);
    }

    private final static int mExportVarIdx_script = 8;
    private Script mExportVar_script;
    public synchronized void set_script(Script v) {
        setVar(mExportVarIdx_script, v);
        mExportVar_script = v;
    }

    public Script get_script() {
        return mExportVar_script;
    }

    public Script.FieldID getFieldID_script() {
        return createFieldID(mExportVarIdx_script, null);
    }

    private final static int mExportVarIdx_sampler = 9;
    private Sampler mExportVar_sampler;
    public synchronized void set_sampler(Sampler v) {
        setVar(mExportVarIdx_sampler, v);
        mExportVar_sampler = v;
    }

    public Sampler get_sampler() {
        return mExportVar_sampler;
    }

    public Script.FieldID getFieldID_sampler() {
        return createFieldID(mExportVarIdx_sampler, null);
    }

    private final static int mExportForEachIdx_root = 0;
    public Script.KernelID getKernelID_root() {
        return createKernelID(mExportForEachIdx_root, 35, null, null);
    }

    public void forEach_root(Allocation ain, Allocation aout) {
        forEach_root(ain, aout, null);
    }

    public void forEach_root(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
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

        forEach(mExportForEachIdx_root, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_in_only = 1;
    public Script.KernelID getKernelID_in_only() {
        return createKernelID(mExportForEachIdx_in_only, 33, null, null);
    }

    public void forEach_in_only(Allocation ain) {
        forEach_in_only(ain, null);
    }

    public void forEach_in_only(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        forEach(mExportForEachIdx_in_only, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_out_only = 2;
    public Script.KernelID getKernelID_out_only() {
        return createKernelID(mExportForEachIdx_out_only, 34, null, null);
    }

    public void forEach_out_only(Allocation aout) {
        forEach_out_only(aout, null);
    }

    public void forEach_out_only(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        forEach(mExportForEachIdx_out_only, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_everything = 3;
    public Script.KernelID getKernelID_everything() {
        return createKernelID(mExportForEachIdx_everything, 59, null, null);
    }

    public void forEach_everything(Allocation ain, Allocation aout) {
        forEach_everything(ain, aout, null);
    }

    public void forEach_everything(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
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

        forEach(mExportForEachIdx_everything, ain, aout, null, sc);
    }

}

