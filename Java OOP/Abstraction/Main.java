import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Class2 obj=new Class2();

        obj.animalSound();
        obj.run();
        obj.animalShape();

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no :");
        int x=input.nextInt();
        obj.fno(x);
        
        System.out.println("Enter the age :");
        int age=input.nextInt();
        if(obj.anmAge(age)==1){
            System.out.println("Adult");
        }
        else{
            System.out.println("Child");
        }
    }
}