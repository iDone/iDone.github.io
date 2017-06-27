echo keytool -genkey -alias °®Òùµ´ -keyalg RSA -validity 36500 -keystore 2017-100.keystore
echo;
keytool -genkey -keystore BS.keystore -alias BS -storepass android -keypass android -keyalg RSA -keysize 2048 -validity 36500 -dname "CN='B.S.', OU='www.appleos.xyz', O='baidu-tencent-alibaba', L='SZ', ST='GD', C='CN'"
pause
keytool -list -keystore BS.keystore -v
pause