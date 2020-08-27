#clean
rm -fr *.class
rm -fr zzz
rm -fr zxf

#编译打包StaticLoader
javac StaticLoader.java
mkdir zzz && mv StaticLoader.class zzz/
jar cvf zzz.jar zzz


#编译Debugger
javac Debugger.java
mkdir zxf && mv Debugger.class zxf/

#Run Debugger by class file
java -cp .:zzz.jar zxf.Debugger

#Run Debugger by executable jar
jar cvfe zxf.jar zxf.Debugger zxf
java -Xbootclasspath/a:./zzz.jar -jar zxf.jar

#包加载路径(编译时、运行时)
N/A

#调试器模式启动
jdb ********

#Profile模式启动
N/A

#Tools
BTrace

#dependency
mvn dependency:tree