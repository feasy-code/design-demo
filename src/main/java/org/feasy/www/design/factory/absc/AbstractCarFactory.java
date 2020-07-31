package org.feasy.www.design.factory.absc;

/**
 * 汽车工厂抽象类
 */
public abstract class AbstractCarFactory {
    /**
     * 生产一辆奥迪汽车
     */
    abstract AbstractCar createAudiCar();
    /**
     * 生产一辆宝马汽车
     */
    abstract AbstractCar createBmwCar();
    /**
     * 生产一辆奔驰汽车
     */
    abstract AbstractCar createBenzCar();
}
