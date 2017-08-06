#!/usr/bin/python
#coding:utf-8

import gmpy2
import time
import datetime

N = gmpy2.mpz(0x6248BC3AB92A33B000FDB88568F19727F92F79EB68FF6AD73203EFD20A3E331BE941C7AA288095F33BC4B255FD983114D480EFFBEE2E313E6218A57F9CCC8189)
d = gmpy2.mpz(0x2476A7F02588913F228923E1F36F963F29708C07B117396817A6B94C336FC77FF7D381925EB40CFED8FBE894570155E41569B4EC69B26CB0320105A29651CB4B)
e = gmpy2.mpz(0x1)




if __name__ == '__main__':

    # SN: F552B38DBDDE72E2E693B2AED5C769C0DCB3DA83534480A80E652FFE53544CD91A18C3
    print "*"*80
    print "看雪CTF2017第10题\r\n"
    print "Cracked by B.S. For pediy.com CTF2017-10\r\n"
    localtime = time.localtime(time.time())
    #print "Local current time :", localtime
    print "Local current time :", time.asctime(localtime)
    # 当前时间
    curtime = time.strftime("\r\n%Y-%m-%d %H:%M:%S\r\n", time.localtime())
    print (curtime)
    print "*"*80

    starttime = datetime.datetime.now()
    while e < 0x1000000:
        e = e +1
        kfi = gmpy2.mul(e,d)-1
        k = gmpy2.div(kfi,N)

        if kfi%(k+1) == 0:      
            x = 1-kfi/(k+1)+N
            if x > 0 and x < 0x100000000000000000000000000000000000000000000000000000000000000000:
                print 'e:' + hex(e).upper()
                print 'x:' + hex(x).upper()
                continue;


    #X2 = gmpy2.mul(x,x)
    #N4 = gmpy2.mul(N,4)
    #delta = gmpy2.sub(X2,N4)

    delta_root = gmpy2.mpz(0x23c4ffb7dff4f383202beb418be684edaad4c1838af43e9ea0a731d0ea495f00)
    print 'delta_root:' + hex(delta_root).upper()
    fenzi = gmpy2.add(x,delta_root)
    fenzi2 = gmpy2.sub(x,delta_root)
    p1 = gmpy2.div(fenzi,2)
    p2 = gmpy2.div(fenzi2,2)
    print 'p1:' + hex(p1).upper() 
    print 'p2:' + hex(p2).upper()
    
    endtime = datetime.datetime.now()
    print ("耗时: %0.2lf秒.\a\r\n"%(endtime - starttime).seconds)