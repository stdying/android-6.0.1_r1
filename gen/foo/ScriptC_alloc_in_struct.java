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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_alloc_in_struct/alloc_in_struct.rs
 */

package foo;

import android.renderscript.*;
import foo.alloc_in_structBitCode;

/**
 * @hide
 */
public class ScriptC_alloc_in_struct extends ScriptC {
    private static final String __rs_resource_name = "alloc_in_struct";
    // Constructor
    public  ScriptC_alloc_in_struct(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              alloc_in_structBitCode.getBitCode32(),
              alloc_in_structBitCode.getBitCode64());
        __ScriptField_s = ScriptField_s.createElement(rs);
    }

    private Element __ScriptField_s;
    private FieldPacker __rs_fp_ScriptField_s;
    private final static int mExportVarIdx_myStruct = 0;
    private ScriptField_s.Item mExportVar_myStruct;
    public synchronized void set_myStruct(ScriptField_s.Item v) {
        mExportVar_myStruct = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addObj(v.a);
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

