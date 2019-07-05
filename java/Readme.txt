#编译
javac Debugger.java

#Run by class file
mkdir zxf && mv Debugger.class zxf/
java -cp . zxf.Debugger

#Run by executable jar
mkdir zxf && mv Debugger.class zxf/
jar cvfe zxf.jar zxf.Debugger zxf
java -jar zxf.jar

#包加载路径(编译时、运行时)
N/A

#调试器模式启动
jdb ********

#Profile模式启动
N/A
