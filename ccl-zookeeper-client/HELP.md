# **主要特性**
[官网]:https://zookeeper.apache.org/doc/r3.5.5/zookeeperOver.html
CP原则
监听通知机制
数据存在内存,大小在0-1kb之间
读写性能比大概是10:1
临时节点:创建znode的会话处于活动状态,这些znode就存在
作为协议协议的一部分，来自客户端的所有写请求都被转发到称为领导者的单个服务器。其余的ZooKeeper服务器（称为跟随者）从领导者接收消息建议并同意消息传递。消息传递层负责替换出现故障的领导者，并将跟随者与领导者同步。
只需不到200毫秒即可选出新的领导者
## **保证**
顺序一致性-来自客户端的更新将按照发送的顺序应用。
原子性-更新成功或失败。没有部分结果。
单个系统映像-无论客户端连接到哪个服务器，客户端都将看到相同的服务视图。
可靠性-应用更新后，此更新将一直持续到客户端覆盖更新为止。
及时性-确保系统的客户视图在特定时间范围内是最新的。

# **节点**
PERSISTENT-持久化目录节点
PERSISTENT_SEQUENTIAL-持久化顺序编号目录节点
EPHEMERAL-临时目录节点
EPHEMERAL_SEQUENTIAL-临时顺序编号目录节点

# **文件目录**
![avatar](img/文件目录.jpg)