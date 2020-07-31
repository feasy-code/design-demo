package org.feasy.www.design.factory.simple;

/**
 * 汽车生产工厂
 */
public class CarFactory {
    /**
     * 生产汽车方法
     *
     * @param carType 生产什么品牌的汽车
     * @return 汽车对象
     */
    public static Car createCar(String carType) {
        if (carType.equals("Audi")) {
            return new AudiCar();
        } else if (carType.equals("Bmw")) {
            return new BmwCar();
        } else {
            return null;
        }
    }
}
