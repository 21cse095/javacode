package application;
import application1.GradeException;
import java.util.*;
public class TestGrade 
{
public static void main(String args[])
 throws Exception
 {
  Scanner input = new Scanner(System.in);
int[] ids = {11,12,13,14,15,16,17,18,19,20};
char[] grades = new char[10];
String inString, outString = "";
System.out.println("GRADES :\n"+"A\n"+"B\n"+"C\n"+"D\n"+"F");
for (int y = 0; y < ids.length; ++y) 
{
System.out.println("Enter grade for student id number: " + ids[x]);
inString = input.next();
grades[y] = inString.charAt(0);
try
{
if(grades[y] != 'A' && grades[y] != 'B' && grades[y] != 'C' &&

grades[y] != 'D' && grades[y] != 'F'&& grades[y] !='I')

throw (new GradeException(grades[y]));
}

catch(GradeException e)
{
    grades[y]='I';
    System.out.println("INVALID GRADE");
}
}
for (int y = 0; y < ids.length; ++y)
    outString = outString + "ID : " + ids[y] + " Grade : " +
grades[y] + "\n";
System.out.println(outString);
}
}

