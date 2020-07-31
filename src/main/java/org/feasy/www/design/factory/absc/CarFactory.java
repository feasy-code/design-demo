package org.feasy.www.design.factory.absc;


/**
 * 汽车生产工厂接口
 */
public interface CarFactory {
    /**
     * 生产汽车方法
     * @return 汽车对象
     */
    AbstractCar createCar(String version);
}
