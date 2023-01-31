public class Car {
    // class attributes
    private String  make;
    private String model;
    private int year;
    private String color;
    private double price;

    // class methods

    /*
    * It's the first constructor : It initializes attributes with default values
    * */
    public Car(){
        make = "make";
        model ="XXX";
        year = 0;
        color = "black";
        price = 0.0;
    }

    /*
     * It's the second constructor : It initializes make, model and year attributes with parameter values
     * */
    public Car(String make, String model,  int year){
        this(); // call first constructor
        this.make = make;
        this.model = model;
        this.year = year;
    }

    /*
    * It's the second constructor : It initializes all attributes with parameter values
    * */
    public Car(String make, String model,  int year, String color, double price){
        this(make,model,year);
        this.color = color;
        this.price = price;
    }

    /*
    * Display cars informations
    * @param : empty
    * @returns: void
    * */
    public void displayCarInfo(){
        System.out.println("Make: "+make+"\nModel: "+model+"\nColor: "+color+"\nYear: "+year+"\nColor: "+color+"\nPrice: "+price);
    }

    public static void main(String[] args){
        // creation car objet
        Car car = new Car("Toyota","360",2000,"Red",1500000);

        // display information
        car.displayCarInfo();
    }
}

