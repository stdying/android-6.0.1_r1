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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/RsTest/src/com/android/rs/test/math_fp16.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.math_fp16BitCode;

/**
 * @hide
 */
public class ScriptC_math_fp16 extends ScriptC {
    private static final String __rs_resource_name = "math_fp16";
    // Constructor
    public  ScriptC_math_fp16(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              math_fp16BitCode.getBitCode32(),
              math_fp16BitCode.getBitCode64());
    }

    private final static int mExportFuncIdx_testFp16Math = 0;
    public Script.InvokeID getInvokeID_testFp16Math() {
        return createInvokeID(mExportFuncIdx_testFp16Math);
    }

    public void invoke_testFp16Math() {
        invoke(mExportFuncIdx_testFp16Math);
    }

}

