@echo off
@echo ==================
@echo ��ʼ����IP......
@echo ==================
@rem echo on
:: �Զ���ȡIP
@echo �Զ���ȡDNS......
::netsh interface ip set address name="��������" source=dhcp
:: ���þ�̬IP
@echo ���þ�̬IP......
netsh interface ip set address name="��������" source=static address=9.236.40.71 mask=255.255.255.192 gateway=9.236.40.126 gwmetric=1
@echo;
@echo ==================
@echo ��ʼ����DNS......
@echo ==================
:: �Զ���ȡDNS
@echo �Զ���ȡDNS......
netsh interface ip set dnsservers name="��������" source=dhcp
@echo �����DNS......
netsh interface ip add dnsservers name="��������" address=9.236.5.3  index=1
@echo ��Ӹ�DNS......
netsh interface ip add dnsservers name="��������" address=202.96.128.166  index=2
:: ���þ�̬DNS
@echo �޸�����ע����DNS......
netsh interface ip set dnsservers name="��������" source=static address=9.236.5.3  register=primary
@echo,

@echo off
@echo ==================
@echo IP��DNS�������!!!
@echo ==================

@pause
@exit
