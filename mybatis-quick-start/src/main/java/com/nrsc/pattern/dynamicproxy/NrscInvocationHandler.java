package com.nrsc.pattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/***
 * @author : Sun Chuan
 * @date : 2020/1/9
 * Description :
 */
public class NrscInvocationHandler implements InvocationHandler {

    /***
     * 被代理的对象 --- 其实该对象是真正提供服务的对象
     *            --- 如同装饰器模式一样，这个类并不真正干活，它其实主要做的任务是卖东西之前的市场调查和卖东西之后的市场评估
     *            --- 真正的卖东西这个事，它其实是调用的被代理对象的服务
     */
    private Object target;


    public void setTarget(Object target) {
        this.target = target;
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
