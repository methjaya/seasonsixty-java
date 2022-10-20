import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        encapdata en=new encapdata();
        //getting an user input value for radius
        System.out.println("Enter value for rad :");
        en.setrad(input.nextDouble());

        //getting the area
        System.out.println("Area is : "+en.getarea());
        //getting the Circumference 
        System.out.println("Circumference is : "+en.getcir());


    }
}