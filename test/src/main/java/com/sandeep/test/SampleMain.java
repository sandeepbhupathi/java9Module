package com.sandeep.test;


import com.sandeep.providesmodule.impl.Service;
import com.sandeep.test2.Test2Hello;

import java.lang.reflect.Method;

import static javax.xml.XMLConstants.XML_NS_PREFIX;
public class SampleMain {
    public static void main(String[] args) {
        System.out.println("Sample Java9");
        System.out.println("XML "+XML_NS_PREFIX);
        Test2Hello test2Hello = new Test2Hello();
        System.out.println(test2Hello.getHi());
        checkOpensDirectiveWithReflection();
        checkProvidesWith();
    }


    private static void checkProvidesWith() {
        Service service = Service.getInstance();
        service.printServiceNames();
    }

    private static void checkOpensDirectiveWithReflection() {
        try {
            Class c = Class.forName("com.sandeep.openmodule.OpenModules");
            Method m = c.getMethod("getHiOpens");
            System.out.println(m.invoke(c.getDeclaredConstructor().newInstance()));
        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}
