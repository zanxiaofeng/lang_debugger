package main;

import "os";
import "log";
import "fmt";
import "time";
import "os/exec";
import "runtime/debug"

func main(){
  //sleep 1s
  time.Sleep(time.Duration(1)*time.Second)

  //ouput log
  print("hello")
  println(" davis")

  //interrupt

  //run shell
  out, err := exec.Command("env").Output()
	if err != nil {
	   log.Fatal(err)
	}
	fmt.Printf("The env is %s\n", out)

  out, err = exec.Command("ls","-al",".").Output()
	if err != nil {
	   log.Fatal(err)
	}
	fmt.Printf("The files is %s\n", out)

  //get stack info
  debug.PrintStack();

  //profile

  //read config from external

  //format by template

  //pid
  fmt.Printf("The pid is %d\n", os.Getppid())

  //goruntine

  //cpu usage

  //cwd
  dir, err := os.Getwd()
	if err != nil {
		log.Fatal(err)
	}
  fmt.Println(dir)
}
