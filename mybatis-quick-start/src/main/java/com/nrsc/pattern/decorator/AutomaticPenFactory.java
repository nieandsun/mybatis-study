package com.nrsc.pattern.decorator;

import com.nrsc.pattern.factory.PenFactory;

/***
 * @author : Sun Chuan
 * @date : 2020/1/9 10:21
 * Description: 具体实现类，卖自己工厂生产的自动笔
 */
public class AutomaticPenFactory implements PenFactory {
    @Override
    public void salePens(String color) {
        System.err.println("卖" + color + "颜色的自动笔");
    }
}
