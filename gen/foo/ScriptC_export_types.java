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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_export_types/export_types.rs
 */

package foo;

import android.renderscript.*;
import foo.export_typesBitCode;

/**
 * @hide
 */
public class ScriptC_export_types extends ScriptC {
    private static final String __rs_resource_name = "export_types";
    // Constructor
    public  ScriptC_export_types(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              export_typesBitCode.getBitCode32(),
              export_typesBitCode.getBitCode64());
        mExportVar_h = 1.2002;
        __F16 = Element.F16(rs);
        mExportVar_h2 = new Short2();
        mExportVar_h2.x = 1.2002;
        mExportVar_h2.y = 2.3008;
        __F16_2 = Element.F16_2(rs);
        mExportVar_h3 = new Short3();
        mExportVar_h3.x = 1.2002;
        mExportVar_h3.y = 2.3008;
        mExportVar_h3.z = 3.4004;
        __F16_3 = Element.F16_3(rs);
        mExportVar_h4 = new Short4();
        mExportVar_h4.x = 1.2002;
        mExportVar_h4.y = 2.3008;
        mExportVar_h4.z = 3.4004;
        mExportVar_h4.w = 4.5;
        __F16_4 = Element.F16_4(rs);
        mExportVar_f = 9.99989986f;
        __F32 = Element.F32(rs);
        mExportVar_d = 7;
        __F64 = Element.F64(rs);
        mExportVar_c = 97;
        __I8 = Element.I8(rs);
        mExportVar_uc = 97;
        __U8 = Element.U8(rs);
        mExportVar_s = 1;
        __I16 = Element.I16(rs);
        mExportVar_us = 1;
        __U16 = Element.U16(rs);
        mExportVar_i = 5;
        __I32 = Element.I32(rs);
        __U32 = Element.U32(rs);
        mExportVar_l = 13L;
        __I64 = Element.I64(rs);
        mExportVar_ul = 13L;
        __U64 = Element.U64(rs);
        mExportVar_ll = 34L;
        mExportVar_ull = 34L;
        mExportVar_b = true;
        __BOOLEAN = Element.BOOLEAN(rs);
        __ELEMENT = Element.ELEMENT(rs);
        __TYPE = Element.TYPE(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __SAMPLER = Element.SAMPLER(rs);
        __SCRIPT = Element.SCRIPT(rs);
    }

    private Element __ALLOCATION;
    private Element __BOOLEAN;
    private Element __ELEMENT;
    private Element __F16;
    private Element __F16_2;
    private Element __F16_3;
    private Element __F16_4;
    private Element __F32;
    private Element __F64;
    private Element __I16;
    private Element __I32;
    private Element __I64;
    private Element __I8;
    private Element __SAMPLER;
    private Element __SCRIPT;
    private Element __TYPE;
    private Element __U16;
    private Element __U32;
    private Element __U64;
    private Element __U8;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_BOOLEAN;
    private FieldPacker __rs_fp_ELEMENT;
    private FieldPacker __rs_fp_F16;
    private FieldPacker __rs_fp_F16_2;
    private FieldPacker __rs_fp_F16_3;
    private FieldPacker __rs_fp_F16_4;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_F64;
    private FieldPacker __rs_fp_I16;
    private FieldPacker __rs_fp_I32;
    private FieldPacker __rs_fp_I64;
    private FieldPacker __rs_fp_I8;
    private FieldPacker __rs_fp_SAMPLER;
    private FieldPacker __rs_fp_SCRIPT;
    private FieldPacker __rs_fp_TYPE;
    private FieldPacker __rs_fp_U16;
    private FieldPacker __rs_fp_U32;
    private FieldPacker __rs_fp_U64;
    private FieldPacker __rs_fp_U8;
    private final static int mExportVarIdx_h = 0;
    private short mExportVar_h;
    public synchronized void set_h(short v) {
        if (__rs_fp_F16!= null) {
            __rs_fp_F16.reset();
        } else {
            __rs_fp_F16 = new FieldPacker(2);
        }
        __rs_fp_F16.addI16(v);
        setVar(mExportVarIdx_h, __rs_fp_F16);
        mExportVar_h = v;
    }

    public short get_h() {
        return mExportVar_h;
    }

    public Script.FieldID getFieldID_h() {
        return createFieldID(mExportVarIdx_h, null);
    }

    private final static int mExportVarIdx_h2 = 1;
    private Short2 mExportVar_h2;
    public synchronized void set_h2(Short2 v) {
        mExportVar_h2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_h2, fp, __F16_2, __dimArr);
    }

    public Short2 get_h2() {
        return mExportVar_h2;
    }

    public Script.FieldID getFieldID_h2() {
        return createFieldID(mExportVarIdx_h2, null);
    }

    private final static int mExportVarIdx_h3 = 2;
    private Short3 mExportVar_h3;
    public synchronized void set_h3(Short3 v) {
        mExportVar_h3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_h3, fp, __F16_3, __dimArr);
    }

    public Short3 get_h3() {
        return mExportVar_h3;
    }

    public Script.FieldID getFieldID_h3() {
        return createFieldID(mExportVarIdx_h3, null);
    }

    private final static int mExportVarIdx_h4 = 3;
    private Short4 mExportVar_h4;
    public synchronized void set_h4(Short4 v) {
        mExportVar_h4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_h4, fp, __F16_4, __dimArr);
    }

    public Short4 get_h4() {
        return mExportVar_h4;
    }

    public Script.FieldID getFieldID_h4() {
        return createFieldID(mExportVarIdx_h4, null);
    }

    private final static int mExportVarIdx_f = 4;
    private float mExportVar_f;
    public synchronized void set_f(float v) {
        setVar(mExportVarIdx_f, v);
        mExportVar_f = v;
    }

    public float get_f() {
        return mExportVar_f;
    }

    public Script.FieldID getFieldID_f() {
        return createFieldID(mExportVarIdx_f, null);
    }

    private final static int mExportVarIdx_d = 5;
    private double mExportVar_d;
    public synchronized void set_d(double v) {
        setVar(mExportVarIdx_d, v);
        mExportVar_d = v;
    }

    public double get_d() {
        return mExportVar_d;
    }

    public Script.FieldID getFieldID_d() {
        return createFieldID(mExportVarIdx_d, null);
    }

    private final static int mExportVarIdx_c = 6;
    private byte mExportVar_c;
    public synchronized void set_c(byte v) {
        if (__rs_fp_I8!= null) {
            __rs_fp_I8.reset();
        } else {
            __rs_fp_I8 = new FieldPacker(1);
        }
        __rs_fp_I8.addI8(v);
        setVar(mExportVarIdx_c, __rs_fp_I8);
        mExportVar_c = v;
    }

    public byte get_c() {
        return mExportVar_c;
    }

    public Script.FieldID getFieldID_c() {
        return createFieldID(mExportVarIdx_c, null);
    }

    private final static int mExportVarIdx_uc = 7;
    private short mExportVar_uc;
    public synchronized void set_uc(short v) {
        if (__rs_fp_U8!= null) {
            __rs_fp_U8.reset();
        } else {
            __rs_fp_U8 = new FieldPacker(1);
        }
        __rs_fp_U8.addU8(v);
        setVar(mExportVarIdx_uc, __rs_fp_U8);
        mExportVar_uc = v;
    }

    public short get_uc() {
        return mExportVar_uc;
    }

    public Script.FieldID getFieldID_uc() {
        return createFieldID(mExportVarIdx_uc, null);
    }

    private final static int mExportVarIdx_s = 8;
    private short mExportVar_s;
    public synchronized void set_s(short v) {
        if (__rs_fp_I16!= null) {
            __rs_fp_I16.reset();
        } else {
            __rs_fp_I16 = new FieldPacker(2);
        }
        __rs_fp_I16.addI16(v);
        setVar(mExportVarIdx_s, __rs_fp_I16);
        mExportVar_s = v;
    }

    public short get_s() {
        return mExportVar_s;
    }

    public Script.FieldID getFieldID_s() {
        return createFieldID(mExportVarIdx_s, null);
    }

    private final static int mExportVarIdx_us = 9;
    private int mExportVar_us;
    public synchronized void set_us(int v) {
        if (__rs_fp_U16!= null) {
            __rs_fp_U16.reset();
        } else {
            __rs_fp_U16 = new FieldPacker(2);
        }
        __rs_fp_U16.addU16(v);
        setVar(mExportVarIdx_us, __rs_fp_U16);
        mExportVar_us = v;
    }

    public int get_us() {
        return mExportVar_us;
    }

    public Script.FieldID getFieldID_us() {
        return createFieldID(mExportVarIdx_us, null);
    }

    private final static int mExportVarIdx_i = 10;
    private int mExportVar_i;
    public synchronized void set_i(int v) {
        setVar(mExportVarIdx_i, v);
        mExportVar_i = v;
    }

    public int get_i() {
        return mExportVar_i;
    }

    public Script.FieldID getFieldID_i() {
        return createFieldID(mExportVarIdx_i, null);
    }

    private final static int mExportVarIdx_ui = 11;
    private long mExportVar_ui;
    public synchronized void set_ui(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_ui, __rs_fp_U32);
        mExportVar_ui = v;
    }

    public long get_ui() {
        return mExportVar_ui;
    }

    public Script.FieldID getFieldID_ui() {
        return createFieldID(mExportVarIdx_ui, null);
    }

    private final static int mExportVarIdx_l = 12;
    private long mExportVar_l;
    public synchronized void set_l(long v) {
        setVar(mExportVarIdx_l, v);
        mExportVar_l = v;
    }

    public long get_l() {
        return mExportVar_l;
    }

    public Script.FieldID getFieldID_l() {
        return createFieldID(mExportVarIdx_l, null);
    }

    private final static int mExportVarIdx_ul = 13;
    private long mExportVar_ul;
    public synchronized void set_ul(long v) {
        if (__rs_fp_U64!= null) {
            __rs_fp_U64.reset();
        } else {
            __rs_fp_U64 = new FieldPacker(8);
        }
        __rs_fp_U64.addU64(v);
        setVar(mExportVarIdx_ul, __rs_fp_U64);
        mExportVar_ul = v;
    }

    public long get_ul() {
        return mExportVar_ul;
    }

    public Script.FieldID getFieldID_ul() {
        return createFieldID(mExportVarIdx_ul, null);
    }

    private final static int mExportVarIdx_ll = 14;
    private long mExportVar_ll;
    public synchronized void set_ll(long v) {
        setVar(mExportVarIdx_ll, v);
        mExportVar_ll = v;
    }

    public long get_ll() {
        return mExportVar_ll;
    }

    public Script.FieldID getFieldID_ll() {
        return createFieldID(mExportVarIdx_ll, null);
    }

    private final static int mExportVarIdx_ull = 15;
    private long mExportVar_ull;
    public synchronized void set_ull(long v) {
        if (__rs_fp_U64!= null) {
            __rs_fp_U64.reset();
        } else {
            __rs_fp_U64 = new FieldPacker(8);
        }
        __rs_fp_U64.addU64(v);
        setVar(mExportVarIdx_ull, __rs_fp_U64);
        mExportVar_ull = v;
    }

    public long get_ull() {
        return mExportVar_ull;
    }

    public Script.FieldID getFieldID_ull() {
        return createFieldID(mExportVarIdx_ull, null);
    }

    private final static int mExportVarIdx_b = 16;
    private boolean mExportVar_b;
    public synchronized void set_b(boolean v) {
        if (__rs_fp_BOOLEAN!= null) {
            __rs_fp_BOOLEAN.reset();
        } else {
            __rs_fp_BOOLEAN = new FieldPacker(1);
        }
        __rs_fp_BOOLEAN.addBoolean(v);
        setVar(mExportVarIdx_b, __rs_fp_BOOLEAN);
        mExportVar_b = v;
    }

    public boolean get_b() {
        return mExportVar_b;
    }

    public Script.FieldID getFieldID_b() {
        return createFieldID(mExportVarIdx_b, null);
    }

    private final static int mExportVarIdx_element = 17;
    private Element mExportVar_element;
    public synchronized void set_element(Element v) {
        setVar(mExportVarIdx_element, v);
        mExportVar_element = v;
    }

    public Element get_element() {
        return mExportVar_element;
    }

    public Script.FieldID getFieldID_element() {
        return createFieldID(mExportVarIdx_element, null);
    }

    private final static int mExportVarIdx_type = 18;
    private Type mExportVar_type;
    public synchronized void set_type(Type v) {
        setVar(mExportVarIdx_type, v);
        mExportVar_type = v;
    }

    public Type get_type() {
        return mExportVar_type;
    }

    public Script.FieldID getFieldID_type() {
        return createFieldID(mExportVarIdx_type, null);
    }

    private final static int mExportVarIdx_allocation = 19;
    private Allocation mExportVar_allocation;
    public synchronized void set_allocation(Allocation v) {
        setVar(mExportVarIdx_allocation, v);
        mExportVar_allocation = v;
    }

    public Allocation get_allocation() {
        return mExportVar_allocation;
    }

    public Script.FieldID getFieldID_allocation() {
        return createFieldID(mExportVarIdx_allocation, null);
    }

    private final static int mExportVarIdx_sampler = 20;
    private Sampler mExportVar_sampler;
    public synchronized void set_sampler(Sampler v) {
        setVar(mExportVarIdx_sampler, v);
        mExportVar_sampler = v;
    }

    public Sampler get_sampler() {
        return mExportVar_sampler;
    }

    public Script.FieldID getFieldID_sampler() {
        return createFieldID(mExportVarIdx_sampler, null);
    }

    private final static int mExportVarIdx_script = 21;
    private Script mExportVar_script;
    public synchronized void set_script(Script v) {
        setVar(mExportVarIdx_script, v);
        mExportVar_script = v;
    }

    public Script get_script() {
        return mExportVar_script;
    }

    public Script.FieldID getFieldID_script() {
        return createFieldID(mExportVarIdx_script, null);
    }

    private final static int mExportVarIdx_dk = 22;
    private int mExportVar_dk;
    public synchronized void set_dk(int v) {
        if (__rs_fp_I32!= null) {
            __rs_fp_I32.reset();
        } else {
            __rs_fp_I32 = new FieldPacker(4);
        }
        __rs_fp_I32.addI32(v);
        setVar(mExportVarIdx_dk, __rs_fp_I32);
        mExportVar_dk = v;
    }

    public int get_dk() {
        return mExportVar_dk;
    }

    public Script.FieldID getFieldID_dk() {
        return createFieldID(mExportVarIdx_dk, null);
    }

    private final static int mExportVarIdx_dt = 23;
    private int mExportVar_dt;
    public synchronized void set_dt(int v) {
        if (__rs_fp_I32!= null) {
            __rs_fp_I32.reset();
        } else {
            __rs_fp_I32 = new FieldPacker(4);
        }
        __rs_fp_I32.addI32(v);
        setVar(mExportVarIdx_dt, __rs_fp_I32);
        mExportVar_dt = v;
    }

    public int get_dt() {
        return mExportVar_dt;
    }

    public Script.FieldID getFieldID_dt() {
        return createFieldID(mExportVarIdx_dt, null);
    }

    private final static int mExportVarIdx_fp = 24;
    private Allocation mExportVar_fp;
    public void bind_fp(Allocation v) {
        mExportVar_fp = v;
        if (v == null) bindAllocation(null, mExportVarIdx_fp);
        else bindAllocation(v, mExportVarIdx_fp);
    }

    public Allocation get_fp() {
        return mExportVar_fp;
    }

    private final static int mExportVarIdx_ip = 25;
    private Allocation mExportVar_ip;
    public void bind_ip(Allocation v) {
        mExportVar_ip = v;
        if (v == null) bindAllocation(null, mExportVarIdx_ip);
        else bindAllocation(v, mExportVarIdx_ip);
    }

    public Allocation get_ip() {
        return mExportVar_ip;
    }

}

