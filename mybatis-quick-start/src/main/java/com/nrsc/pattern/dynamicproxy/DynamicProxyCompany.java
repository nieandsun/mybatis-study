package com.nrsc.pattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/***
 * @author : Sun Chuan
 * @date : 2020/1/9
 * Description :
 */
public class DynamicProxyCompany implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /***
     * 这里的this就是指的当前的InvocationHandler
     * @return
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeEnhance();
        //通过反射调用被代理对象的具体方法
        //【联系静态代理模式和装饰器模式】--这里调用的方法肯定是被代理对象的方法 -- 即实际的工厂里的方法
        Object res = method.invoke(target, args);
        afterEnhance();
        return res;
    }

    private void beforeEnhance() {
        System.out.println("卖东西之前对市场进行调研。。。。");
    }

    private void afterEnhance() {
        System.out.println("卖了一段时间之后，对市场进行总结评估");
    }
}
