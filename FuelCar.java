
/**
 * @author (21039641 Mandil Shrestha)
 * @version (1.0.0)
 */
public class FuelCar extends Car
{
    // attributes
    private String distributorName;
    private String fuelType;
    private int numberOfSeats;
    private String bookedDate;
    private String purchaseDate;
    private int mileage;
    private String transmissionType;
    private boolean isPurchased;
    
    // constructor FuelCar
    public FuelCar(int carId, String carName, String carBrand, String carPrice, String fuelType, int numberOfSeats, int mileage)
    {
        //call constructor of superclass
        super(carId, carName, carBrand, carPrice);
        // initialise attributes
        this.distributorName = "";
        this.bookedDate = "";
        this.purchaseDate = "";
        this.transmissionType = "";
        this.isPurchased = false;
        this.fuelType = fuelType;
        this.numberOfSeats = numberOfSeats;
        this.mileage = mileage;
    }
    
    // accessor methods
    public String getDistributorName()
    {
        return this.distributorName;
    }
    public String getFuelType()
    {
        return this.fuelType;
    }
    public int getNumberOfSeats()
    {
        return this.numberOfSeats;
    }
    public String getBookedDate()
    {
        return this.bookedDate;
    }
    public String getPurchaseDate()
    {
        return this.purchaseDate;
    }
    public int getMileage()
    {
        return this.mileage;
    }
    public String getTransmissionType()
    {
        return this.transmissionType;
    }
    public boolean getIsPurchased()
    {
        return this.isPurchased;
    }
    
    // mutator methods
    public void setDistributorName( String distributorName)
    {
        this.distributorName = distributorName;
    }
    public void setTransmissionType(String transmissionType)
    {
        this.transmissionType = transmissionType;
    }
    
    // purchase method
    public void purchase(String purchaseDate, String bookedDate)
    {
        // passing parameters
        this.purchaseDate = purchaseDate;
        this.bookedDate = bookedDate;
        // boolean value check
        if ( isPurchased == true)
        {
            // call method of superclass Car and input value
            super.setCarColor ("purple");
            // call method of superclass Car
            super.display();
            // display output
            System.out.println("The car distributor name is " + distributorName);
        }
        else
        {
            // call method of FuelCar class and input value
            setTransmissionType ("Automatic");
            setDistributorName ("JoJo Wheels Pvt Ltd");
            isPurchased = true;
        }
    }
    // override display method
    @Override
    public void display()
    {
        // call method of superclass Car
        super.display();
        // boolean value check
        if( isPurchased == true )
        {
            // print output
            System.out.println("The car distributor is " + distributorName);
            System.out.println("The car fuel type is " + fuelType );
            System.out.println("The car purchased date is " + purchaseDate);
            System.out.println("The car booked date is " + bookedDate);
            System.out.println("The car mileage is " + mileage + " kilometers.");
            System.out.println("The number of seats in the car is " + numberOfSeats);
            System.out.println("The car transmission type is " + transmissionType);
        }
    }
}
