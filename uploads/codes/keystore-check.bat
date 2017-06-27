echo keytool -list -keystore debug.keystore -v
echo;
keytool -list -keystore %1 -v
pause