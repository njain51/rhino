package main.java.collections.main.java.designpatterns.singleton.a;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();
        SingleObject object1 = SingleObject.getInstance();

        //show the message
        object.showMessage();
        System.out.println(object);
        System.out.println(object1);
    }
}
