package ec.edu.espe.lab18.tools;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * @author TopCoders
 */
public class Circle {
    private float radius;
    private float pi = (float) 3.1416;
    private float perimeter;
    private float area;
    
    public float computePerimeter(float radius)
    {
        if(radius<=0)
        {
            System.out.println("The radius isn't correct");
            System.out.println("This isn't a circle");
            return 0;
        }
        else
        {
            setPerimeter(2*radius*getPi());
            setRadius(radius);
            setPerimeter((float) (Math.round(getPerimeter() * 10000) / 10000d));
            System.out.println("The perimeter is: "+getPerimeter());
            return getPerimeter();
        }
    }

        public float computeArea(float radius){
        if(radius<=0){
            System.out.println("Enter another value");
            return 0;
        }else{
            setArea((getPi() * radius * radius));
            setRadius(radius);
            setArea((float) (Math.round(getArea() * 10000) / 10000d));
            System.out.println("The area is: " + getArea());
        return getArea();
        }
    }
    

     public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    
}
