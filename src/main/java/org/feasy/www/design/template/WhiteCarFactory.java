package org.feasy.www.design.template;

/**
 * 生产白色汽车的工厂
 */
public class WhiteCarFactory extends AbstractCarFactory{
    void coloring() {
        System.out.println("给汽车喷上白色的车漆");
    }
}
