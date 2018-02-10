package com.sandeep.test;


import com.sandeep.test2.Test2Hello;

import static javax.xml.XMLConstants.XML_NS_PREFIX;
public class SampleMain {
    public static void main(String[] args) {
        System.out.println("Sample Java9");
        System.out.println("XML "+XML_NS_PREFIX);
        Test2Hello test2Hello = new Test2Hello();
        System.out.println(test2Hello.getHi());
    }
}
