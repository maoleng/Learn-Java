import java.time.temporal.UnsupportedTemporalTypeException;

class Drinks 
{
    private String drinksID, drinksName, drinksUnit;
    private int drinksQuan, drinksPrice;
    
    public Drinks(String id, String name, String unit, int quan, int price)
    {
        this.drinksID = id;
        this.drinksName = name;
        this.drinksUnit = unit;
        this.drinksQuan = quan;
        this.drinksPrice = price;
    }    
    //get methods
    public int getDrinksQuan()
    {
        return this.drinksQuan;
    }
    public int getDrinksPrice()
    {
        return this.drinksPrice;
    }
    public String getDrinksID()
    {
        return this.drinksID;
    }
    public String getDrinksName()
    {
        return this.drinksName;
    }
    public String getDrinksUnit()
    {
        return this.drinksUnit;
    }
    //set methods
    public void setDrinksQuan(int quan)
    {
        this.drinksQuan = quan;
    }
    public void setDrinksPrice(int price) 
    {
        this.drinksPrice = price;
    }
    public void setDrinksID(String id)
    {
        this.drinksID = id;
    }
    public void setDrinksName(String name)
    {
        this.drinksName = name;
    }
    public void setDrinksUnit(String unit)
    {
        this.drinksUnit = unit;
    }
    
    //Total
    public double calTotal()
    {
        if ( this.drinksQuan <= 0 || this.drinksPrice <= 0 ) {
            return -1;
        }
        
        if ( this.drinksUnit == "lon" || this.drinksUnit == "chai" ) {
            return this.drinksQuan * this.drinksPrice;
        } else if ( this.drinksUnit == "thung" ) {
            return this.drinksQuan * this.drinksPrice * 24 ;
        } else if ( this.drinksUnit == "ket" ) {
            return this.drinksQuan * this.drinksPrice * 20 ;
        }
        return -1;
    }
	
    //discount
    public double discount()
    {
        int num = 0;
        if ( this.drinksUnit == "thung" ) {
            num = this.drinksQuan * 24;
        } else if ( this.drinksUnit == "ket" ) {
            num = this.drinksQuan * 20;
        } else if ( this.drinksUnit == "lon" ) {
            num = this.drinksQuan;
        }

        if ( num <= 0 || this.drinksPrice <= 0 ) {
            return -1;
        }

        if ( num >= 40 ) {
            return this.drinksQuan * this.drinksPrice * 0.05;
        } else if ( num >= 30 && num < 40 ) {
            return this.drinksQuan * this.drinksPrice * 0.03;
        } else if ( num >= 20 && num < 30 ) {
            return this.drinksQuan * this.drinksPrice * 0.01;
        } else if ( num < 20 ) {
            return 0;
        } 
        

        return -1;
    }
}
