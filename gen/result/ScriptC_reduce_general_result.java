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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_reduce_general_result/reduce_general_result.rs
 */

package result;

import android.renderscript.*;
import result.reduce_general_resultBitCode;

/**
 * @hide
 */
public class ScriptC_reduce_general_result extends ScriptC {
    private static final String __rs_resource_name = "reduce_general_result";
    // Constructor
    public  ScriptC_reduce_general_result(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              reduce_general_resultBitCode.getBitCode32(),
              reduce_general_resultBitCode.getBitCode64());
        mRSLocal = rs;
        __F16 = Element.F16(rs);
        __F16_2 = Element.F16_2(rs);
        __F16_4 = Element.F16_4(rs);
        __F32 = Element.F32(rs);
        __F32_2 = Element.F32_2(rs);
        __F32_4 = Element.F32_4(rs);
        __F64 = Element.F64(rs);
        __F64_2 = Element.F64_2(rs);
        __F64_4 = Element.F64_4(rs);
        __I8 = Element.I8(rs);
        __I8_2 = Element.I8_2(rs);
        __I8_4 = Element.I8_4(rs);
        __I16 = Element.I16(rs);
        __I16_2 = Element.I16_2(rs);
        __I16_4 = Element.I16_4(rs);
        __I32 = Element.I32(rs);
        __I32_2 = Element.I32_2(rs);
        __I32_4 = Element.I32_4(rs);
        __I64 = Element.I64(rs);
        __I64_2 = Element.I64_2(rs);
        __I64_4 = Element.I64_4(rs);
        __U8 = Element.U8(rs);
        __U8_2 = Element.U8_2(rs);
        __U8_4 = Element.U8_4(rs);
        __U16 = Element.U16(rs);
        __U16_2 = Element.U16_2(rs);
        __U16_4 = Element.U16_4(rs);
        __U32 = Element.U32(rs);
        __U32_2 = Element.U32_2(rs);
        __U32_4 = Element.U32_4(rs);
        __U64 = Element.U64(rs);
        __U64_2 = Element.U64_2(rs);
        __U64_4 = Element.U64_4(rs);
        __BOOLEAN = Element.BOOLEAN(rs);
    }

    private Element __BOOLEAN;
    private Element __F16;
    private Element __F16_2;
    private Element __F16_4;
    private Element __F32;
    private Element __F32_2;
    private Element __F32_4;
    private Element __F64;
    private Element __F64_2;
    private Element __F64_4;
    private Element __I16;
    private Element __I16_2;
    private Element __I16_4;
    private Element __I32;
    private Element __I32_2;
    private Element __I32_4;
    private Element __I64;
    private Element __I64_2;
    private Element __I64_4;
    private Element __I8;
    private Element __I8_2;
    private Element __I8_4;
    private Element __U16;
    private Element __U16_2;
    private Element __U16_4;
    private Element __U32;
    private Element __U32_2;
    private Element __U32_4;
    private Element __U64;
    private Element __U64_2;
    private Element __U64_4;
    private Element __U8;
    private Element __U8_2;
    private Element __U8_4;
    private RenderScript mRSLocal;
    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_bool {
        public boolean[] get() {
            if (!mGotResult) {
                byte[] outArray = new byte[7];
                mOut.copyTo(outArray);
                boolean[] result = new boolean[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = outArray[Idx] != 0;
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

        private  resultArray7_bool(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private boolean[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_char {
        public byte[] get() {
            if (!mGotResult) {
                byte[] outArray = new byte[7];
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

        private  resultArray7_char(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private byte[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_char2 {
        public Byte2[] get() {
            if (!mGotResult) {
                byte[] outArray = new byte[14];
                mOut.copyTo(outArray);
                Byte2[] result = new Byte2[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Byte2(outArray[2*Idx+0], outArray[2*Idx+1]);
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

        private  resultArray7_char2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Byte2[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_char4 {
        public Byte4[] get() {
            if (!mGotResult) {
                byte[] outArray = new byte[28];
                mOut.copyTo(outArray);
                Byte4[] result = new Byte4[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Byte4(outArray[4*Idx+0], outArray[4*Idx+1], outArray[4*Idx+2], outArray[4*Idx+3]);
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

        private  resultArray7_char4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Byte4[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_double {
        public double[] get() {
            if (!mGotResult) {
                double[] outArray = new double[7];
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

        private  resultArray7_double(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private double[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_double2 {
        public Double2[] get() {
            if (!mGotResult) {
                double[] outArray = new double[14];
                mOut.copyTo(outArray);
                Double2[] result = new Double2[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Double2(outArray[2*Idx+0], outArray[2*Idx+1]);
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

        private  resultArray7_double2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Double2[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_double4 {
        public Double4[] get() {
            if (!mGotResult) {
                double[] outArray = new double[28];
                mOut.copyTo(outArray);
                Double4[] result = new Double4[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Double4(outArray[4*Idx+0], outArray[4*Idx+1], outArray[4*Idx+2], outArray[4*Idx+3]);
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

        private  resultArray7_double4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Double4[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_float {
        public float[] get() {
            if (!mGotResult) {
                float[] outArray = new float[7];
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

        private  resultArray7_float(Allocation out) {
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
    public static class resultArray7_float2 {
        public Float2[] get() {
            if (!mGotResult) {
                float[] outArray = new float[14];
                mOut.copyTo(outArray);
                Float2[] result = new Float2[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Float2(outArray[2*Idx+0], outArray[2*Idx+1]);
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

        private  resultArray7_float2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Float2[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_float4 {
        public Float4[] get() {
            if (!mGotResult) {
                float[] outArray = new float[28];
                mOut.copyTo(outArray);
                Float4[] result = new Float4[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Float4(outArray[4*Idx+0], outArray[4*Idx+1], outArray[4*Idx+2], outArray[4*Idx+3]);
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

        private  resultArray7_float4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Float4[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_half {
        public short[] get() {
            if (!mGotResult) {
                short[] outArray = new short[7];
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

        private  resultArray7_half(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private short[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_half2 {
        public Short2[] get() {
            if (!mGotResult) {
                short[] outArray = new short[14];
                mOut.copyTo(outArray);
                Short2[] result = new Short2[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Short2(outArray[2*Idx+0], outArray[2*Idx+1]);
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

        private  resultArray7_half2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Short2[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_half4 {
        public Short4[] get() {
            if (!mGotResult) {
                short[] outArray = new short[28];
                mOut.copyTo(outArray);
                Short4[] result = new Short4[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Short4(outArray[4*Idx+0], outArray[4*Idx+1], outArray[4*Idx+2], outArray[4*Idx+3]);
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

        private  resultArray7_half4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Short4[] mResult;
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
    public static class resultArray7_int2 {
        public Int2[] get() {
            if (!mGotResult) {
                int[] outArray = new int[14];
                mOut.copyTo(outArray);
                Int2[] result = new Int2[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Int2(outArray[2*Idx+0], outArray[2*Idx+1]);
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

        private  resultArray7_int2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Int2[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_int4 {
        public Int4[] get() {
            if (!mGotResult) {
                int[] outArray = new int[28];
                mOut.copyTo(outArray);
                Int4[] result = new Int4[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Int4(outArray[4*Idx+0], outArray[4*Idx+1], outArray[4*Idx+2], outArray[4*Idx+3]);
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

        private  resultArray7_int4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Int4[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_long {
        public long[] get() {
            if (!mGotResult) {
                long[] outArray = new long[7];
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

        private  resultArray7_long(Allocation out) {
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
    public static class resultArray7_long2 {
        public Long2[] get() {
            if (!mGotResult) {
                long[] outArray = new long[14];
                mOut.copyTo(outArray);
                Long2[] result = new Long2[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Long2(outArray[2*Idx+0], outArray[2*Idx+1]);
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

        private  resultArray7_long2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Long2[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_long4 {
        public Long4[] get() {
            if (!mGotResult) {
                long[] outArray = new long[28];
                mOut.copyTo(outArray);
                Long4[] result = new Long4[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Long4(outArray[4*Idx+0], outArray[4*Idx+1], outArray[4*Idx+2], outArray[4*Idx+3]);
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

        private  resultArray7_long4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Long4[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_short {
        public short[] get() {
            if (!mGotResult) {
                short[] outArray = new short[7];
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

        private  resultArray7_short(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private short[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_short2 {
        public Short2[] get() {
            if (!mGotResult) {
                short[] outArray = new short[14];
                mOut.copyTo(outArray);
                Short2[] result = new Short2[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Short2(outArray[2*Idx+0], outArray[2*Idx+1]);
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

        private  resultArray7_short2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Short2[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_short4 {
        public Short4[] get() {
            if (!mGotResult) {
                short[] outArray = new short[28];
                mOut.copyTo(outArray);
                Short4[] result = new Short4[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Short4(outArray[4*Idx+0], outArray[4*Idx+1], outArray[4*Idx+2], outArray[4*Idx+3]);
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

        private  resultArray7_short4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Short4[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_uchar {
        public short[] get() {
            if (!mGotResult) {
                byte[] outArray = new byte[7];
                mOut.copyTo(outArray);
                short[] result = new short[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = ((short) ((outArray[Idx]) & (short) 0xff));
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

        private  resultArray7_uchar(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private short[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_uchar2 {
        public Short2[] get() {
            if (!mGotResult) {
                byte[] outArray = new byte[14];
                mOut.copyTo(outArray);
                Short2[] result = new Short2[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Short2(((short) ((outArray[2*Idx+0]) & (short) 0xff)), ((short) ((outArray[2*Idx+1]) & (short) 0xff)));
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

        private  resultArray7_uchar2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Short2[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_uchar4 {
        public Short4[] get() {
            if (!mGotResult) {
                byte[] outArray = new byte[28];
                mOut.copyTo(outArray);
                Short4[] result = new Short4[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Short4(((short) ((outArray[4*Idx+0]) & (short) 0xff)), ((short) ((outArray[4*Idx+1]) & (short) 0xff)), ((short) ((outArray[4*Idx+2]) & (short) 0xff)), ((short) ((outArray[4*Idx+3]) & (short) 0xff)));
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

        private  resultArray7_uchar4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Short4[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_uint {
        public long[] get() {
            if (!mGotResult) {
                int[] outArray = new int[7];
                mOut.copyTo(outArray);
                long[] result = new long[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
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

        private  resultArray7_uint(Allocation out) {
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
    public static class resultArray7_uint2 {
        public Long2[] get() {
            if (!mGotResult) {
                int[] outArray = new int[14];
                mOut.copyTo(outArray);
                Long2[] result = new Long2[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Long2(((long) ((outArray[2*Idx+0]) & 0xffffffffL)), ((long) ((outArray[2*Idx+1]) & 0xffffffffL)));
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

        private  resultArray7_uint2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Long2[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_uint4 {
        public Long4[] get() {
            if (!mGotResult) {
                int[] outArray = new int[28];
                mOut.copyTo(outArray);
                Long4[] result = new Long4[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Long4(((long) ((outArray[4*Idx+0]) & 0xffffffffL)), ((long) ((outArray[4*Idx+1]) & 0xffffffffL)), ((long) ((outArray[4*Idx+2]) & 0xffffffffL)), ((long) ((outArray[4*Idx+3]) & 0xffffffffL)));
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

        private  resultArray7_uint4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Long4[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_ulong {
        public long[] get() {
            if (!mGotResult) {
                long[] outArray = new long[7];
                mOut.copyTo(outArray);
                for (int Idx = 0; Idx < 7; ++Idx) {
                    if (outArray[Idx] < 0)
                        throw new RSRuntimeException("Result is not representible in Java");
                }

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

        private  resultArray7_ulong(Allocation out) {
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
    public static class resultArray7_ulong2 {
        public Long2[] get() {
            if (!mGotResult) {
                long[] outArray = new long[14];
                mOut.copyTo(outArray);
                for (int Idx = 0; Idx < 14; ++Idx) {
                    if (outArray[Idx] < 0)
                        throw new RSRuntimeException("Result is not representible in Java");
                }

                Long2[] result = new Long2[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Long2(outArray[2*Idx+0], outArray[2*Idx+1]);
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

        private  resultArray7_ulong2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Long2[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_ulong4 {
        public Long4[] get() {
            if (!mGotResult) {
                long[] outArray = new long[28];
                mOut.copyTo(outArray);
                for (int Idx = 0; Idx < 28; ++Idx) {
                    if (outArray[Idx] < 0)
                        throw new RSRuntimeException("Result is not representible in Java");
                }

                Long4[] result = new Long4[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Long4(outArray[4*Idx+0], outArray[4*Idx+1], outArray[4*Idx+2], outArray[4*Idx+3]);
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

        private  resultArray7_ulong4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Long4[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_ushort {
        public int[] get() {
            if (!mGotResult) {
                short[] outArray = new short[7];
                mOut.copyTo(outArray);
                int[] result = new int[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = ((int) ((outArray[Idx]) & 0xffff));
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

        private  resultArray7_ushort(Allocation out) {
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
    public static class resultArray7_ushort2 {
        public Int2[] get() {
            if (!mGotResult) {
                short[] outArray = new short[14];
                mOut.copyTo(outArray);
                Int2[] result = new Int2[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Int2(((int) ((outArray[2*Idx+0]) & 0xffff)), ((int) ((outArray[2*Idx+1]) & 0xffff)));
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

        private  resultArray7_ushort2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Int2[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class resultArray7_ushort4 {
        public Int4[] get() {
            if (!mGotResult) {
                short[] outArray = new short[28];
                mOut.copyTo(outArray);
                Int4[] result = new Int4[7];
                for (int Idx = 0; Idx < 7; ++Idx) {
                    result[Idx] = new Int4(((int) ((outArray[4*Idx+0]) & 0xffff)), ((int) ((outArray[4*Idx+1]) & 0xffff)), ((int) ((outArray[4*Idx+2]) & 0xffff)), ((int) ((outArray[4*Idx+3]) & 0xffff)));
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

        private  resultArray7_ushort4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Int4[] mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_bool {
        public boolean get() {
            if (!mGotResult) {
                byte[] outArray = new byte[1];
                mOut.copyTo(outArray);
                mResult = outArray[0] != 0;
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

        private  result_bool(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private boolean mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_char {
        public byte get() {
            if (!mGotResult) {
                byte[] outArray = new byte[1];
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

        private  result_char(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private byte mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_char2 {
        public Byte2 get() {
            if (!mGotResult) {
                byte[] outArray = new byte[2];
                mOut.copyTo(outArray);
                mResult = new Byte2(outArray[0], outArray[1]);
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

        private  result_char2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Byte2 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_char4 {
        public Byte4 get() {
            if (!mGotResult) {
                byte[] outArray = new byte[4];
                mOut.copyTo(outArray);
                mResult = new Byte4(outArray[0], outArray[1], outArray[2], outArray[3]);
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

        private  result_char4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Byte4 mResult;
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

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_double2 {
        public Double2 get() {
            if (!mGotResult) {
                double[] outArray = new double[2];
                mOut.copyTo(outArray);
                mResult = new Double2(outArray[0], outArray[1]);
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

        private  result_double2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Double2 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_double4 {
        public Double4 get() {
            if (!mGotResult) {
                double[] outArray = new double[4];
                mOut.copyTo(outArray);
                mResult = new Double4(outArray[0], outArray[1], outArray[2], outArray[3]);
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

        private  result_double4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Double4 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_float {
        public float get() {
            if (!mGotResult) {
                float[] outArray = new float[1];
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

        private  result_float(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private float mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_float2 {
        public Float2 get() {
            if (!mGotResult) {
                float[] outArray = new float[2];
                mOut.copyTo(outArray);
                mResult = new Float2(outArray[0], outArray[1]);
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

        private  result_float2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Float2 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_float4 {
        public Float4 get() {
            if (!mGotResult) {
                float[] outArray = new float[4];
                mOut.copyTo(outArray);
                mResult = new Float4(outArray[0], outArray[1], outArray[2], outArray[3]);
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

        private  result_float4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Float4 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_half {
        public short get() {
            if (!mGotResult) {
                short[] outArray = new short[1];
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

        private  result_half(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private short mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_half2 {
        public Short2 get() {
            if (!mGotResult) {
                short[] outArray = new short[2];
                mOut.copyTo(outArray);
                mResult = new Short2(outArray[0], outArray[1]);
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

        private  result_half2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Short2 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_half4 {
        public Short4 get() {
            if (!mGotResult) {
                short[] outArray = new short[4];
                mOut.copyTo(outArray);
                mResult = new Short4(outArray[0], outArray[1], outArray[2], outArray[3]);
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

        private  result_half4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Short4 mResult;
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
    public static class result_int4 {
        public Int4 get() {
            if (!mGotResult) {
                int[] outArray = new int[4];
                mOut.copyTo(outArray);
                mResult = new Int4(outArray[0], outArray[1], outArray[2], outArray[3]);
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

        private  result_int4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Int4 mResult;
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

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_long2 {
        public Long2 get() {
            if (!mGotResult) {
                long[] outArray = new long[2];
                mOut.copyTo(outArray);
                mResult = new Long2(outArray[0], outArray[1]);
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

        private  result_long2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Long2 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_long4 {
        public Long4 get() {
            if (!mGotResult) {
                long[] outArray = new long[4];
                mOut.copyTo(outArray);
                mResult = new Long4(outArray[0], outArray[1], outArray[2], outArray[3]);
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

        private  result_long4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Long4 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_short {
        public short get() {
            if (!mGotResult) {
                short[] outArray = new short[1];
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

        private  result_short(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private short mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_short2 {
        public Short2 get() {
            if (!mGotResult) {
                short[] outArray = new short[2];
                mOut.copyTo(outArray);
                mResult = new Short2(outArray[0], outArray[1]);
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

        private  result_short2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Short2 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_short4 {
        public Short4 get() {
            if (!mGotResult) {
                short[] outArray = new short[4];
                mOut.copyTo(outArray);
                mResult = new Short4(outArray[0], outArray[1], outArray[2], outArray[3]);
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

        private  result_short4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Short4 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_uchar {
        public short get() {
            if (!mGotResult) {
                byte[] outArray = new byte[1];
                mOut.copyTo(outArray);
                mResult = ((short) ((outArray[0]) & (short) 0xff));
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

        private  result_uchar(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private short mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_uchar2 {
        public Short2 get() {
            if (!mGotResult) {
                byte[] outArray = new byte[2];
                mOut.copyTo(outArray);
                mResult = new Short2(((short) ((outArray[0]) & (short) 0xff)), ((short) ((outArray[1]) & (short) 0xff)));
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

        private  result_uchar2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Short2 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_uchar4 {
        public Short4 get() {
            if (!mGotResult) {
                byte[] outArray = new byte[4];
                mOut.copyTo(outArray);
                mResult = new Short4(((short) ((outArray[0]) & (short) 0xff)), ((short) ((outArray[1]) & (short) 0xff)), ((short) ((outArray[2]) & (short) 0xff)), ((short) ((outArray[3]) & (short) 0xff)));
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

        private  result_uchar4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Short4 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_uint {
        public long get() {
            if (!mGotResult) {
                int[] outArray = new int[1];
                mOut.copyTo(outArray);
                mResult = ((long) ((outArray[0]) & 0xffffffffL));
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

        private  result_uint(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private long mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_uint2 {
        public Long2 get() {
            if (!mGotResult) {
                int[] outArray = new int[2];
                mOut.copyTo(outArray);
                mResult = new Long2(((long) ((outArray[0]) & 0xffffffffL)), ((long) ((outArray[1]) & 0xffffffffL)));
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

        private  result_uint2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Long2 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_uint4 {
        public Long4 get() {
            if (!mGotResult) {
                int[] outArray = new int[4];
                mOut.copyTo(outArray);
                mResult = new Long4(((long) ((outArray[0]) & 0xffffffffL)), ((long) ((outArray[1]) & 0xffffffffL)), ((long) ((outArray[2]) & 0xffffffffL)), ((long) ((outArray[3]) & 0xffffffffL)));
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

        private  result_uint4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Long4 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_ulong {
        public long get() {
            if (!mGotResult) {
                long[] outArray = new long[1];
                mOut.copyTo(outArray);
                if (outArray[0] < 0)
                    throw new RSRuntimeException("Result is not representible in Java");
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

        private  result_ulong(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private long mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_ulong2 {
        public Long2 get() {
            if (!mGotResult) {
                long[] outArray = new long[2];
                mOut.copyTo(outArray);
                for (int Idx = 0; Idx < 2; ++Idx) {
                    if (outArray[Idx] < 0)
                        throw new RSRuntimeException("Result is not representible in Java");
                }

                mResult = new Long2(outArray[0], outArray[1]);
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

        private  result_ulong2(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Long2 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_ulong4 {
        public Long4 get() {
            if (!mGotResult) {
                long[] outArray = new long[4];
                mOut.copyTo(outArray);
                for (int Idx = 0; Idx < 4; ++Idx) {
                    if (outArray[Idx] < 0)
                        throw new RSRuntimeException("Result is not representible in Java");
                }

                mResult = new Long4(outArray[0], outArray[1], outArray[2], outArray[3]);
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

        private  result_ulong4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Long4 mResult;
    }

    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_ushort {
        public int get() {
            if (!mGotResult) {
                short[] outArray = new short[1];
                mOut.copyTo(outArray);
                mResult = ((int) ((outArray[0]) & 0xffff));
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

        private  result_ushort(Allocation out) {
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
    public static class result_ushort2 {
        public Int2 get() {
            if (!mGotResult) {
                short[] outArray = new short[2];
                mOut.copyTo(outArray);
                mResult = new Int2(((int) ((outArray[0]) & 0xffff)), ((int) ((outArray[1]) & 0xffff)));
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

        private  result_ushort2(Allocation out) {
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
    public static class result_ushort4 {
        public Int4 get() {
            if (!mGotResult) {
                short[] outArray = new short[4];
                mOut.copyTo(outArray);
                mResult = new Int4(((int) ((outArray[0]) & 0xffff)), ((int) ((outArray[1]) & 0xffff)), ((int) ((outArray[2]) & 0xffff)), ((int) ((outArray[3]) & 0xffff)));
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

        private  result_ushort4(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private Int4 mResult;
    }

    private final static int mExportReduceIdx_my_half = 0;
    // in1 = "val"
    public result_half reduce_my_half(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_half result = reduce_my_half(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half val"
    public result_half reduce_my_half(Allocation ain1) {
        return reduce_my_half(ain1, null);
    }

    // ain1 = "half val"
    public result_half reduce_my_half(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F16, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half, new Allocation[]{ain1}, aout, sc);
        return new result_half(aout);
    }

    private final static int mExportReduceIdx_my_half2 = 1;
    // in1 = "val", flattened 2-vectors
    public result_half2 reduce_my_half2(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_half2 result = reduce_my_half2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 val"
    public result_half2 reduce_my_half2(Allocation ain1) {
        return reduce_my_half2(ain1, null);
    }

    // ain1 = "half2 val"
    public result_half2 reduce_my_half2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F16_2, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2, new Allocation[]{ain1}, aout, sc);
        return new result_half2(aout);
    }

    private final static int mExportReduceIdx_my_half4 = 2;
    // in1 = "val", flattened 4-vectors
    public result_half4 reduce_my_half4(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_half4 result = reduce_my_half4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 val"
    public result_half4 reduce_my_half4(Allocation ain1) {
        return reduce_my_half4(ain1, null);
    }

    // ain1 = "half4 val"
    public result_half4 reduce_my_half4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F16_4, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4, new Allocation[]{ain1}, aout, sc);
        return new result_half4(aout);
    }

    private final static int mExportReduceIdx_my_array_half = 3;
    // in1 = "val"
    public resultArray7_half reduce_my_array_half(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_half result = reduce_my_array_half(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half val"
    public resultArray7_half reduce_my_array_half(Allocation ain1) {
        return reduce_my_array_half(ain1, null);
    }

    // ain1 = "half val"
    public resultArray7_half reduce_my_array_half(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F16, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_half, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_half(aout);
    }

    private final static int mExportReduceIdx_my_array_half2 = 4;
    // in1 = "val", flattened 2-vectors
    public resultArray7_half2 reduce_my_array_half2(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_half2 result = reduce_my_array_half2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 val"
    public resultArray7_half2 reduce_my_array_half2(Allocation ain1) {
        return reduce_my_array_half2(ain1, null);
    }

    // ain1 = "half2 val"
    public resultArray7_half2 reduce_my_array_half2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F16_2, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_half2, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_half2(aout);
    }

    private final static int mExportReduceIdx_my_array_half4 = 5;
    // in1 = "val", flattened 4-vectors
    public resultArray7_half4 reduce_my_array_half4(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_half4 result = reduce_my_array_half4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 val"
    public resultArray7_half4 reduce_my_array_half4(Allocation ain1) {
        return reduce_my_array_half4(ain1, null);
    }

    // ain1 = "half4 val"
    public resultArray7_half4 reduce_my_array_half4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F16_4, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_half4, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_half4(aout);
    }

    private final static int mExportReduceIdx_my_float = 6;
    // in1 = "val"
    public result_float reduce_my_float(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_float result = reduce_my_float(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float val"
    public result_float reduce_my_float(Allocation ain1) {
        return reduce_my_float(ain1, null);
    }

    // ain1 = "float val"
    public result_float reduce_my_float(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float, new Allocation[]{ain1}, aout, sc);
        return new result_float(aout);
    }

    private final static int mExportReduceIdx_my_float2 = 7;
    // in1 = "val", flattened 2-vectors
    public result_float2 reduce_my_float2(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_float2 result = reduce_my_float2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 val"
    public result_float2 reduce_my_float2(Allocation ain1) {
        return reduce_my_float2(ain1, null);
    }

    // ain1 = "float2 val"
    public result_float2 reduce_my_float2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F32_2, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2, new Allocation[]{ain1}, aout, sc);
        return new result_float2(aout);
    }

    private final static int mExportReduceIdx_my_float4 = 8;
    // in1 = "val", flattened 4-vectors
    public result_float4 reduce_my_float4(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_float4 result = reduce_my_float4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 val"
    public result_float4 reduce_my_float4(Allocation ain1) {
        return reduce_my_float4(ain1, null);
    }

    // ain1 = "float4 val"
    public result_float4 reduce_my_float4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F32_4, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4, new Allocation[]{ain1}, aout, sc);
        return new result_float4(aout);
    }

    private final static int mExportReduceIdx_my_array_float = 9;
    // in1 = "val"
    public resultArray7_float reduce_my_array_float(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_float result = reduce_my_array_float(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float val"
    public resultArray7_float reduce_my_array_float(Allocation ain1) {
        return reduce_my_array_float(ain1, null);
    }

    // ain1 = "float val"
    public resultArray7_float reduce_my_array_float(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F32, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_float, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_float(aout);
    }

    private final static int mExportReduceIdx_my_array_float2 = 10;
    // in1 = "val", flattened 2-vectors
    public resultArray7_float2 reduce_my_array_float2(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_float2 result = reduce_my_array_float2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 val"
    public resultArray7_float2 reduce_my_array_float2(Allocation ain1) {
        return reduce_my_array_float2(ain1, null);
    }

    // ain1 = "float2 val"
    public resultArray7_float2 reduce_my_array_float2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F32_2, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_float2, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_float2(aout);
    }

    private final static int mExportReduceIdx_my_array_float4 = 11;
    // in1 = "val", flattened 4-vectors
    public resultArray7_float4 reduce_my_array_float4(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_float4 result = reduce_my_array_float4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 val"
    public resultArray7_float4 reduce_my_array_float4(Allocation ain1) {
        return reduce_my_array_float4(ain1, null);
    }

    // ain1 = "float4 val"
    public resultArray7_float4 reduce_my_array_float4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F32_4, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_float4, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_float4(aout);
    }

    private final static int mExportReduceIdx_my_double = 12;
    // in1 = "val"
    public result_double reduce_my_double(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_double result = reduce_my_double(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double val"
    public result_double reduce_my_double(Allocation ain1) {
        return reduce_my_double(ain1, null);
    }

    // ain1 = "double val"
    public result_double reduce_my_double(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F64, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double, new Allocation[]{ain1}, aout, sc);
        return new result_double(aout);
    }

    private final static int mExportReduceIdx_my_double2 = 13;
    // in1 = "val", flattened 2-vectors
    public result_double2 reduce_my_double2(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_double2 result = reduce_my_double2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 val"
    public result_double2 reduce_my_double2(Allocation ain1) {
        return reduce_my_double2(ain1, null);
    }

    // ain1 = "double2 val"
    public result_double2 reduce_my_double2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F64_2, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2, new Allocation[]{ain1}, aout, sc);
        return new result_double2(aout);
    }

    private final static int mExportReduceIdx_my_double4 = 14;
    // in1 = "val", flattened 4-vectors
    public result_double4 reduce_my_double4(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_double4 result = reduce_my_double4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 val"
    public result_double4 reduce_my_double4(Allocation ain1) {
        return reduce_my_double4(ain1, null);
    }

    // ain1 = "double4 val"
    public result_double4 reduce_my_double4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F64_4, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4, new Allocation[]{ain1}, aout, sc);
        return new result_double4(aout);
    }

    private final static int mExportReduceIdx_my_array_double = 15;
    // in1 = "val"
    public resultArray7_double reduce_my_array_double(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_double result = reduce_my_array_double(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double val"
    public resultArray7_double reduce_my_array_double(Allocation ain1) {
        return reduce_my_array_double(ain1, null);
    }

    // ain1 = "double val"
    public resultArray7_double reduce_my_array_double(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F64, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_double, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_double(aout);
    }

    private final static int mExportReduceIdx_my_array_double2 = 16;
    // in1 = "val", flattened 2-vectors
    public resultArray7_double2 reduce_my_array_double2(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_double2 result = reduce_my_array_double2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 val"
    public resultArray7_double2 reduce_my_array_double2(Allocation ain1) {
        return reduce_my_array_double2(ain1, null);
    }

    // ain1 = "double2 val"
    public resultArray7_double2 reduce_my_array_double2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F64_2, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_double2, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_double2(aout);
    }

    private final static int mExportReduceIdx_my_array_double4 = 17;
    // in1 = "val", flattened 4-vectors
    public resultArray7_double4 reduce_my_array_double4(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_double4 result = reduce_my_array_double4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 val"
    public resultArray7_double4 reduce_my_array_double4(Allocation ain1) {
        return reduce_my_array_double4(ain1, null);
    }

    // ain1 = "double4 val"
    public resultArray7_double4 reduce_my_array_double4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __F64_4, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_double4, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_double4(aout);
    }

    private final static int mExportReduceIdx_my_char = 18;
    // in1 = "val"
    public result_char reduce_my_char(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_char result = reduce_my_char(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char val"
    public result_char reduce_my_char(Allocation ain1) {
        return reduce_my_char(ain1, null);
    }

    // ain1 = "char val"
    public result_char reduce_my_char(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I8, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char, new Allocation[]{ain1}, aout, sc);
        return new result_char(aout);
    }

    private final static int mExportReduceIdx_my_char2 = 19;
    // in1 = "val", flattened 2-vectors
    public result_char2 reduce_my_char2(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_char2 result = reduce_my_char2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 val"
    public result_char2 reduce_my_char2(Allocation ain1) {
        return reduce_my_char2(ain1, null);
    }

    // ain1 = "char2 val"
    public result_char2 reduce_my_char2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I8_2, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2, new Allocation[]{ain1}, aout, sc);
        return new result_char2(aout);
    }

    private final static int mExportReduceIdx_my_char4 = 20;
    // in1 = "val", flattened 4-vectors
    public result_char4 reduce_my_char4(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_char4 result = reduce_my_char4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 val"
    public result_char4 reduce_my_char4(Allocation ain1) {
        return reduce_my_char4(ain1, null);
    }

    // ain1 = "char4 val"
    public result_char4 reduce_my_char4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I8_4, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4, new Allocation[]{ain1}, aout, sc);
        return new result_char4(aout);
    }

    private final static int mExportReduceIdx_my_array_char = 21;
    // in1 = "val"
    public resultArray7_char reduce_my_array_char(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_char result = reduce_my_array_char(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char val"
    public resultArray7_char reduce_my_array_char(Allocation ain1) {
        return reduce_my_array_char(ain1, null);
    }

    // ain1 = "char val"
    public resultArray7_char reduce_my_array_char(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I8, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_char, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_char(aout);
    }

    private final static int mExportReduceIdx_my_array_char2 = 22;
    // in1 = "val", flattened 2-vectors
    public resultArray7_char2 reduce_my_array_char2(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_char2 result = reduce_my_array_char2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 val"
    public resultArray7_char2 reduce_my_array_char2(Allocation ain1) {
        return reduce_my_array_char2(ain1, null);
    }

    // ain1 = "char2 val"
    public resultArray7_char2 reduce_my_array_char2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I8_2, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_char2, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_char2(aout);
    }

    private final static int mExportReduceIdx_my_array_char4 = 23;
    // in1 = "val", flattened 4-vectors
    public resultArray7_char4 reduce_my_array_char4(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_char4 result = reduce_my_array_char4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 val"
    public resultArray7_char4 reduce_my_array_char4(Allocation ain1) {
        return reduce_my_array_char4(ain1, null);
    }

    // ain1 = "char4 val"
    public resultArray7_char4 reduce_my_array_char4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I8_4, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_char4, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_char4(aout);
    }

    private final static int mExportReduceIdx_my_short = 24;
    // in1 = "val"
    public result_short reduce_my_short(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_short result = reduce_my_short(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short val"
    public result_short reduce_my_short(Allocation ain1) {
        return reduce_my_short(ain1, null);
    }

    // ain1 = "short val"
    public result_short reduce_my_short(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I16, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short, new Allocation[]{ain1}, aout, sc);
        return new result_short(aout);
    }

    private final static int mExportReduceIdx_my_short2 = 25;
    // in1 = "val", flattened 2-vectors
    public result_short2 reduce_my_short2(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_short2 result = reduce_my_short2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 val"
    public result_short2 reduce_my_short2(Allocation ain1) {
        return reduce_my_short2(ain1, null);
    }

    // ain1 = "short2 val"
    public result_short2 reduce_my_short2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I16_2, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2, new Allocation[]{ain1}, aout, sc);
        return new result_short2(aout);
    }

    private final static int mExportReduceIdx_my_short4 = 26;
    // in1 = "val", flattened 4-vectors
    public result_short4 reduce_my_short4(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_short4 result = reduce_my_short4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 val"
    public result_short4 reduce_my_short4(Allocation ain1) {
        return reduce_my_short4(ain1, null);
    }

    // ain1 = "short4 val"
    public result_short4 reduce_my_short4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I16_4, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4, new Allocation[]{ain1}, aout, sc);
        return new result_short4(aout);
    }

    private final static int mExportReduceIdx_my_array_short = 27;
    // in1 = "val"
    public resultArray7_short reduce_my_array_short(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_short result = reduce_my_array_short(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short val"
    public resultArray7_short reduce_my_array_short(Allocation ain1) {
        return reduce_my_array_short(ain1, null);
    }

    // ain1 = "short val"
    public resultArray7_short reduce_my_array_short(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I16, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_short, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_short(aout);
    }

    private final static int mExportReduceIdx_my_array_short2 = 28;
    // in1 = "val", flattened 2-vectors
    public resultArray7_short2 reduce_my_array_short2(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_short2 result = reduce_my_array_short2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 val"
    public resultArray7_short2 reduce_my_array_short2(Allocation ain1) {
        return reduce_my_array_short2(ain1, null);
    }

    // ain1 = "short2 val"
    public resultArray7_short2 reduce_my_array_short2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I16_2, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_short2, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_short2(aout);
    }

    private final static int mExportReduceIdx_my_array_short4 = 29;
    // in1 = "val", flattened 4-vectors
    public resultArray7_short4 reduce_my_array_short4(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_short4 result = reduce_my_array_short4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 val"
    public resultArray7_short4 reduce_my_array_short4(Allocation ain1) {
        return reduce_my_array_short4(ain1, null);
    }

    // ain1 = "short4 val"
    public resultArray7_short4 reduce_my_array_short4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I16_4, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_short4, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_short4(aout);
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
    // in1 = "val", flattened 2-vectors
    public result_int2 reduce_my_int2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int2 result = reduce_my_int2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 val"
    public result_int2 reduce_my_int2(Allocation ain1) {
        return reduce_my_int2(ain1, null);
    }

    // ain1 = "int2 val"
    public result_int2 reduce_my_int2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32_2, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2, new Allocation[]{ain1}, aout, sc);
        return new result_int2(aout);
    }

    private final static int mExportReduceIdx_my_int4 = 32;
    // in1 = "val", flattened 4-vectors
    public result_int4 reduce_my_int4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int4 result = reduce_my_int4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 val"
    public result_int4 reduce_my_int4(Allocation ain1) {
        return reduce_my_int4(ain1, null);
    }

    // ain1 = "int4 val"
    public result_int4 reduce_my_int4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32_4, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4, new Allocation[]{ain1}, aout, sc);
        return new result_int4(aout);
    }

    private final static int mExportReduceIdx_my_array_int = 33;
    // in1 = "val"
    public resultArray7_int reduce_my_array_int(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_int result = reduce_my_array_int(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int val"
    public resultArray7_int reduce_my_array_int(Allocation ain1) {
        return reduce_my_array_int(ain1, null);
    }

    // ain1 = "int val"
    public resultArray7_int reduce_my_array_int(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_int, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_int(aout);
    }

    private final static int mExportReduceIdx_my_array_int2 = 34;
    // in1 = "val", flattened 2-vectors
    public resultArray7_int2 reduce_my_array_int2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_int2 result = reduce_my_array_int2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 val"
    public resultArray7_int2 reduce_my_array_int2(Allocation ain1) {
        return reduce_my_array_int2(ain1, null);
    }

    // ain1 = "int2 val"
    public resultArray7_int2 reduce_my_array_int2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32_2, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_int2, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_int2(aout);
    }

    private final static int mExportReduceIdx_my_array_int4 = 35;
    // in1 = "val", flattened 4-vectors
    public resultArray7_int4 reduce_my_array_int4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_int4 result = reduce_my_array_int4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 val"
    public resultArray7_int4 reduce_my_array_int4(Allocation ain1) {
        return reduce_my_array_int4(ain1, null);
    }

    // ain1 = "int4 val"
    public resultArray7_int4 reduce_my_array_int4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32_4, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_int4, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_int4(aout);
    }

    private final static int mExportReduceIdx_my_long = 36;
    // in1 = "val"
    public result_long reduce_my_long(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_long result = reduce_my_long(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long val"
    public result_long reduce_my_long(Allocation ain1) {
        return reduce_my_long(ain1, null);
    }

    // ain1 = "long val"
    public result_long reduce_my_long(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I64, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long, new Allocation[]{ain1}, aout, sc);
        return new result_long(aout);
    }

    private final static int mExportReduceIdx_my_long2 = 37;
    // in1 = "val", flattened 2-vectors
    public result_long2 reduce_my_long2(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_long2 result = reduce_my_long2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 val"
    public result_long2 reduce_my_long2(Allocation ain1) {
        return reduce_my_long2(ain1, null);
    }

    // ain1 = "long2 val"
    public result_long2 reduce_my_long2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I64_2, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2, new Allocation[]{ain1}, aout, sc);
        return new result_long2(aout);
    }

    private final static int mExportReduceIdx_my_long4 = 38;
    // in1 = "val", flattened 4-vectors
    public result_long4 reduce_my_long4(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_long4 result = reduce_my_long4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 val"
    public result_long4 reduce_my_long4(Allocation ain1) {
        return reduce_my_long4(ain1, null);
    }

    // ain1 = "long4 val"
    public result_long4 reduce_my_long4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I64_4, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4, new Allocation[]{ain1}, aout, sc);
        return new result_long4(aout);
    }

    private final static int mExportReduceIdx_my_array_long = 39;
    // in1 = "val"
    public resultArray7_long reduce_my_array_long(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_long result = reduce_my_array_long(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long val"
    public resultArray7_long reduce_my_array_long(Allocation ain1) {
        return reduce_my_array_long(ain1, null);
    }

    // ain1 = "long val"
    public resultArray7_long reduce_my_array_long(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I64, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_long, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_long(aout);
    }

    private final static int mExportReduceIdx_my_array_long2 = 40;
    // in1 = "val", flattened 2-vectors
    public resultArray7_long2 reduce_my_array_long2(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_long2 result = reduce_my_array_long2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 val"
    public resultArray7_long2 reduce_my_array_long2(Allocation ain1) {
        return reduce_my_array_long2(ain1, null);
    }

    // ain1 = "long2 val"
    public resultArray7_long2 reduce_my_array_long2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I64_2, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_long2, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_long2(aout);
    }

    private final static int mExportReduceIdx_my_array_long4 = 41;
    // in1 = "val", flattened 4-vectors
    public resultArray7_long4 reduce_my_array_long4(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_long4 result = reduce_my_array_long4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 val"
    public resultArray7_long4 reduce_my_array_long4(Allocation ain1) {
        return reduce_my_array_long4(ain1, null);
    }

    // ain1 = "long4 val"
    public resultArray7_long4 reduce_my_array_long4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I64_4, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_long4, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_long4(aout);
    }

    private final static int mExportReduceIdx_my_uchar = 42;
    // in1 = "val"
    public result_uchar reduce_my_uchar(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_uchar result = reduce_my_uchar(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar val"
    public result_uchar reduce_my_uchar(Allocation ain1) {
        return reduce_my_uchar(ain1, null);
    }

    // ain1 = "uchar val"
    public result_uchar reduce_my_uchar(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U8, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar, new Allocation[]{ain1}, aout, sc);
        return new result_uchar(aout);
    }

    private final static int mExportReduceIdx_my_uchar2 = 43;
    // in1 = "val", flattened 2-vectors
    public result_uchar2 reduce_my_uchar2(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_uchar2 result = reduce_my_uchar2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 val"
    public result_uchar2 reduce_my_uchar2(Allocation ain1) {
        return reduce_my_uchar2(ain1, null);
    }

    // ain1 = "uchar2 val"
    public result_uchar2 reduce_my_uchar2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U8_2, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2, new Allocation[]{ain1}, aout, sc);
        return new result_uchar2(aout);
    }

    private final static int mExportReduceIdx_my_uchar4 = 44;
    // in1 = "val", flattened 4-vectors
    public result_uchar4 reduce_my_uchar4(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_uchar4 result = reduce_my_uchar4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 val"
    public result_uchar4 reduce_my_uchar4(Allocation ain1) {
        return reduce_my_uchar4(ain1, null);
    }

    // ain1 = "uchar4 val"
    public result_uchar4 reduce_my_uchar4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U8_4, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4, new Allocation[]{ain1}, aout, sc);
        return new result_uchar4(aout);
    }

    private final static int mExportReduceIdx_my_array_uchar = 45;
    // in1 = "val"
    public resultArray7_uchar reduce_my_array_uchar(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_uchar result = reduce_my_array_uchar(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar val"
    public resultArray7_uchar reduce_my_array_uchar(Allocation ain1) {
        return reduce_my_array_uchar(ain1, null);
    }

    // ain1 = "uchar val"
    public resultArray7_uchar reduce_my_array_uchar(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U8, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_uchar, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_uchar(aout);
    }

    private final static int mExportReduceIdx_my_array_uchar2 = 46;
    // in1 = "val", flattened 2-vectors
    public resultArray7_uchar2 reduce_my_array_uchar2(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_uchar2 result = reduce_my_array_uchar2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 val"
    public resultArray7_uchar2 reduce_my_array_uchar2(Allocation ain1) {
        return reduce_my_array_uchar2(ain1, null);
    }

    // ain1 = "uchar2 val"
    public resultArray7_uchar2 reduce_my_array_uchar2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U8_2, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_uchar2, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_uchar2(aout);
    }

    private final static int mExportReduceIdx_my_array_uchar4 = 47;
    // in1 = "val", flattened 4-vectors
    public resultArray7_uchar4 reduce_my_array_uchar4(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_uchar4 result = reduce_my_array_uchar4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 val"
    public resultArray7_uchar4 reduce_my_array_uchar4(Allocation ain1) {
        return reduce_my_array_uchar4(ain1, null);
    }

    // ain1 = "uchar4 val"
    public resultArray7_uchar4 reduce_my_array_uchar4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U8_4, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_uchar4, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_uchar4(aout);
    }

    private final static int mExportReduceIdx_my_ushort = 48;
    // in1 = "val"
    public result_ushort reduce_my_ushort(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_ushort result = reduce_my_ushort(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort val"
    public result_ushort reduce_my_ushort(Allocation ain1) {
        return reduce_my_ushort(ain1, null);
    }

    // ain1 = "ushort val"
    public result_ushort reduce_my_ushort(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U16, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort, new Allocation[]{ain1}, aout, sc);
        return new result_ushort(aout);
    }

    private final static int mExportReduceIdx_my_ushort2 = 49;
    // in1 = "val", flattened 2-vectors
    public result_ushort2 reduce_my_ushort2(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_ushort2 result = reduce_my_ushort2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 val"
    public result_ushort2 reduce_my_ushort2(Allocation ain1) {
        return reduce_my_ushort2(ain1, null);
    }

    // ain1 = "ushort2 val"
    public result_ushort2 reduce_my_ushort2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U16_2, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2, new Allocation[]{ain1}, aout, sc);
        return new result_ushort2(aout);
    }

    private final static int mExportReduceIdx_my_ushort4 = 50;
    // in1 = "val", flattened 4-vectors
    public result_ushort4 reduce_my_ushort4(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_ushort4 result = reduce_my_ushort4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 val"
    public result_ushort4 reduce_my_ushort4(Allocation ain1) {
        return reduce_my_ushort4(ain1, null);
    }

    // ain1 = "ushort4 val"
    public result_ushort4 reduce_my_ushort4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U16_4, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4, new Allocation[]{ain1}, aout, sc);
        return new result_ushort4(aout);
    }

    private final static int mExportReduceIdx_my_array_ushort = 51;
    // in1 = "val"
    public resultArray7_ushort reduce_my_array_ushort(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_ushort result = reduce_my_array_ushort(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort val"
    public resultArray7_ushort reduce_my_array_ushort(Allocation ain1) {
        return reduce_my_array_ushort(ain1, null);
    }

    // ain1 = "ushort val"
    public resultArray7_ushort reduce_my_array_ushort(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U16, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_ushort, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_ushort(aout);
    }

    private final static int mExportReduceIdx_my_array_ushort2 = 52;
    // in1 = "val", flattened 2-vectors
    public resultArray7_ushort2 reduce_my_array_ushort2(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_ushort2 result = reduce_my_array_ushort2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 val"
    public resultArray7_ushort2 reduce_my_array_ushort2(Allocation ain1) {
        return reduce_my_array_ushort2(ain1, null);
    }

    // ain1 = "ushort2 val"
    public resultArray7_ushort2 reduce_my_array_ushort2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U16_2, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_ushort2, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_ushort2(aout);
    }

    private final static int mExportReduceIdx_my_array_ushort4 = 53;
    // in1 = "val", flattened 4-vectors
    public resultArray7_ushort4 reduce_my_array_ushort4(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_ushort4 result = reduce_my_array_ushort4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 val"
    public resultArray7_ushort4 reduce_my_array_ushort4(Allocation ain1) {
        return reduce_my_array_ushort4(ain1, null);
    }

    // ain1 = "ushort4 val"
    public resultArray7_ushort4 reduce_my_array_ushort4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U16_4, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_ushort4, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_ushort4(aout);
    }

    private final static int mExportReduceIdx_my_uint = 54;
    // in1 = "val"
    public result_uint reduce_my_uint(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_uint result = reduce_my_uint(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint val"
    public result_uint reduce_my_uint(Allocation ain1) {
        return reduce_my_uint(ain1, null);
    }

    // ain1 = "uint val"
    public result_uint reduce_my_uint(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint, new Allocation[]{ain1}, aout, sc);
        return new result_uint(aout);
    }

    private final static int mExportReduceIdx_my_uint2 = 55;
    // in1 = "val", flattened 2-vectors
    public result_uint2 reduce_my_uint2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_uint2 result = reduce_my_uint2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 val"
    public result_uint2 reduce_my_uint2(Allocation ain1) {
        return reduce_my_uint2(ain1, null);
    }

    // ain1 = "uint2 val"
    public result_uint2 reduce_my_uint2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U32_2, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2, new Allocation[]{ain1}, aout, sc);
        return new result_uint2(aout);
    }

    private final static int mExportReduceIdx_my_uint4 = 56;
    // in1 = "val", flattened 4-vectors
    public result_uint4 reduce_my_uint4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_uint4 result = reduce_my_uint4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 val"
    public result_uint4 reduce_my_uint4(Allocation ain1) {
        return reduce_my_uint4(ain1, null);
    }

    // ain1 = "uint4 val"
    public result_uint4 reduce_my_uint4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U32_4, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4, new Allocation[]{ain1}, aout, sc);
        return new result_uint4(aout);
    }

    private final static int mExportReduceIdx_my_array_uint = 57;
    // in1 = "val"
    public resultArray7_uint reduce_my_array_uint(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_uint result = reduce_my_array_uint(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint val"
    public resultArray7_uint reduce_my_array_uint(Allocation ain1) {
        return reduce_my_array_uint(ain1, null);
    }

    // ain1 = "uint val"
    public resultArray7_uint reduce_my_array_uint(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U32, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_uint, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_uint(aout);
    }

    private final static int mExportReduceIdx_my_array_uint2 = 58;
    // in1 = "val", flattened 2-vectors
    public resultArray7_uint2 reduce_my_array_uint2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_uint2 result = reduce_my_array_uint2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 val"
    public resultArray7_uint2 reduce_my_array_uint2(Allocation ain1) {
        return reduce_my_array_uint2(ain1, null);
    }

    // ain1 = "uint2 val"
    public resultArray7_uint2 reduce_my_array_uint2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U32_2, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_uint2, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_uint2(aout);
    }

    private final static int mExportReduceIdx_my_array_uint4 = 59;
    // in1 = "val", flattened 4-vectors
    public resultArray7_uint4 reduce_my_array_uint4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_uint4 result = reduce_my_array_uint4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 val"
    public resultArray7_uint4 reduce_my_array_uint4(Allocation ain1) {
        return reduce_my_array_uint4(ain1, null);
    }

    // ain1 = "uint4 val"
    public resultArray7_uint4 reduce_my_array_uint4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U32_4, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_uint4, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_uint4(aout);
    }

    private final static int mExportReduceIdx_my_ulong = 60;
    // in1 = "val"
    public result_ulong reduce_my_ulong(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_ulong result = reduce_my_ulong(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong val"
    public result_ulong reduce_my_ulong(Allocation ain1) {
        return reduce_my_ulong(ain1, null);
    }

    // ain1 = "ulong val"
    public result_ulong reduce_my_ulong(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U64, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong, new Allocation[]{ain1}, aout, sc);
        return new result_ulong(aout);
    }

    private final static int mExportReduceIdx_my_ulong2 = 61;
    // in1 = "val", flattened 2-vectors
    public result_ulong2 reduce_my_ulong2(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_ulong2 result = reduce_my_ulong2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 val"
    public result_ulong2 reduce_my_ulong2(Allocation ain1) {
        return reduce_my_ulong2(ain1, null);
    }

    // ain1 = "ulong2 val"
    public result_ulong2 reduce_my_ulong2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U64_2, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2, new Allocation[]{ain1}, aout, sc);
        return new result_ulong2(aout);
    }

    private final static int mExportReduceIdx_my_ulong4 = 62;
    // in1 = "val", flattened 4-vectors
    public result_ulong4 reduce_my_ulong4(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_ulong4 result = reduce_my_ulong4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 val"
    public result_ulong4 reduce_my_ulong4(Allocation ain1) {
        return reduce_my_ulong4(ain1, null);
    }

    // ain1 = "ulong4 val"
    public result_ulong4 reduce_my_ulong4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U64_4, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4, new Allocation[]{ain1}, aout, sc);
        return new result_ulong4(aout);
    }

    private final static int mExportReduceIdx_my_array_ulong = 63;
    // in1 = "val"
    public resultArray7_ulong reduce_my_array_ulong(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_ulong result = reduce_my_array_ulong(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong val"
    public resultArray7_ulong reduce_my_array_ulong(Allocation ain1) {
        return reduce_my_array_ulong(ain1, null);
    }

    // ain1 = "ulong val"
    public resultArray7_ulong reduce_my_array_ulong(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U64, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_ulong, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_ulong(aout);
    }

    private final static int mExportReduceIdx_my_array_ulong2 = 64;
    // in1 = "val", flattened 2-vectors
    public resultArray7_ulong2 reduce_my_array_ulong2(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_ulong2 result = reduce_my_array_ulong2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 val"
    public resultArray7_ulong2 reduce_my_array_ulong2(Allocation ain1) {
        return reduce_my_array_ulong2(ain1, null);
    }

    // ain1 = "ulong2 val"
    public resultArray7_ulong2 reduce_my_array_ulong2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U64_2, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_ulong2, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_ulong2(aout);
    }

    private final static int mExportReduceIdx_my_array_ulong4 = 65;
    // in1 = "val", flattened 4-vectors
    public resultArray7_ulong4 reduce_my_array_ulong4(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_ulong4 result = reduce_my_array_ulong4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 val"
    public resultArray7_ulong4 reduce_my_array_ulong4(Allocation ain1) {
        return reduce_my_array_ulong4(ain1, null);
    }

    // ain1 = "ulong4 val"
    public resultArray7_ulong4 reduce_my_array_ulong4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __U64_4, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_ulong4, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_ulong4(aout);
    }

    private final static int mExportReduceIdx_my_bool = 66;
    // in1 = "val"
    public result_bool reduce_my_bool(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_bool result = reduce_my_bool(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool val"
    public result_bool reduce_my_bool(Allocation ain1) {
        return reduce_my_bool(ain1, null);
    }

    // ain1 = "bool val"
    public result_bool reduce_my_bool(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __BOOLEAN, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool, new Allocation[]{ain1}, aout, sc);
        return new result_bool(aout);
    }

    private final static int mExportReduceIdx_my_array_bool = 67;
    // in1 = "val"
    public resultArray7_bool reduce_my_array_bool(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        resultArray7_bool result = reduce_my_array_bool(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool val"
    public resultArray7_bool reduce_my_array_bool(Allocation ain1) {
        return reduce_my_array_bool(ain1, null);
    }

    // ain1 = "bool val"
    public resultArray7_bool reduce_my_array_bool(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __BOOLEAN, 7);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_array_bool, new Allocation[]{ain1}, aout, sc);
        return new resultArray7_bool(aout);
    }

}

