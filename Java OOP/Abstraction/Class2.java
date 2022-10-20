import java.util.Scanner;
public class Class2 implements Class1{
    @Override
    public void animalSound() {
        System.out.println("Sound.");
    }

    @Override
    public void run() {
        System.out.println("Run.");
    }

    @Override
    public void animalShape() {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the color :");
        String x=input.next();
        System.out.println("Color: "+x);
    }

    @Override
    public void fno(int x) {
        System.out.println("No : "+x);
    }

    @Override
    public int anmAge(int y) {
        if(y<5)
            return 0;
        else
            return 1;
    }
}
