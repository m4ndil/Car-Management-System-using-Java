
/**
 * @author (21039641 Mandil Shrestha)
 * @version (1.0.0)
 */
public class Car
{
    // attributes
    private int carId;
    private String carName;
    private String carBrand;
    private String carColor;
    private String carPrice;
    
    // constructor Car
    public Car(int carId, String carName, String carBrand, String carPrice)
    {
        // initialise attributes
        this.carId = carId;
        this.carName = carName;
        this.carBrand = carBrand;
        this.carPrice = carPrice;
        this.carColor = "";
    }

    // accessor methods
    public int getCarId()
    {
        return this.carId; 
    }
    public String getCarName()
    {
        return this.carName; 
    }
    public String getCarBrand()
    {
        return this.carBrand; 
    }
    public String getCarPrice()
    {
        return this.carPrice; 
    }
    public String getCarColor()
    {
        return this.carColor; 
    }
    
    // mutator method
    public void setCarColor(String color)
    {
        this.carColor = color;
    }
    
    // display method
    public void display()
    {
        // print output
        System.out.println("The car Id is " + carId);
        System.out.println("The car name is " + carName);
        System.out.println("The car brand is " + carBrand);
        System.out.println("The price of the car is " + carPrice);
        
        if (carColor == "")
        {
           System.out.println("The color of the car is empty"); 
        }
        else
        {
            System.out.println("The color of the car is " + carColor);
        }
        
    }
}
