#运行程序
python3 <script>.py

#包加载路径(运行时)
sys.path

#调试器模式启动
python3 -m pdb <script>.py
#启动后程序暂停在第一行，按c继续，按Ctol+c暂停
#暂停后输入where或者bt列出栈信息

#Profile模式启动
python3 -m profile <script>.py
