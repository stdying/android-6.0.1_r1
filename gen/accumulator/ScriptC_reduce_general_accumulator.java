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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_reduce_general_accumulator/reduce_general_accumulator.rs
 */

package accumulator;

import android.renderscript.*;
import accumulator.reduce_general_accumulatorBitCode;

/**
 * @hide
 */
public class ScriptC_reduce_general_accumulator extends ScriptC {
    private static final String __rs_resource_name = "reduce_general_accumulator";
    // Constructor
    public  ScriptC_reduce_general_accumulator(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              reduce_general_accumulatorBitCode.getBitCode32(),
              reduce_general_accumulatorBitCode.getBitCode64());
        mRSLocal = rs;
        __I32 = Element.I32(rs);
    }

    private Element __I32;
    private RenderScript mRSLocal;
    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_int {
        public int get() {
            if (!mGotResult) {
                int[] outArray = new int[1];
                mOut.copyTo(outArray);
                mResult = outArray[0];
                mOut.destroy();
                mOut = null;  // make Java object eligible for garbage collection
                if (mTempIns != null) {
                    for (Allocation tempIn : mTempIns) {
                        tempIn.destroy();
                    }

                    mTempIns = null;  // make Java objects eligible for garbage collection
                }

                mGotResult = true;
            }

            return mResult;
        }

        private  result_int(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private int mResult;
    }

    private final static int mExportReduceIdx_my_half = 0;
    // in1 = "val"
    public result_int reduce_my_half(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_half(Allocation ain1) {
        return reduce_my_half(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_half(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half2 = 1;
    // in1 = "val"
    public result_int reduce_my_half2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_half2(Allocation ain1) {
        return reduce_my_half2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_half2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half4 = 2;
    // in1 = "val"
    public result_int reduce_my_half4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_half4(Allocation ain1) {
        return reduce_my_half4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_half4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_half = 3;
    // in1 = "val"
    public result_int reduce_my_array_half(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_half(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_half(Allocation ain1) {
        return reduce_my_array_half(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_half(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_half, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_half2 = 4;
    // in1 = "val"
    public result_int reduce_my_array_half2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_half2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_half2(Allocation ain1) {
        return reduce_my_array_half2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_half2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_half2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_half4 = 5;
    // in1 = "val"
    public result_int reduce_my_array_half4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_half4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_half4(Allocation ain1) {
        return reduce_my_array_half4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_half4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_half4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float = 6;
    // in1 = "val"
    public result_int reduce_my_float(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_float(Allocation ain1) {
        return reduce_my_float(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_float(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float2 = 7;
    // in1 = "val"
    public result_int reduce_my_float2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_float2(Allocation ain1) {
        return reduce_my_float2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_float2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float4 = 8;
    // in1 = "val"
    public result_int reduce_my_float4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_float4(Allocation ain1) {
        return reduce_my_float4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_float4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_float = 9;
    // in1 = "val"
    public result_int reduce_my_array_float(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_float(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_float(Allocation ain1) {
        return reduce_my_array_float(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_float(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_float, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_float2 = 10;
    // in1 = "val"
    public result_int reduce_my_array_float2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_float2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_float2(Allocation ain1) {
        return reduce_my_array_float2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_float2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_float2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_float4 = 11;
    // in1 = "val"
    public result_int reduce_my_array_float4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_float4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_float4(Allocation ain1) {
        return reduce_my_array_float4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_float4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_float4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double = 12;
    // in1 = "val"
    public result_int reduce_my_double(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_double(Allocation ain1) {
        return reduce_my_double(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_double(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double2 = 13;
    // in1 = "val"
    public result_int reduce_my_double2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_double2(Allocation ain1) {
        return reduce_my_double2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_double2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double4 = 14;
    // in1 = "val"
    public result_int reduce_my_double4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_double4(Allocation ain1) {
        return reduce_my_double4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_double4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_double = 15;
    // in1 = "val"
    public result_int reduce_my_array_double(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_double(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_double(Allocation ain1) {
        return reduce_my_array_double(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_double(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_double, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_double2 = 16;
    // in1 = "val"
    public result_int reduce_my_array_double2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_double2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_double2(Allocation ain1) {
        return reduce_my_array_double2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_double2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_double2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_double4 = 17;
    // in1 = "val"
    public result_int reduce_my_array_double4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_double4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_double4(Allocation ain1) {
        return reduce_my_array_double4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_double4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_double4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char = 18;
    // in1 = "val"
    public result_int reduce_my_char(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_char(Allocation ain1) {
        return reduce_my_char(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_char(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char2 = 19;
    // in1 = "val"
    public result_int reduce_my_char2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_char2(Allocation ain1) {
        return reduce_my_char2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_char2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char4 = 20;
    // in1 = "val"
    public result_int reduce_my_char4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_char4(Allocation ain1) {
        return reduce_my_char4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_char4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_char = 21;
    // in1 = "val"
    public result_int reduce_my_array_char(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_char(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_char(Allocation ain1) {
        return reduce_my_array_char(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_char(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_char, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_char2 = 22;
    // in1 = "val"
    public result_int reduce_my_array_char2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_char2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_char2(Allocation ain1) {
        return reduce_my_array_char2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_char2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_char2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_char4 = 23;
    // in1 = "val"
    public result_int reduce_my_array_char4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_char4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_char4(Allocation ain1) {
        return reduce_my_array_char4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_char4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_char4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short = 24;
    // in1 = "val"
    public result_int reduce_my_short(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_short(Allocation ain1) {
        return reduce_my_short(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_short(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short2 = 25;
    // in1 = "val"
    public result_int reduce_my_short2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_short2(Allocation ain1) {
        return reduce_my_short2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_short2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short4 = 26;
    // in1 = "val"
    public result_int reduce_my_short4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_short4(Allocation ain1) {
        return reduce_my_short4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_short4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_short = 27;
    // in1 = "val"
    public result_int reduce_my_array_short(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_short(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_short(Allocation ain1) {
        return reduce_my_array_short(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_short(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_short, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_short2 = 28;
    // in1 = "val"
    public result_int reduce_my_array_short2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_short2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_short2(Allocation ain1) {
        return reduce_my_array_short2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_short2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_short2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_short4 = 29;
    // in1 = "val"
    public result_int reduce_my_array_short4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_short4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_short4(Allocation ain1) {
        return reduce_my_array_short4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_short4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_short4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int = 30;
    // in1 = "val"
    public result_int reduce_my_int(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_int(Allocation ain1) {
        return reduce_my_int(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_int(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int2 = 31;
    // in1 = "val"
    public result_int reduce_my_int2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_int2(Allocation ain1) {
        return reduce_my_int2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_int2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int4 = 32;
    // in1 = "val"
    public result_int reduce_my_int4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_int4(Allocation ain1) {
        return reduce_my_int4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_int4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_int = 33;
    // in1 = "val"
    public result_int reduce_my_array_int(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_int(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_int(Allocation ain1) {
        return reduce_my_array_int(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_int(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_int, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_int2 = 34;
    // in1 = "val"
    public result_int reduce_my_array_int2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_int2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_int2(Allocation ain1) {
        return reduce_my_array_int2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_int2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_int2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_int4 = 35;
    // in1 = "val"
    public result_int reduce_my_array_int4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_int4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_int4(Allocation ain1) {
        return reduce_my_array_int4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_int4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_int4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long = 36;
    // in1 = "val"
    public result_int reduce_my_long(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_long(Allocation ain1) {
        return reduce_my_long(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_long(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long2 = 37;
    // in1 = "val"
    public result_int reduce_my_long2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_long2(Allocation ain1) {
        return reduce_my_long2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_long2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long4 = 38;
    // in1 = "val"
    public result_int reduce_my_long4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_long4(Allocation ain1) {
        return reduce_my_long4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_long4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_long = 39;
    // in1 = "val"
    public result_int reduce_my_array_long(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_long(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_long(Allocation ain1) {
        return reduce_my_array_long(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_long(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_long, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_long2 = 40;
    // in1 = "val"
    public result_int reduce_my_array_long2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_long2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_long2(Allocation ain1) {
        return reduce_my_array_long2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_long2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_long2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_long4 = 41;
    // in1 = "val"
    public result_int reduce_my_array_long4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_long4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_long4(Allocation ain1) {
        return reduce_my_array_long4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_long4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_long4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar = 42;
    // in1 = "val"
    public result_int reduce_my_uchar(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_uchar(Allocation ain1) {
        return reduce_my_uchar(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_uchar(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar2 = 43;
    // in1 = "val"
    public result_int reduce_my_uchar2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_uchar2(Allocation ain1) {
        return reduce_my_uchar2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_uchar2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar4 = 44;
    // in1 = "val"
    public result_int reduce_my_uchar4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_uchar4(Allocation ain1) {
        return reduce_my_uchar4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_uchar4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_uchar = 45;
    // in1 = "val"
    public result_int reduce_my_array_uchar(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_uchar(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_uchar(Allocation ain1) {
        return reduce_my_array_uchar(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_uchar(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_uchar, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_uchar2 = 46;
    // in1 = "val"
    public result_int reduce_my_array_uchar2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_uchar2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_uchar2(Allocation ain1) {
        return reduce_my_array_uchar2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_uchar2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_uchar2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_uchar4 = 47;
    // in1 = "val"
    public result_int reduce_my_array_uchar4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_uchar4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_uchar4(Allocation ain1) {
        return reduce_my_array_uchar4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_uchar4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_uchar4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort = 48;
    // in1 = "val"
    public result_int reduce_my_ushort(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_ushort(Allocation ain1) {
        return reduce_my_ushort(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_ushort(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort2 = 49;
    // in1 = "val"
    public result_int reduce_my_ushort2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_ushort2(Allocation ain1) {
        return reduce_my_ushort2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_ushort2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort4 = 50;
    // in1 = "val"
    public result_int reduce_my_ushort4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_ushort4(Allocation ain1) {
        return reduce_my_ushort4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_ushort4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_ushort = 51;
    // in1 = "val"
    public result_int reduce_my_array_ushort(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_ushort(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_ushort(Allocation ain1) {
        return reduce_my_array_ushort(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_ushort(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_ushort, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_ushort2 = 52;
    // in1 = "val"
    public result_int reduce_my_array_ushort2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_ushort2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_ushort2(Allocation ain1) {
        return reduce_my_array_ushort2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_ushort2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_ushort2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_ushort4 = 53;
    // in1 = "val"
    public result_int reduce_my_array_ushort4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_ushort4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_ushort4(Allocation ain1) {
        return reduce_my_array_ushort4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_ushort4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_ushort4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint = 54;
    // in1 = "val"
    public result_int reduce_my_uint(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_uint(Allocation ain1) {
        return reduce_my_uint(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_uint(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint2 = 55;
    // in1 = "val"
    public result_int reduce_my_uint2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_uint2(Allocation ain1) {
        return reduce_my_uint2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_uint2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint4 = 56;
    // in1 = "val"
    public result_int reduce_my_uint4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_uint4(Allocation ain1) {
        return reduce_my_uint4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_uint4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_uint = 57;
    // in1 = "val"
    public result_int reduce_my_array_uint(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_uint(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_uint(Allocation ain1) {
        return reduce_my_array_uint(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_uint(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_uint, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_uint2 = 58;
    // in1 = "val"
    public result_int reduce_my_array_uint2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_uint2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_uint2(Allocation ain1) {
        return reduce_my_array_uint2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_uint2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_uint2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_uint4 = 59;
    // in1 = "val"
    public result_int reduce_my_array_uint4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_uint4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_uint4(Allocation ain1) {
        return reduce_my_array_uint4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_uint4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_uint4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong = 60;
    // in1 = "val"
    public result_int reduce_my_ulong(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_ulong(Allocation ain1) {
        return reduce_my_ulong(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_ulong(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong2 = 61;
    // in1 = "val"
    public result_int reduce_my_ulong2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_ulong2(Allocation ain1) {
        return reduce_my_ulong2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_ulong2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong4 = 62;
    // in1 = "val"
    public result_int reduce_my_ulong4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_ulong4(Allocation ain1) {
        return reduce_my_ulong4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_ulong4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_ulong = 63;
    // in1 = "val"
    public result_int reduce_my_array_ulong(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_ulong(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_ulong(Allocation ain1) {
        return reduce_my_array_ulong(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_ulong(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_ulong, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_ulong2 = 64;
    // in1 = "val"
    public result_int reduce_my_array_ulong2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_ulong2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_ulong2(Allocation ain1) {
        return reduce_my_array_ulong2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_ulong2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_ulong2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_ulong4 = 65;
    // in1 = "val"
    public result_int reduce_my_array_ulong4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_ulong4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_ulong4(Allocation ain1) {
        return reduce_my_array_ulong4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_ulong4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_ulong4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_bool = 66;
    // in1 = "val"
    public result_int reduce_my_bool(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_bool(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_bool(Allocation ain1) {
        return reduce_my_bool(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_bool(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_bool = 67;
    // in1 = "val"
    public result_int reduce_my_array_bool(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_bool(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_bool(Allocation ain1) {
        return reduce_my_array_bool(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_bool(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_bool, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix2x2 = 68;
    // in1 = "val"
    public result_int reduce_my_rs_matrix2x2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_rs_matrix2x2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_rs_matrix2x2(Allocation ain1) {
        return reduce_my_rs_matrix2x2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_rs_matrix2x2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix2x2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_rs_matrix2x2 = 69;
    // in1 = "val"
    public result_int reduce_my_array_rs_matrix2x2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_rs_matrix2x2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_rs_matrix2x2(Allocation ain1) {
        return reduce_my_array_rs_matrix2x2(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_rs_matrix2x2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_rs_matrix2x2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix3x3 = 70;
    // in1 = "val"
    public result_int reduce_my_rs_matrix3x3(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_rs_matrix3x3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_rs_matrix3x3(Allocation ain1) {
        return reduce_my_rs_matrix3x3(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_rs_matrix3x3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix3x3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_rs_matrix3x3 = 71;
    // in1 = "val"
    public result_int reduce_my_array_rs_matrix3x3(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_rs_matrix3x3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_rs_matrix3x3(Allocation ain1) {
        return reduce_my_array_rs_matrix3x3(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_rs_matrix3x3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_rs_matrix3x3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix4x4 = 72;
    // in1 = "val"
    public result_int reduce_my_rs_matrix4x4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_rs_matrix4x4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_rs_matrix4x4(Allocation ain1) {
        return reduce_my_rs_matrix4x4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_rs_matrix4x4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix4x4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_rs_matrix4x4 = 73;
    // in1 = "val"
    public result_int reduce_my_array_rs_matrix4x4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_rs_matrix4x4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_rs_matrix4x4(Allocation ain1) {
        return reduce_my_array_rs_matrix4x4(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_rs_matrix4x4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_rs_matrix4x4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_for_each_strategy_t = 74;
    // in1 = "val"
    public result_int reduce_my_rs_for_each_strategy_t(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_rs_for_each_strategy_t(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_rs_for_each_strategy_t(Allocation ain1) {
        return reduce_my_rs_for_each_strategy_t(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_rs_for_each_strategy_t(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_for_each_strategy_t, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_rs_for_each_strategy_t = 75;
    // in1 = "val"
    public result_int reduce_my_array_rs_for_each_strategy_t(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_rs_for_each_strategy_t(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_rs_for_each_strategy_t(Allocation ain1) {
        return reduce_my_array_rs_for_each_strategy_t(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_rs_for_each_strategy_t(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_rs_for_each_strategy_t, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_script_call_t = 76;
    // in1 = "val"
    public result_int reduce_my_rs_script_call_t(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_rs_script_call_t(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_rs_script_call_t(Allocation ain1) {
        return reduce_my_rs_script_call_t(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_rs_script_call_t(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_script_call_t, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_rs_script_call_t = 77;
    // in1 = "val"
    public result_int reduce_my_array_rs_script_call_t(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_rs_script_call_t(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_rs_script_call_t(Allocation ain1) {
        return reduce_my_array_rs_script_call_t(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_rs_script_call_t(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_rs_script_call_t, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_time_t = 78;
    // in1 = "val"
    public result_int reduce_my_rs_time_t(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_rs_time_t(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_rs_time_t(Allocation ain1) {
        return reduce_my_rs_time_t(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_rs_time_t(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_time_t, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_rs_time_t = 79;
    // in1 = "val"
    public result_int reduce_my_array_rs_time_t(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_rs_time_t(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_rs_time_t(Allocation ain1) {
        return reduce_my_array_rs_time_t(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_rs_time_t(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_rs_time_t, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_tm = 80;
    // in1 = "val"
    public result_int reduce_my_rs_tm(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_rs_tm(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_rs_tm(Allocation ain1) {
        return reduce_my_rs_tm(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_rs_tm(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_tm, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_rs_tm = 81;
    // in1 = "val"
    public result_int reduce_my_array_rs_tm(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_rs_tm(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_rs_tm(Allocation ain1) {
        return reduce_my_array_rs_tm(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_rs_tm(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_rs_tm, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyEnum = 82;
    // in1 = "val"
    public result_int reduce_my_MyEnum(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_MyEnum(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_MyEnum(Allocation ain1) {
        return reduce_my_MyEnum(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_MyEnum(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyEnum, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_MyEnum = 83;
    // in1 = "val"
    public result_int reduce_my_array_MyEnum(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_MyEnum(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyEnum(Allocation ain1) {
        return reduce_my_array_MyEnum(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyEnum(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_MyEnum, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyPtrArray = 84;
    // in1 = "val"
    public result_int reduce_my_MyPtrArray(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_MyPtrArray(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_MyPtrArray(Allocation ain1) {
        return reduce_my_MyPtrArray(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_MyPtrArray(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyPtrArray, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_MyPtrArray = 85;
    // in1 = "val"
    public result_int reduce_my_array_MyPtrArray(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_MyPtrArray(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyPtrArray(Allocation ain1) {
        return reduce_my_array_MyPtrArray(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyPtrArray(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_MyPtrArray, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyPtrFn = 86;
    // in1 = "val"
    public result_int reduce_my_MyPtrFn(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_MyPtrFn(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_MyPtrFn(Allocation ain1) {
        return reduce_my_MyPtrFn(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_MyPtrFn(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyPtrFn, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_MyPtrFn = 87;
    // in1 = "val"
    public result_int reduce_my_array_MyPtrFn(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_MyPtrFn(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyPtrFn(Allocation ain1) {
        return reduce_my_array_MyPtrFn(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyPtrFn(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_MyPtrFn, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyPtrIncomplete = 88;
    // in1 = "val"
    public result_int reduce_my_MyPtrIncomplete(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_MyPtrIncomplete(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_MyPtrIncomplete(Allocation ain1) {
        return reduce_my_MyPtrIncomplete(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_MyPtrIncomplete(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyPtrIncomplete, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_MyPtrIncomplete = 89;
    // in1 = "val"
    public result_int reduce_my_array_MyPtrIncomplete(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_MyPtrIncomplete(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyPtrIncomplete(Allocation ain1) {
        return reduce_my_array_MyPtrIncomplete(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyPtrIncomplete(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_MyPtrIncomplete, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyPtrShort = 90;
    // in1 = "val"
    public result_int reduce_my_MyPtrShort(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_MyPtrShort(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_MyPtrShort(Allocation ain1) {
        return reduce_my_MyPtrShort(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_MyPtrShort(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyPtrShort, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_MyPtrShort = 91;
    // in1 = "val"
    public result_int reduce_my_array_MyPtrShort(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_MyPtrShort(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyPtrShort(Allocation ain1) {
        return reduce_my_array_MyPtrShort(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyPtrShort(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_MyPtrShort, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyPtrVoid = 92;
    // in1 = "val"
    public result_int reduce_my_MyPtrVoid(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_MyPtrVoid(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_MyPtrVoid(Allocation ain1) {
        return reduce_my_MyPtrVoid(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_MyPtrVoid(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyPtrVoid, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_MyPtrVoid = 93;
    // in1 = "val"
    public result_int reduce_my_array_MyPtrVoid(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_MyPtrVoid(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyPtrVoid(Allocation ain1) {
        return reduce_my_array_MyPtrVoid(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyPtrVoid(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_MyPtrVoid, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyStruct = 94;
    // in1 = "val"
    public result_int reduce_my_MyStruct(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_MyStruct(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_MyStruct(Allocation ain1) {
        return reduce_my_MyStruct(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_MyStruct(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyStruct, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_MyStruct = 95;
    // in1 = "val"
    public result_int reduce_my_array_MyStruct(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_MyStruct(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyStruct(Allocation ain1) {
        return reduce_my_array_MyStruct(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyStruct(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_MyStruct, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyUnion = 96;
    // in1 = "val"
    public result_int reduce_my_MyUnion(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_MyUnion(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_MyUnion(Allocation ain1) {
        return reduce_my_MyUnion(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_MyUnion(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyUnion, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_MyUnion = 97;
    // in1 = "val"
    public result_int reduce_my_array_MyUnion(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_MyUnion(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyUnion(Allocation ain1) {
        return reduce_my_array_MyUnion(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyUnion(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_MyUnion, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyBlob = 98;
    // in1 = "val"
    public result_int reduce_my_MyBlob(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_MyBlob(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_MyBlob(Allocation ain1) {
        return reduce_my_MyBlob(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_MyBlob(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyBlob, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_array_MyBlob = 99;
    // in1 = "val"
    public result_int reduce_my_array_MyBlob(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_array_MyBlob(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyBlob(Allocation ain1) {
        return reduce_my_array_MyBlob(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_my_array_MyBlob(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_MyBlob, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

}

