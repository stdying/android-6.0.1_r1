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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/RsTest/src/com/android/rs/test/reduce.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.reduceBitCode;

/**
 * @hide
 */
public class ScriptC_reduce extends ScriptC {
    private static final String __rs_resource_name = "reduce";
    // Constructor
    public  ScriptC_reduce(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              reduceBitCode.getBitCode32(),
              reduceBitCode.getBitCode64());
        __F32 = Element.F32(rs);
        mRSLocal = rs;
        __I32 = Element.I32(rs);
        __I32_2 = Element.I32_2(rs);
        __I32_3 = Element.I32_3(rs);
        __U32 = Element.U32(rs);
        __U8 = Element.U8(rs);
        __I64 = Element.I64(rs);
    }

    private Element __F32;
    private Element __I32;
    private Element __I32_2;
    private Element __I32_3;
    private Element __I64;
    private Element __U32;
    private Element __U8;
    private FieldPacker __rs_fp_F32;
    private RenderScript mRSLocal;
    private final static int mExportVarIdx_negInf = 0;
    private float mExportVar_negInf;
    public synchronized void set_negInf(float v) {
        setVar(mExportVarIdx_negInf, v);
        mExportVar_negInf = v;
    }

    public float get_negInf() {
        return mExportVar_negInf;
    }

    public Script.FieldID getFieldID_negInf() {
        return createFieldID(mExportVarIdx_negInf, null);
    }

    private final static int mExportVarIdx_posInf = 1;
    private float mExportVar_posInf;
    public synchronized void set_posInf(float v) {
        setVar(mExportVarIdx_posInf, v);
        mExportVar_posInf = v;
    }

    public float get_posInf() {
        return mExportVar_posInf;
    }

    public Script.FieldID getFieldID_posInf() {
        return createFieldID(mExportVarIdx_posInf, null);
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray16_float {
        public float[] get() {
            if (!mGotResult) {
                float[] outArray = new float[16];
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

        private  resultArray16_float(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private float[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray256_uint {
        public long[] get() {
            if (!mGotResult) {
                int[] outArray = new int[256];
                mOut.copyTo(outArray);
                long[] result = new long[256];
                for (int Idx = 0; Idx < 256; ++Idx) {
                    result[Idx] = ((long) ((outArray[Idx]) & 0xffffffffL));
                }

                mResult = result;
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

        private  resultArray256_uint(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private long[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray4_float {
        public float[] get() {
            if (!mGotResult) {
                float[] outArray = new float[4];
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

        private  resultArray4_float(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private float[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray4_int {
        public int[] get() {
            if (!mGotResult) {
                int[] outArray = new int[4];
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

        private  resultArray4_int(Allocation out) {
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

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_int2 {
        public Int2 get() {
            if (!mGotResult) {
                int[] outArray = new int[2];
                mOut.copyTo(outArray);
                mResult = new Int2(outArray[0], outArray[1]);
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

        private  result_int2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Int2 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_int3 {
        public Int3 get() {
            if (!mGotResult) {
                int[] outArray = new int[3];
                mOut.copyTo(outArray);
                mResult = new Int3(outArray[0], outArray[1], outArray[2]);
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

        private  result_int3(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Int3 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_long {
        public long get() {
            if (!mGotResult) {
                long[] outArray = new long[1];
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

        private  result_long(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private long mResult;
    }

    private final static int mExportReduceIdx_addint = 0;
    // in1 = "val"
    public result_int reduce_addint(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_addint(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public result_int reduce_addint(Allocation ain1) {
        return reduce_addint(ain1, null);
    }

    // ain1 = "int val"
    public result_int reduce_addint(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_addint, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_findMinAndMax = 1;
    // in1 = "in"
    public result_int2 reduce_findMinAndMax(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int2 result = reduce_findMinAndMax(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float in"
    public result_int2 reduce_findMinAndMax(Allocation ain1) {
        return reduce_findMinAndMax(ain1, null);
    }

    // ain1 = "float in"
    public result_int2 reduce_findMinAndMax(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32_2, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_findMinAndMax, new Allocation[]{ain1}, aout, sc);
        return new result_int2(aout);
    }

    private final static int mExportReduceIdx_fz = 2;
    // in1 = "inVal"
    public result_int reduce_fz(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_fz(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int inVal"
    public result_int reduce_fz(Allocation ain1) {
        return reduce_fz(ain1, null);
    }

    // ain1 = "int inVal"
    public result_int reduce_fz(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_fz, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_fz2 = 3;
    // in1 = "inVal"
    public result_int2 reduce_fz2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int2 result = reduce_fz2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int inVal"
    public result_int2 reduce_fz2(Allocation ain1) {
        return reduce_fz2(ain1, null);
    }

    // ain1 = "int inVal"
    public result_int2 reduce_fz2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32_2, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_fz2, new Allocation[]{ain1}, aout, sc);
        return new result_int2(aout);
    }

    private final static int mExportReduceIdx_fz3 = 4;
    // in1 = "inVal"
    public result_int3 reduce_fz3(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int3 result = reduce_fz3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int inVal"
    public result_int3 reduce_fz3(Allocation ain1) {
        return reduce_fz3(ain1, null);
    }

    // ain1 = "int inVal"
    public result_int3 reduce_fz3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32_3, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_fz3, new Allocation[]{ain1}, aout, sc);
        return new result_int3(aout);
    }

    private final static int mExportReduceIdx_histogram = 5;
    // in1 = "in"
    public resultArray256_uint reduce_histogram(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray256_uint result = reduce_histogram(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public resultArray256_uint reduce_histogram(Allocation ain1) {
        return reduce_histogram(ain1, null);
    }

    // ain1 = "uchar in"
    public resultArray256_uint reduce_histogram(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U32, 256);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_histogram, new Allocation[]{ain1}, aout, sc);
        return new resultArray256_uint(aout);
    }

    private final static int mExportReduceIdx_mode = 6;
    // in1 = "in"
    public result_int2 reduce_mode(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int2 result = reduce_mode(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public result_int2 reduce_mode(Allocation ain1) {
        return reduce_mode(ain1, null);
    }

    // ain1 = "uchar in"
    public result_int2 reduce_mode(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32_2, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_mode, new Allocation[]{ain1}, aout, sc);
        return new result_int2(aout);
    }

    private final static int mExportReduceIdx_sumgcd = 7;
    // in1 = "a"
    // in2 = "b"
    public result_long reduce_sumgcd(int[] in1, int[] in2) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);
        // Verify that "in2" is non-null.
        if (in2 == null) {
            throw new RSIllegalArgumentException("Array \"in2\" is null!");
        }
        // Verify that input array lengths are the same.
        if (in1.length != in2.length) {
            throw new RSRuntimeException("Array length mismatch between parameters \"in1\" and \"in2\"!");
        }
        Allocation ain2 = Allocation.createSized(mRSLocal, __I32, in2.length);
        ain2.setAutoPadding(true);
        ain2.copyFrom(in2);

        result_long result = reduce_sumgcd(ain1, ain2, null);
        result.mTempIns = new Allocation[]{ain1, ain2};
        return result;
    }

    // ain1 = "int a"
    // ain2 = "int b"
    public result_long reduce_sumgcd(Allocation ain1, Allocation ain2) {
        return reduce_sumgcd(ain1, ain2, null);
    }

    // ain1 = "int a"
    // ain2 = "int b"
    public result_long reduce_sumgcd(Allocation ain1, Allocation ain2, Script.LaunchOptions sc) {
        Type t0, t1;
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        // check ain2
        if (!ain2.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        // Verify dimensions
        t0 = ain1.getType();
        t1 = ain2.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain1 and ain2!");
        }

        Allocation aout = Allocation.createSized(mRSLocal, __I64, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_sumgcd, new Allocation[]{ain1, ain2}, aout, sc);
        return new result_long(aout);
    }

    private final static int mExportReduceIdx_sillySumIntoDecArray = 8;
    // in1 = "val"
    public resultArray4_int reduce_sillySumIntoDecArray(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray4_int result = reduce_sillySumIntoDecArray(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public resultArray4_int reduce_sillySumIntoDecArray(Allocation ain1) {
        return reduce_sillySumIntoDecArray(ain1, null);
    }

    // ain1 = "int val"
    public resultArray4_int reduce_sillySumIntoDecArray(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 4);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_sillySumIntoDecArray, new Allocation[]{ain1}, aout, sc);
        return new resultArray4_int(aout);
    }

    private final static int mExportReduceIdx_sillySumIntoIncArray = 9;
    // in1 = "val"
    public resultArray4_int reduce_sillySumIntoIncArray(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray4_int result = reduce_sillySumIntoIncArray(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public resultArray4_int reduce_sillySumIntoIncArray(Allocation ain1) {
        return reduce_sillySumIntoIncArray(ain1, null);
    }

    // ain1 = "int val"
    public resultArray4_int reduce_sillySumIntoIncArray(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 4);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_sillySumIntoIncArray, new Allocation[]{ain1}, aout, sc);
        return new resultArray4_int(aout);
    }

    private final static int mExportReduceIdx_findMinMat2 = 10;
    // ain1 = "rs_matrix2x2 val"
    public resultArray4_float reduce_findMinMat2(Allocation ain1) {
        return reduce_findMinMat2(ain1, null);
    }

    // ain1 = "rs_matrix2x2 val"
    public resultArray4_float reduce_findMinMat2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __F32, 4);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_findMinMat2, new Allocation[]{ain1}, aout, sc);
        return new resultArray4_float(aout);
    }

    private final static int mExportReduceIdx_findMinMat4 = 11;
    // ain1 = "rs_matrix4x4 val"
    public resultArray16_float reduce_findMinMat4(Allocation ain1) {
        return reduce_findMinMat4(ain1, null);
    }

    // ain1 = "rs_matrix4x4 val"
    public resultArray16_float reduce_findMinMat4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __F32, 16);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_findMinMat4, new Allocation[]{ain1}, aout, sc);
        return new resultArray16_float(aout);
    }

}

