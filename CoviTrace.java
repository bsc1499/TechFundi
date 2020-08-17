import java.util.*;

//Compiler version JDK 11.0.2

class CoviTrace
{  
    public CoviTrace(){
        
        
    }
    
    public void lastLocation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("last location?");
        String lastLocation = sc.nextLine();
    }
    public void Virus(){
        Scanner pc = new Scanner(System.in);
       String  p = "1";
       String  n = "2";
         System.out.println("virus status?");
        System.out.println("1 for positive, 2 for negative");
        State =pc.nextInt();
    }
    public int Notify(){
        int ar[] = new int[1];
       if (ar[0]==1){
           System.out.println(phoneID);
       }else{
           System.exit(0);
       }
        return State;
    }
  public static void main(String args[])
  {  
      CoviTrace app = new CoviTrace();
      app.lastLocation();
      app.Virus();
      app.Notify();
  }
    private int State; 
    private static final double phoneID;
}
