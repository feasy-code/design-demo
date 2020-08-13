package org.feasy.www.design.template;

import java.util.List;

/**
 * 汽车工厂
 */
public abstract class AbstractCarFactory {
    void createFrame(){
        System.out.println("制造汽车框架");
    }
    void installComponent(){
        System.out.println("安装零件");
    }
    abstract void coloring();
    void over(){
        System.out.println("汽车制造完毕");
    }
    void builderCar(){
        // 1. 制造汽车框架
        createFrame();
        // 2. 安装汽车零件
        installComponent();
        // 3. 汽车喷漆，上色
        coloring();
        // 4. 汽车制造完毕
        over();
    }
}
