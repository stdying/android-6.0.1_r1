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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/F_one_definition_rule8/def2.rs
 */

package foo;

import android.renderscript.*;
import foo.def2BitCode;

/**
 * @hide
 */
public class ScriptC_def2 extends ScriptC {
    private static final String __rs_resource_name = "def2";
    // Constructor
    public  ScriptC_def2(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              def2BitCode.getBitCode32(),
              def2BitCode.getBitCode64());
        __ScriptField_DifferentDefinition8 = ScriptField_DifferentDefinition8.createElement(rs);
    }

    private Element __ScriptField_DifferentDefinition8;
    private FieldPacker __rs_fp_ScriptField_DifferentDefinition8;
    private final static int mExportVarIdx_o8 = 0;
    private ScriptField_DifferentDefinition8.Item mExportVar_o8;
    public synchronized void set_o8(ScriptField_DifferentDefinition8.Item v) {
        mExportVar_o8 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addF32(v.member1.member1);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_o8, fp, __ScriptField_DifferentDefinition8, __dimArr);
    }

    public ScriptField_DifferentDefinition8.Item get_o8() {
        return mExportVar_o8;
    }

    public Script.FieldID getFieldID_o8() {
        return createFieldID(mExportVarIdx_o8, null);
    }

}

