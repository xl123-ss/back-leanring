package com.xxx.controller.t04参数传递到页面;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月08日 19:33
 */
public class T {
    static class A {
        void say(){
            System.out.println("A");
        }
    }

    static class B extends A{
        @Override
        void say() {
            System.out.println("B");
        }
    }

    static void say(A a){
        a.say();
    }

    public static void main(String[] args) {
        A a = new B();
        say(a);
    }
}
