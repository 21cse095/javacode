import java.util.Scanner;
class bill {
    public static void main(String[] args) {
        SuperMarket obj = new SuperMarket();
        System.out.println(".........SUPER MARKET BILL........");
        obj.calculateBill();
        obj.display();
        Restaurant obj1 = new Restaurant();
        System.out.println(".........RESTAURANT BILL........");
        obj1.calculateBill();
        obj1.display();
    }
}
interface printable{
    void calculateBill();//considers as public abstract void calculateBill();
    void display();
}
class SuperMarket implements printable{
    String name;
    String Customerid;
    int n;
    String pname;  
    int qty;  
    int price;  
    int totalprice;  
    int amount=0,discount,total,gst,pay_amount;
    public void calculateBill(){
        Scanner a = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF PRODUCTS:");
        n = a.nextInt();
        for(int i =1;i<=n;i++){
            System.out.println("ENTER PRODUCTNAME:");
            pname = a.next();
            System.out.println("ENTER QUANTITY:");
            qty = a.nextInt();
            System.out.println("ENTER PRICE:");
            price = a.nextInt();
            totalprice = price * qty;
            amount = amount+totalprice;
        }
        discount = amount*2/100; 
        total = amount - discount;
        gst=amount*12/100;  
        pay_amount = total+gst;
    }
    public void display(){
        System.out.println("..............BILL..............");
        System.out.println("AMOUNT : "+amount);
        System.out.println("DISCOUNT : "+discount);
        System.out.println("TOTAL : "+total);
        System.out.println("GST : "+gst);
        System.out.println("AMOUNT TO BE PAID : "+pay_amount);
        System.out.println("THANK YOU FOR SHOPPING :)");
        
    }
}
class Restaurant implements printable{
        int amount=0;
        int price,qty;
        String order="";
        String dname;
        int n,totalprice;
        
        public void calculateBill(){ 
            Scanner a = new Scanner(System.in);
            System.out.println("ENTER NUMBER OF PERSONS:");
            n = a.nextInt();
            for(int i =1;i<=n;i++){
                System.out.println("ENTER DISHNAME:");
                dname = a.next();
                System.out.println("ENTER QUANTITY:");
                qty = a.nextInt();
                System.out.println("ENTER RATE:");
                price = a.nextInt();
                totalprice = price * qty;
                order=order.concat(dname+"  "+totalprice+"\n");
                amount = amount+totalprice;
            }
        }       
            
        public void display(){   
            System.out.println("..............BILL..............");
            System.out.println("YOUR ORDERS ARE:\n"+order);
            System.out.println("YOUR BILL AMOUNT="+amount);
            System.out.println("THANK YOU :)");
    }
    
}