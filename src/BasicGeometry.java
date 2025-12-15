import java.util.Scanner;

public class BasicGeometry {
    public static void main (String[] args){
        //Circumference=2*Math.PI*radius
        double circumference;
        double radius;
        double area;
        double volume;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius=input.nextDouble();

        circumference=2*Math.PI*radius;
        System.out.println("The circumference: "+circumference);

        //area=Math.PI*Math.pow(radius,2)
        System.out.print("Enter the radius: ");
        radius=input.nextDouble();

        area=Math.PI*Math.pow(radius,2);
        System.out.println("The area: "+area);

        //volume=(4/3)*Math.PI*Math.pow(radius,3)
        System.out.print("Enter the radius: " );
        radius=input.nextDouble();

        volume=(4/3)*Math.PI*Math.pow(radius,3);
        System.out.println("The volume: "+volume);

        input.close();
    }
}
