import java.util.Scanner;

public class manager extends employee{

    //overriding the getDetails method
    @Override
    protected void getDetails()
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter manager age :");
        int age= input.nextInt();

        System.out.print("Enter manager name :");
        String name= input.next();

        System.out.println("manager Name :"+name+"\nmanager Age : "+age);
    }
}
