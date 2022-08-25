import java.util.Scanner;
public class marksheet
{
    public static void main(String[] args)
    {

    avg a = new avg();
    System.out.println("THE STUDENT MARK DETAILS ARE....");
    a.display();

    }
}
class avg{
    void display(){
        int n, total = 0, avg,m;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of subject:");
        n = s.nextInt();
        int marks[] = new int[n];
        System.out.print("Enter no. of students :");
        m = s.nextInt();
        for(int j =1;j<=m;j++){
            System.out.println("student"+j+" marks:");

            System.out.println("Enter marks out of 100:");
            for(int i = 0; i < n; i++)
            {
                marks[i] = s.nextInt();
                total = total + marks[i];
            }  
            avg = total / n;
            System.out.println("....RESULT....");
            System.out.println("Total:"+total);
            System.out.println("average:"+avg);
            total =0;
    }
    }

}
