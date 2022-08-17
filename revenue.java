import java.util.Scanner;
public class revenue {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER UNIT PRICE:");
        int price = obj.nextInt();
        System.out.println("ENTER QUANTITY:");
        int quantity = obj.nextInt();
        int rev = price * quantity;
        System.out.println("THE REVENUE FROM THE SALE :"+ rev);
        if(quantity>=100 & quantity<=120){
            int p = (rev*10)/100;
            System.out.println("AFTER DISCOUNT :" +p);
        }
        else if(quantity>120){
            int p = (rev*15)/100;
            System.out.println("AFTER DISCOUNT :" +p);
        }
        else{
            int p = rev;
            System.out.println("AMOUNT : "+ p);
        }
       
    }
}