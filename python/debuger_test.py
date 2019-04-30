import time

def func_a():
  print("in function a")

def func_b():
  print("in function b")

def func_c():
  print("in function c")

def func_d():
  print("in function d")
  counter = 0
  while True:
    func_e(counter)
    counter += 1

def func_e(counter):
    print("in function e " + str(counter))
    time.sleep(.2)

def main():
    func_a()
    func_b()
    func_c()
    func_d()
    func_e

main()
