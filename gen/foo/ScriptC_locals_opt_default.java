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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/lit-tests/opt/locals_opt_default.rs
 */

package foo;

import android.renderscript.*;
import foo.locals_opt_defaultBitCode;

/**
 * @hide
 */
public class ScriptC_locals_opt_default extends ScriptC {
    private static final String __rs_resource_name = "locals_opt_default";
    // Constructor
    public  ScriptC_locals_opt_default(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              locals_opt_defaultBitCode.getBitCode32(),
              locals_opt_defaultBitCode.getBitCode64());
        __ScriptField_float_struct = ScriptField_float_struct.createElement(rs);
    }

    private Element __ScriptField_float_struct;
    private FieldPacker __rs_fp_ScriptField_float_struct;
    private final static int mExportVarIdx_compound_float = 0;
    private ScriptField_float_struct.Item mExportVar_compound_float;
    public synchronized void set_compound_float(ScriptField_float_struct.Item v) {
        mExportVar_compound_float = v;
        FieldPacker fp = new FieldPacker(12);
        fp.addF32(v.f);
        for (int ct2 = 0; ct2 < 2; ct2++) {
            fp.addF32(v.f2[ct2]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_compound_float, fp, __ScriptField_float_struct, __dimArr);
    }

    public ScriptField_float_struct.Item get_compound_float() {
        return mExportVar_compound_float;
    }

    public Script.FieldID getFieldID_compound_float() {
        return createFieldID(mExportVarIdx_compound_float, null);
    }

    private final static int mExportFuncIdx_the_main = 0;
    public Script.InvokeID getInvokeID_the_main() {
        return createInvokeID(mExportFuncIdx_the_main);
    }

    public void invoke_the_main() {
        invoke(mExportFuncIdx_the_main);
    }

}

