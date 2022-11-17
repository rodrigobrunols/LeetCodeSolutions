package org.lab.solutions.threads;

public class MyClass2 extends Thread{
    private String name;
    private MyObject2 myObject;

    public MyClass2(MyObject2 myObject, String name) {
        this.name = name;
        this.myObject = myObject;
    }

    @Override
    public void run() {
        if(name.equals("1")){
            MyObject2.foo(name);
        } else if (name.equals("2")) {
            MyObject2.bar(name);
        }

    }

    public static void main(String[] args) {
        MyObject2 myObject1 = new MyObject2();
        MyObject2 myObject2 = new MyObject2();

        //referencias diferentes de myobject threads executam o metodo foo() ao mesmo tempo.
        //com a mesma referencia o metodo é executado por uma thread de cada vez
        MyClass2 thread1 = new MyClass2(myObject1, "1");
        MyClass2 thread2 = new MyClass2(myObject2, "2");

        thread1.start();
        thread2.start();


    }
}
