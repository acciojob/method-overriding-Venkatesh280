package com.driver;

 public class Main {
   static  class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
       static  class B extends A{
            @Override
            public String meth(){
                return "Invoking method from class B";
            }
        }

        public static void main(String args[]){
            B obj=new B();
            System.out.println(obj.meth());

        }
    }
  
