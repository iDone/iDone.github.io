#!/usr/bin/python
# -*- coding: UTF-8 -*-

import time
import datetime

def test(Max):
	print "*"*80
	print ("看雪CTF2017第1题\r\nCracked by B.S. For pediy.com CTF2017-1\r\n")
	localtime = time.localtime(time.time())
	#print "Local current time :", localtime
	print "Local current time :", time.asctime(localtime)
	# 当前时间
	curtime = time.strftime("\r\n%Y-%m-%d %H:%M:%S\r\n", time.localtime())
	print (curtime)
	print "*"*80

	starttime = datetime.datetime.now()
	for a in range(Max):
		for b in range(Max):
			if((a - 1.0/5.0) * b * 16.0 == 384.0):
				c = chr(int(str(hex(a + 48)),16))
				d = chr(int(str(hex(b + 48)),16))
				print ("key: 15%s"%c + "%s"%d)
	endtime = datetime.datetime.now()
	print ("耗时: %0.2lf秒.\a\r\n"%(endtime - starttime).seconds)

if __name__ == '__main__':
	test(0xff)
