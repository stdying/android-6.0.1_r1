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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_array_cpp/array.rs
 */

package foo;

import android.renderscript.*;
import foo.arrayBitCode;

/**
 * @hide
 */
public class ScriptC_array extends ScriptC {
    private static final String __rs_resource_name = "array";
    // Constructor
    public  ScriptC_array(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              arrayBitCode.getBitCode32(),
              arrayBitCode.getBitCode64());
        __F32 = Element.F32(rs);
    }

    private Element __F32;
    private FieldPacker __rs_fp_F32;
    private final static int mExportVarIdx_array = 0;
    private float[] mExportVar_array;
    public synchronized void set_array(float[] v) {
        mExportVar_array = v;
        FieldPacker fp = new FieldPacker(64);
        for (int ct1 = 0; ct1 < 16; ct1++) {
            fp.addF32(v[ct1]);
        }

        int []__dimArr = new int[1];
        __dimArr[0] = 16;
        setVar(mExportVarIdx_array, fp, __F32, __dimArr);
    }

    public float[] get_array() {
        return mExportVar_array;
    }

    public Script.FieldID getFieldID_array() {
        return createFieldID(mExportVarIdx_array, null);
    }

}

