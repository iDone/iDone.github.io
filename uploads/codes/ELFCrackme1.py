#!/usr/bin/env python
# -*- coding: utf-8 -*-
# ElfCrackMe1.py

v6=[0x0EF, 0x0C7, 0x0E9, 0x0CD, 0x0F7, 0x8B, 0x0D9,
    0x8D, 0x0BF, 0x0D9, 0x0DD, 0x0B1, 0x0BF, 0x87,
    0x0D7, 0x0DB, 0x0BF]

L=[]
for i in range(17):
    num = (v6[i] - 1)/2
    ans = chr(int(num))
    L.append(ans)


flag = ''.join(L)
flag+='0823}'

print("SN: %s" %flag)
