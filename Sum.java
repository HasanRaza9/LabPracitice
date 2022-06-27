package LabPractice;
//Step 3.8.3: Writing a program in Java to demonstrate the uses of polymorphism
public class Sum {
    public int sum(int x,int y){
        return (x+y);
    }
    public int sum(int x,int y ,int z){
        return (x+y+z);
    }
    public double sum(double x,double y){
        return (x+y);
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.sum(10, 20));
        System.out.println(sum.sum(10, 20, 30));
        System.out.println(sum.sum(10.5, 20.5));
    }
}
