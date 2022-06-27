package LabPractice;

public class CustomException {
    public void validateAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Invalid age");
        }else {
            System.out.println("Welcome to Vote");
        }
    }

    public static void main(String[] args) {
        CustomException ce = new CustomException();
        try {
            ce.validateAge(18);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

class InvalidAgeException extends Exception{
    InvalidAgeException(String mes){
        super(mes);
    }
}