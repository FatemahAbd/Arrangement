import java.util.Scanner;

public class E5_7 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int n1= in.nextInt();
        System.out.println("Please enter the second number:");
        int n2= in.nextInt();
        System.out.println("Please enter the third number:");
        int n3= in.nextInt();
        if(n1>=n2){
            if(n2>=n3){
                System.out.println("in order");
            }
        }
        else if(n1<=n2){
            if(n2<=n3){
                System.out.println("in order");
            }
        }
        else{
            System.out.println("not in order"); 
        }     
        
    }
    
}
