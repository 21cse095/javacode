import java.util.*;
public class PhoneNumberFormat {
    public static void main(String[] args) {
     Scanner obj=new Scanner(System.in);
     String phonenumber= "";
     String cphonenumer="";
     while(true)
    {
    System.out.println("Enter phone number: ");
    phonenumber=obj.nextLine();
         if(phonenumber.equalsIgnoreCase("999"))
          System.exit(0);
         if(phonenumber.length() < 10)
System.out.println("Invalid phone number .");
else {
cphonenumber+= "(" + phonenumber.substring(0, 3)+ ")" + phonenumber.substring(3, 6)+"-"+phonenumber.substring(6, phonenumber.length());
System.out.println(cphonenumber);
 }
 }
 }
 }
