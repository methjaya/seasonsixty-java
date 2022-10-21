package Java_Loops;

public class WhileLoop {
    public static void main(String[] args) {
        
        //--Examples using While Loop--
        
        //Displaying 1st 10 natural numbers using for Loop.

        int y=1;
        while(y<=10){

            System.out.println(y);
            y++;
        }

        //Displaying an Increasing Star Pattern

        int i=1;
        int j=1; 
        while(i <= 5)  
        {  

            while( j<=i )  
            {  
                System.out.print("*");  
                j++;  
            } 
            System.out.println();   
            i++;  
            j=1;
        }
    
    }

}
