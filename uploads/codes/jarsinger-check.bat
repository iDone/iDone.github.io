@echo off
echo jarsigner -verbose -certs -verify %1 omg-TD-BS-Cr.apk
echo Copy wanfei.jpg/b + 001.txt/a wanfei-1.jpg����001.txt�ؽ�wanfei-1.jpgͼƬ��
echo;
jarsigner -verbose -certs -verify %1
pause