public class Manager extends FullTimeStaff {
    protected int allowance;

    public Manager(String sID, String sName, int baseSalary, double bonusRate, int allowance) {
        super(sID, sName, baseSalary, bonusRate);
        this.allowance = allowance;
    }
    
    public int getAllowance() {
        return this.allowance;
    }

    public double paySalary(int workedHours) {
        return 5;
    }

    public String toString() {
        return this.sID + "_" + this.sName + "_" + this.bonusRate + "_" + this.baseSalary + "_" + this.allowance;
    }

}
