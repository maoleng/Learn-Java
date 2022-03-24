import java.util.concurrent.ConcurrentHashMap;

import javax.swing.plaf.basic.BasicComboBoxUI.FocusHandler;

class house {
    public String houseCode = "A01";
    public int numOfBedRooms = 2;
    public boolean hasSwimmingPool = false;
    public double area = 0;
    public double costPerSquareMeter = 0;

    public house (String houseCode, int numOfBedRooms, boolean hasSwimmingPool, double area, double costPerSquareMeter) {
        this.houseCode = houseCode;
        this.numOfBedRooms = numOfBedRooms;
        this.hasSwimmingPool = hasSwimmingPool;
        this.area = area;
        this.costPerSquareMeter = costPerSquareMeter;
    }

    public String getHouseCode () {
        return this.houseCode;
    }

    public int getNumOfBedRooms () {
        return this.numOfBedRooms;
    }

    public boolean getHasSwimmingPool () {
        return this.hasSwimmingPool;
    }

    public double getArea () {
        return this.area;
    }

    public double getCostPerSquareMeter () {
        return this.costPerSquareMeter;
    }

// --------
    public void setHouseCode (String houseCode) {
        this.houseCode = houseCode;
    }

    public void setNumOfBedRooms (int numOfBedRooms) {
        this.numOfBedRooms = numOfBedRooms;
    }

    public void setHasSwimmingPool (boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public void setArea (double area) {
        this.area = area;
    }

    public void setCostPerSquareMeter (double costPerSquareMeter) {
        this.costPerSquareMeter = costPerSquareMeter;
    }

// ------

    
    public double calculateSellingPrice () {
        double area = getArea();
        double costPerMet = getCostPerSquareMeter();
        double total = 0;
        total = (long)area * (long)costPerMet;
        if ( this.hasSwimmingPool == true ) {
            return (long)total * (long)1.15;
        } else {
            return (long)total;
        }
        
        
    }


}