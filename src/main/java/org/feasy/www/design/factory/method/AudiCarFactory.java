package org.feasy.www.design.factory.method;

/**
 * 奥迪汽车工厂
 */
public class AudiCarFactory implements CarFactory{

    /**
     * 生产汽车方法
     *
     * @return 汽车对象
     */
    public Car createCar() {
        return new AudiCar();
    }
}
