@echo off
@echo ==================
@echo 开始设置IP......
@echo ==================
@rem echo on
:: 自动获取IP
@echo 自动获取DNS......
::netsh interface ip set address name="本地连接" source=dhcp
:: 设置静态IP
@echo 设置静态IP......
netsh interface ip set address name="本地连接" source=static address=9.236.40.71 mask=255.255.255.192 gateway=9.236.40.126 gwmetric=1
@echo;
@echo ==================
@echo 开始设置DNS......
@echo ==================
:: 自动获取DNS
@echo 自动获取DNS......
netsh interface ip set dnsservers name="本地连接" source=dhcp
@echo 添加主DNS......
netsh interface ip add dnsservers name="本地连接" address=9.236.5.3  index=1
@echo 添加副DNS......
netsh interface ip add dnsservers name="本地连接" address=202.96.128.166  index=2
:: 设置静态DNS
@echo 修改设置注册主DNS......
netsh interface ip set dnsservers name="本地连接" source=static address=9.236.5.3  register=primary
@echo,

@echo off
@echo ==================
@echo IP和DNS设置完毕!!!
@echo ==================

@pause
@exit
