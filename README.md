# Apache Dubbo (incubating) Project

### `Dubbo`源码思路梳理

- `Dubbo SPI`

  入口：ExtensionLoader.getExtension(String name)

- `Adaptive`

  入口：ExtensionLoader.getAdaptiveExtension()

- 服务导出`export`

  入口：ServiceConfig.export()

- 服务引入`getProxy`

  入口：ReferenceBean.get()

- 服务调用`InvokerInvocationHandler.invoke`

  入口：InvokerInvocationHandler.invoke(Object proxy, Method method, Object[] args)

- 服务降级`MockClusterInvoker`

  入口：MockClusterInvoker.invoker(Invocation invocation)

- `Provider`接收消息并响应结果

  入口：NettyServerHandler.channelRead(ChannelHandlerContext ctx, Object msg)

- `Consumer`接收`Provider`响应结果

  入口：NettyClientHandler.channelRead(ChannelHandlerContext ctx, Object msg)

- `Dubbo`调用异步变同步

  入口：DubboInvoker.doInvoke(final Invocation invocation)

- `Dubbo`协议编解码

  入口：NettyCodecAdapter.InternalEncoder/NettyCodecAdapter.InternalDecoder



### `Dubbo`架构图

![img](https://qqadapt.qpic.cn/txdocpic/0/5a0cabaa8310c461d870886bab3548e4/0)



### `Dubbo`调用链

![img](https://qqadapt.qpic.cn/txdocpic/0/f4e70ed26115711826c91cb0152e6a20/0)

1、proxy:服务引用（代理对象，调用InvokerInvocationHandler）

2、filter:服务降级 MockClusterInvoker

3、Cluster Invoker:服务容错 FailoverCluster

4、Directory: 服务目录 RegistryDirectory

5、LoadBalance: 负载均衡 RandomLoadbalance

6、Filter: 扩展点：监听、过滤、统计、异常、超时....

7、Protocol Invoker: 服务引用 DubboInvoker

8、Client: 网络通信 NettyClient

9、Codec: 编解码

10、Serizlization : 序列化

11、ThreadPool: 请求接收处理线程池 ExecutorService  

12、Server:网络通信 NettyServer

13、Exporter: 维护服务端的远程接口Invoker  DubboExporter

14、Filter: 扩展点：监听、过滤、统计、异常、超时

15、Invoker: 服务包装 AbstractProxyInvoker

16、Implement： 服务方法 

