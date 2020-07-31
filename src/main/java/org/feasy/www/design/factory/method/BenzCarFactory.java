package org.feasy.www.design.factory.method;

/**
 * 奔驰汽车工厂
 */
public class BenzCarFactory implements CarFactory{

    /**
     * 生产汽车方法
     *
     * @return 汽车对象
     */
    public Car createCar() {
        return new BenzCar();
    }
}
