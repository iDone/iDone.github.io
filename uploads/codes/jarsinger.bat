@echo off
echo ���  ����:δ�ṩ -tsa �� -tsacert, �� jar û��ʱ��������û��ʱ���, ����ǩ����֤��ĵ������� (2117-05-29) ���Ժ���κγ�������֮��, �û������޷���֤�� jar��
echo jarsigner -verbose -digestalg SHA1 -sigalg MD5withRSA -tsa http://tsa.safecreative.org/ -keystore BS.keystore -storepass 123456 -signedjar test_signed.apk test.apk BS
echo Copy wanfei.jpg/b + 001.txt/a wanfei-1.jpg����001.txt�ؽ�wanfei-1.jpgͼƬ��
echo;

jarsigner -verbose -keystore BS.keystore -storepass android -signedjar test_signed.apk autologin.apk BS

rem jarsigner -verbose -digestalg SHA1 -sigalg MD5withRSA -tsa http://tsa.safecreative.org/ -keystore BS.keystore -storepass android -signedjar test_signed.apk autologin.apk BS

pause