package zxf;

public class Debugger {
    public static void main(String[] args) throws Exception {
      //sleep 1s
      Thread.sleep(1000);

      //ouput log
      System.out.print("hello");
      System.out.println(" davis");

      //interrupt

      //run shell
      Process process = Runtime.getRuntime().exec("env");

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

      //cpu usage

      //cwd
      System.out.println(System.getProperty("user.dir"));
    }
}
