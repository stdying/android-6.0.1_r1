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
 * The source Renderscript file: /media/li/old/asop/aosp/frameworks/rs/java/tests/RsCameraDemo/src/com/android/example/rscamera/focus_peak.rs
 */

package com.android.example.rscamera;

import android.renderscript.*;
import com.android.example.rscamera.focus_peakBitCode;

/**
 * @hide
 */
public class ScriptC_focus_peak extends ScriptC {
    private static final String __rs_resource_name = "focus_peak";
    // Constructor
    public  ScriptC_focus_peak(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              focus_peakBitCode.getBitCode32(),
              focus_peakBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __U8_4 = Element.U8_4(rs);
    }

    private Element __ALLOCATION;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private final static int mExportVarIdx_gCurrentFrame = 0;
    private Allocation mExportVar_gCurrentFrame;
    public synchronized void set_gCurrentFrame(Allocation v) {
        setVar(mExportVarIdx_gCurrentFrame, v);
        mExportVar_gCurrentFrame = v;
    }

    public Allocation get_gCurrentFrame() {
        return mExportVar_gCurrentFrame;
    }

    public Script.FieldID getFieldID_gCurrentFrame() {
        return createFieldID(mExportVarIdx_gCurrentFrame, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_peak = 1;
    public Script.KernelID getKernelID_peak() {
        return createKernelID(mExportForEachIdx_peak, 58, null, null);
    }

    public void forEach_peak(Allocation aout) {
        forEach_peak(aout, null);
    }

    public void forEach_peak(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_peak, (Allocation) null, aout, null, sc);
    }

}

