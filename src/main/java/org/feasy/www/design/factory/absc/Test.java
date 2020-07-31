package org.feasy.www.design.factory.absc;

public class Test {
    public static void main(String[] args) {
        WhiteCarFactory whiteCarFactory=new WhiteCarFactory();
        BlackCarFactory blackCarFactory=new BlackCarFactory();
        // 生产一辆白色奥迪汽车
        AbstractCar whiteAudiCar=whiteCarFactory.createAudiCar();
        whiteAudiCar.run();
        // 生产一辆黑色奥迪汽车
        AbstractCar blackAudiCar=blackCarFactory.createAudiCar();
        blackAudiCar.run();
        // 生产一辆白色宝马汽车
        AbstractCar whiteBmwCar=whiteCarFactory.createBmwCar();
        whiteBmwCar.run();
        // 生产一辆黑色宝马汽车
        AbstractCar blackBmwCar=blackCarFactory.createBmwCar();
        blackBmwCar.run();
        // 生产一辆白色奔驰汽车
        AbstractCar whiteBenzCar=whiteCarFactory.createBenzCar();
        whiteBenzCar.run();
        // 生产一辆黑色奔驰汽车
        AbstractCar blackBenzCar=blackCarFactory.createBenzCar();
        blackBenzCar.run();
    }
}
