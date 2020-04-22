# **redis**
[官网]:http://www.redis.cn/documentation.html
##命令

##redis 管道和脚本

##redis 订阅
subscribe
unsubscribe
psubscribe 
punsubscribe

##redis Lua脚本
EVAL和EVALSHA
如果服务器还记得给定的 SHA1 校验和所指定的脚本，那么执行这个脚本 如果服务器不记得给定的 SHA1 校验和所指定的脚本，那么它返回一个特殊的错误，提醒用户使用 EVAL 代替 EVALSHA 以下是示例
ep.eval "return redis.call('set',KEYS[1],'bar')" 1 foo
脚本缓存

##内存