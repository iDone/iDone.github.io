#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Ctf.pediy.com ctf2017 crackme 2 keygen
# python 3.6.0 32bit
# written by 爱琴海
# 2017/06/14
 
import time
 
def main():
    start_time = time.clock()
    for sn in range(11111111,100000000):
        if check_input(sn) == 1:
            if check_answer(sn,calchash(sn)) == 1:
                print ('found sn:',str(sn)[::-1])
                break
    print ('use time: %.3f second' % (time.clock()-start_time))
    return
 
#校验计算结果，假设输入8位，如果测试更多位数需要对程序做完善，这里图省事
def check_answer(input1,out1):
    input1_str = str(input1)
    out1_str = str(out1)
    count = len(out1_str) // 2
    if len(out1_str) % 2 == 1:
        if out1_str[count] == input1_str[7]:
            if out1_str[0:7] == input1_str[0:7]:
                input1_str = input1_str[::-1]
                if out1_str[10:17] == input1_str[1:8]:
                    return 1
            else:
                return 0
        else:
            return 0
    else:
        return 0
 
#检查输入是否包含0
def check_input(input2):
    input2_str = str(input2)
    count1 = 1
    while count1 <= len(input2_str):
        if input2 % 10 == 0:
            return 0
        else:
            input2 //= 10
        count1 += 1
    return 1
 
#计算用户输入转为十进制之后进行乘法和累加
def calchash(input):
    input_str = str(input)
    calchash1 = input * 9
    calchash2 = 0
    count2 = 1
    while count2 <= len(input_str):
        calchash2 = calchash2 + calchash1 * (input % 10)
        calchash1 *= 10
        input //= 10
        count2 += 1
    calchash2 *= 9
    return calchash2
 
if __name__=="__main__":
    main()