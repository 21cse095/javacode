import java.util.Scanner;
public class bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account obj = new Account("abcd","kushi");
        Account obj1 = new Account("xyzq","riya",20000);
        obj.getid();
        obj.getname();
        obj1.getid();
        obj1.getname();
        obj1.getbalance();
        Scanner b = new Scanner(System.in);
        System.out.println("ENTER amount :");
        int amount = b.nextInt();
        System.out.println("1.credit"+" "+"2.debit"+" "+"3.transferto");
        System.out.println("ENTER choice :");
        int choice = b.nextInt();
        switch(choice){
            case 1:
                obj1.credit(amount);
                break;
            case 2:
                obj1.debit(amount);
                break;
            case 3:
                obj1.transferto("xyzq",amount);
                break;
            default:
                System.out.println("invalid choice");
                break;
            }
    System.out.print(obj1);
    }

}
class Account{
   String id="";
   String name="";
   int balance = 0;
   Account(String id,String name){
     this.id=id;
     this.name=name;
    }
   Account(String id,String name,int balance){
      this.id=id;
      this.name=name;
      this.balance=balance;
   }
   String getid()
   {
       return id;
   }
   String getname()
   {
       return name;
   }
   int getbalance()
   {
       return balance;
   }
   int credit(int amount){
       balance = balance+amount;
       return balance;
   }
   int debit(int amount){
       if(amount<=balance){
           balance = balance-amount;
       }
       else{
          System.out.println("Amount exceeded balance");
        }
        return balance;
   }
   int transferto(String Account,int amount){
        if(amount<=balance){
           balance=balance+amount;
       }
       else{
          System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString(){
        return "id="+id+"\n"+"name="+name+"\n"+"balance="+"\n"+balance;
    }

   }






 