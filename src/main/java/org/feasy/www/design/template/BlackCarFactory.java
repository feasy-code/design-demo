package org.feasy.www.design.template;

/**
 * 生产黑色汽车的工厂
 */
public class BlackCarFactory  extends AbstractCarFactory{
    void coloring() {
        System.out.println("给汽车喷上黑色的车漆");
    }
}
