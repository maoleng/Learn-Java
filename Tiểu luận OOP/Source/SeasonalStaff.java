public class SeasonalStaff extends Staff {
    protected int hourlyWage;


    public SeasonalStaff(String sID, String sName, int hourlyWage) {
        super(sID, sName);
        this.hourlyWage = hourlyWage;
    }


    public int getHourlyWage() {
        return this.hourlyWage;
    }
    
    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double paySalary(int workedHours) {
        return this.hourlyWage * workedHours;
    }

    public String toString() {
        return this.sID + "_" + this.sName + "_" + this.hourlyWage;
    }


}
