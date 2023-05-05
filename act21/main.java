public class Main {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(1, "foo", 1.23);
        MyClass obj2 = new MyClass(2, "bar", 4.56);

        System.out.println("obj1 instances: " + obj1.getNumInstances());
        System.out.println("obj2 instances: " + obj2.getNumInstances());
        System.out.println("MyClass instances: " + MyClass.getNumInstances());
    }
}
