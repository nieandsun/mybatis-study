package com.nrsc.pattern.staticproxy;

import com.nrsc.pattern.factory.PenFactory;
import com.nrsc.pattern.factory.PencilFactory;

/***
 * @author : Sun Chuan
 * @date : 2020/1/8
 * Description: 静态代理 -------专一的代理商
 * 【注意】 这里要和铅笔工厂实现一样的接口----PenFactory
 */
public class SpecificProxy implements PenFactory {
    /***这辈子只做铅笔的代理*/
    private PenFactory penFactory = new PencilFactory();

    @Override
    public void salePens(String color) {
        beforeEnhance();
        penFactory.salePens(color);
        afterEnhance();
    }

    private void beforeEnhance() {
        System.out.println("在卖笔之前对市场进行调研。。。。");
    }


    private void afterEnhance() {
        System.out.println("卖了一段时间的笔之后，对市场进行总结评估");
    }
}
