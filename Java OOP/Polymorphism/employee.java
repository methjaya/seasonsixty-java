import java.util.Scanner;
public class employee {
    protected void getDetails()
    {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter employee age :");
        int age= input.nextInt();

        System.out.print("Enter employee name :");
        String name= input.next();

        System.out.println("employee Name :"+name+"\nemployee Age : "+age);
    }
}
