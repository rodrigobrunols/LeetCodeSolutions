package org.lab.solutions.threads;

public class MyClass extends Thread{
    private String name;
    private MyObject myObject;

    public MyClass(MyObject myObject,String name) {
        this.name = name;
        this.myObject = myObject;
    }

    @Override
    public void run() {
        myObject.foo(name);
    }

    public static void main(String[] args) {
        MyObject myObject1 = new MyObject();
        MyObject myObject2 = new MyObject();

        //referencias diferentes de myobject threads executam o metodo foo() ao mesmo tempo.
        //com a mesma referencia o metodo é executado por uma thread de cada vez
        MyClass myClass1 = new MyClass(myObject1, "1");
        MyClass myClass2 = new MyClass(myObject1, "2");

        myClass1.start();
        myClass2.start();


    }
}
