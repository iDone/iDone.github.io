/*
 * Decompiled with CFR 0_121.
 */
package com.xk72.charles;

import com.xk72.charles.LicenseException;
import com.xk72.charles.LicenseType;
import com.xk72.charles.TkzI;
import java.io.UnsupportedEncodingException;

public final class WNzU {
    private static String OjEP = "Thanks for looking at the source. Please register Charles if you use it.";
    private static WNzU wfpb;
    private boolean DZZn = false;
    private String TVrM = "Unregistered";
    private int LSiK;
    private LicenseType tVok;
    private static final int zNUM = 1;
    private static final int whaQ = 2;
    private static final int ddIP = 3;
    private static final int eWmp = 4;
    private static final long uvjg = 8800536498351690864L;
    private static final long vvRz = -5408575981733630035L;
    private static final long lCWQ = -6517524745266237632L;
    private static final long YrAh = 5911726755176091652L;
    private static final String[] EEUf;
    private static final int OhoT = 32;
    private static int XotT;
    private static int zojy;
    private static int POPm;
    private static int jrSk;
    private static int BfOY;
    private static int cgDg;
    private static int ppKD;
    private static int IaXH;
    private static int YkPq;
    private static int yfMR;
    private static int IALq;
    private static int GZpN;
    private static int RanK;
    private static int dceV;
    private static int kXLV;
    private static int Ujaf;
    private static int geiE;
    private static int bMGO;
    private static int CapD;
    private static int tDDl;
    private static int Zwuq;
    private static int WceZ;
    private static int HmgK;
    private static int cRBe;
    private static int HSHi;
    private static int vvAS;
    private int Warf;
    private int sKLA;
    private int SasP;
    private int IADF;
    private int vDUg;
    private int eBQe;
    private int EmDE;
    private int tyTg;
    private int injl;
    private int zXkL;
    private int gAEB;
    private int AJXm;
    private int tpsz;
    private int STYi;
    private int pbjS;
    private int UNeT;
    private int xnyg;
    private int HoRz;
    private int epDj;
    private int FbfK;
    private int INIp;
    private int WbHB;
    private int PpCz;
    private int cAFR;
    private int ApKw;
    private int TRgV;
    private static final int LjDs = -1209970333;
    private static final int uJdL = -1640531527;

    public WNzU() {
    }

    private WNzU(String string, String string2) {
        this(string, string2, 4);
    }

    private WNzU(String string, String object, int n) {
        try {
            boolean bl;
            int n2 = 4;
            String string2 = object;
            String string3 = string;
            object = this;
            String string4 = string3;
            String string5 = string4;
            string5 = string4;
            string5 = string4.replaceAll("[\u00a0\u1680\u180e\u2000\u200a\u202f\u205f\u3000]", " ");
            long l = WNzU.super.wfpb(string5, string2, n2);
            boolean bl2 = WNzU.super.OjEP(l);
            if (bl2) {
                bl = true;
            } else if (string5.equals(string3)) {
                bl = false;
            } else {
                long l2 = WNzU.super.wfpb(string3, string2, n2);
                bl = WNzU.super.OjEP(l2);
            }
            if (!bl) {
                throw new LicenseException(this.OjEP(2));
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw new LicenseException(this.OjEP(1));
        }
        this.TVrM = string;
        this.DZZn = true;
    }

    private static void OjEP(WNzU wNzU) {
        wfpb = wNzU;
    }

    public static boolean OjEP() {
        WNzU wNzU = wfpb;
        return wNzU.DZZn;
    }

    public static void wfpb() {
        WNzU wNzU;
        wfpb = wNzU = new WNzU();
    }

    public static String DZZn() {
        WNzU wNzU = wfpb;
        switch (TkzI.OjEP[wNzU.tVok.ordinal()]) {
            case 1: {
                return wNzU.TVrM;
            }
            case 2: {
                return wNzU.TVrM + " - Site License";
            }
            case 3: {
                return wNzU.TVrM + " - Multi-Site License";
            }
        }
        return wNzU.TVrM;
    }

    public static String OjEP(String object, String string) {
        try {
            object = new WNzU((String)object, string);
        }
        catch (LicenseException licenseException) {
            object = licenseException;
            return licenseException.getMessage();
        }
        wfpb = object;
        return null;
    }

    private boolean TVrM() {
        return this.DZZn;
    }

    private String LSiK() {
        switch (TkzI.OjEP[this.tVok.ordinal()]) {
            case 1: {
                return this.TVrM;
            }
            case 2: {
                return this.TVrM + " - Site License";
            }
            case 3: {
                return this.TVrM + " - Multi-Site License";
            }
        }
        return this.TVrM;
    }

    private int tVok() {
        return this.LSiK;
    }

    private LicenseType zNUM() {
        return this.tVok;
    }

    private String OjEP(int n) {
        this.TVrM(8800536498351690864L);
        try {
            String string = EEUf[n];
            byte[] arrby = new byte[string.length() / 2];
            for (int i = 0; i < arrby.length; ++i) {
                arrby[i] = (byte)Integer.parseInt(string.substring(i << 1, (i << 1) + 2), 16);
            }
            byte[] arrby2 = this.DZZn(arrby);
            int n2 = arrby2.length;
            while (arrby2[n2 - 1] == 0) {
                --n2;
            }
            return new String(arrby2, 0, n2, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return "";
        }
    }

    private boolean OjEP(String string, String string2, int n) {
        String string3;
        String string4 = string;
        string4 = string4;
        string4 = string3.replaceAll("[\u00a0\u1680\u180e\u2000\u200a\u202f\u205f\u3000]", " ");
        long l = this.wfpb(string4, string2, n);
        boolean bl = this.OjEP(l);
        if (bl) {
            return true;
        }
        if (string4.equals(string)) {
            return false;
        }
        long l2 = this.wfpb(string, string2, n);
        return this.OjEP(l2);
    }

    private static String OjEP(String string) {
        return string.replaceAll("[\u00a0\u1680\u180e\u2000\u200a\u202f\u205f\u3000]", " ");
    }

    private boolean OjEP(long l) {
        int n = WNzU.wfpb(l);
        this.TVrM(l);
        long l2 = l;
        for (int i = 0; i < n + 35; ++i) {
            l2 = this.DZZn(l2);
        }
        if (l2 == 5911726755176091652L) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private long wfpb(String arrby, String string, int n) {
        if (string.length() != 18) {
            throw new LicenseException(this.OjEP(0));
        }
        if (string.equalsIgnoreCase("7055ce2f8cb4f9405f")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("5bae9d8cdea32760ae")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("f3264994d9ea6bc595")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("b9930cef009d3a7865")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("62bd6a5f95aa67998e")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("a1c536c35904e64584")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("d6e5590ecc05edd9b3")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("8fbe36ce2726458b18")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("042a8352caf1188945")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("9d26d5088770221c3c")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("e19b2a01905e4129bf")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("68ebe4c9d792f31057")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("4e4beb8a43e9feb9c7")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("d04d85b44b306fc9ec")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("2b5d21a38c9452e342")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("88cb89c26a813bce44")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("76c9ee78c8ab124054")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("729db7c98163ac7d3d")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("7c1d4761993c412472")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("08bc0b7ec91cd0f4aa")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("25bafae175decaedcc")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("3181aae6822ef90ccd")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("d7a8fe9dc9dc919f87")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("728dae81d9d22aca03")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("119a9b593348fa3e74")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("04ab87c8d69667878e")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("4b282d851ebd87a7bb")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("ed526255313b756e42")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("ed5ab211362ab25ca7")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("18f4789a3df48f3b15")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("67549e44b1c8d8d857")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("4593c6c54227c4f17d")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("1c59db29042e7df8ef")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("a647e3dd42ce9b409b")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("7e06d6a70b82858113")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("ef4b5a48595197a373")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("0ac55f6bebd0330640")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("1beda9831c78994f43")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("8a2b9debb15766bff9")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("da0e7561b10d974216")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("86257b04b8c303fd9a")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("a4036b2761c9583fda")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("18e69f6d5bc820d4d3")) throw new LicenseException(this.OjEP(1));
        if (string.equalsIgnoreCase("a13746cb3d1c83bca6")) {
            throw new LicenseException(this.OjEP(1));
        }
        byte[] arrby2 = string;
        long l = Long.parseLong(arrby2.substring(2, 10), 16) << 32 | Long.parseLong(arrby2.substring(10, 18), 16);
        arrby2 = string;
        int n2 = Integer.parseInt(arrby2.substring(0, 2), 16);
        this.TVrM(-5408575981733630035L);
        long l2 = this.DZZn(l);
        if (WNzU.wfpb(l2) != n2) {
            throw new LicenseException(this.OjEP(1));
        }
        this.LSiK = (int)(l2 << 32 >>> 32 >>> 24);
        if (this.LSiK == 1) {
            this.tVok = LicenseType.OjEP;
        } else {
            if (this.LSiK != n) {
                if (this.LSiK >= n) throw new LicenseException(this.OjEP(1));
                throw new LicenseException(this.OjEP(3));
            }
            switch ((int)(l2 << 32 >>> 32 >>> 16 & 255)) {
                case 1: {
                    this.tVok = LicenseType.OjEP;
                    break;
                }
                case 2: {
                    this.tVok = LicenseType.wfpb;
                    break;
                }
                case 3: {
                    this.tVok = LicenseType.DZZn;
                    break;
                }
                default: {
                    throw new LicenseException(this.OjEP(1));
                }
            }
        }
        this.TVrM(8800536498351690864L);
        try {
            byte[] arrby3;
            arrby = arrby.getBytes("UTF-8");
            arrby2 = this;
            n2 = arrby.length;
            n = n2 + 4;
            if (n % 8 != 0) {
                n += 8 - n % 8;
            }
            byte[] arrby4 = new byte[n];
            System.arraycopy(arrby, 0, arrby4, 4, n2);
            arrby4[0] = n2 >> 24;
            arrby4[1] = (byte)(n2 >> 16);
            arrby4[2] = (byte)(n2 >> 8);
            arrby4[3] = (byte)n2;
            arrby2 = arrby3 = WNzU.super.DZZn(arrby4);
            int n3 = 0;
            byte[] arrby5 = arrby2;
            n = arrby5.length;
            int n4 = 0;
            while (n4 < n) {
                byte by = arrby5[n4];
                n3 ^= by;
                n3 = n3 << 3 | n3 >>> 29;
                ++n4;
            }
            return -6517524747541020672L | (long)(n3 ^= (int)(l2 >> 32)) << 32 >>> 32;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return -1;
        }
    }

    private static final long wfpb(String string) {
        return Long.parseLong(string.substring(2, 10), 16) << 32 | Long.parseLong(string.substring(10, 18), 16);
    }

    private static final int DZZn(String string) {
        return Integer.parseInt(string.substring(0, 2), 16);
    }

    private static final int OjEP(byte[] arrby) {
        int n = 0;
        for (byte by : arrby) {
            n ^= by;
            n = n << 3 | n >>> 29;
        }
        return n;
    }

    private static final int wfpb(long l) {
        long l2 = 0;
        for (int i = 56; i >= 0; i -= 8) {
            l2 ^= l >>> i & 255;
        }
        return Math.abs((int)(l2 & 255));
    }

    private byte[] wfpb(byte[] arrby) {
        int n = arrby.length;
        int n2 = n + 4;
        if (n2 % 8 != 0) {
            n2 += 8 - n2 % 8;
        }
        byte[] arrby2 = new byte[n2];
        System.arraycopy(arrby, 0, arrby2, 4, n);
        arrby2[0] = n >> 24;
        arrby2[1] = (byte)(n >> 16);
        arrby2[2] = (byte)(n >> 8);
        arrby2[3] = (byte)n;
        arrby = this.DZZn(arrby2);
        return arrby;
    }

    private byte[] DZZn(byte[] arrby) {
        byte[] arrby2 = new byte[arrby.length];
        int n = arrby.length;
        int n2 = 0;
        long l = 0;
        for (int i = 0; i < n; ++i) {
            l <<= 8;
            l |= (long)(arrby[i] & 255);
            if (++n2 != 8) continue;
            l = this.DZZn(l);
            arrby2[i - 7] = (byte)(l >>> 56);
            arrby2[i - 6] = (byte)(l >>> 48);
            arrby2[i - 5] = (byte)(l >>> 40);
            arrby2[i - 4] = (byte)(l >>> 32);
            arrby2[i - 3] = (byte)(l >>> 24);
            arrby2[i - 2] = (byte)(l >>> 16);
            arrby2[i - 1] = (byte)(l >>> 8);
            arrby2[i] = (byte)l;
            n2 = 0;
            l = 0;
        }
        return arrby2;
    }

    private long DZZn(long l) {
        int n = (int)l + this.Warf;
        int n2 = (int)(l >>> 32) + this.sKLA;
        int n3 = n ^ n2;
        int n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.SasP;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.IADF;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.vDUg;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.eBQe;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.EmDE;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.tyTg;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.injl;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.zXkL;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.gAEB;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.AJXm;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.tpsz;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.STYi;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.pbjS;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.UNeT;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.xnyg;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.HoRz;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.epDj;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.FbfK;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.INIp;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.WbHB;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.PpCz;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.cAFR;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.ApKw;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.TRgV;
        return ((long)n2 << 32) + ((long)n & 0xFFFFFFFFL);
    }

    private void TVrM(long l) {
        int n = (int)l;
        int n2 = (int)(l >>> 32);
        int n3 = XotT;
        int n4 = this.Warf = n3 << 3 | n3 >>> 29;
        n3 = n + n4;
        int n5 = n4 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = zojy + (n4 + n5);
        n4 = this.sKLA = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = POPm + (n4 + n5);
        n4 = this.SasP = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = jrSk + (n4 + n5);
        n4 = this.IADF = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = BfOY + (n4 + n5);
        n4 = this.vDUg = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = cgDg + (n4 + n5);
        n4 = this.eBQe = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = ppKD + (n4 + n5);
        n4 = this.EmDE = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = IaXH + (n4 + n5);
        n4 = this.tyTg = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = YkPq + (n4 + n5);
        n4 = this.injl = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = yfMR + (n4 + n5);
        n4 = this.zXkL = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = IALq + (n4 + n5);
        n4 = this.gAEB = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = GZpN + (n4 + n5);
        n4 = this.AJXm = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = RanK + (n4 + n5);
        n4 = this.tpsz = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = dceV + (n4 + n5);
        n4 = this.STYi = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = kXLV + (n4 + n5);
        n4 = this.pbjS = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = Ujaf + (n4 + n5);
        n4 = this.UNeT = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = geiE + (n4 + n5);
        n4 = this.xnyg = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = bMGO + (n4 + n5);
        n4 = this.HoRz = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = CapD + (n4 + n5);
        n4 = this.epDj = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = tDDl + (n4 + n5);
        n4 = this.FbfK = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = Zwuq + (n4 + n5);
        n4 = this.INIp = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = WceZ + (n4 + n5);
        n4 = this.WbHB = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = HmgK + (n4 + n5);
        n4 = this.PpCz = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = cRBe + (n4 + n5);
        n4 = this.cAFR = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = HSHi + (n4 + n5);
        n4 = this.ApKw = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = vvAS + (n4 + n5);
        n4 = this.TRgV = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.Warf + (n4 + n5);
        n4 = this.Warf = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.sKLA + (n4 + n5);
        n4 = this.sKLA = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.SasP + (n4 + n5);
        n4 = this.SasP = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.IADF + (n4 + n5);
        n4 = this.IADF = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.vDUg + (n4 + n5);
        n4 = this.vDUg = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.eBQe + (n4 + n5);
        n4 = this.eBQe = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.EmDE + (n4 + n5);
        n4 = this.EmDE = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.tyTg + (n4 + n5);
        n4 = this.tyTg = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.injl + (n4 + n5);
        n4 = this.injl = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.zXkL + (n4 + n5);
        n4 = this.zXkL = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.gAEB + (n4 + n5);
        n4 = this.gAEB = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.AJXm + (n4 + n5);
        n4 = this.AJXm = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.tpsz + (n4 + n5);
        n4 = this.tpsz = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.STYi + (n4 + n5);
        n4 = this.STYi = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.pbjS + (n4 + n5);
        n4 = this.pbjS = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.UNeT + (n4 + n5);
        n4 = this.UNeT = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.xnyg + (n4 + n5);
        n4 = this.xnyg = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.HoRz + (n4 + n5);
        n4 = this.HoRz = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.epDj + (n4 + n5);
        n4 = this.epDj = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.FbfK + (n4 + n5);
        n4 = this.FbfK = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.INIp + (n4 + n5);
        n4 = this.INIp = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.WbHB + (n4 + n5);
        n4 = this.WbHB = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.PpCz + (n4 + n5);
        n4 = this.PpCz = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.cAFR + (n4 + n5);
        n4 = this.cAFR = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.ApKw + (n4 + n5);
        n4 = this.ApKw = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.TRgV + (n4 + n5);
        n4 = this.TRgV = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.Warf + (n4 + n5);
        n4 = this.Warf = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.sKLA + (n4 + n5);
        n4 = this.sKLA = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.SasP + (n4 + n5);
        n4 = this.SasP = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.IADF + (n4 + n5);
        n4 = this.IADF = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.vDUg + (n4 + n5);
        n4 = this.vDUg = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.eBQe + (n4 + n5);
        n4 = this.eBQe = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.EmDE + (n4 + n5);
        n4 = this.EmDE = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.tyTg + (n4 + n5);
        n4 = this.tyTg = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.injl + (n4 + n5);
        n4 = this.injl = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.zXkL + (n4 + n5);
        n4 = this.zXkL = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.gAEB + (n4 + n5);
        n4 = this.gAEB = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.AJXm + (n4 + n5);
        n4 = this.AJXm = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.tpsz + (n4 + n5);
        n4 = this.tpsz = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.STYi + (n4 + n5);
        n4 = this.STYi = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.pbjS + (n4 + n5);
        n4 = this.pbjS = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.UNeT + (n4 + n5);
        n4 = this.UNeT = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.xnyg + (n4 + n5);
        n4 = this.xnyg = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.HoRz + (n4 + n5);
        n4 = this.HoRz = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.epDj + (n4 + n5);
        n4 = this.epDj = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.FbfK + (n4 + n5);
        n4 = this.FbfK = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.INIp + (n4 + n5);
        n4 = this.INIp = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.WbHB + (n4 + n5);
        n4 = this.WbHB = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.PpCz + (n4 + n5);
        n4 = this.PpCz = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.cAFR + (n4 + n5);
        n4 = this.cAFR = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.ApKw + (n4 + n5);
        n4 = this.ApKw = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.TRgV + (n4 + n5);
        this.TRgV = n3 << 3 | n3 >>> 29;
    }

    static {
        WNzU.wfpb();
        EEUf = new String[]{"b241993e8a12c782348e4652cc22c2501d9d6f248e91a3d849275666a0ff7d954fdf638f0d03098c52c4710a5e619b9b09cd6cd027ea3bdb937172b3fdf0bded3d684333798880bb78780f6f6644580409ac882bc021732a", "b241993e8a12c782348e4652cc22c250c30afb881b44ba4dd936c44a573755b5276046dc3ae32e58d10f467421f51ca607b0e29f53cd8f38dd9eee548398b195348e4652cc22c2502feb5f8fd884cb3c9a330ee10954d071", "8a24264c4ae5e5371d663158ccbd75e5a5d70bef5d61291ba3af58b92fe98f7a5c8f83abe09b0c1b3f469d5ad85a3a01e81a2248a290b22d05f52db22eb8b10af10437ddcf2f437b1a519b09a9c4f2c374a882757515e2e2fde238a4eccc62d3fc36d9a77dcbd7cc05236b02716005836b21e58a07330bb18136139263e71a0f79382179978b680a", "96122782ec21d0584881fa8dc6b2ff60585bcafbaeec4bd03874fc7ce730dcb3515b9fb963790219047bf20363167e9967cc1b0851ae39b63d831e55c196a04d7ae5be1b671bedc43b7e8ca175e6d3af2610c3f6b5863d0000ccc9ff3b971946974d3cb7be340cb08475020696df69ac20764f7709cb63e3aac239578db58e85"};
        XotT = -1209970333;
        zojy = -1209970333 + -1640531527;
        POPm = zojy + -1640531527;
        jrSk = POPm + -1640531527;
        BfOY = jrSk + -1640531527;
        cgDg = BfOY + -1640531527;
        ppKD = cgDg + -1640531527;
        IaXH = ppKD + -1640531527;
        YkPq = IaXH + -1640531527;
        yfMR = YkPq + -1640531527;
        IALq = yfMR + -1640531527;
        GZpN = IALq + -1640531527;
        RanK = GZpN + -1640531527;
        dceV = RanK + -1640531527;
        kXLV = dceV + -1640531527;
        Ujaf = kXLV + -1640531527;
        geiE = Ujaf + -1640531527;
        bMGO = geiE + -1640531527;
        CapD = bMGO + -1640531527;
        tDDl = CapD + -1640531527;
        Zwuq = tDDl + -1640531527;
        WceZ = Zwuq + -1640531527;
        HmgK = WceZ + -1640531527;
        cRBe = HmgK + -1640531527;
        HSHi = cRBe + -1640531527;
        vvAS = HSHi + -1640531527;
    }
}

