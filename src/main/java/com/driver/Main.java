package com.driver;

 public class Main {
    class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
        class B extends A{
            @Override
            public String meth(){
                return "Inoking method from class B";
            }
        }

        public static void main(String args[]){
            B obj=new B();
            System.out.println(obj.meth());

        }
    }
  
