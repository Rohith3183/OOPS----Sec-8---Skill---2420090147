package Skill1;
import java.util.*;
public class Student
{
    public static void main(String[] args)
    {
     
        long roll_no = 2420090147l;     
        String name = "Rohith";  
        float marks = 9F;          
        char gender = 'M';             
        boolean hasPassed = marks >= 40.0F;   
        

        System.out.printf("Roll Number : %d%n", roll_no);
        System.out.printf("Name : %s%n", name);
        System.out.printf("Marks : %.2f%n", marks);
        System.out.printf("Gender : %c%n", gender);
        System.out.printf("Status : %s%n", hasPassed ? "Pass" : "Fail");
        
    }
}
