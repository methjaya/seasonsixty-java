package Java_Loops;


public class ForLoop {
    public static void main(String[] args) {

              //--Examples using For Loop--
        
        //Displaying 1st 10 natural numbers using for Loop. 

        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }

        //Displaying an Increasing Star Pattern 

        for(int a=0;a<5;a++)
        {
            for(int b=0;b<=a;b++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        
        
        
      
        
    }
}