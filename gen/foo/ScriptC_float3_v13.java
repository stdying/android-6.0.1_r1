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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/F_float3_v13/float3_v13.rs
 */

package foo;

import android.renderscript.*;
import foo.float3_v13BitCode;

/**
 * @hide
 */
public class ScriptC_float3_v13 extends ScriptC {
    private static final String __rs_resource_name = "float3_v13";
    // Constructor
    public  ScriptC_float3_v13(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              float3_v13BitCode.getBitCode32(),
              float3_v13BitCode.getBitCode64());
        __ScriptField_s = ScriptField_s.createElement(rs);
    }

    private Element __ScriptField_s;
    private FieldPacker __rs_fp_ScriptField_s;
    private final static int mExportVarIdx_myStruct = 0;
    private ScriptField_s.Item mExportVar_myStruct;
    public synchronized void set_myStruct(ScriptField_s.Item v) {
        mExportVar_myStruct = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v.f);
        fp.skip(4);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_myStruct, fp, __ScriptField_s, __dimArr);
    }

    public ScriptField_s.Item get_myStruct() {
        return mExportVar_myStruct;
    }

    public Script.FieldID getFieldID_myStruct() {
        return createFieldID(mExportVarIdx_myStruct, null);
    }

}

