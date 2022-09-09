import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21cse095
 */
public class school {
    public static void main(String[] args){
        person obj = new student();
        System.out.print("STUDENT DETAILS : ");
        obj.getdata();
        obj.display();
        person obj1 = new faculty();
        System.out.print("FACULTY DETAILS : ");
        obj1.getdata();
        obj1.display();
       
    }
   
}
abstract class person{
    abstract void getdata();
    abstract void display();
}
class student extends person{

   
    String name;
    int aadhar;
    int n, total = 0, avg;

    void getdata(){
       
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name:");
        name = s.next();
        System.out.print("Enter aadhar number:");
        aadhar = s.nextInt();
        System.out.print("Enter no. of subject:");
        n = s.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100:");
            for(int i = 0; i < n; i++)
            {
                marks[i] = s.nextInt();
                total = total + marks[i];
            }  
            avg = total / n;
         }
     void display() {
            System.out.println("....DETAILS....");
            System.out.println("Name:"+name);
            System.out.println("aadharno:"+aadhar);
            System.out.println("total:"+total);
            System.out.println("average:"+avg);
   
    }
}
class faculty extends person{
    String name;
    int aadhar;
    int id;
    String dept;
    int Salary;
    void getdata() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name:");
        name = s.next();
        System.out.print("Enter aadhar number:");
        aadhar = s.nextInt();
        System.out.print("Enter ID:");
        id = s.nextInt();
        System.out.print("Enter department:");
        dept = s.next();
        System.out.print("Enter Salary:");
        Salary = s.nextInt();
     }
    void display() {
        System.out.println("....DETAILS....");
        System.out.println("Name:"+name);
        System.out.println("aadharno:"+aadhar);
        System.out.println("id:"+id);
        System.out.print("department:"+dept);
        System.out.println("salary:"+Salary);
    }
   
   
}