package com.nrsc.pattern.decorator;

import com.nrsc.pattern.factory.PenFactory;

/***
 * @author : Sun Chuan
 * @date : 2020/1/8
 * Description: 其实这就是装饰器模式了 --- 铅笔、钢笔、毛笔各种笔的代理商
 * 【注意】 这里要和铅笔工厂、钢笔工厂等各种笔工厂实现一样的接口----PenFactory
 */
public class PensProxy implements PenFactory {

    private PenFactory penFactory;

    /***
     * 只要是笔我都可以代理，由调用者指明我到底代理哪种笔
     * @param penFactory
     */
    public PensProxy(PenFactory penFactory) {
        this.penFactory = penFactory;
    }

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
