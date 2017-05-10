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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_warnings_deprecated/deprecated.rs
 */

package foo;

import android.renderscript.*;
import foo.deprecatedBitCode;

/**
 * @hide
 */
public class ScriptC_deprecated extends ScriptC {
    private static final String __rs_resource_name = "deprecated";
    // Constructor
    public  ScriptC_deprecated(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              deprecatedBitCode.getBitCode32(),
              deprecatedBitCode.getBitCode64());
        __I8 = Element.I8(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
    }

    private Element __ALLOCATION;
    private Element __I8;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I8;
    private final static int mExportVarIdx_out = 0;
    private byte mExportVar_out;
    public synchronized void set_out(byte v) {
        if (__rs_fp_I8!= null) {
            __rs_fp_I8.reset();
        } else {
            __rs_fp_I8 = new FieldPacker(1);
        }
        __rs_fp_I8.addI8(v);
        setVar(mExportVarIdx_out, __rs_fp_I8);
        mExportVar_out = v;
    }

    public byte get_out() {
        return mExportVar_out;
    }

    public Script.FieldID getFieldID_out() {
        return createFieldID(mExportVarIdx_out, null);
    }

    private final static int mExportVarIdx_al = 1;
    private Allocation mExportVar_al;
    public synchronized void set_al(Allocation v) {
        setVar(mExportVarIdx_al, v);
        mExportVar_al = v;
    }

    public Allocation get_al() {
        return mExportVar_al;
    }

    public Script.FieldID getFieldID_al() {
        return createFieldID(mExportVarIdx_al, null);
    }

    private final static int mExportFuncIdx_foo = 0;
    public Script.InvokeID getInvokeID_foo() {
        return createInvokeID(mExportFuncIdx_foo);
    }

    public void invoke_foo(byte in) {
        FieldPacker foo_fp = new FieldPacker(1);
        foo_fp.addI8(in);
        invoke(mExportFuncIdx_foo, foo_fp);
    }

}

