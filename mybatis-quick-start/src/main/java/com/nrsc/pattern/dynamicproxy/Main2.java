package com.nrsc.pattern.dynamicproxy;

import com.nrsc.pattern.factory.PenFactory;
import com.nrsc.pattern.factory.PencilFactory;
import com.nrsc.pattern.factory.ToyFactory;
import com.nrsc.pattern.factory.YellowDuckToyFactory;

/***
 * @author : Sun Chuan
 * @date : 2020/1/9
 * Description :
 */
public class Main2 {
    public static void main(String[] args) {

        //新建代理商公司
        DynamicProxyCompany dynamicProxyCompany = new DynamicProxyCompany();

        //指定代理商公司具体要代理的工厂
        dynamicProxyCompany.setTarget(new PencilFactory());
        //由代理商公司找到具体的笔代理人  --- 将代理对象强转为PenFactory,因为如果不强转的话生成的代理类将是一个Object对象,
        //                           --- 而Object对象只有equals()、hashCode()、toString()等几个方法，无法调用卖笔的方法
        //                           --- 这应该就是为什么JDK的动态代理为什么需要被代理的对象必须至少实现一个接口的原因
        PenFactory pencilFactoryProxy = (PenFactory) dynamicProxyCompany.getProxyInstance();
        //具体的笔代理人卖笔
        pencilFactoryProxy.salePens("红");


        //指定代理商公司具体要代理的工厂
        dynamicProxyCompany.setTarget(new YellowDuckToyFactory());
        //由代理商公司找到具体的玩具代理人
        ToyFactory toyFactory = (ToyFactory) dynamicProxyCompany.getProxyInstance();
        //具体的玩具代理人卖玩具
        toyFactory.saleToys(10000);
    }
}
