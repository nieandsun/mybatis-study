package com.nrsc.pattern.dynamicproxy;

import com.nrsc.pattern.factory.PenFactory;
import com.nrsc.pattern.factory.PencilFactory;

import java.lang.reflect.Proxy;

/***
 * @author : Sun Chuan
 * @date : 2020/1/9 16:42
 * Description: 
 */
public class Main1 {

    public static void main(String[] args) {
        //新建铅笔工厂类
        PenFactory pencilFactory = new PencilFactory();
        //新建InvocationHandler的具体实现类 --- 对该类的解释请看下面的注释
        NrscInvocationHandler nrscInvocationHandler = new NrscInvocationHandler();
        nrscInvocationHandler.setTarget(pencilFactory);

        /***
         * 第一个参数为类加载器 ---- 传入的是【被代理类】所用的类加载器，因为这样生成的代理类就可以代理【被代理类】了
         *
         * 第二个参数为【被代理类】实现的所有接口
         *    ---Proxy.newProxyInstance(...)方法的返回值类型为Object，而Object对象只有equals()、hashCode()、
         *    ----toString()等几个方法，代理类如果想代理【被代理类】的方法，肯定就得强转为和【被代理类】一样的类型
         *    ---凭什么可以随便强转呢??? 就是因为Proxy生成的代理对象其实也实现了和【被代理对象】一样的接口，
         *    ---而这些接口就是通过该参数传递给Proxy的
         *    ---其实这也是为什么JDK进行动态代理，必须要求【被代理类】必须至少实现一个接口的原因
         *
         * 第三个参数为InvocationHandler的具体实现类:
         *    ----这个对象里封装了真正的【被代理对象】，以及对【被代理对象】方法的具体调用，当然在方法调用前后，我们可以对其进行增强
         *    ----Proxy在创建具体的代理对象的时候既然需要这个对象，那它创建出来的具体的代理对像肯定会使用这个对象，怎么使用呢???
         *    ----其实很简单，就是当你拿到代理对象时(这个代理对象肯定是已经强转为具体类型的对象了)，
         *    ----可以直接按照【代理的那个对象】原有的方法调用方式进行法调用，但是呢，我既然是一个代理对象，
         *    ----肯定不会让你直接调用【代理的那个对象】的方法，而是调用创建代理对象时传入的InvocationHandler对象的invoke(...)方法。
         */
        PenFactory penFactoryProxy = (PenFactory) Proxy.newProxyInstance(
                pencilFactory.getClass().getClassLoader(),
                pencilFactory.getClass().getInterfaces(),
                nrscInvocationHandler);


        /****
         * 可以按照PenFactory的方法调用方式进行方法调用，但是真正走的是nrscInvocationHandler中的invoke(...)方法
         */
        penFactoryProxy.salePens("蓝");

    }
}