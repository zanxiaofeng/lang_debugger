package zxf;

public class Debugger {
    public static void main(String[] args) throws Exception {
      //sleep 1s
      Thread.sleep(1000);

      //ouput log
      System.out.print("hello");
      System.out.println(" davis");

      //read env virable
      String hostIp = System.getenv("PATH")

      //interrupt

      //run shell
      try {
          Process process = Runtime.getRuntime().exec("env");
          if (process.waitFor(30, TimeUnit.MINUTES)) {
              System.out.println(process.exitValue());
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
      System.out.println(stackTrace);

      //profile

      //read config from external

      //format by template

      //pid In Java 9
      //System.out.print(ProcessHandle.current().pid());

      //thread
      System.out.println(Thread.currentThread());

      //cpu info
      int cores = Runtime.getRuntime().availableProcessors();

      //cpu usage


      //dynamic load

      //proxy

      //host script

      //cwd
      System.out.println(System.getProperty("user.dir"));
    }
}
