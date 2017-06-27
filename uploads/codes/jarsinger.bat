@echo off
echo 解决  警告:未提供 -tsa 或 -tsacert, 此 jar 没有时间戳。如果没有时间戳, 则在签名者证书的到期日期 (2117-05-29) 或以后的任何撤销日期之后, 用户可能无法验证此 jar。
echo jarsigner -verbose -digestalg SHA1 -sigalg MD5withRSA -tsa http://tsa.safecreative.org/ -keystore BS.keystore -storepass 123456 -signedjar test_signed.apk test.apk BS
echo Copy wanfei.jpg/b + 001.txt/a wanfei-1.jpg（把001.txt藏进wanfei-1.jpg图片）
echo;

jarsigner -verbose -keystore BS.keystore -storepass android -signedjar test_signed.apk autologin.apk BS

rem jarsigner -verbose -digestalg SHA1 -sigalg MD5withRSA -tsa http://tsa.safecreative.org/ -keystore BS.keystore -storepass android -signedjar test_signed.apk autologin.apk BS

pause