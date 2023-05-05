public class MyClass {
    // instance variables
    private int var1;
    private String var2;
    private double var3;

    // static variable
    private static int numInstances = 0;

    // constructor
    public MyClass(int var1, String var2, double var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        numInstances++; // increment static variable
    }

    // static method
    public static int getNumInstances() {
        return numInstances;
    }
}