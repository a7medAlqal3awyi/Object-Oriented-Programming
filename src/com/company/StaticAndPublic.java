package com.company;

public class StaticAndPublic {

        // i will build public method ==>i must create object to call it
        public void myPublicMethod() {
            System.out.println("Iam public Method ");
        }


        // i will build static method ==> static methods can be called without creating objects
        static void myStaticMethod() {
            System.out.println("Iam static Method ");
        }


        public static void main(String[] args) {
            myStaticMethod();
            // myPublicMethod();  cause compile error because it not static and must create object to call
            StaticAndPublic obj=new  StaticAndPublic();
            obj.myPublicMethod();


        }


}
