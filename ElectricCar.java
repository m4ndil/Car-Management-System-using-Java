
/**
 * @author (21039641 Mandil Shrestha)
 * @version (1.0.0)
 */
public class ElectricCar extends Car
{
    // attributes
    private String customerName;
    private int batteryCapacity;
    private int batteryWarranty;
    private String purchaseDate;
    private String range;
    private int rechargeTime;
    private boolean isBought;
    private boolean isSold;
    
    // constructor ElectricCar
    public ElectricCar (int carId, String carName, String carBrand, String carPrice, int batteryCapacity)
    {
        // call constructor of superclass Car
        super(carId, carName, carBrand, carPrice);
        // initialise attributes
        this.batteryCapacity = batteryCapacity;
        this.customerName = "";
        this.batteryWarranty = 0;
        this.purchaseDate = "";
        this.range = "";
        this.rechargeTime = 0 ;
        this.isBought = false;
        this.isSold = false;
    }
    
    // accessor methods
    public String getCustomerName()
    {
        return this.customerName;
    }
    public  int getBatteryCapacity()
    {
        return this.batteryCapacity;
    }
    public  int getBatteryWarranty()
    {
        return this.batteryWarranty;
    }
    public String getPurchaseDate()
    {
        return this.purchaseDate;
    }
    public String getRange()
    {
        return this.range;
    }
    public int getRechargeTime()
    {
        return this.rechargeTime;
    }
    public boolean getIsBought()
    {
        return this.isBought;
    }
    public boolean getIsSold()
    {
        return this.isSold;
    }
    
    // mutator method
    public void setCustomerName(String customerName)
    {
        // boolean value check
        if (isBought == false)
        {
            // assigning new value
            this.customerName = customerName;
        }
        else
        {
            // print output
            System.out.println("Sorry! The customer name cannot be changed as the car is already bought.");
        }
    }
    
    // buy method
    public void buy(String customerName, int batteryWarranty, String purchaseDate, String range, int rechargeTime)
    {  
        // passing parameters 
        this.customerName = customerName;
        this.batteryWarranty = batteryWarranty;
        this.purchaseDate = purchaseDate;
        this.range = range;
        this.rechargeTime = rechargeTime;
        // boolean value check
        if (isBought == false)
        {
            setCustomerName (customerName);
            isBought = true;
        }
        else
        {
            // print output
            System.out.println("Sorry! The car is already bought.");
        } 
    }
    
    // sell method
    public void sell (String customerName)
    {
        // assign new value
        this.customerName = customerName;
        // boolean value check
        if (isSold == false)
        {
            batteryCapacity = 0;
            batteryWarranty = 0;
            purchaseDate = "";
            range = "";
            rechargeTime = 0;
            isSold = true;
            isBought = false;
        }
        else
        {
            // print output
            System.out.println("Oops! The car is already sold.");
        }
    }
        
    // override display method
    @Override
    public void display()
    {
        // call method of superclass Car
        super.display();
        if (isBought == true)
        {
            // print output
            System.out.println("The car-owner name is " + customerName);
            System.out.println("The car battery capacity is " + batteryCapacity + " kilometer.");
            System.out.println("The car battery warranty is " + batteryWarranty + " years.");
            System.out.println("The car purchase date is " + purchaseDate);
            System.out.println("The car range is " +  range);
            System.out.println("The car recharge time is " + rechargeTime);
            }
        }
    }



