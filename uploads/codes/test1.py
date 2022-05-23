# -*- coding: utf-8 -*-
# capstone-test.py
from capstone import *
from capstone.arm import *

import binascii
import time
import datetime

print (u"*"*80) #print (u"*"*80)
print ("Python ASM {Capstone The Ultimate Disassembler} 终极反汇编\r\n")
print ("Coded by B.S.\r\n")
localtime = time.localtime(time.time())
#print "Local current time :", localtime
print ("Local current time :", time.asctime(localtime))
# 当前时间
curtime = time.strftime("\r\n%Y-%m-%d %H:%M:%S\r\n", time.localtime())
print (curtime)


CODE = b"\x55\x48\x8b\x05\xb8\x13\x00\x00"
CODE1 = b"\x55\x31\xD2\x89\xE5\x8B\x45\x08"
CODENOP = b"\x00\x00\xA0\xE3\x00\x00\xA0\xE1\x01\x00\xA0\xE3"

offset = 4198400
offset1 = 0x1000

md = Cs(CS_ARCH_X86, CS_MODE_64)
md.detail = True


print ("="*80)
starttime = datetime.datetime.now()
for i in md.disasm(CODE1, offset):


    print("0x%016lx:\t\t\t%s\t%s" %(i.address, i.mnemonic, i.op_str))
    #print binascii.hexlify(i.bytes)
    print("\t\t  :%s\t\t\t (instruction size:%d)" %(binascii.hexlify(i.bytes), i.size))
endtime = datetime.datetime.now()
print ("耗时: %0.2lf秒.\a\r\n"%(endtime - starttime).seconds)
