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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/ImageProcessing2/src/com/android/rs/image/util.rs
 */

package com.android.rs.image2;

import android.renderscript.*;
import com.android.rs.image2.utilBitCode;

/**
 * @hide
 */
public class ScriptC_util extends ScriptC {
    private static final String __rs_resource_name = "util";
    // Constructor
    public  ScriptC_util(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              utilBitCode.getBitCode32(),
              utilBitCode.getBitCode64());
    }

    private final static int mExportFuncIdx_utilSendMessage = 0;
    public Script.InvokeID getInvokeID_utilSendMessage() {
        return createInvokeID(mExportFuncIdx_utilSendMessage);
    }

    public void invoke_utilSendMessage(int op) {
        FieldPacker utilSendMessage_fp = new FieldPacker(4);
        utilSendMessage_fp.addI32(op);
        invoke(mExportFuncIdx_utilSendMessage, utilSendMessage_fp);
    }

}

