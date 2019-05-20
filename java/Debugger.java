package zxf;

public class Debugger {
    public static void main(String[] args) {
      //sleep 1s
      Thread.sleep(1000);

      //ouput log
      System.out.print("hello")
      System.out.println(" davis")

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

      //profile

      //pid In Java 9
      ProcessHandle.current().pid();
    }
}
