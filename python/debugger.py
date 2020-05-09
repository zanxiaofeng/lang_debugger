# -*- coding:utf-8 -*-  

#sleep 10s
import time;
time.sleep(10);

#ouput log
print("test");

#read env virable

#interrupt
import pdb;
#程序将主动暂停并进入pdb调试模式，不需要python -m pdb。按c继续运行。
pdb.set_trace();

#run shell
import subprocess;
subprocess.call("env");
#error
#subprocess.call("ls","-al",".");

#get stack info
import traceback;
traceback.print_stack();

#profile
def func_for_profile():
    print("sleepping...........");
    time.sleep(20);
func_for_profile();

#read config from external

#format by template

#current pid
import os;
print("pid: " + str(os.getpid()));

#current process info

#other process info
p = psutil.Process(16031)
p.name()      #进程名
p.exe()         #进程的bin路径
p.cwd()        #进程的工作目录绝对路径
p.status()     #进程状态
p.create_time()  #进程创建时间
p.uids()      #进程uid信息
p.gids()      #进程的gid信息
p.cpu_times()    #进程的cpu时间信息,包括user,system两个cpu信息
p.cpu_affinity()  #get进程cpu亲和度,如果要设置cpu亲和度,将cpu号作为参考就好
p.memory_percent()  #进程内存利用率
p.memory_info()    #进程内存rss,vms信息
p.io_counters()    #进程的IO信息,包括读写IO数字及参数
p.connectios()    #返回进程列表
p.num_threads()  #进程开启的线程数

#thread
import threading;
print(threading.currentThread().name)
print(threading.currentThread().ident)

#cpu info


#cpu usage
import psutil;
print(psutil.cpu_percent())

#dynamic load

#proxy

#host script

#cwd
import os;
print("cwd: " + os.getcwd());

#uuid
import uuid
print(uuid.uuid1())

#byte <-> char encoding
'abc'.encode('utf-8')
b'\x31\x32\x33'.decode('utf-8')

#hex string(1 byte to 2 chars)

#base64 string(3 bytes to 4 chars)

