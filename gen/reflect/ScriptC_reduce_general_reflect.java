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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_reduce_general_reflect/reduce_general_reflect.rs
 */

package reflect;

import android.renderscript.*;
import reflect.reduce_general_reflectBitCode;

/**
 * @hide
 */
public class ScriptC_reduce_general_reflect extends ScriptC {
    private static final String __rs_resource_name = "reduce_general_reflect";
    // Constructor
    public  ScriptC_reduce_general_reflect(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              reduce_general_reflectBitCode.getBitCode32(),
              reduce_general_reflectBitCode.getBitCode64());
        mRSLocal = rs;
        __F64 = Element.F64(rs);
        __F32 = Element.F32(rs);
        __I32 = Element.I32(rs);
    }

    private Element __F32;
    private Element __F64;
    private Element __I32;
    private RenderScript mRSLocal;
    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray3_int {
        public int[] get() {
            if (!mGotResult) {
                int[] outArray = new int[3];
                mOut.copyTo(outArray);
                mResult = outArray;
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

        private  resultArray3_int(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private int[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_int {
        public int[] get() {
            if (!mGotResult) {
                int[] outArray = new int[7];
                mOut.copyTo(outArray);
                mResult = outArray;
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

        private  resultArray7_int(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private int[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_double {
        public double get() {
            if (!mGotResult) {
                double[] outArray = new double[1];
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

        private  result_double(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private double mResult;
    }

    private final static int mExportReduceIdx_d1 = 0;
    // in1 = "val"
    public result_double reduce_d1(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_double result = reduce_d1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float val"
    public result_double reduce_d1(Allocation ain1) {
        return reduce_d1(ain1, null);
    }

    // ain1 = "float val"
    public result_double reduce_d1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F64, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_d1, new Allocation[]{ain1}, aout, sc);
        return new result_double(aout);
    }

    private final static int mExportReduceIdx_d2 = 1;
    // in1 = "val"
    public result_double reduce_d2(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_double result = reduce_d2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double val"
    public result_double reduce_d2(Allocation ain1) {
        return reduce_d2(ain1, null);
    }

    // ain1 = "double val"
    public result_double reduce_d2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F64, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_d2, new Allocation[]{ain1}, aout, sc);
        return new result_double(aout);
    }

    private final static int mExportReduceIdx_a3 = 2;
    // in1 = "val"
    public resultArray3_int reduce_a3(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray3_int result = reduce_a3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public resultArray3_int reduce_a3(Allocation ain1) {
        return reduce_a3(ain1, null);
    }

    // ain1 = "int val"
    public resultArray3_int reduce_a3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 3);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_a3, new Allocation[]{ain1}, aout, sc);
        return new resultArray3_int(aout);
    }

    private final static int mExportReduceIdx_a7 = 3;
    // in1 = "val"
    public resultArray7_int reduce_a7(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_int result = reduce_a7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public resultArray7_int reduce_a7(Allocation ain1) {
        return reduce_a7(ain1, null);
    }

    // ain1 = "int val"
    public resultArray7_int reduce_a7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_a7, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_int(aout);
    }

}

