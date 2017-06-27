#!/bin/bash
# Coded by B.S.
# wwww.appleos.xyz
# www.allin1.xyz
#
echo;
echo "Charles Patcher"
echo " by B.S. "
echo "❤ www.appleos.xyz"
echo "❤ www.allin1.xyz"
echo;
echo "FileName: $0, Pid: $$"
DATE=`date`
echo "Date is $DATE"
USERS=`who | wc -l`
echo "Logged in user are $USERS"
UP=`date ; uptime`
echo "Uptime is $UP"

charles=/Applications/Charles.app/Contents/Java/charles.jar
dir=charlesbs

mkdir $dir
cd $dir
echo "I Am Working......"
echo "Work @ $dir"

cat >> psPJ.java <<EOF
/*
 * Decompiled with CFR 0_121.
 * Coded by B.S.
 */
package com.xk72.charles;

public final class psPJ {
	public static boolean qIvM() { return true; }
	public static String tCiz() { return "B.S. - Multi-Site License\\r\\n♥ [http://www.appleos.xyz/]"; }
	public static String qIvM(String name, String key) { return null; }
}
EOF
echo "javac -encoding UTF-8 *.java -d . && jar -uvf (*^__^*)"
javac -encoding UTF-8 psPJ.java -d .&& jar -uvf $charles com/xk72/charles/psPJ.class
echo "rm -rf *"
read -p "Press any key & return to continue." var1
cd .. && rm -rf $dir
echo "Catch you later!"
