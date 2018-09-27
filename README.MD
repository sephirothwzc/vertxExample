## 常用命令
启动  

    java -jar vertxExample-1.0-SNAPSHOT.jar
    
端口查询    

    lsof -i:8099
    
端口杀死    

    kill -9 [PID]

## 官方注意
1. 请注意：一般情况下，用了Vert.x的Verticle之后，原则上synchronized，Lock，volatile，static对象，java.util.concurrent, HashTable, Vector, Thread, Runnable, Callable, Executor, Task, ExecutorService等这些并发和线程相关的东西就不再需要使用了，可以由Verticle全面接管，如果您不得不在Vert.x代码中使用上述内容，则多少暗示着您的设计或者使用Vert.x的姿势出现了问题，建议再斟酌商榷一下