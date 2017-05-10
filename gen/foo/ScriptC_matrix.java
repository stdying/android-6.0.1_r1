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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_matrix_cpp/matrix.rs
 */

package foo;

import android.renderscript.*;
import foo.matrixBitCode;

/**
 * @hide
 */
public class ScriptC_matrix extends ScriptC {
    private static final String __rs_resource_name = "matrix";
    // Constructor
    public  ScriptC_matrix(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              matrixBitCode.getBitCode32(),
              matrixBitCode.getBitCode64());
    }

    private final static int mExportVarIdx_mat = 0;
    private Matrix4f mExportVar_mat;
    public synchronized void set_mat(Matrix4f v) {
        mExportVar_mat = v;
        FieldPacker fp = new FieldPacker(64);
        fp.addMatrix(v);
        setVar(mExportVarIdx_mat, fp);
    }

    public Matrix4f get_mat() {
        return mExportVar_mat;
    }

    public Script.FieldID getFieldID_mat() {
        return createFieldID(mExportVarIdx_mat, null);
    }

}

