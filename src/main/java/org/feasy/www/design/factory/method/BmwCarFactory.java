package org.feasy.www.design.factory.method;

/**
 * 宝马汽车工厂
 */
public class BmwCarFactory implements CarFactory{

    /**
     * 生产汽车方法
     *
     * @return 汽车对象
     */
    public Car createCar() {
        return new BmwCar();
    }
}
