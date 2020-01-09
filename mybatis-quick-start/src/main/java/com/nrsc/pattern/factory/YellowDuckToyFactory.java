package com.nrsc.pattern.factory;

/***
 * @author : Sun Chuan
 * @date : 2020/1/9 10:30
 * Description: 
 */
public class YellowDuckToyFactory implements ToyFactory {

    @Override
    public void saleToys(Integer number) {
        System.err.println("卖" + number + "只小黄鸭");
    }
}
