package org.feasy.www.design.factory.simple;

public class Test {
    /**
     * 简单工厂模式实例
     */
    public static void main(String[] args) {
        // 小明跟汽车厂说，想要一台奥迪
        Car audiCar=CarFactory.createCar("Audi");
        audiCar.run();
        // 小明突然又想要一台宝马
        Car bmwCar=CarFactory.createCar("Bmw");
        bmwCar.run();
    }
}
