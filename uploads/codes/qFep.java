/*
 * Decompiled with CFR 0_121.
 */
package com.xk72.charles;

import com.xk72.charles.LicenseException;
import com.xk72.charles.LicenseType;
import com.xk72.charles.ofBg;
import java.io.UnsupportedEncodingException;

public final class qFep {
    private static String gtOW = "Thanks for looking at the source. Please register Charles if you use it.";
    private static qFep SkgP;
    private boolean HTrY = false;
    private String sEhA = "Unregistered";
    private int xUoC;
    private LicenseType NcmB;
    private static final int vHqU = 1;
    private static final int VoVL = 2;
    private static final int OQiJ = 3;
    private static final long eBdv = 8800536498351690864L;
    private static final long qTqd = -5408575981733630035L;
    private static final long yDcM = -6517524745266237632L;
    private static final long msWS = 5911726755176091652L;
    private static final String[] Egpf;
    private static final int kVMm = 32;
    private static int BIti;
    private static int UhyO;
    private static int ZxAX;
    private static int iAEp;
    private static int wspQ;
    private static int KOPu;
    private static int lbkD;
    private static int BfKw;
    private static int Nplh;
    private static int kqsC;
    private static int BsWz;
    private static int vRoB;
    private static int MaPU;
    private static int GKoM;
    private static int MkkK;
    private static int VhKF;
    private static int gISv;
    private static int cEos;
    private static int ZfCJ;
    private static int lAdR;
    private static int PlAM;
    private static int uFZW;
    private static int Zsjr;
    private static int BuJE;
    private static int KHsG;
    private static int BXrJ;
    private int FYPC;
    private int jhoh;
    private int BkAB;
    private int PBUi;
    private int EpGP;
    private int UgLm;
    private int uIvn;
    private int xhkp;
    private int MVWU;
    private int IxJL;
    private int vonN;
    private int OERL;
    private int sAXM;
    private int eqQB;
    private int vnNh;
    private int TeLH;
    private int PyJn;
    private int xRoT;
    private int xXET;
    private int rWrp;
    private int Msov;
    private int qDfC;
    private int VtAd;
    private int QYNW;
    private int LDQn;
    private int QzqF;
    private static final int gXSP = -1209970333;
    private static final int GsGI = -1640531527;

    public qFep() {
    }

    private qFep(String string, String object) {
        try {
            boolean bl;
            String string2 = object;
            String string3 = string;
            object = this;
            String string4 = string3;
            String string5 = string4;
            string5 = string4;
            string5 = string4.replaceAll("[\u00a0\u1680\u180e\u2000\u200a\u202f\u205f\u3000]", " ");
            long l = qFep.super.HTrY(string5, string2);
            boolean bl2 = qFep.super.gtOW(l);
            if (bl2) {
                bl = true;
            } else if (string5.equals(string3)) {
                bl = false;
            } else {
                long l2 = qFep.super.HTrY(string3, string2);
                bl = qFep.super.gtOW(l2);
            }
            if (!bl) {
                throw new LicenseException(this.gtOW(2));
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw new LicenseException(this.gtOW(1));
        }
        this.sEhA = string;
        this.HTrY = true;
    }

    private static void gtOW(qFep qFep2) {
        SkgP = qFep2;
    }

    public static boolean gtOW() {
        qFep qFep2 = SkgP;
        return qFep2.HTrY;
    }

    public static String SkgP() {
        qFep qFep2 = SkgP;
        switch (ofBg.gtOW[qFep2.NcmB.ordinal()]) {
            case 1: {
                return qFep2.sEhA;
            }
            case 2: {
                return qFep2.sEhA + " - Site License";
            }
            case 3: {
                return qFep2.sEhA + " - Multi-Site License";
            }
        }
        return qFep2.sEhA;
    }

    public static String gtOW(String object, String string) {
        try {
            object = new qFep((String)object, string);
        }
        catch (LicenseException licenseException) {
            object = licenseException;
            return licenseException.getMessage();
        }
        SkgP = object;
        return null;
    }

    private boolean HTrY() {
        return this.HTrY;
    }

    private String sEhA() {
        switch (ofBg.gtOW[this.NcmB.ordinal()]) {
            case 1: {
                return this.sEhA;
            }
            case 2: {
                return this.sEhA + " - Site License";
            }
            case 3: {
                return this.sEhA + " - Multi-Site License";
            }
        }
        return this.sEhA;
    }

    private int xUoC() {
        return this.xUoC;
    }

    private LicenseType NcmB() {
        return this.NcmB;
    }

    private String gtOW(int n) {
        this.sEhA(8800536498351690864L);
        try {
            String string = Egpf[n];
            byte[] arrby = new byte[string.length() / 2];
            for (int i = 0; i < arrby.length; ++i) {
                arrby[i] = (byte)Integer.parseInt(string.substring(i << 1, (i << 1) + 2), 16);
            }
            byte[] arrby2 = this.HTrY(arrby);
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

    private boolean SkgP(String string, String string2) {
        String string3;
        String string4 = string;
        string4 = string4;
        string4 = string3.replaceAll("[\u00a0\u1680\u180e\u2000\u200a\u202f\u205f\u3000]", " ");
        long l = this.HTrY(string4, string2);
        boolean bl = this.gtOW(l);
        if (bl) {
            return true;
        }
        if (string4.equals(string)) {
            return false;
        }
        long l2 = this.HTrY(string, string2);
        return this.gtOW(l2);
    }

    private static String gtOW(String string) {
        return string.replaceAll("[\u00a0\u1680\u180e\u2000\u200a\u202f\u205f\u3000]", " ");
    }

    private boolean gtOW(long l) {
        int n = qFep.SkgP(l);
        this.sEhA(l);
        long l2 = l;
        for (int i = 0; i < n + 35; ++i) {
            l2 = this.HTrY(l2);
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
    private long HTrY(String arrby, String string) {
        if (string.length() != 18) {
            throw new LicenseException(this.gtOW(0));
        }
        if (string.equalsIgnoreCase("7055ce2f8cb4f9405f")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("5bae9d8cdea32760ae")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("f3264994d9ea6bc595")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("b9930cef009d3a7865")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("62bd6a5f95aa67998e")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("a1c536c35904e64584")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("d6e5590ecc05edd9b3")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("8fbe36ce2726458b18")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("042a8352caf1188945")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("9d26d5088770221c3c")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("e19b2a01905e4129bf")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("68ebe4c9d792f31057")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("4e4beb8a43e9feb9c7")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("d04d85b44b306fc9ec")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("2b5d21a38c9452e342")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("88cb89c26a813bce44")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("76c9ee78c8ab124054")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("729db7c98163ac7d3d")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("7c1d4761993c412472")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("08bc0b7ec91cd0f4aa")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("25bafae175decaedcc")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("3181aae6822ef90ccd")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("d7a8fe9dc9dc919f87")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("728dae81d9d22aca03")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("119a9b593348fa3e74")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("04ab87c8d69667878e")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("4b282d851ebd87a7bb")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("ed526255313b756e42")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("ed5ab211362ab25ca7")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("18f4789a3df48f3b15")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("67549e44b1c8d8d857")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("4593c6c54227c4f17d")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("1c59db29042e7df8ef")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("a647e3dd42ce9b409b")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("7e06d6a70b82858113")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("ef4b5a48595197a373")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("0ac55f6bebd0330640")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("1beda9831c78994f43")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("8a2b9debb15766bff9")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("da0e7561b10d974216")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("86257b04b8c303fd9a")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("a4036b2761c9583fda")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("18e69f6d5bc820d4d3")) throw new LicenseException(this.gtOW(1));
        if (string.equalsIgnoreCase("a13746cb3d1c83bca6")) {
            throw new LicenseException(this.gtOW(1));
        }
        byte[] arrby2 = string;
        long l = Long.parseLong(arrby2.substring(2, 10), 16) << 32 | Long.parseLong(arrby2.substring(10, 18), 16);
        arrby2 = string;
        int n = Integer.parseInt(arrby2.substring(0, 2), 16);
        this.sEhA(-5408575981733630035L);
        long l2 = this.HTrY(l);
        if (qFep.SkgP(l2) != n) {
            throw new LicenseException(this.gtOW(1));
        }
        this.xUoC = (int)(l2 << 32 >>> 32 >>> 24);
        if (this.xUoC == 1) {
            this.NcmB = LicenseType.gtOW;
        } else {
            if (this.xUoC != 4) {
                if (this.xUoC >= 4) throw new LicenseException(this.gtOW(1));
                throw new LicenseException(this.gtOW(3));
            }
            switch ((int)(l2 << 32 >>> 32 >>> 16 & 255)) {
                case 1: {
                    this.NcmB = LicenseType.gtOW;
                    break;
                }
                case 2: {
                    this.NcmB = LicenseType.SkgP;
                    break;
                }
                case 3: {
                    this.NcmB = LicenseType.HTrY;
                    break;
                }
                default: {
                    throw new LicenseException(this.gtOW(1));
                }
            }
        }
        this.sEhA(8800536498351690864L);
        try {
            arrby = arrby.getBytes("UTF-8");
            arrby2 = this;
            n = arrby.length;
            int n2 = n + 4;
            if (n2 % 8 != 0) {
                n2 += 8 - n2 % 8;
            }
            byte[] arrby3 = new byte[n2];
            System.arraycopy(arrby, 0, arrby3, 4, n);
            arrby3[0] = n >> 24;
            arrby3[1] = (byte)(n >> 16);
            arrby3[2] = (byte)(n >> 8);
            arrby3[3] = (byte)n;
            arrby2 = qFep.super.HTrY(arrby3);
            int n3 = 0;
            byte[] arrby4 = arrby2;
            n2 = arrby4.length;
            int n4 = 0;
            while (n4 < n2) {
                byte by = arrby4[n4];
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

    private static final long SkgP(String string) {
        return Long.parseLong(string.substring(2, 10), 16) << 32 | Long.parseLong(string.substring(10, 18), 16);
    }

    private static final int HTrY(String string) {
        return Integer.parseInt(string.substring(0, 2), 16);
    }

    private static final int gtOW(byte[] arrby) {
        int n = 0;
        for (byte by : arrby) {
            n ^= by;
            n = n << 3 | n >>> 29;
        }
        return n;
    }

    private static final int SkgP(long l) {
        long l2 = 0;
        for (int i = 56; i >= 0; i -= 8) {
            l2 ^= l >>> i & 255;
        }
        return Math.abs((int)(l2 & 255));
    }

    private byte[] SkgP(byte[] arrby) {
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
        arrby = this.HTrY(arrby2);
        return arrby;
    }

    private byte[] HTrY(byte[] arrby) {
        byte[] arrby2 = new byte[arrby.length];
        int n = arrby.length;
        int n2 = 0;
        long l = 0;
        for (int i = 0; i < n; ++i) {
            l <<= 8;
            l |= (long)(arrby[i] & 255);
            if (++n2 != 8) continue;
            l = this.HTrY(l);
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

    private long HTrY(long l) {
        int n = (int)l + this.FYPC;
        int n2 = (int)(l >>> 32) + this.jhoh;
        int n3 = n ^ n2;
        int n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.BkAB;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.PBUi;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.EpGP;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.UgLm;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.uIvn;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.xhkp;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.MVWU;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.IxJL;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.vonN;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.OERL;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.sAXM;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.eqQB;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.vnNh;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.TeLH;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.PyJn;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.xRoT;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.xXET;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.rWrp;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.Msov;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.qDfC;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.VtAd;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.QYNW;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.LDQn;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.QzqF;
        return ((long)n2 << 32) + ((long)n & 0xFFFFFFFFL);
    }

    private void sEhA(long l) {
        int n = (int)l;
        int n2 = (int)(l >>> 32);
        int n3 = BIti;
        int n4 = this.FYPC = n3 << 3 | n3 >>> 29;
        n3 = n + n4;
        int n5 = n4 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = UhyO + (n4 + n5);
        n4 = this.jhoh = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = ZxAX + (n4 + n5);
        n4 = this.BkAB = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = iAEp + (n4 + n5);
        n4 = this.PBUi = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = wspQ + (n4 + n5);
        n4 = this.EpGP = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = KOPu + (n4 + n5);
        n4 = this.UgLm = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = lbkD + (n4 + n5);
        n4 = this.uIvn = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = BfKw + (n4 + n5);
        n4 = this.xhkp = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = Nplh + (n4 + n5);
        n4 = this.MVWU = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = kqsC + (n4 + n5);
        n4 = this.IxJL = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = BsWz + (n4 + n5);
        n4 = this.vonN = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = vRoB + (n4 + n5);
        n4 = this.OERL = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = MaPU + (n4 + n5);
        n4 = this.sAXM = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = GKoM + (n4 + n5);
        n4 = this.eqQB = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = MkkK + (n4 + n5);
        n4 = this.vnNh = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = VhKF + (n4 + n5);
        n4 = this.TeLH = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = gISv + (n4 + n5);
        n4 = this.PyJn = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = cEos + (n4 + n5);
        n4 = this.xRoT = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = ZfCJ + (n4 + n5);
        n4 = this.xXET = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = lAdR + (n4 + n5);
        n4 = this.rWrp = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = PlAM + (n4 + n5);
        n4 = this.Msov = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = uFZW + (n4 + n5);
        n4 = this.qDfC = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = Zsjr + (n4 + n5);
        n4 = this.VtAd = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = BuJE + (n4 + n5);
        n4 = this.QYNW = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = KHsG + (n4 + n5);
        n4 = this.LDQn = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = BXrJ + (n4 + n5);
        n4 = this.QzqF = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.FYPC + (n4 + n5);
        n4 = this.FYPC = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.jhoh + (n4 + n5);
        n4 = this.jhoh = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.BkAB + (n4 + n5);
        n4 = this.BkAB = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.PBUi + (n4 + n5);
        n4 = this.PBUi = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.EpGP + (n4 + n5);
        n4 = this.EpGP = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.UgLm + (n4 + n5);
        n4 = this.UgLm = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.uIvn + (n4 + n5);
        n4 = this.uIvn = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.xhkp + (n4 + n5);
        n4 = this.xhkp = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.MVWU + (n4 + n5);
        n4 = this.MVWU = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.IxJL + (n4 + n5);
        n4 = this.IxJL = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.vonN + (n4 + n5);
        n4 = this.vonN = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.OERL + (n4 + n5);
        n4 = this.OERL = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.sAXM + (n4 + n5);
        n4 = this.sAXM = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.eqQB + (n4 + n5);
        n4 = this.eqQB = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.vnNh + (n4 + n5);
        n4 = this.vnNh = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.TeLH + (n4 + n5);
        n4 = this.TeLH = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.PyJn + (n4 + n5);
        n4 = this.PyJn = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.xRoT + (n4 + n5);
        n4 = this.xRoT = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.xXET + (n4 + n5);
        n4 = this.xXET = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.rWrp + (n4 + n5);
        n4 = this.rWrp = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.Msov + (n4 + n5);
        n4 = this.Msov = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.qDfC + (n4 + n5);
        n4 = this.qDfC = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.VtAd + (n4 + n5);
        n4 = this.VtAd = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.QYNW + (n4 + n5);
        n4 = this.QYNW = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.LDQn + (n4 + n5);
        n4 = this.LDQn = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.QzqF + (n4 + n5);
        n4 = this.QzqF = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.FYPC + (n4 + n5);
        n4 = this.FYPC = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.jhoh + (n4 + n5);
        n4 = this.jhoh = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.BkAB + (n4 + n5);
        n4 = this.BkAB = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.PBUi + (n4 + n5);
        n4 = this.PBUi = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.EpGP + (n4 + n5);
        n4 = this.EpGP = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.UgLm + (n4 + n5);
        n4 = this.UgLm = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.uIvn + (n4 + n5);
        n4 = this.uIvn = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.xhkp + (n4 + n5);
        n4 = this.xhkp = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.MVWU + (n4 + n5);
        n4 = this.MVWU = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.IxJL + (n4 + n5);
        n4 = this.IxJL = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.vonN + (n4 + n5);
        n4 = this.vonN = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.OERL + (n4 + n5);
        n4 = this.OERL = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.sAXM + (n4 + n5);
        n4 = this.sAXM = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.eqQB + (n4 + n5);
        n4 = this.eqQB = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.vnNh + (n4 + n5);
        n4 = this.vnNh = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.TeLH + (n4 + n5);
        n4 = this.TeLH = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.PyJn + (n4 + n5);
        n4 = this.PyJn = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.xRoT + (n4 + n5);
        n4 = this.xRoT = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.xXET + (n4 + n5);
        n4 = this.xXET = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.rWrp + (n4 + n5);
        n4 = this.rWrp = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.Msov + (n4 + n5);
        n4 = this.Msov = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.qDfC + (n4 + n5);
        n4 = this.qDfC = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.VtAd + (n4 + n5);
        n4 = this.VtAd = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.QYNW + (n4 + n5);
        n4 = this.QYNW = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.LDQn + (n4 + n5);
        n4 = this.LDQn = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.QzqF + (n4 + n5);
        this.QzqF = n3 << 3 | n3 >>> 29;
    }

    static {
        qFep qFep2;
        SkgP = qFep2 = new qFep();
        Egpf = new String[]{"b241993e8a12c782348e4652cc22c2501d9d6f248e91a3d849275666a0ff7d954fdf638f0d03098c52c4710a5e619b9b09cd6cd027ea3bdb937172b3fdf0bded3d684333798880bb78780f6f6644580409ac882bc021732a", "b241993e8a12c782348e4652cc22c250c30afb881b44ba4dd936c44a573755b5276046dc3ae32e58d10f467421f51ca607b0e29f53cd8f38dd9eee548398b195348e4652cc22c2502feb5f8fd884cb3c9a330ee10954d071", "8a24264c4ae5e5371d663158ccbd75e5a5d70bef5d61291ba3af58b92fe98f7a5c8f83abe09b0c1b3f469d5ad85a3a01e81a2248a290b22d05f52db22eb8b10af10437ddcf2f437b1a519b09a9c4f2c374a882757515e2e2fde238a4eccc62d3fc36d9a77dcbd7cc05236b02716005836b21e58a07330bb18136139263e71a0f79382179978b680a", "96122782ec21d0584881fa8dc6b2ff60585bcafbaeec4bd03874fc7ce730dcb3515b9fb963790219047bf20363167e9967cc1b0851ae39b63d831e55c196a04d7ae5be1b671bedc43b7e8ca175e6d3af2610c3f6b5863d0000ccc9ff3b971946974d3cb7be340cb08475020696df69ac20764f7709cb63e3aac239578db58e85"};
        BIti = -1209970333;
        UhyO = -1209970333 + -1640531527;
        ZxAX = UhyO + -1640531527;
        iAEp = ZxAX + -1640531527;
        wspQ = iAEp + -1640531527;
        KOPu = wspQ + -1640531527;
        lbkD = KOPu + -1640531527;
        BfKw = lbkD + -1640531527;
        Nplh = BfKw + -1640531527;
        kqsC = Nplh + -1640531527;
        BsWz = kqsC + -1640531527;
        vRoB = BsWz + -1640531527;
        MaPU = vRoB + -1640531527;
        GKoM = MaPU + -1640531527;
        MkkK = GKoM + -1640531527;
        VhKF = MkkK + -1640531527;
        gISv = VhKF + -1640531527;
        cEos = gISv + -1640531527;
        ZfCJ = cEos + -1640531527;
        lAdR = ZfCJ + -1640531527;
        PlAM = lAdR + -1640531527;
        uFZW = PlAM + -1640531527;
        Zsjr = uFZW + -1640531527;
        BuJE = Zsjr + -1640531527;
        KHsG = BuJE + -1640531527;
        BXrJ = KHsG + -1640531527;
    }
}

