
/**
 * @author (21039641 Mandil Shrestha)
 * @version (1.0.0)
 */
//declare  package to use components
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class GUI_Demo
{
    private JFrame frame;
    //two panels for frmae
    private JPanel fPanel, ePanel;
    //labels for title
    private JLabel mLabel1, mLabel2;
    
    //components for fuel car
    private JLabel fID, fName, fBrand, fPrice, fFuelType, fNumOfSeats, fMileage;
    private JLabel fID2, fName2, fBrand2, fColor, fTrnsType, fDisbtrName, fPurDate, fBookDate, fl;
    
    private JTextField fIDTxt, fNameTxt, fBrandTxt, fPriceTxt, fFuelTypeTxt, fNumOfSeatsTxt, fMileageTxt;
    private JTextField fID2Txt, fName2Txt, fBrand2Txt, fColorTxt, fTrnsTypeTxt, fPurDateTxt, fBookDateTxt, fDisbtrNameTxt;
    
    private JComboBox fPurYearCom, fPurMonthCom, fPurDayCom, fBookYearCom, fBookMonthCom, fBookDayCom;
    
    private JButton fAddBtn, fPurBtn, fDisplayBtn;

    //components for electric car
    private JLabel eID, eName, eBrand, ePrice, eBatteryCap;
    private JLabel eID2, eName2, eBrand2, ePrice2, eColor, eCustomerName, eBatteryWarrenty, eRange, eRechargeTime, ePurDate, l;
    
    private JTextField eIDTxt, eNameTxt, eBrandTxt, ePriceTxt, eBatteryCapTxt;
    private JTextField eID2Txt, eName2Txt, eBrand2Txt, ePrice2Txt, eColorTxt, eCustomerNameTxt, eBatteryWarrentyTxt, eRangeTxt, eRechargeTimeTxt;
    
    private JComboBox ePurYearCom, ePurMonthCom, ePurDayCom;
    
    private JButton eAddBtn, eBuyBtn, eSellBtn, eDisplayBtn;
    //clear button 
    private JButton clearBtn;

    //ArrayList
    private ArrayList<Car>details = new ArrayList<Car>();
    
    //creating objects
    private FuelCar fc;
    private ElectricCar ec;
    
    //Constructor
    public GUI_Demo(){
        createRegistrationForm();
    }
    //This is the main method where other method is called
    public void createRegistrationForm()
    {
        ////Creating a frame
        frame = new JFrame();
        frame.setTitle(" Car Registration Form");
        frame.getContentPane().setBackground(new Color(240,128,128));

        
        //Creating a firstPanel
        fPanel = new JPanel();
        fPanel = new JPanel();
        fPanel.setBounds(0,0, 700,900);
        fPanel.setLayout(null);
        fPanel.setBackground(new Color(107, 202, 226));
        
        //Creating Labels Of fuel car
        mLabel1 = new JLabel();
        mLabel1.setText("FUEL CAR");
        mLabel1.setBounds(332,8,390,56);
        fPanel.add(mLabel1);
        Font fc=new Font("Times New Roman",Font.BOLD,22);
        mLabel1.setFont(fc);
        
        //fuelcar components
        fID = new JLabel();
        fID.setText("Car ID:");
        fID.setBounds(61,90,88,20);
        fPanel.add(fID);
        
        fIDTxt = new JTextField();
        fIDTxt.setText("");
        fIDTxt.setBounds(177,84,180,32);
        fPanel.add(fIDTxt);
        
        fName = new JLabel();
        fName.setText("Car Name:");
        fName.setBounds(61,131,88,20);
        fPanel.add(fName);
        
        fNameTxt = new JTextField();
        fNameTxt.setText("");
        fNameTxt.setBounds(177,125,180,32);
        fPanel.add(fNameTxt);

        fBrand = new JLabel();
        fBrand.setText("Car Brand:");
        fBrand.setBounds(61,172,88,20);
        fPanel.add(fBrand);
        
        fBrandTxt = new JTextField();
        fBrandTxt.setText("");
        fBrandTxt.setBounds(177,164,180,32);
        fPanel.add(fBrandTxt);
        
        fPrice = new JLabel();
        fPrice.setText("Price (Rs):");
        fPrice.setBounds(61,209,88,20);
        fPanel.add(fPrice);
        
        fPriceTxt = new JTextField();
        fPriceTxt.setText("");
        fPriceTxt.setBounds(177,203,180,32);
        fPanel.add(fPriceTxt);

        fFuelType = new JLabel();
        fFuelType.setText("Fuel Type:");
        fFuelType.setBounds(385,90,88,20);
        fPanel.add(fFuelType);
        
        fFuelTypeTxt = new JTextField();
        fFuelTypeTxt.setText("");
        fFuelTypeTxt.setBounds(501,84,180,32);
        fPanel.add(fFuelTypeTxt);

        fNumOfSeats = new JLabel();
        fNumOfSeats.setText("Seat Numbers:");
        fNumOfSeats.setBounds(385,131,88,20);
        fPanel.add(fNumOfSeats);
        
        fNumOfSeatsTxt = new JTextField();
        fNumOfSeatsTxt.setText("");
        fNumOfSeatsTxt.setBounds(501,125,180,32);
        fPanel.add(fNumOfSeatsTxt);

        fMileage = new JLabel();
        fMileage.setText("Mileage (km):");
        fMileage.setBounds(385,172,88,20);
        fPanel.add(fMileage);
        
        fMileageTxt = new JTextField();
        fMileageTxt.setText("");
        fMileageTxt.setBounds(501,166,180,32);
        fPanel.add(fMileageTxt);
        
        //creating add button for fuel car
        fAddBtn = new JButton();
        fAddBtn.setText("Add Car");
        fAddBtn.setBounds(591,241,90,32);
        fPanel.add(fAddBtn);
        fAddBtn.setBackground(new Color(238,130,238));
        
        fl = new JLabel();
        fl.setText("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________:");
        fl.setBounds(0,265,800,20);
        fl.setForeground(Color.white);
        fPanel.add(fl);
                
        //purchase components fo fuel car
        fID2 = new JLabel();
        fID2.setText("Car ID:");
        fID2.setBounds(61,296,88,20);
        fPanel.add(fID2);
        
        fID2Txt = new JTextField();
        fID2Txt.setText("");
        fID2Txt.setBounds(177,290,180,32);
        fPanel.add(fID2Txt);
        
        fName2 = new JLabel();
        fName2.setText("Car Name:");
        fName2.setBounds(61,339,88,20);
        fPanel.add(fName2);
        
        fName2Txt = new JTextField();
        fName2Txt.setText("");
        fName2Txt.setBounds(177,333,180,32);
        fPanel.add(fName2Txt);

        fBrand2 = new JLabel();
        fBrand2.setText("Car Brand:");
        fBrand2.setBounds(61,382,88,20);
        fPanel.add(fBrand2);
        
        fBrand2Txt = new JTextField();
        fBrand2Txt.setText("");
        fBrand2Txt.setBounds(177,376,180,32);
        fPanel.add(fBrand2Txt);
        
        fColor = new JLabel();
        fColor.setText("Color:");
        fColor.setBounds(385,296,88,20);
        fPanel.add(fColor);
        
        fColorTxt = new JTextField();
        fColorTxt.setText("");
        fColorTxt.setBounds(501,290,180,32);
        fPanel.add(fColorTxt);
        
        fTrnsType = new JLabel();
        fTrnsType.setText("Trans. Type:");
        fTrnsType.setBounds(385,337,88,20);
        fPanel.add(fTrnsType);
        
        fTrnsTypeTxt=new JTextField();
        fTrnsTypeTxt.setText("");
        fTrnsTypeTxt.setBounds(501,331,180,32);
        fPanel.add(fTrnsTypeTxt);
        
        fDisbtrName = new JLabel();
        fDisbtrName.setText("Distributor:");
        fDisbtrName.setBounds(385,378,88,20);
        fPanel.add(fDisbtrName);
        
        fDisbtrNameTxt = new JTextField();
        fDisbtrNameTxt.setText("");
        fDisbtrNameTxt.setBounds(501,372,180,32);
        fPanel.add(fDisbtrNameTxt);
        
        //ComboBox for fuel car
        String[] year = {"Year", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"};
        String[] month = {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] day = {"Day" ,"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        
        //purchase label for fuel car
        fPurDate = new JLabel();
        fPurDate.setText("Purchase Date:");
        fPurDate.setBounds(189,450,104,20);
        fPanel.add(fPurDate);
        
        fPurYearCom = new JComboBox(year);
        fPurYearCom.setBounds(300,450,60,20);
        fPanel.add(fPurYearCom);
        
        fPurMonthCom = new JComboBox(month);
        fPurMonthCom.setBounds(370,450,80,20);
        fPanel.add(fPurMonthCom);
        
        fPurDayCom = new JComboBox(day);
        fPurDayCom.setBounds(460,450,50,20);
        fPanel.add(fPurDayCom);
       
        //book components for fuel car
        fBookDate = new JLabel();
        fBookDate.setText("Booked Date:");
        fBookDate.setBounds(189,505,104,20);
        fPanel.add(fBookDate);
        
        fBookYearCom = new JComboBox(year);
        fBookYearCom.setBounds(300,505,60,20);
        fPanel.add(fBookYearCom);
        
        fBookMonthCom = new JComboBox(month);
        fBookMonthCom.setBounds(370,505,80,20);
        fPanel.add(fBookMonthCom);
        
        fBookDayCom = new JComboBox(day);
        fBookDayCom.setBounds(460,505,50,20);
        fPanel.add(fBookDayCom);
        
        //buttons for fuel car
        fPurBtn = new JButton();
        fPurBtn.setText("Purchase");
        fPurBtn.setBounds(460,600,90,32);
        fPanel.add(fPurBtn);
        fPurBtn.setBackground(new Color(0,255,0));
        
        fDisplayBtn = new JButton();
        fDisplayBtn.setText("Display");
        fDisplayBtn.setBounds(591,600,90,32);
        fPanel.add(fDisplayBtn);
        fDisplayBtn.setBackground(new Color(165,42,42));
        fDisplayBtn.setForeground(Color.white);
        
        //heading label for electric car
        mLabel2 = new JLabel();
        mLabel2.setText("ELECTRIC CAR");
        mLabel2.setBounds(950,8,390,56);
        frame.add(mLabel2);
        Font ec=new Font("Times New Roman",Font.BOLD,22);
        mLabel2.setFont(ec);
        
        eID = new JLabel();
        eID.setText("Car ID:");
        eID.setBounds(755,90,88,20);
        
        eIDTxt = new JTextField();
        eIDTxt.setText("");
        eIDTxt.setBounds(865,82,180,32);
        
        eName = new JLabel();
        eName.setText("Car Name:");
        eName.setBounds(755,135,88,20);
        
        eNameTxt = new JTextField();
        eNameTxt.setText("");
        eNameTxt.setBounds(865,135,180,32);
        
        eBrand = new JLabel();
        eBrand.setText("Car Brand:");
        eBrand.setBounds(755,188,88,20);
        
        eBrandTxt = new JTextField();
        eBrandTxt.setText("");
        eBrandTxt.setBounds(865,188,180,32);
         
        ePrice = new JLabel();
        ePrice.setText("Price (Rs):");
        ePrice.setBounds(1070,88,100,20);
        
        ePriceTxt = new JTextField();
        ePriceTxt.setText("");
        ePriceTxt.setBounds(1185,82,180,32);
        
        eBatteryCap = new JLabel();
        eBatteryCap.setText("Battery Capacity:");
        eBatteryCap.setBounds(1070,135,100,20);
      
        eBatteryCapTxt = new JTextField();
        eBatteryCapTxt.setText("");
        eBatteryCapTxt.setBounds(1185,132,180,32);
        
        //add button for electric car
        eAddBtn = new JButton();
        eAddBtn.setText("Add Car");
        eAddBtn.setBounds(1240,241,90,32);
        eAddBtn.setBackground(new Color(238,130,238));
       
        
        l = new JLabel();
        l.setText("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________:");
        l.setBounds(700,265,800,20);
        l.setForeground(Color.white);
        
        //sell and buy components for electric car
        eID2 = new JLabel();
        eID2.setText("Car ID:");
        eID2.setBounds(755,296,88,20);
        
        eID2Txt = new JTextField();
        eID2Txt.setText("");
        eID2Txt.setBounds(865,290,180,32);
        
        eName2 = new JLabel();
        eName2.setText("Car Name:");
        eName2.setBounds(755,339,88,20);
        
        eName2Txt = new JTextField();
        eName2Txt.setText("");
        eName2Txt.setBounds(865,333,180,32);
        
        eBrand2 = new JLabel();
        eBrand2.setText("Car Brand:");
        eBrand2.setBounds(755,382,88,20);
        
        eBrand2Txt = new JTextField();
        eBrand2Txt.setText("");
        eBrand2Txt.setBounds(865,376,180,32);
        
        eRange = new JLabel();
        eRange.setText("Range(hrs):");
        eRange.setBounds(755,425,88,20);
        
        eRangeTxt = new JTextField();
        eRangeTxt.setText("");
        eRangeTxt.setBounds(865,419,180,32);
 
        eColor = new JLabel();
        eColor.setText("Color:");
        eColor.setBounds(755,468,88,20);
        
        eColorTxt = new JTextField();
        eColorTxt.setText("");
        eColorTxt.setBounds(865,462,180,32);        
         
        ePrice2 = new JLabel();
        ePrice2.setText("Price:");
        ePrice2.setBounds(1070,296,100,20);
        
        ePrice2Txt = new JTextField();
        ePrice2Txt.setText("");
        ePrice2Txt.setBounds(1185,290,180,32);
        
        eCustomerName = new JLabel();
        eCustomerName.setText("Customer Name:");
        eCustomerName.setBounds(1070,337,100,20);
        
        eCustomerNameTxt = new JTextField();
        eCustomerNameTxt.setText("");
        eCustomerNameTxt.setBounds(1185,331,180,32);
        
        eBatteryWarrenty = new JLabel();
        eBatteryWarrenty.setText("Battery Warrenty:");
        eBatteryWarrenty.setBounds(1070,378,100,20);
        
        eBatteryWarrentyTxt = new JTextField();
        eBatteryWarrentyTxt.setText("");
        eBatteryWarrentyTxt.setBounds(1185,372,180,32);
        
        eRechargeTime = new JLabel();
        eRechargeTime.setText("Recharge Time:");
        eRechargeTime.setBounds(1070,425,100,20);
        
        eRechargeTimeTxt = new JTextField();
        eRechargeTimeTxt.setText("");
        eRechargeTimeTxt.setBounds(1185,419,180,32);
        
        ePurDate = new JLabel();
        ePurDate.setText("Purchase Date:");
        ePurDate.setBounds(850,530,104,20);
        
        //combobox for electric car
        ePurYearCom = new JComboBox(year);
        ePurYearCom.setBounds(961,530,60,20);
        
        ePurMonthCom = new JComboBox(month);
        ePurMonthCom.setBounds(1031,530,80,20);
        
        ePurDayCom = new JComboBox(day);
        ePurDayCom.setBounds(1121,530,50,20);
        
        //button for electric car
        eSellBtn = new JButton();
        eSellBtn.setText("Sell");
        eSellBtn.setBounds(980,600,90,32);
        eSellBtn.setBackground(new Color(100,149,237));
        eSellBtn.setForeground(Color.black);
        
        eBuyBtn = new JButton();
        eBuyBtn.setText("Purchase");
        eBuyBtn.setBounds(1110,600,90,32);
        eBuyBtn.setBackground(new Color(0,255,0));
        
        eDisplayBtn = new JButton();
        eDisplayBtn.setText("Display");
        eDisplayBtn.setBounds(1240,600,90,32);
        eDisplayBtn.setBackground(new Color(165,42,42));
        eDisplayBtn.setForeground(Color.white);
        
        clearBtn = new JButton();
        clearBtn.setText("Clear");
        clearBtn.setBounds(650,670,90,32);
        clearBtn.setBackground(new Color(75,0,130));
        clearBtn.setForeground(Color.white);
        
        //adding components to the frame
        frame.add(fPanel);
        frame.add(mLabel2);
        frame.add(eID);
        frame.add(eIDTxt);
        frame.add(eName);
        frame.add(eNameTxt);
        frame.add(eBrand);
        frame.add(eBrandTxt);
        frame.add(ePrice);
        frame.add(ePriceTxt);
        frame.add(eBatteryCap);
        frame.add(eBatteryCapTxt);
        frame.add(eAddBtn);
        frame.add(eID2);
        frame.add(eID2Txt);
        frame.add(eName2);
        frame.add(eName2Txt);
        frame.add(eBrand2);
        frame.add(eBrand2Txt);
        frame.add(ePrice2);
        frame.add(ePrice2Txt);
        frame.add(eCustomerName);
        frame.add(eCustomerNameTxt);
        frame.add(eBatteryWarrenty);
        frame.add(eBatteryWarrentyTxt);
        frame.add(eRange);
        frame.add(eRangeTxt);
        frame.add(eColor);
        frame.add(l);
        frame.add(eColorTxt);
        frame.add(eRechargeTime);
        frame.add(eRechargeTimeTxt);
        frame.add(ePurDate);
        frame.add(ePurYearCom);
        frame.add(ePurMonthCom);
        frame.add(ePurDayCom);
        frame.add(eSellBtn);
        frame.add(eBuyBtn);
        frame.add(eDisplayBtn);
        frame.add(clearBtn);
        
        //this is method for performing certain task when the fuel car add button is triggered
        fAddBtn.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent fAdd)
          {
            
                  try
                  {
                    //accepting values of all TextFields
                     int carId = Integer.parseInt(fIDTxt.getText()); 
                     String carBrand = fBrandTxt.getText();
                     String carName = fNameTxt.getText();
                     String fuelType = fFuelTypeTxt.getText();
                     int numberOfSeats = Integer.parseInt(fNumOfSeatsTxt.getText());
                     int mileage = Integer.parseInt(fMileageTxt.getText());
                     String carPrice = fPriceTxt.getText(); 
                     if(details.isEmpty())
                     {
                         //Calling a constructor
                         Car fc = new FuelCar(carId, carName, carBrand, carPrice, fuelType, numberOfSeats, mileage);
                         //adding FuelCar object in the Car arraylist details
                         details.add(fc);
                         JOptionPane.showMessageDialog(frame,"The car ID is successfully added.","Sucessful",JOptionPane.INFORMATION_MESSAGE);
                     }
                     else
                     {
                         //assigning a boolean value
                        boolean dupliId = false; 
                        for(Car car:details)
                        {
                             //for checking repetation
                            if (car instanceof FuelCar)
                            //Object downcasting
                            {
                                if (car.getCarId() == carId)
                                {
                                    dupliId = true;
                                }
                            }
                        }
                        if (dupliId == false)
                        {
                            //Calling a constructor
                            Car fc = new FuelCar(carId, carName, carBrand, carPrice, fuelType, numberOfSeats, mileage);
                            //adding FuelCar object in the Car arraylist details
                            details.add(fc);
                            JOptionPane.showMessageDialog(frame,"The car ID is successfully added.","Thank you",JOptionPane.INFORMATION_MESSAGE);

                        }
                        else
                        {
                            JOptionPane.showMessageDialog(frame,"Repeatition of car ID.","Error!",JOptionPane.ERROR_MESSAGE); 
                        }
                     }
                  }
                  //catching exceptions
                  catch(NumberFormatException ex)
                  {
                      JOptionPane.showMessageDialog(frame,"Make sure all data are filled correctly.","STOP!!",JOptionPane.WARNING_MESSAGE);
                  }
              }
          
        });
        
        //this is method for performing certain task when the electric car add button is triggered
        eAddBtn.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent eAdd)
           {
               try
               {
                   //accepting values of all TextFields
                   int idE = Integer.parseInt(eIDTxt.getText());
                   String eNam = eNameTxt.getText();
                   String eBrands = eBrandTxt.getText();
                   String priceE = ePriceTxt.getText();
                   int batCapE = Integer.parseInt(eBatteryCapTxt.getText());
                   
                   if(details.isEmpty())
                   {
                       //Calling a constructor
                       Car ec = new ElectricCar(idE,eNam,eBrands,priceE,batCapE);
                       //adding ElectricCar object in the Car arraylist details
                       details.add(ec);
                       JOptionPane.showMessageDialog(frame,"Electric Car is added.","Sucessful",JOptionPane.INFORMATION_MESSAGE);
                   }
                   else
                   {
                        //assigning a boolean value
                       boolean dupliE = false;
                       for (Car car: details)
                       {
                            //for checking repetation 
                           if(car instanceof ElectricCar)
                            //Object downcasting

                           {
                               if (car.getCarId() == idE)
                               {
                                   dupliE = true;
                               }
                           }
                       }
                       if (dupliE == false)
                       {
                            //Calling a constructor
                           Car ec = new ElectricCar(idE,eNam,eBrands,priceE,batCapE);
                           //adding ElectricCar object in the Car arraylist details
                           details.add(ec);
                           JOptionPane.showMessageDialog(frame,"Electric Car is added.","Sucessful",JOptionPane.INFORMATION_MESSAGE); 
                       }
                       else
                       {
                           JOptionPane.showMessageDialog(frame,"Car ID is already registered.","ERROR",JOptionPane.ERROR_MESSAGE); 
                       }
                   }
               }
               //catching exceptions
               catch(NumberFormatException ex)
               {
                   JOptionPane.showMessageDialog(frame,"Please Input all the data correctly.","Oops!!",JOptionPane.WARNING_MESSAGE); 
               }
           }
       });
       
        //this is method for performing certain task when the fuel car purchase button is triggered
       fPurBtn.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent fPur)
           {
               try
               {
                   //accepting values of all TextFields
                   int carId2 = Integer.parseInt(fID2Txt.getText()); 
                   String carBrand2 = fBrand2Txt.getText();
                   String carName2 = fName2Txt.getText();
                   String transTP = fTrnsTypeTxt.getText();
                   String disNM = fDisbtrNameTxt.getText();
                   //assigning a boolean value
                   boolean pur = false;
                   
                   if(details.isEmpty())
                   {
                       JOptionPane.showMessageDialog(frame,"Unable to Purchase!!!","No Car Detected.",JOptionPane.ERROR_MESSAGE);
                   }
                   else
                   {
                        //for checking repetation of vacancy number
                       for (Car car: details)
                       {
                           //Object downcasting
                           if(car instanceof FuelCar)
                           {
                               pur = true;
                           }
                       }
                   }
                   if (pur == true)
                   {
                       boolean fcID = false;
                        //for checking repetation 
                       for (Car car: details)
                       {
                           if(car instanceof FuelCar)
                           //Object downcasting
                           {
                              if (car.getCarId() == carId2)
                              {
                                  fcID = true;
                                  //downcasting car to use method of fuel car
                                  if(((FuelCar)car).getIsPurchased() == false)
                                  {
                                      fcID = true;
                                      String fPurDate2 = String.valueOf(fPurYearCom.getSelectedItem()) + "/" + String.valueOf(fPurMonthCom.getSelectedItem()) + "/" +String.valueOf(fPurDayCom.getSelectedItem());
                                      String fBookDate2 = String.valueOf(fBookYearCom.getSelectedItem()) + "/" + String.valueOf(fBookMonthCom.getSelectedItem()) + "/" +String.valueOf(fBookDayCom.getSelectedItem());
                                      //downcast car to fc and calling purchase from fc class
                                      ((FuelCar)car).purchase(fPurDate2, fBookDate2);
                                      JOptionPane.showMessageDialog(frame,"Fuel Car Purchased!!!","Sucessful.",JOptionPane.INFORMATION_MESSAGE);
                                  }
                              else
                              {
                                  JOptionPane.showMessageDialog(frame,"Car is already purchased.","ERROR!!.",JOptionPane.ERROR_MESSAGE);
                                  
                              }
                               }
                        }
                        //Condition when false data are entered
                       if(fcID == false)
                       {
                           JOptionPane.showMessageDialog(frame,"Car does not exists.","Ohno!!.",JOptionPane.ERROR_MESSAGE);
                       }
                    }
                   }
            }
                //catching exceptions
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(frame,"Enter all the data correctly.","STOP",JOptionPane.WARNING_MESSAGE);
            }
            }
       });
       
        //this is method for performing certain task when the electric car purchase button is triggered
        eBuyBtn.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent eBuy)
           {
               try
               {
                   //accepting values of all TextFields
                   int elId2 = Integer.parseInt(eID2Txt.getText()); 
                   String elBrand2 = eBrand2Txt.getText();
                   String elName2 = eName2Txt.getText();
                   String eCusN = eCustomerNameTxt.getText();
                   String eRang = eColorTxt.getText();
                   int eMon= Integer.parseInt(ePrice2Txt.getText()); 
                   int eBW = Integer.parseInt(eBatteryWarrentyTxt.getText()); 
                   String eRan = eRangeTxt.getText(); 
                   int eRecTime = Integer.parseInt(eRechargeTimeTxt.getText()); 
                   //assigning a boolean value
                   boolean buy = false;
                   
                   if(details.isEmpty())
                   {
                       JOptionPane.showMessageDialog(frame,"Unable to Purchase!!!","No car Detected.",JOptionPane.ERROR_MESSAGE);
                   }
                   else
                   {
                       for (Car car: details)
                       {
                           //for checking repetation 
                           //Object downcasting
                           if(car instanceof ElectricCar)
                           {
                               buy = true;
                           }
                       }
                   }
                   if (buy == true)
                   {
                       //assigning a boolean value
                       boolean ecID = false;
                       //for checking repetation 
                       for (Car car: details)
                       {
                           //Object downcasting
                           if(car instanceof ElectricCar)
                           {
                              if (car.getCarId() == elId2)
                              {
                                  ecID = true;
                                  if(((ElectricCar)car).getIsBought() == false)
                                  {
                                      String ePurDate2 = String.valueOf(fPurYearCom.getSelectedItem()) + "/" + String.valueOf(fPurMonthCom.getSelectedItem()) + "/" +String.valueOf(fPurDayCom.getSelectedItem());
                                      //downcast car to ec and calling purchase from ec class
                                      ((ElectricCar)car).buy(eCusN, eBW, ePurDate2, eRan, eRecTime);
                                      JOptionPane.showMessageDialog(frame,"Electric Car Purchased!!!","Sucessful.",JOptionPane.INFORMATION_MESSAGE);
                                      
                                  }
                                  else
                                  {
                                        JOptionPane.showMessageDialog(frame,"Electric Car Already Purchased!!!","ERROR.",JOptionPane.ERROR_MESSAGE);

                                  }
                              }
                           }
                       }
                       //Condition when false data are entered
                       if(ecID == false)
                       {
                           JOptionPane.showMessageDialog(frame,"Car does not exists.","Ohno!!.",JOptionPane.ERROR_MESSAGE);
                       }
                    }
                }
                //catching exceptions
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(frame,"Enter all the data correctly.","STOP",JOptionPane.WARNING_MESSAGE);
                }
            }
       });
       
       //this is method for performing certain task when the electric car sell button is triggered
       eSellBtn.addActionListener(new ActionListener()
       {
          public void actionPerformed(ActionEvent eSell)
          {
             try
             {
                 //accepting values of all TextFields
                 int ecID = Integer.parseInt(eIDTxt.getText());
                 String ecCN = eCustomerNameTxt.getText();
                 //assigning a boolean value
                 boolean sID = false;
                  //for checking repetation
                 for(Car car : details)
                 {
                     //Object downcasting
                     if (car instanceof ElectricCar)
                     {
                         if (car.getCarId() == ecID)
                         {
                             sID = true;
                             if(((ElectricCar)car).getIsSold() == false)
                             {
                                 //calling the sell method fromelectric car
                                 ((ElectricCar)car).sell(ecCN);
                                 JOptionPane.showMessageDialog(frame,"Electric Car is sold.","Sucessful",JOptionPane.INFORMATION_MESSAGE); 
                             }
                            else
                            {
                                JOptionPane.showMessageDialog(frame,"Electric Car is already sold.","ERROR",JOptionPane.ERROR_MESSAGE); 

                            }
                         }
                     }
                 }
                 //Condition when false data are entered
                 if (sID == false)
                 {
                     JOptionPane.showMessageDialog(frame,"Electric Car doesnot exists.","Oops",JOptionPane.ERROR_MESSAGE); 
                 }
             }
             //catching exceptions
             catch(NumberFormatException ex)
             {
                 JOptionPane.showMessageDialog(frame,"Enter all the details.","STOP",JOptionPane.WARNING_MESSAGE); 
             }
          }
       });
       
       //this is method for performing certain task when the fuel car display button is triggered
       fDisplayBtn.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent fDis){
                //for checking repetation
                for(Car car:details){
                     //Object downcasting
                    if(car instanceof FuelCar){
                        System.out.println("Displaying the details of Fuel Car:");
                        ((FuelCar)car).display();
                        System.out.println("\n");
                        
                    }
                    
                }
            }
            
        });
        
       ////this is method for performing certain task when the fuel car display button is triggered 
        eDisplayBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eDis){
                //for checking repetation
                for(Car car:details){
                    //Object downcasting
                    if(car instanceof ElectricCar){
                        System.out.println("Displaying the details of Electric Car:");
                        ((ElectricCar)car).display();
                        System.out.println("\n");
                        
                    }
                    
                }
            }
            
        });
       
        //this is method for performing certain task when the clear button is triggered
        clearBtn.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent klar){
            //setting all the value as empty
            fIDTxt.setText("");  
            fNameTxt.setText(""); 
            fBrandTxt.setText("");
            fPriceTxt.setText("");
            fFuelTypeTxt.setText("");
            fNumOfSeatsTxt.setText("");
            fMileageTxt.setText("");
            fID2Txt.setText("");  
            fName2Txt.setText(""); 
            fBrand2Txt.setText("");
            try{
                fColorTxt.setText("");
            }//catching exceptions
            catch(NullPointerException nt){
                
            }
            
            fTrnsTypeTxt.setText("");
            fDisbtrNameTxt.setText("");
            fPurDayCom.setSelectedIndex(0);
            fPurMonthCom.setSelectedIndex(0);
            fPurYearCom.setSelectedIndex(0);
            fBookDayCom.setSelectedIndex(0);
            fBookMonthCom.setSelectedIndex(0);
            fBookYearCom.setSelectedIndex(0);
            eIDTxt.setText("");
            eNameTxt.setText("");
            eBrandTxt.setText("");
            ePriceTxt.setText("");
            eBatteryCapTxt.setText("");
            eID2Txt.setText("");
            eName2Txt.setText("");
            eBrand2Txt.setText("");
            eColorTxt.setText("");
            ePrice2Txt.setText("");
            eCustomerNameTxt.setText("");
            eBatteryWarrentyTxt.setText("");
            eRangeTxt.setText("");
            eRechargeTimeTxt.setText("");
            ePurDayCom.setSelectedIndex(0);
            ePurMonthCom.setSelectedIndex(0);
            ePurYearCom.setSelectedIndex(0);
           }
           
       });
        
       // setting frame work
        frame.setLayout(null);//removing all exiting layout manager
        frame.setSize(1600,900);//setting the size
        frame.setResizable(false);// resizability to false
        frame.setLocationRelativeTo(null);//sets the frame in the center of the screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//making X to close the GUI
        frame.setVisible(true); //makes the frame visible
    }

    //Creating a main method
    public static void main(String args [] )
    {
        GUI_Demo RegistrationForm = new GUI_Demo();
        RegistrationForm.createRegistrationForm();
     }
    
}

