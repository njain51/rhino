package main.java.collections.main.java.designpatterns.singleton.b;

public class SingleObject {

    //create an object of SingleObject
    // Volatile keyword is used to modify the value of a variable by different threads. It is also used to make classes thread safe.
    // It means that multiple threads can use a method and instance of the classes at the same time without any problem.
    // Addresing first loophole of reflection API
    private static volatile SingleObject instance; //= new SingleObject(); commented instantiation this line to counter object creation via reflection API

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){
        if (instance != null){
            throw new RuntimeException("get your object by getInstance()");
        }
    }

    //Get the only object available
    // Addressing second loophole of object creation via Multi Threading
    public static SingleObject getInstance(){
        if (instance == null){
            // if 2 threads enters here at this point then due to synchronized keyword used, only one thread can go inside and remaining threads will have to wait.
            synchronized (SingleObject.class){
                if(instance==null){
                    instance = new SingleObject();
                }
            }

        }

        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
