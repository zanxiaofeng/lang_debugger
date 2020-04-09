package zxf;

import java.util.Arrays;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;

public class Debugger {
    public static void main(String[] args) throws Exception {
      //sleep 1s
      Thread.sleep(1000);

      Class.forName("zzz.StaticLoader",false, Debugger.class.getClassLoader());

      //ouput log
      System.out.print("hello");
      System.out.println(" davis");

      //read env virable
      String path = System.getenv("PATH");
      System.out.println("path: " + path);

      //interrupt

      //run shell
      try {
          Process process = Runtime.getRuntime().exec("env");
          if (process.waitFor(30, TimeUnit.MINUTES)) {
              System.out.println("exit code: " + process.exitValue());
          } else {
              System.out.println("Timeout");
          }
      } catch (Exception ex) {
          ex.printStackTrace();
      }

      //out, err = exec.Command("ls","-al",".").Output()
      //if err != nil {
      //   log.Fatal(err)
      //}
      //fmt.Printf("The files is %s\n", out)

      //get stack info
      StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
      Arrays.stream(stackTrace).forEach(System.out::println);

      //profile

      //read config from external

      //format by template

      //pid In Java 9
      //System.out.print(ProcessHandle.current().pid());

      //thread
      System.out.println("Thread: " + Thread.currentThread());

      //hostname
      System.out.println("HostName: " + InetAddress.getLocalHost().getHostName());

      //cpu info
      int cores = Runtime.getRuntime().availableProcessors();
      System.out.println("cores: " + cores);

      //cpu usage


      //dynamic load

      //proxy

      //host script

      //cwd
      System.out.println("user.dir: " + System.getProperty("user.dir"));
    }
}
