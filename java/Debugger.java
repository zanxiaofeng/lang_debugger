package zxf;

import java.util.Arrays;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;
import java.awt.*;
import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

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

      //IPs
      Enumeration e = NetworkInterface.getNetworkInterfaces();
      while(e.hasMoreElements())
      {
          NetworkInterface n = (NetworkInterface) e.nextElement();
          Enumeration ee = n.getInetAddresses();
          while (ee.hasMoreElements())
          {
              InetAddress i = (InetAddress) ee.nextElement();
              System.out.println(i.getHostAddress());
          }
      }

      //cpu info
      int cores = Runtime.getRuntime().availableProcessors();
      System.out.println("cores: " + cores);

      //cpu usage


      //dynamic load

      //proxy

      //host script
      ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");
      Bindings bindings = engine.createBindings();
      bindings.put("a", 3600);
      bindings.put("b", 14);
      bindings.put("c", 4);
      try {
          Object d = engine.eval("a * b * c", bindings);
          System.out.println(d);
      } catch (ScriptException e) {
          e.printStackTrace();
      }

      //cwd
      System.out.println("user.dir: " + System.getProperty("user.dir"));

      //font && font-family
      GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
      Font[] fonts = e.getAllFonts();
      System.out.println("(name, family, isBold, isItalic, isPlain)");
      for (int i = 0; i < fonts.length; i++) {
          System.out.println(String.format("(%s, %s, %s, %s, %s)", fonts[i].getFontName(), fonts[i].getFamily(), fonts[i].isBold(), fonts[i].isItalic(), fonts[i].isPlain()));
      }

      String[] fontFamilyNames = e.getAvailableFontFamilyNames();
      for (int i = 0; i < fontFamilyNames.length; i++) {
          System.out.println(fontFamilyNames[i]);
      }
    }

    public static String getIP() throws SocketException {
        for(Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements();) {
          NetworkInterface inetf = en.nextElement();
          for(Enumeration<InetAddress> enumIpAddr = inetf.getInetAddresses(); enumIpAddr.hasMoreElements();) {
             InetAddress inetAddress = enumIpAddr.nextElement();
             if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                return inetAddress.getHostAddress();
             }
          }
        }
        return null;
    }
}
