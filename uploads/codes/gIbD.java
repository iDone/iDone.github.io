/*
 * Decompiled with CFR 0_121.
 */
package com.xk72.charles;

import com.xk72.charles.LicenseException;
import com.xk72.charles.LicenseType;
import com.xk72.charles.jrCQ;
import java.io.UnsupportedEncodingException;

public final class gIbD {
    private static String xUFT = "Thanks for looking at the source. Please register Charles if you use it.";
    private static gIbD QNfW;
    private boolean PcqR = false;
    private String GyLP = "Unregistered";
    private int LCuJ;
    private LicenseType obIG;
    private static final int oIFs = 1;
    private static final int BrgM = 2;
    private static final int ACVy = 3;
    private static final int tXSF = 4;
    private static final long smOB = 8800536498351690864L;
    private static final long VXIH = -5408575981733630035L;
    private static final long yzpo = -6517524745266237632L;
    private static final long OELe = 5911726755176091652L;
    private static final String[] jStv;
    private static final int OktK = 32;
    private static int xZDB;
    private static int Kddp;
    private static int kLTw;
    private static int wANZ;
    private static int eGvv;
    private static int OyrW;
    private static int AhNW;
    private static int fSTT;
    private static int dEyp;
    private static int teXl;
    private static int jGCV;
    private static int xkdd;
    private static int acAr;
    private static int uCNg;
    private static int SXwK;
    private static int SVyR;
    private static int yoFQ;
    private static int GSjU;
    private static int sMOl;
    private static int ufkR;
    private static int AMmv;
    private static int hXue;
    private static int xKlN;
    private static int FoZv;
    private static int Qdko;
    private static int lFFd;
    private int oVFc;
    private int efjz;
    private int zabk;
    private int QlPt;
    private int RldU;
    private int shaH;
    private int xFHb;
    private int WXnh;
    private int QInw;
    private int BYsH;
    private int ldJn;
    private int IUUl;
    private int vDXo;
    private int hpRF;
    private int IYPr;
    private int kkyP;
    private int LBAQ;
    private int GHHd;
    private int gAPO;
    private int MRRB;
    private int nlJv;
    private int dgIp;
    private int fYJz;
    private int vEFI;
    private int dDPo;
    private int nnwg;
    private static final int mHHZ = -1209970333;
    private static final int mCBi = -1640531527;

    public gIbD() {
    }

    private gIbD(String string, String string2) {
        this(string, string2, 4);
    }

    private gIbD(String string, String object, int n) {
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
            long l = gIbD.super.QNfW(string5, string2, n2);
            boolean bl2 = gIbD.super.xUFT(l);
            if (bl2) {
                bl = true;
            } else if (string5.equals(string3)) {
                bl = false;
            } else {
                long l2 = gIbD.super.QNfW(string3, string2, n2);
                bl = gIbD.super.xUFT(l2);
            }
            if (!bl) {
                throw new LicenseException(this.xUFT(2));
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw new LicenseException(this.xUFT(1));
        }
        this.GyLP = string;
        this.PcqR = true;
    }

    private static void xUFT(gIbD gIbD2) {
        QNfW = gIbD2;
    }

    public static boolean xUFT() {
        gIbD gIbD2 = QNfW;
        return gIbD2.PcqR;
    }

    public static void QNfW() {
        gIbD gIbD2;
        QNfW = gIbD2 = new gIbD();
    }

    public static String PcqR() {
        gIbD gIbD2 = QNfW;
        switch (jrCQ.xUFT[gIbD2.obIG.ordinal()]) {
            case 1: {
                return gIbD2.GyLP;
            }
            case 2: {
                return gIbD2.GyLP + " - Site License";
            }
            case 3: {
                return gIbD2.GyLP + " - Multi-Site License";
            }
        }
        return gIbD2.GyLP;
    }

    public static String xUFT(String object, String string) {
        try {
            object = new gIbD((String)object, string);
        }
        catch (LicenseException licenseException) {
            object = licenseException;
            return licenseException.getMessage();
        }
        QNfW = object;
        return null;
    }

    private boolean GyLP() {
        return this.PcqR;
    }

    private String LCuJ() {
        switch (jrCQ.xUFT[this.obIG.ordinal()]) {
            case 1: {
                return this.GyLP;
            }
            case 2: {
                return this.GyLP + " - Site License";
            }
            case 3: {
                return this.GyLP + " - Multi-Site License";
            }
        }
        return this.GyLP;
    }

    private int obIG() {
        return this.LCuJ;
    }

    private LicenseType oIFs() {
        return this.obIG;
    }

    private String xUFT(int n) {
        this.GyLP(8800536498351690864L);
        try {
            String string = jStv[n];
            byte[] arrby = new byte[string.length() / 2];
            for (int i = 0; i < arrby.length; ++i) {
                arrby[i] = (byte)Integer.parseInt(string.substring(i << 1, (i << 1) + 2), 16);
            }
            byte[] arrby2 = this.PcqR(arrby);
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

    private boolean xUFT(String string, String string2, int n) {
        String string3;
        String string4 = string;
        string4 = string4;
        string4 = string3.replaceAll("[\u00a0\u1680\u180e\u2000\u200a\u202f\u205f\u3000]", " ");
        long l = this.QNfW(string4, string2, n);
        boolean bl = this.xUFT(l);
        if (bl) {
            return true;
        }
        if (string4.equals(string)) {
            return false;
        }
        long l2 = this.QNfW(string, string2, n);
        return this.xUFT(l2);
    }

    private static String xUFT(String string) {
        return string.replaceAll("[\u00a0\u1680\u180e\u2000\u200a\u202f\u205f\u3000]", " ");
    }

    private boolean xUFT(long l) {
        int n = gIbD.QNfW(l);
        this.GyLP(l);
        long l2 = l;
        for (int i = 0; i < n + 35; ++i) {
            l2 = this.PcqR(l2);
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
    private long QNfW(String arrby, String string, int n) {
        if (string.length() != 18) {
            throw new LicenseException(this.xUFT(0));
        }
        if (string.equalsIgnoreCase("7055ce2f8cb4f9405f")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("5bae9d8cdea32760ae")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("f3264994d9ea6bc595")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("b9930cef009d3a7865")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("62bd6a5f95aa67998e")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("a1c536c35904e64584")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("d6e5590ecc05edd9b3")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("8fbe36ce2726458b18")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("042a8352caf1188945")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("9d26d5088770221c3c")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("e19b2a01905e4129bf")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("68ebe4c9d792f31057")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("4e4beb8a43e9feb9c7")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("d04d85b44b306fc9ec")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("2b5d21a38c9452e342")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("88cb89c26a813bce44")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("76c9ee78c8ab124054")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("729db7c98163ac7d3d")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("7c1d4761993c412472")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("08bc0b7ec91cd0f4aa")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("25bafae175decaedcc")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("3181aae6822ef90ccd")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("d7a8fe9dc9dc919f87")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("728dae81d9d22aca03")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("119a9b593348fa3e74")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("04ab87c8d69667878e")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("4b282d851ebd87a7bb")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("ed526255313b756e42")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("ed5ab211362ab25ca7")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("18f4789a3df48f3b15")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("67549e44b1c8d8d857")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("4593c6c54227c4f17d")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("1c59db29042e7df8ef")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("a647e3dd42ce9b409b")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("7e06d6a70b82858113")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("ef4b5a48595197a373")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("0ac55f6bebd0330640")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("1beda9831c78994f43")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("8a2b9debb15766bff9")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("da0e7561b10d974216")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("86257b04b8c303fd9a")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("a4036b2761c9583fda")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("18e69f6d5bc820d4d3")) throw new LicenseException(this.xUFT(1));
        if (string.equalsIgnoreCase("a13746cb3d1c83bca6")) {
            throw new LicenseException(this.xUFT(1));
        }
        byte[] arrby2 = string;
        long l = Long.parseLong(arrby2.substring(2, 10), 16) << 32 | Long.parseLong(arrby2.substring(10, 18), 16);
        arrby2 = string;
        int n2 = Integer.parseInt(arrby2.substring(0, 2), 16);
        this.GyLP(-5408575981733630035L);
        long l2 = this.PcqR(l);
        if (gIbD.QNfW(l2) != n2) {
            throw new LicenseException(this.xUFT(1));
        }
        this.LCuJ = (int)(l2 << 32 >>> 32 >>> 24);
        if (this.LCuJ == 1) {
            this.obIG = LicenseType.xUFT;
        } else {
            if (this.LCuJ != n) {
                if (this.LCuJ >= n) throw new LicenseException(this.xUFT(1));
                throw new LicenseException(this.xUFT(3));
            }
            switch ((int)(l2 << 32 >>> 32 >>> 16 & 255)) {
                case 1: {
                    this.obIG = LicenseType.xUFT;
                    break;
                }
                case 2: {
                    this.obIG = LicenseType.QNfW;
                    break;
                }
                case 3: {
                    this.obIG = LicenseType.PcqR;
                    break;
                }
                default: {
                    throw new LicenseException(this.xUFT(1));
                }
            }
        }
        this.GyLP(8800536498351690864L);
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
            arrby2 = arrby3 = gIbD.super.PcqR(arrby4);
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

    private static final long QNfW(String string) {
        return Long.parseLong(string.substring(2, 10), 16) << 32 | Long.parseLong(string.substring(10, 18), 16);
    }

    private static final int PcqR(String string) {
        return Integer.parseInt(string.substring(0, 2), 16);
    }

    private static final int xUFT(byte[] arrby) {
        int n = 0;
        for (byte by : arrby) {
            n ^= by;
            n = n << 3 | n >>> 29;
        }
        return n;
    }

    private static final int QNfW(long l) {
        long l2 = 0;
        for (int i = 56; i >= 0; i -= 8) {
            l2 ^= l >>> i & 255;
        }
        return Math.abs((int)(l2 & 255));
    }

    private byte[] QNfW(byte[] arrby) {
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
        arrby = this.PcqR(arrby2);
        return arrby;
    }

    private byte[] PcqR(byte[] arrby) {
        byte[] arrby2 = new byte[arrby.length];
        int n = arrby.length;
        int n2 = 0;
        long l = 0;
        for (int i = 0; i < n; ++i) {
            l <<= 8;
            l |= (long)(arrby[i] & 255);
            if (++n2 != 8) continue;
            l = this.PcqR(l);
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

    private long PcqR(long l) {
        int n = (int)l + this.oVFc;
        int n2 = (int)(l >>> 32) + this.efjz;
        int n3 = n ^ n2;
        int n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.zabk;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.QlPt;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.RldU;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.shaH;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.xFHb;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.WXnh;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.QInw;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.BYsH;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.ldJn;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.IUUl;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.vDXo;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.hpRF;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.IYPr;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.kkyP;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.LBAQ;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.GHHd;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.gAPO;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.MRRB;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.nlJv;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.dgIp;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.fYJz;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.vEFI;
        n3 = n ^ n2;
        n4 = n2 & 31;
        n = (n3 << n4 | n3 >>> 32 - n4) + this.dDPo;
        n3 = n2 ^ n;
        n4 = n & 31;
        n2 = (n3 << n4 | n3 >>> 32 - n4) + this.nnwg;
        return ((long)n2 << 32) + ((long)n & 0xFFFFFFFFL);
    }

    private void GyLP(long l) {
        int n = (int)l;
        int n2 = (int)(l >>> 32);
        int n3 = xZDB;
        int n4 = this.oVFc = n3 << 3 | n3 >>> 29;
        n3 = n + n4;
        int n5 = n4 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = Kddp + (n4 + n5);
        n4 = this.efjz = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = kLTw + (n4 + n5);
        n4 = this.zabk = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = wANZ + (n4 + n5);
        n4 = this.QlPt = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = eGvv + (n4 + n5);
        n4 = this.RldU = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = OyrW + (n4 + n5);
        n4 = this.shaH = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = AhNW + (n4 + n5);
        n4 = this.xFHb = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = fSTT + (n4 + n5);
        n4 = this.WXnh = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = dEyp + (n4 + n5);
        n4 = this.QInw = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = teXl + (n4 + n5);
        n4 = this.BYsH = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = jGCV + (n4 + n5);
        n4 = this.ldJn = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = xkdd + (n4 + n5);
        n4 = this.IUUl = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = acAr + (n4 + n5);
        n4 = this.vDXo = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = uCNg + (n4 + n5);
        n4 = this.hpRF = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = SXwK + (n4 + n5);
        n4 = this.IYPr = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = SVyR + (n4 + n5);
        n4 = this.kkyP = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = yoFQ + (n4 + n5);
        n4 = this.LBAQ = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = GSjU + (n4 + n5);
        n4 = this.GHHd = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = sMOl + (n4 + n5);
        n4 = this.gAPO = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = ufkR + (n4 + n5);
        n4 = this.MRRB = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = AMmv + (n4 + n5);
        n4 = this.nlJv = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = hXue + (n4 + n5);
        n4 = this.dgIp = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = xKlN + (n4 + n5);
        n4 = this.fYJz = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = FoZv + (n4 + n5);
        n4 = this.vEFI = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = Qdko + (n4 + n5);
        n4 = this.dDPo = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = lFFd + (n4 + n5);
        n4 = this.nnwg = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.oVFc + (n4 + n5);
        n4 = this.oVFc = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.efjz + (n4 + n5);
        n4 = this.efjz = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.zabk + (n4 + n5);
        n4 = this.zabk = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.QlPt + (n4 + n5);
        n4 = this.QlPt = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.RldU + (n4 + n5);
        n4 = this.RldU = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.shaH + (n4 + n5);
        n4 = this.shaH = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.xFHb + (n4 + n5);
        n4 = this.xFHb = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.WXnh + (n4 + n5);
        n4 = this.WXnh = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.QInw + (n4 + n5);
        n4 = this.QInw = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.BYsH + (n4 + n5);
        n4 = this.BYsH = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.ldJn + (n4 + n5);
        n4 = this.ldJn = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.IUUl + (n4 + n5);
        n4 = this.IUUl = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.vDXo + (n4 + n5);
        n4 = this.vDXo = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.hpRF + (n4 + n5);
        n4 = this.hpRF = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.IYPr + (n4 + n5);
        n4 = this.IYPr = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.kkyP + (n4 + n5);
        n4 = this.kkyP = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.LBAQ + (n4 + n5);
        n4 = this.LBAQ = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.GHHd + (n4 + n5);
        n4 = this.GHHd = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.gAPO + (n4 + n5);
        n4 = this.gAPO = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.MRRB + (n4 + n5);
        n4 = this.MRRB = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.nlJv + (n4 + n5);
        n4 = this.nlJv = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.dgIp + (n4 + n5);
        n4 = this.dgIp = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.fYJz + (n4 + n5);
        n4 = this.fYJz = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.vEFI + (n4 + n5);
        n4 = this.vEFI = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.dDPo + (n4 + n5);
        n4 = this.dDPo = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.nnwg + (n4 + n5);
        n4 = this.nnwg = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.oVFc + (n4 + n5);
        n4 = this.oVFc = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.efjz + (n4 + n5);
        n4 = this.efjz = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.zabk + (n4 + n5);
        n4 = this.zabk = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.QlPt + (n4 + n5);
        n4 = this.QlPt = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.RldU + (n4 + n5);
        n4 = this.RldU = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.shaH + (n4 + n5);
        n4 = this.shaH = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.xFHb + (n4 + n5);
        n4 = this.xFHb = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.WXnh + (n4 + n5);
        n4 = this.WXnh = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.QInw + (n4 + n5);
        n4 = this.QInw = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.BYsH + (n4 + n5);
        n4 = this.BYsH = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.ldJn + (n4 + n5);
        n4 = this.ldJn = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.IUUl + (n4 + n5);
        n4 = this.IUUl = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.vDXo + (n4 + n5);
        n4 = this.vDXo = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.hpRF + (n4 + n5);
        n4 = this.hpRF = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.IYPr + (n4 + n5);
        n4 = this.IYPr = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.kkyP + (n4 + n5);
        n4 = this.kkyP = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.LBAQ + (n4 + n5);
        n4 = this.LBAQ = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.GHHd + (n4 + n5);
        n4 = this.GHHd = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.gAPO + (n4 + n5);
        n4 = this.gAPO = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.MRRB + (n4 + n5);
        n4 = this.MRRB = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.nlJv + (n4 + n5);
        n4 = this.nlJv = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.dgIp + (n4 + n5);
        n4 = this.dgIp = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n2 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.fYJz + (n4 + n5);
        n4 = this.fYJz = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.vEFI + (n4 + n5);
        n4 = this.vEFI = n3 << 3 | n3 >>> 29;
        n3 = n2 + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.dDPo + (n4 + n5);
        n4 = this.dDPo = n3 << 3 | n3 >>> 29;
        n3 = n + (n4 + n5);
        n5 = n4 + n5 & 31;
        n5 = n3 << n5 | n3 >>> 32 - n5;
        n3 = this.nnwg + (n4 + n5);
        this.nnwg = n3 << 3 | n3 >>> 29;
    }

    static {
        gIbD.QNfW();
        jStv = new String[]{"b241993e8a12c782348e4652cc22c2501d9d6f248e91a3d849275666a0ff7d954fdf638f0d03098c52c4710a5e619b9b09cd6cd027ea3bdb937172b3fdf0bded3d684333798880bb78780f6f6644580409ac882bc021732a", "b241993e8a12c782348e4652cc22c250c30afb881b44ba4dd936c44a573755b5276046dc3ae32e58d10f467421f51ca607b0e29f53cd8f38dd9eee548398b195348e4652cc22c2502feb5f8fd884cb3c9a330ee10954d071", "8a24264c4ae5e5371d663158ccbd75e5a5d70bef5d61291ba3af58b92fe98f7a5c8f83abe09b0c1b3f469d5ad85a3a01e81a2248a290b22d05f52db22eb8b10af10437ddcf2f437b1a519b09a9c4f2c374a882757515e2e2fde238a4eccc62d3fc36d9a77dcbd7cc05236b02716005836b21e58a07330bb18136139263e71a0f79382179978b680a", "96122782ec21d0584881fa8dc6b2ff60585bcafbaeec4bd03874fc7ce730dcb3515b9fb963790219047bf20363167e9967cc1b0851ae39b63d831e55c196a04d7ae5be1b671bedc43b7e8ca175e6d3af2610c3f6b5863d0000ccc9ff3b971946974d3cb7be340cb08475020696df69ac20764f7709cb63e3aac239578db58e85"};
        xZDB = -1209970333;
        Kddp = -1209970333 + -1640531527;
        kLTw = Kddp + -1640531527;
        wANZ = kLTw + -1640531527;
        eGvv = wANZ + -1640531527;
        OyrW = eGvv + -1640531527;
        AhNW = OyrW + -1640531527;
        fSTT = AhNW + -1640531527;
        dEyp = fSTT + -1640531527;
        teXl = dEyp + -1640531527;
        jGCV = teXl + -1640531527;
        xkdd = jGCV + -1640531527;
        acAr = xkdd + -1640531527;
        uCNg = acAr + -1640531527;
        SXwK = uCNg + -1640531527;
        SVyR = SXwK + -1640531527;
        yoFQ = SVyR + -1640531527;
        GSjU = yoFQ + -1640531527;
        sMOl = GSjU + -1640531527;
        ufkR = sMOl + -1640531527;
        AMmv = ufkR + -1640531527;
        hXue = AMmv + -1640531527;
        xKlN = hXue + -1640531527;
        FoZv = xKlN + -1640531527;
        Qdko = FoZv + -1640531527;
        lFFd = Qdko + -1640531527;
    }
}

