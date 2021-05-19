
public class Heater
{
    private double temperature;
    private double increasetemp;
    private double decreasetemp;
    private double min;
    private double max;
    private double increment;
    
    /**
     * Constructor for objects of class Heater
     */
    public Heater()
    {
        
        temperature = 15.0;
    }
    
     public Heater(double minimum, double maximum)
    {
        min = minimum;
        max = maximum;
        increment = 5.0;
        
    }

    public double Warmer()
    {
        
        
        if(temperature < max){
      
        temperature = temperature + increment;
        }
        
        else{
           System.out.println("The temperature has reached max value");
        }
        return temperature;
    }
    
    public double Cooler()
    {
       
        
        if(temperature > min){
        temperature = temperature - increment;
    }
        return temperature;
    }
    
    public double gettemperature(){
      return temperature;
    }
    
    public void setincrement(double incre){
     increment = incre;
    }
    public double check(){
        double ch;
        if(increment > 0){
         ch = increment;
        }
        
        else {
        System.out.println("Error....Please enter positive increment value.");
        }
        return increment;
     }
    
    
    
}
