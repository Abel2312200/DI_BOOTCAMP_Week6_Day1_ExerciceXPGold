public class Circle {

    // class attributes
    private double radius ;

    // class Methods

    /*
    * It's a first constructor : It's initialize the attributes values with default values
    * */
    public Circle(){
        radius = 1;
    }

    /*
     * It's the second constructor : It's initialize the attributes values with a parameter value
     * */
    public Circle(double radius){
        if(radius <= 0.0)
            radius = 1;
        else
            this.radius = radius;
    }

    /*
    * Returns the radius value
    * @param : empty
    * @returns :
    * - radius : double
    * */
    public double getRadius() {
        return radius;
    }

    /*
     * Returns the area value of circle
     * @param : empty
     * @returns :
     * - area : double
     * */
    public  double areaCircle(){
        return (radius*radius*Math.PI);
    }

    public void displayInfo(){
        System.out.println("radius: "+radius+"\n area circle: "+this.areaCircle());
    }

    public static void main(String[] args){
        // creation circle objects
        Circle circle1 = new Circle(2.0);
        Circle circle2 = new Circle(20);
        Circle circle3 = new Circle(24);

        // display informations : radius and area
        System.out.println("Circle 1");
        circle1.displayInfo();

        System.out.println("Circle 1");
        circle2.displayInfo();

        System.out.println("Circle 1");
        circle3.displayInfo();
    }
}
