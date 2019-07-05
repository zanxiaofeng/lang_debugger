# -*- coding:utf-8 -*-  

#sleep 10s
import time;
time.sleep(10);

#ouput log
print("test");

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

#pid
import os;
print("pid: " + str(os.getpid()));

#thread
import threading;
print(threading.currentThread().name)
print(threading.currentThread().ident)

#cwd
import os;
print("cwd: " + os.getcwd());
