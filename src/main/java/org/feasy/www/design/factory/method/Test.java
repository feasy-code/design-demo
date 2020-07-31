package org.feasy.www.design.factory.method;


public class Test {
    /**
     * 方法工厂模式实例
     */
    public static void main(String[] args) {
        // 生产奥迪汽车
        CarFactory audiCarFactory=new AudiCarFactory();
        Car audiCar=audiCarFactory.createCar();
        audiCar.run();
        // 生产宝马汽车
        CarFactory bmwCarFactory=new BmwCarFactory();
        Car bmwCar=bmwCarFactory.createCar();
        bmwCar.run();
        // 生产奔驰汽车
        CarFactory benzCarFactory=new BenzCarFactory();
        Car benzCar=benzCarFactory.createCar();
        benzCar.run();
    }
}
