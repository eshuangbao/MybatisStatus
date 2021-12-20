package com.esb;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-16 15:30
 **/
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host =new Host();
        //代理角色
        ProxyInvocationHandler pih =new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象!
        pih.setRent(host);

        //这里的proxy就是动态生成，我们没有生成
        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();

    }
}
