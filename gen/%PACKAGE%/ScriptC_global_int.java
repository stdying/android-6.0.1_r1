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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/libbcc/tests/debuginfo/target-tests/global_int.rs
 */

package %PACKAGE%;

import android.renderscript.*;
import %PACKAGE%.global_intBitCode;

/**
 * @hide
 */
public class ScriptC_global_int extends ScriptC {
    private static final String __rs_resource_name = "global_int";
    // Constructor
    public  ScriptC_global_int(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              global_intBitCode.getBitCode32(),
              global_intBitCode.getBitCode64());
        mExportVar_global_zero = 0;
        __I32 = Element.I32(rs);
        mExportVar_global_value = 1;
    }

    private Element __I32;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_global_zero = 0;
    private int mExportVar_global_zero;
    public synchronized void set_global_zero(int v) {
        setVar(mExportVarIdx_global_zero, v);
        mExportVar_global_zero = v;
    }

    public int get_global_zero() {
        return mExportVar_global_zero;
    }

    public Script.FieldID getFieldID_global_zero() {
        return createFieldID(mExportVarIdx_global_zero, null);
    }

    private final static int mExportVarIdx_global_value = 1;
    private int mExportVar_global_value;
    public synchronized void set_global_value(int v) {
        setVar(mExportVarIdx_global_value, v);
        mExportVar_global_value = v;
    }

    public int get_global_value() {
        return mExportVar_global_value;
    }

    public Script.FieldID getFieldID_global_value() {
        return createFieldID(mExportVarIdx_global_value, null);
    }

    private final static int mExportFuncIdx_entry = 0;
    public Script.InvokeID getInvokeID_entry() {
        return createInvokeID(mExportFuncIdx_entry);
    }

    public void invoke_entry(int parameter) {
        FieldPacker entry_fp = new FieldPacker(4);
        entry_fp.addI32(parameter);
        invoke(mExportFuncIdx_entry, entry_fp);
    }

}

