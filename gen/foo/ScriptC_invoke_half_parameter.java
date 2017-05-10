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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_invoke_half_parameter/invoke_half_parameter.rs
 */

package foo;

import android.renderscript.*;
import foo.invoke_half_parameterBitCode;

/**
 * @hide
 */
public class ScriptC_invoke_half_parameter extends ScriptC {
    private static final String __rs_resource_name = "invoke_half_parameter";
    // Constructor
    public  ScriptC_invoke_half_parameter(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              invoke_half_parameterBitCode.getBitCode32(),
              invoke_half_parameterBitCode.getBitCode64());
    }

    private final static int mExportFuncIdx_test = 0;
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

