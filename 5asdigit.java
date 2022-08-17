import java.util.Scanner;

class count {
  
  public static void main(String[] args) {
    
     Scanner obj = new Scanner(System.in);
       
 System.out.println("ENTER THE SIZE:");
      
  int n = obj.nextInt();
      
  int result = 0;
      
  for(int i = 0;i<=n;i++){
     
       if (i%10 == 5){
           
    System.out.println("c = " + i);
    
           result++;
            
     
   }
         
      
  }
       
 System.out.println("Count = " + result);  
 
    }

}