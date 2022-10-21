 package Java_Loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        
            //--Examples using While Loop--
        
        //Displaying 1st 10 natural numbers using for Loop.

        int j=1;

        do{
            System.out.println(j);
            j++;
        }while(j<=10);

        //Displaying an Increasing Star Pattern

        int x=0;
        int y=0;
        int z;
        do
        {
            y=1;z=x+1;
            do
            {
                System.out.print("*");
                y++;
            }while(y<=z);
            System.out.println();
           x++;
        }while(x<=5);


    }
}
