package com.nrsc.pattern.staticproxy;

import com.nrsc.pattern.factory.PenFactory;

/***
 * @author : Sun Chuan
 * @date : 2020/1/8
 * Description: 静态代理模式 --- 调用专一的代理商
 */
public class Main {
    public static void main(String[] args) {

        //生成代理商
        PenFactory specificProxy = new SpecificProxy();

        //代理商卖铅笔
        specificProxy.salePens("红");
    }
}
