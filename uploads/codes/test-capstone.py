#!/usr/bin/env python
# -*- coding: utf-8 -*-
# test capstone python
# python 3.5.4 64bit
# Coded by B.S.
# 2017/08/08
# 8C 60 9F E5 07 10 96 E7 07 20 96 E7
 
from capstone import *
from capstone.arm import *

import binascii
import time
import datetime



def main():
    print ("Python ASM {Capstone The Ultimate Disassembler} 终极反汇编  \r\n")
    print ("Coded by B.S.\r\n")
    localtime = time.localtime(time.time())
    #print ("  Local current time :", localtime)
    print ("  Local current time :", time.asctime(localtime))
    # 当前时间
    curtime = time.strftime("\r\n%Y-%m-%d %H:%M:%S\r\n", time.localtime())
    print (curtime)

    CODE = b"\x8C\x60\x9F\xE5\x07\x10\x96\xE7\x07\x20\x96\xE7"
    CODENOP = b"\x00\x00\xA0\xE3\x00\x00\xA0\xE1\x00\xF0\x20\xE3\x01\x00\xA0\xE3"

    ADDR = 0x1274
    offset = 4198400
    offset1 = 0x1000

    md = Cs(CS_ARCH_ARM, CS_MODE_ARM)
    md1 = Cs(CS_ARCH_ARM, CS_MODE_V8)
    md.detail = True
    print ("======================================================================")
    starttime = datetime.datetime.now()
    for i in md1.disasm(CODE, ADDR):
        print("0x%016lx:\t\t\t%s\t%s" %(i.address, i.mnemonic, i.op_str))
        #print binascii.hexlify(i.bytes)
        print("\t\t  :%s\t\t\t (instruction size:%d)" %(binascii.hexlify(i.bytes), i.size))
    endtime = datetime.datetime.now()
    print ("耗时: %0.2lf秒.\a\r\n"%(endtime - starttime).seconds)
    print ("======================================================================")
    starttime = datetime.datetime.now()
    for ins in md.disasm(CODENOP, offset):
        print("0x%016lx:\t\t\t%s\t%s" %(ins.address, ins.mnemonic, ins.op_str))
        #print binascii.hexlify(ins.bytes)
        print("\t\t  :%s\t\t\t (instruction size:%d)" %(binascii.hexlify(ins.bytes), ins.size))
    endtime = datetime.datetime.now()
    print ("耗时: %0.2lf秒.\a\r\n"%(endtime - starttime).seconds)

if __name__ == '__main__':
    print (u"*"*80) # python 2.17.3 32bit
##    for i in range(0,70):
##        print ("❤", end='') # print ("*", end='')
##    print ()
    main()
