import java.util.Scanner;

public class E5_7 {

    public static void main(String[] args) {
        //we make an object from the class Scanner to use its methods
        Scanner in= new Scanner(System.in);
        //this is a print sentence to make the user enter a number and so on...
        System.out.println("Please enter the first number: ");
        //we make a veriable (n1), its integer and so on... 
        int n1= in.nextInt();
        System.out.println("Please enter the second number:");
        int n2= in.nextInt();
        System.out.println("Please enter the third number:");
        int n3= in.nextInt();
        //now we want to compare the three numbers that the user is entered to know if the entered numbers are in order or not...
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
