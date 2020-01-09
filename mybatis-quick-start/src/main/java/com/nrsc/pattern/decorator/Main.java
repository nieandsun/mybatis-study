package com.nrsc.pattern.decorator;

import com.nrsc.pattern.factory.PenFactory;
import com.nrsc.pattern.factory.PencilFactory;

/***
 * @author : Sun Chuan
 * @date : 2020/1/8
 * Description：
 */
public class Main {
    public static void main(String[] args) {

        //新建代理商时指定代理什么工厂的笔
        PenFactory pencilProxy = new PensProxy(new PencilFactory());
        PenFactory automaticPenProxy = new PensProxy(new AutomaticPenFactory());

        //卖铅笔
        pencilProxy.salePens("红");

        //卖自动笔
        automaticPenProxy.salePens("蓝");
    }
}
