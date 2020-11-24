package isa.utm;

import isa.utm.GeometricBody.Cub;
import isa.utm.GeometricBody.GeometricBody;
import isa.utm.GeometricBody.Parallelepiped;
import isa.utm.GeometricBody.Sphere;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<GeometricBody> bodies = new ArrayList<GeometricBody>();
        GeometricBodyController bodyController = new GeometricBodyController();

        bodies.add(new Cub(4));
        bodies.add(new Sphere(2.75f));
        bodies.add(new Parallelepiped(5, 5, 3));

        GeometricBody biggestSurface = bodyController.getBiggestSurface(bodies);
        GeometricBody biggestVolume = bodyController.getBiggestVolume(bodies);

        println("Biggest Volume : " +
                biggestVolume.getClass().getSimpleName() + " : " +
                biggestVolume.getVolume());
        println("Biggest Surface : " +
                biggestSurface.getClass().getSimpleName() + " : " +
                biggestSurface.getSurface());



        /*
        class Circle extends Figure {
            public Circle(double radius) {
                super.perimeter = 2 * Math.PI * radius;
                super.area = Math.PI * radius * radius;
            }
        }
        */
    }

    private static void println(Object o) {
        System.out.println(o.toString());
    }
}
