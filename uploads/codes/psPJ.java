/*
 * Decompiled with CFR 0_121.
 */
package com.xk72.charles;

import com.xk72.charles.LicenseException;
import com.xk72.charles.LicenseType;
import com.xk72.charles.bJif;
import java.io.UnsupportedEncodingException;

public final class psPJ {
    private static String qIvM = "Thanks for looking at the source. Please register Charles if you use it.";
    private static psPJ mLFE;
    private boolean tCiz = false;
    private String SeSn = "Unregistered";
    private int ItXW;
    private LicenseType lvYl;
    private static final int qcmb = 1;
    private static final int katN = 2;
    private static final int dPND = 3;
    private static final int BIuH = 4;
    private static final long DPdV = 8800536498351690864L;
    private static final long uFHX = -5408575981733630035L;
    private static final long TizZ = -6517524745266237632L;
    private static final long vvSc = 5911726755176091652L;
    private static final String[] ixwj;
    private static final int BRUS = 32;
    private static int BrJi;
    private static int iiya;
    private static int CQRb;
    private static int vubc;
    private static int rIxM;
    private static int dVvh;
    private static int MIxK;
    private static int KYIM;
    private static int RhvO;
    private static int BmVj;
    private static int IzQc;
    private static int Esuy;
    private static int YNxl;
    private static int ndKw;
    private static int LjYz;
    private static int iDKe;
    private static int cUDn;
    private static int yFoU;
    private static int CoJZ;
    private static int qIpz;
    private static int IEXE;
    private static int EyoC;
    private static int KaAp;
    private static int rLOX;
    private static int QXgZ;
    private static int VTht;
    private int jzaI;
    private int AQmh;
    private int gKBU;
    private int AiXx;
    private int ffZV;
    private int alnN;
    private int BEES;
    private int lPwh;
    private int enwJ;
    private int gGWy;
    private int YjvF;
    private int laeH;
    private int oUCM;
    private int AlMw;
    private int buRa;
    private int ACoV;
    private int KxfV;
    private int TkNa;
    private int IVDb;
    private int rMnG;
    private int miMC;
    private int pXJa;
    private int AYFy;
    private int gYnH;
    private int NjDV;
    private int liMc;
    private static final int jslA = -1209970333;
    private static final int tjMT = -1640531527;

    public psPJ() {
    }

    private psPJ(String string, String string2) {
        this(string, string2, 4);
    }

    private psPJ(String string, String object, int n) {
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
            long l = psPJ.super.mLFE(string5, string2, n2);
            boolean bl2 = psPJ.super.qIvM(l);
            if (bl2) {
                bl = true;
            } else if (string5.equals(string3)) {
                bl = false;
            } else {
                long l2 = psPJ.super.mLFE(string3, string2, n2);
                bl = psPJ.super.qIvM(l2);
            }
            if (!bl) {
                throw new LicenseException(this.qIvM(2));
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw new LicenseException(this.qIvM(1));
        }
        this.SeSn = string;
        this.tCiz = true;
    }

    private static void qIvM(psPJ psPJ2) {
        mLFE = psPJ2;
    }

    public static boolean qIvM() {
        psPJ psPJ2 = mLFE;
        return psPJ2.tCiz;
    }

    public static void mLFE() {
        psPJ psPJ2;
        mLFE = psPJ2 = new psPJ();
    }

    public static String tCiz() {
        psPJ psPJ2 = mLFE;
        switch (bJif.qIvM[psPJ2.lvYl.ordinal()]) {
            case 1: {
                return psPJ2.SeSn;
            }
            case 2: {
                return psPJ2.SeSn + " - Site License";
            }
            case 3: {
                return psPJ2.SeSn + " - Multi-Site License";
            }
        }
        return psPJ2.SeSn;
    }

    public static String qIvM(String object, String string) {
        try {
            object = new psPJ((String)object, string);
        }
        catch (LicenseException licenseException) {
            object = licenseException;
            return licenseException.getMessage();
        }
        mLFE = object;
        return null;
    }

    private boolean SeSn() {
        return this.tCiz;
    }

    private String ItXW() {
        switch (bJif.qIvM[this.lvYl.ordinal()]) {
            case 1: {
                return this.SeSn;
            }
            case 2: {
                return this.SeSn + " - Site License";
            }
            case 3: {
                return this.SeSn + " - Multi-Site License";
            }
        }
        return this.SeSn;
    }

    private int lvYl() {
        return this.ItXW;
    }

    private LicenseType qcmb() {
        return this.lvYl;
    }

    private String qIvM(int n) {
        this.SeSn(8800536498351690864L);
        try {
            String string = ixwj[n];
            byte[] arrby = new byte[string.length() / 2];
            for (int i = 0; i < arrby.length; ++i) {
                arrby[i] = (byte)Integer.parseInt(string.substring(i << 1, (i << 1) + 2), 16);
            }
            byte[] arrby2 = this.tCiz(arrby);
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

    private boolean qIvM(String string, String string2, int n) {
        String string3;
        String string4 = string;
        string4 = string4;
        string4 = string3.replaceAll("[\u00a0\u1680\u180e\u2000\u200a\u202f\u205f\u3000]", " ");
        long l = this.mLFE(string4, string2, n);
        boolean bl = this.qIvM(l);
        if (bl) {
            return true;
        }
        if (string4.equals(string)) {
            return false;
        }
        long l2 = this.mLFE(string, string2, n);
        return this.qIvM(l2);
    }

    private static String qIvM(String string) {
        return string.replaceAll("[\u00a0\u1680\u180e\u2000\u200a\u202f\u205f\u3000]", " ");
    }

    private boolean qIvM(long l) {
        int n = psPJ.mLFE(l);
        this.SeSn(l);
        long l2 = l;
        for (int i = 0; i < n + 35; ++i) {
            l2 = this.tCiz(l2);
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
    private long mLFE(String arrby, String string, int n) {
        if (string.length() != 18) {
            throw new LicenseException(this.qIvM(0));
        }
        if (string.equalsIgnoreCase("7055ce2f8cb4f9405f")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("5bae9d8cdea32760ae")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("f3264994d9ea6bc595")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("b9930cef009d3a7865")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("62bd6a5f95aa67998e")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("a1c536c35904e64584")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("d6e5590ecc05edd9b3")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("8fbe36ce2726458b18")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("042a8352caf1188945")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("9d26d5088770221c3c")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("e19b2a01905e4129bf")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("68ebe4c9d792f31057")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("4e4beb8a43e9feb9c7")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("d04d85b44b306fc9ec")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("2b5d21a38c9452e342")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("88cb89c26a813bce44")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("76c9ee78c8ab124054")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("729db7c98163ac7d3d")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("7c1d4761993c412472")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("08bc0b7ec91cd0f4aa")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("25bafae175decaedcc")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("3181aae6822ef90ccd")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("d7a8fe9dc9dc919f87")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("728dae81d9d22aca03")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("119a9b593348fa3e74")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("04ab87c8d69667878e")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("4b282d851ebd87a7bb")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("ed526255313b756e42")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("ed5ab211362ab25ca7")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("18f4789a3df48f3b15")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("67549e44b1c8d8d857")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("4593c6c54227c4f17d")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("1c59db29042e7df8ef")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("a647e3dd42ce9b409b")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("7e06d6a70b82858113")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("ef4b5a48595197a373")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("0ac55f6bebd0330640")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("1beda9831c78994f43")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("8a2b9debb15766bff9")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("da0e7561b10d974216")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("86257b04b8c303fd9a")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("a4036b2761c9583fda")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("18e69f6d5bc820d4d3")) throw new LicenseException(this.qIvM(1));
        if (string.equalsIgnoreCase("a13746cb3d1c83bca6")) {
            throw new LicenseException(this.qIvM(1));
        }
        byte[] arrby2 = string;
        long l = Long.parseLong(arrby2.substring(2, 10), 16) << 32 | Long.parseLong(arrby2.substring(10, 18), 16);
        arrby2 = string;
        int n2 = Integer.parseInt(arrby2.substring(0, 2), 16);
        this.SeSn(-5408575981733630035L);
        long l2 = this.tCiz(l);
        if (psPJ.mLFE(l2) != n2) {
            throw new LicenseException(this.qIvM(1));
        }
        this.ItXW = (int)(l2 << 32 >>> 32 >>> 24);
        if (this.ItXW == 1) {
            this.lvYl = LicenseType.qIvM;
        } else {
            if (this.ItXW != n) {
                if (this.ItXW >= n) throw new LicenseException(this.qIvM(1));
                throw new LicenseException(this.qIvM(3));
            }
            switch ((int)(l2 << 32 >>> 32 >>> 16 & 255)) {
                case 1: {
                    this.lvYl = LicenseType.qIvM;
                    break;
                }
                case 2: {
                    this.lvYl = LicenseType.mLFE;
                    break;
                }
                case 3: {
                    this.lvYl = LicenseType.tCiz;
                    break;
                }
                default: {
                    throw new LicenseException(this.qIvM(1));
                }
            }
        }
        this.SeSn(8800536498351690864L);
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
            arrby2 = arrby3 = psPJ.super.tCiz(arrby4);
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

    private static final long mLFE(String string) {
        return Long.parseLong(string.substring(2, 10), 16) << 32 | Long.parseLong(string.substring(10, 18), 16);
    }

    private static final int tCiz(String string) {
        return Integer.parseInt(string.substring(0, 2), 16);
    }

    private static final int qIvM(byte[] arrby) {
        int n = 0;
        for (byte by : arrby) {
            n ^= by;
            n = n << 3 | n >>> 29;
        }
        return n;
    }

    private static final int mLFE(long l) {
        long l2 = 0;
        for (int i = 56; i >= 0; i -= 8) {
            l2 ^= l >>> i & 255;
        }
        return Math.abs((int)(l2 & 255));
    }

    private byte[] mLFE(byte[] arrby) {
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
        arrby = this.tCiz(arrby2);
        return arrby;
    }

    private byte[] tCiz(byte[] arrby) {
        byte[] arrby2 = new byte[arrby.length];
        int n = arrby.length;
        int n2 = 0;
        long l = 0;
        for (int i = 0; i < n; ++i) {
            l <<= 8;
            l |= (long)(arrby[i] & 255);
            if (++n2 != 8) continue;
            l = this.tCiz(l);
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

    private long tCiz(long l) {
        int n = (int)l + this.jzaI;
        int n2 = (int)(l >>> 32) + this.AQmh;
        int n3 = n ^ n2;
        int n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.gKBU;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.AiXx;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.ffZV;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.alnN;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.BEES;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.lPwh;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.enwJ;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.gGWy;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.YjvF;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.laeH;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.oUCM;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.AlMw;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.buRa;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.ACoV;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.KxfV;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.TkNa;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.IVDb;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.rMnG;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.miMC;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.pXJa;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.AYFy;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.gYnH;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.NjDV;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.liMc;
        return ((long)n2 << 32) + ((long)n & 0xFFFFFFFFL);
    }

    private void SeSn(long l) {
        int n = (int)l;
        int n2 = (int)(l >>> 32);
        int n3 = BrJi;
        int n4 = this.jzaI = n3 << 3 | n3 >>> 29;
        n3 = n + n4;
        int n5 = n4 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = iiya + (n4 + n5);
        n4 = this.AQmh = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = CQRb + (n4 + n5);
        n4 = this.gKBU = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = vubc + (n4 + n5);
        n4 = this.AiXx = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = rIxM + (n4 + n5);
        n4 = this.ffZV = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = dVvh + (n4 + n5);
        n4 = this.alnN = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = MIxK + (n4 + n5);
        n4 = this.BEES = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = KYIM + (n4 + n5);
        n4 = this.lPwh = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = RhvO + (n4 + n5);
        n4 = this.enwJ = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = BmVj + (n4 + n5);
        n4 = this.gGWy = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = IzQc + (n4 + n5);
        n4 = this.YjvF = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = Esuy + (n4 + n5);
        n4 = this.laeH = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = YNxl + (n4 + n5);
        n4 = this.oUCM = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = ndKw + (n4 + n5);
        n4 = this.AlMw = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = LjYz + (n4 + n5);
        n4 = this.buRa = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = iDKe + (n4 + n5);
        n4 = this.ACoV = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = cUDn + (n4 + n5);
        n4 = this.KxfV = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = yFoU + (n4 + n5);
        n4 = this.TkNa = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = CoJZ + (n4 + n5);
        n4 = this.IVDb = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = qIpz + (n4 + n5);
        n4 = this.rMnG = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = IEXE + (n4 + n5);
        n4 = this.miMC = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = EyoC + (n4 + n5);
        n4 = this.pXJa = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = KaAp + (n4 + n5);
        n4 = this.AYFy = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = rLOX + (n4 + n5);
        n4 = this.gYnH = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = QXgZ + (n4 + n5);
        n4 = this.NjDV = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = VTht + (n4 + n5);
        n4 = this.liMc = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.jzaI + (n4 + n5);
        n4 = this.jzaI = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.AQmh + (n4 + n5);
        n4 = this.AQmh = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.gKBU + (n4 + n5);
        n4 = this.gKBU = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.AiXx + (n4 + n5);
        n4 = this.AiXx = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.ffZV + (n4 + n5);
        n4 = this.ffZV = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.alnN + (n4 + n5);
        n4 = this.alnN = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.BEES + (n4 + n5);
        n4 = this.BEES = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.lPwh + (n4 + n5);
        n4 = this.lPwh = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.enwJ + (n4 + n5);
        n4 = this.enwJ = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.gGWy + (n4 + n5);
        n4 = this.gGWy = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.YjvF + (n4 + n5);
        n4 = this.YjvF = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.laeH + (n4 + n5);
        n4 = this.laeH = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.oUCM + (n4 + n5);
        n4 = this.oUCM = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.AlMw + (n4 + n5);
        n4 = this.AlMw = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.buRa + (n4 + n5);
        n4 = this.buRa = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.ACoV + (n4 + n5);
        n4 = this.ACoV = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.KxfV + (n4 + n5);
        n4 = this.KxfV = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.TkNa + (n4 + n5);
        n4 = this.TkNa = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.IVDb + (n4 + n5);
        n4 = this.IVDb = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.rMnG + (n4 + n5);
        n4 = this.rMnG = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.miMC + (n4 + n5);
        n4 = this.miMC = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.pXJa + (n4 + n5);
        n4 = this.pXJa = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.AYFy + (n4 + n5);
        n4 = this.AYFy = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.gYnH + (n4 + n5);
        n4 = this.gYnH = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.NjDV + (n4 + n5);
        n4 = this.NjDV = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.liMc + (n4 + n5);
        n4 = this.liMc = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.jzaI + (n4 + n5);
        n4 = this.jzaI = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.AQmh + (n4 + n5);
        n4 = this.AQmh = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.gKBU + (n4 + n5);
        n4 = this.gKBU = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.AiXx + (n4 + n5);
        n4 = this.AiXx = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.ffZV + (n4 + n5);
        n4 = this.ffZV = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.alnN + (n4 + n5);
        n4 = this.alnN = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.BEES + (n4 + n5);
        n4 = this.BEES = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.lPwh + (n4 + n5);
        n4 = this.lPwh = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.enwJ + (n4 + n5);
        n4 = this.enwJ = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.gGWy + (n4 + n5);
        n4 = this.gGWy = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.YjvF + (n4 + n5);
        n4 = this.YjvF = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.laeH + (n4 + n5);
        n4 = this.laeH = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.oUCM + (n4 + n5);
        n4 = this.oUCM = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.AlMw + (n4 + n5);
        n4 = this.AlMw = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.buRa + (n4 + n5);
        n4 = this.buRa = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.ACoV + (n4 + n5);
        n4 = this.ACoV = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.KxfV + (n4 + n5);
        n4 = this.KxfV = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.TkNa + (n4 + n5);
        n4 = this.TkNa = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.IVDb + (n4 + n5);
        n4 = this.IVDb = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.rMnG + (n4 + n5);
        n4 = this.rMnG = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.miMC + (n4 + n5);
        n4 = this.miMC = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.pXJa + (n4 + n5);
        n4 = this.pXJa = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.AYFy + (n4 + n5);
        n4 = this.AYFy = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.gYnH + (n4 + n5);
        n4 = this.gYnH = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.NjDV + (n4 + n5);
        n4 = this.NjDV = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.liMc + (n4 + n5);
        this.liMc = n3 << 3 | n3 >>> 29;
    }

    static {
        psPJ.mLFE();
        ixwj = new String[]{"b241993e8a12c782348e4652cc22c2501d9d6f248e91a3d849275666a0ff7d954fdf638f0d03098c52c4710a5e619b9b09cd6cd027ea3bdb937172b3fdf0bded3d684333798880bb78780f6f6644580409ac882bc021732a", "b241993e8a12c782348e4652cc22c250c30afb881b44ba4dd936c44a573755b5276046dc3ae32e58d10f467421f51ca607b0e29f53cd8f38dd9eee548398b195348e4652cc22c2502feb5f8fd884cb3c9a330ee10954d071", "8a24264c4ae5e5371d663158ccbd75e5a5d70bef5d61291ba3af58b92fe98f7a5c8f83abe09b0c1b3f469d5ad85a3a01e81a2248a290b22d05f52db22eb8b10af10437ddcf2f437b1a519b09a9c4f2c374a882757515e2e2fde238a4eccc62d3fc36d9a77dcbd7cc05236b02716005836b21e58a07330bb18136139263e71a0f79382179978b680a", "96122782ec21d0584881fa8dc6b2ff60585bcafbaeec4bd03874fc7ce730dcb3515b9fb963790219047bf20363167e9967cc1b0851ae39b63d831e55c196a04d7ae5be1b671bedc43b7e8ca175e6d3af2610c3f6b5863d0000ccc9ff3b971946974d3cb7be340cb08475020696df69ac20764f7709cb63e3aac239578db58e85"};
        BrJi = -1209970333;
        iiya = -1209970333 + -1640531527;
        CQRb = iiya + -1640531527;
        vubc = CQRb + -1640531527;
        rIxM = vubc + -1640531527;
        dVvh = rIxM + -1640531527;
        MIxK = dVvh + -1640531527;
        KYIM = MIxK + -1640531527;
        RhvO = KYIM + -1640531527;
        BmVj = RhvO + -1640531527;
        IzQc = BmVj + -1640531527;
        Esuy = IzQc + -1640531527;
        YNxl = Esuy + -1640531527;
        ndKw = YNxl + -1640531527;
        LjYz = ndKw + -1640531527;
        iDKe = LjYz + -1640531527;
        cUDn = iDKe + -1640531527;
        yFoU = cUDn + -1640531527;
        CoJZ = yFoU + -1640531527;
        qIpz = CoJZ + -1640531527;
        IEXE = qIpz + -1640531527;
        EyoC = IEXE + -1640531527;
        KaAp = EyoC + -1640531527;
        rLOX = KaAp + -1640531527;
        QXgZ = rLOX + -1640531527;
        VTht = QXgZ + -1640531527;
    }
}

