package org.feasy.www.design.template;

public class Test {
    public static void main(String[] args) {
        AbstractCarFactory whiteCarFactory=new WhiteCarFactory();
        AbstractCarFactory blackCarFactory=new BlackCarFactory();
        // 生产白色汽车
        whiteCarFactory.builderCar();
        // 生产黑色汽车
        blackCarFactory.builderCar();
    }
}
