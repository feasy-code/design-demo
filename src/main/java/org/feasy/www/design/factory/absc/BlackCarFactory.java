package org.feasy.www.design.factory.absc;

/**
 * 生产黑色汽车工厂
 */
public class BlackCarFactory extends AbstractCarFactory{
    /**
     * 生产一辆黑色奥迪汽车
     */
    AbstractCar createAudiCar() {
        return new BlackAudiCar();
    }

    /**
     * 生产一辆黑色宝马汽车
     */
    AbstractCar createBmwCar() {
        return new BlackBmwCar();
    }

    /**
     * 生产一辆黑色奔驰汽车
     */
    AbstractCar createBenzCar() {
        return new BlackBenzCar();
    }
}
