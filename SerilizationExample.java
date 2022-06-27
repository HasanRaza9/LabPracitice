package LabPractice;

import java.io.*;

public class SerilizationExample {
    public static void main(String[] args) throws IOException{
        String path = "D://Hasan Raza//Weekend.ser";
        Student obj = new Student(101, 25, "Chaitanya", "Agra", 6);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
           fos = new FileOutputStream(path);
           oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            System.out.println("Serialization done");

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            oos.close();
            fos.close();
        }
        Student s = null;
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            s = (Student) ois.readObject();
            fis.close();
            ois.close();

        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("Student Name:"+s.getStuName());
        System.out.println("Student Age:"+s.getStuAge());
        System.out.println("Student Roll No:"+s.getStuRollNum());
        System.out.println("Student Address:"+s.getStuAddress());
        System.out.println("Student Height:"+s.getStuHeight());

    }
}

class Student implements Serializable {
    private int stuRollNum;
    private int stuAge;
    private transient String stuName;
    private String stuAddress;
    private transient int stuHeight;  //

    public int getStuRollNum() {
        return stuRollNum;
    }

    public void setStuRollNum(int stuRollNum) {
        this.stuRollNum = stuRollNum;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public int getStuHeight() {
        return stuHeight;
    }

    public void setStuHeight(int stuHeight) {
        this.stuHeight = stuHeight;
    }

    public Student(int stuRollNum, int stuAge, String stuName, String stuAddress, int stuHeight) {
        this.stuRollNum = stuRollNum;
        this.stuAge = stuAge;
        this.stuName = stuName;
        this.stuAddress = stuAddress;
        this.stuHeight = stuHeight;
    }
}