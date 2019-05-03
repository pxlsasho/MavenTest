import oop.animals.MammalInt;
import oop.cars.ACar;
import oop.cars.BmwX6;
import oop.cars.BmwX6mod;
import oop.figures.Circle;
import oop.figures.Rectangle;

public class Main {

    public static void main(String[] args) {

      /*  Circle circle = new Circle(34);
        Rectangle rectangle = new Rectangle(10,20);

        System.out.println("The area of circle:" + circle.getArea());
        System.out.println("The area of rect:" + rectangle.getArea());
*/

        ACar carX6 = new BmwX6( );
        carX6.carRides( );

        ACar carX6mod = new BmwX6mod();
        carX6mod.carRides();






//        MammalInt m = new MammalInt();
//        m.eat();
//        m.travel();
    }
}
