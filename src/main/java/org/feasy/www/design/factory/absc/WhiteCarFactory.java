package org.feasy.www.design.factory.absc;

/**
 * 生产白色汽车工厂
 */
public class WhiteCarFactory extends AbstractCarFactory{
    /**
     * 生产一辆白色奥迪汽车
     */
    AbstractCar createAudiCar() {
        return new WhiteAudiCar();
    }

    /**
     * 生产一辆白色宝马汽车
     */
    AbstractCar createBmwCar() {
        return new WhiteBmwCar();
    }

    /**
     * 生产一辆白色奔驰汽车
     */
    AbstractCar createBenzCar() {
        return new WhiteBenzCar();
    }
}
