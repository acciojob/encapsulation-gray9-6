package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
        /*
        System.out.println(rwOnly.name = "ajay");
        // error :- java: name has private access in com.driver.RWOnly
         */
        rwOnly.setName("Ajay");

        System.out.println(rwOnly.getName());
    }
}