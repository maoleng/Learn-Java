public class FullTimeStaff extends Staff {
    protected int baseSalary;
    protected double bonusRate;

    public FullTimeStaff(String sID, String sName, int baseSalary, double bonusRate) {
        super(sID, sName);
        this.baseSalary = baseSalary;
        this.bonusRate = bonusRate;
    }

    public int getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBonusRate() {
        return this.bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    public double paySalary(int workingTime) {
        return 0;
    }

    public String toString() {
        return this.sID + "_" + this.sName + "_" + this.bonusRate + "_" + this.baseSalary;
    }

}