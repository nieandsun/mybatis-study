package com.nrsc.pattern.factory;

/***
 * @author : Sun Chuan
 * @date : 2020/1/8
 * Description: 具体实现类，卖自己工厂生产的铅笔
 */
public class PencilFactory implements PenFactory {

    @Override
    public void salePens(String color) {
        System.err.println("卖" + color + "颜色的铅笔");
    }
}
