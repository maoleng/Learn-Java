import java.io.*;
import java.util.*;

public class StoreManagement {
    private ArrayList<Staff> staffs;
    private ArrayList<String> workingTime;
    private ArrayList<Invoice> invoices;
    private ArrayList<InvoiceDetails> invoiceDetails;
    private ArrayList<Drink> drinks;

    public StoreManagement(String staffPath, String workingTimePath, String invoicesPath, String detailsPath, String drinksPath) {
        this.staffs = loadStaffs(staffPath);
        this.workingTime = loadFile(workingTimePath);
        this.invoices = loadInvoices(invoicesPath);
        this.invoiceDetails = loadInvoicesDetails(detailsPath);
        this.drinks = loadDrinks(drinksPath);
    }

    public ArrayList<Staff> getStaffs() {
        return this.staffs;
    }

    public void setStaffs(ArrayList<Staff> staffs){
        this.staffs = staffs;
    }
    
    public ArrayList<Drink> loadDrinks(String filePath) {
        ArrayList<Drink> drinksResult = new ArrayList<Drink>();
        ArrayList<String> drinks = loadFile(filePath);

        for (String drink : drinks) {
            String[] information = drink.split(",");
            drinksResult.add(new Drink(information[0], Integer.parseInt(information[1])));
        }

        return drinksResult;
    }

    public ArrayList<Invoice> loadInvoices(String filePath) {
        ArrayList<Invoice> invoiceResult = new ArrayList<Invoice>();
        ArrayList<String> invoices = loadFile(filePath);

        for (String invoice : invoices) {
            String[] information = invoice.split(",");
            invoiceResult.add(new Invoice(information[0], information[1], information[2]));
        }

        return invoiceResult;
    }

    public ArrayList<InvoiceDetails> loadInvoicesDetails(String filePath) {
        ArrayList<InvoiceDetails> invoiceResult = new ArrayList<InvoiceDetails>();
        ArrayList<String> invoices = loadFile(filePath);

        for (String invoice : invoices) {
            String[] information = invoice.split(",");
            invoiceResult.add(new InvoiceDetails(information[0], information[1], Integer.parseInt(information[2])));
        }

        return invoiceResult;
    }

    // requirement 1
    public ArrayList<Staff> loadStaffs(String filePath) {
        ArrayList<Staff> ten = new ArrayList<Staff>();
        File file = new File(filePath);
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                int checkStaff = data.length() - data.replace(",", "").length();
                String[] words = data.split(",");
                if (checkStaff == 4) {
                    ten.add(new Manager(words[0], words[1], Integer.parseInt(words[2]), Double.parseDouble(words[3]), Integer.parseInt(words[4])));
                }
                if (checkStaff == 2) {
                    ten.add(new SeasonalStaff(words[0], words[1], Integer.parseInt(words[2])));
                }
                if (checkStaff == 3) {
                    ten.add(new FullTimeStaff(words[0], words[1], Integer.parseInt(words[2]), Double.parseDouble(words[3])));
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }  
        return ten;
    }

    // requirement 2s
    public ArrayList<SeasonalStaff> getTopFiveSeasonalStaffsHighSalary() {
        List<String> list = new ArrayList<String>();
        ArrayList<SeasonalStaff> sss = new ArrayList<SeasonalStaff>();

        for (Staff eachStaff : this.staffs) {   
            for (String eachTime : this.workingTime) {
                String[] TimeData = eachTime.split(",");
                if (TimeData[0].equals(eachStaff.sID)) {
                    String[] row = eachStaff.toString().split("_");
                    if (eachStaff.getClass().toString().equals("class SeasonalStaff")) {
                        int salary = Integer.parseInt(row[2]) * Integer.parseInt(TimeData[1]);
                        sss.add(new SeasonalStaff(eachStaff.sID, eachStaff.sName, Integer.parseInt(row[2])));
                        list.add(eachStaff.sID + "_" + salary);
                    }
                }
            }
        }

        List<Integer> order = new ArrayList<Integer>();        
        for (String each : list) {
            String[] row = each.split("_");
            order.add(Integer.parseInt(row[1]));
        }
        Collections.sort(order, Collections.reverseOrder());

        List<String> semiFinal = new ArrayList<String>();        
        for (Integer eachOrder : order) {
            for (String eachList : list) {
                if (eachOrder == Integer.parseInt(eachList.split("_")[1])) {
                    semiFinal.add(eachList.split("_")[0]);
                }
            }
        }

        Integer count = Integer.valueOf(0);
        ArrayList<SeasonalStaff> finalResult = new ArrayList<SeasonalStaff>();        
        for (String each : semiFinal) {
            for(SeasonalStaff eachStaff : sss) {
                if (eachStaff.toString().split("_")[0].equals(each)) {
                    finalResult.add(new SeasonalStaff(eachStaff.sID, eachStaff.sName, eachStaff.hourlyWage));
                    count++;
                    
                }
    
            }
            if (count == 5) {
                break;
            }
        }
        return finalResult;
    }

    // requirement 3
    public ArrayList<FullTimeStaff> getFullTimeStaffsHaveSalaryGreaterThan(int lowerBound) {
        List<String> moneyData = new ArrayList<String>();        

        for (Staff eachStaff : this.staffs) {   
            for (String eachTime : this.workingTime) {
                String[] TimeData = eachTime.split(",");
                if (TimeData[0].equals(eachStaff.sID)) {
                    int check = eachStaff.toString().split("_").length;
                    if ( check == 4 || check == 5) {
                        Double invoice = Double.parseDouble(eachStaff.toString().split("_")[3]);
                        Double bonus = Double.parseDouble(eachStaff.toString().split("_")[2]);
                        Double money = invoice * bonus;

                        if (Double.parseDouble(TimeData[1]) > Double.parseDouble("21")) {
                            money += ( Double.parseDouble(TimeData[1]) - Double.parseDouble("21") ) * Double.parseDouble("100000");
                        }

                        if (check == 5) {
                            Double bigBonus = Double.parseDouble(eachStaff.toString().split("_")[4]);
                            money += bigBonus;
                        }
                        moneyData.add(eachStaff.sID + "_" + money);
                    }
                }
                
            }
        }
        
        List<String> moneyResultData = new ArrayList<String>();        
        for (String each : moneyData) {
            if (Double.parseDouble(each.split("_")[1]) > lowerBound) {
                moneyResultData.add(each);
            }
        }

        List<String> ids = new ArrayList<String>();        
        for (String each : moneyResultData) {
            ids.add(each.split("_")[0]);
        }
        
        ArrayList<FullTimeStaff> result = new ArrayList<FullTimeStaff>();
        for (Staff each : this.staffs) {
            for (String id : ids) {
                if (each.toString().split("_")[0].equals(id)) {
                    if (id.contains("CT")) {
                        result.add(new FullTimeStaff(id, each.toString().split("_")[1], Integer.parseInt(each.toString().split("_")[3]), Double.parseDouble(each.toString().split("_")[2])));
                    }
                    if (id.contains("QL")) {
                        result.add(new Manager(id, each.toString().split("_")[1], Integer.parseInt(each.toString().split("_")[3]), Double.parseDouble(each.toString().split("_")[2]), Integer.parseInt(each.toString().split("_")[4])));
                    }
                }
            }
        }

        return result;
    }

    // requirement 4
    public double totalInQuarter(int quarter) {
        double total = 0;
        List<String> receiptDetails = new ArrayList<String>();        

        if (quarter == 1) {
            for(Invoice eachReceipt : invoices) {
                for(InvoiceDetails eachDrink : invoiceDetails) {
                    String[] drink = eachDrink.toString().split("_");
                    if (drink[0].equals(eachReceipt.toString().split("_")[0])) {
                        String month = (eachReceipt.toString().split("_")[2]).split("/")[1];
                        if ( month.equals("01") || month.equals("02") || month.equals("03") ) {
                            receiptDetails.add(eachDrink.toString());
                        }
                    }
                }
            }
        }

        if (quarter == 2) {
            for(Invoice eachReceipt : invoices) {
                for(InvoiceDetails eachDrink : invoiceDetails) {
                    String[] drink = eachDrink.toString().split("_");
                    if (drink[0].equals(eachReceipt.toString().split("_")[0])) {
                        String month = (eachReceipt.toString().split("_")[2]).split("/")[1];
                        if ( month.equals("04") || month.equals("05") || month.equals("06") ) {
                            receiptDetails.add(eachDrink.toString());
                        }
                    }
                }
            }
        }

        if (quarter == 3) {
            for(Invoice eachReceipt : invoices) {
                for(InvoiceDetails eachDrink : invoiceDetails) {
                    String[] drink = eachDrink.toString().split("_");
                    if (drink[0].equals(eachReceipt.toString().split("_")[0])) {
                        String month = (eachReceipt.toString().split("_")[2]).split("/")[1];
                        if ( month.equals("07") || month.equals("08") || month.equals("09") ) {
                            receiptDetails.add(eachDrink.toString());
                        }
                    }
                }
            }
        }

        if (quarter == 4) {
            for(Invoice eachReceipt : invoices) {
                for(InvoiceDetails eachDrink : invoiceDetails) {
                    String[] drink = eachDrink.toString().split("_");
                    if (drink[0].equals(eachReceipt.toString().split("_")[0])) {
                        String month = (eachReceipt.toString().split("_")[2]).split("/")[1];
                        if ( month.equals("10") || month.equals("11") || month.equals("12") ) {
                            receiptDetails.add(eachDrink.toString());
                        }
                    }
                }
            }
        }

        for (String each : receiptDetails) {
            for (Drink drink : this.drinks) {
                if (each.split("_")[1].equals(drink.toString().split("_")[0])) {
                    total += Double.parseDouble(each.split("_")[2]) * Double.parseDouble(drink.toString().split("_")[1]);
                }
            }
            
        }

        return total;
    }

    // requirement 5
    public Staff getStaffHighestBillInMonth(int month) {
        Staff maxStaff = null;
        List<String> receiptDetails = new ArrayList<String>();        


        for(Invoice eachReceipt : invoices) {
            for(InvoiceDetails eachDrink : invoiceDetails) {
                String[] drink = eachDrink.toString().split("_");
                if (drink[0].equals(eachReceipt.toString().split("_")[0])) {
                    int monthInDate = Integer.parseInt((eachReceipt.toString().split("_")[2]).split("/")[1]);
                    if ( monthInDate == month ) {
                        receiptDetails.add(eachReceipt.toString().split("_")[1] + "_" + eachDrink.toString());
                    }
                }
            }
        }

        List<String> data = new ArrayList<String>();        
        for (String each : receiptDetails) {
            for (Drink drink : this.drinks) {
                if (each.split("_")[2].equals(drink.toString().split("_")[0])) {
                    data.add(each + "_" + drink.toString().split("_")[1]);
                }
            }
        }

        List<String> lastData = new ArrayList<String>();        
        for (String each : data) {
            double total = Double.parseDouble(each.split("_")[3]) * Double.parseDouble(each.split("_")[4]);
            lastData.add(each + "_" + total);
        }
        

        List<Double> result = new ArrayList<Double>();
        List<String> temp = new ArrayList<String>();        
        for (Invoice eachInvoice : invoices) {
            double sum = 0;
            for (String each : lastData) {
                if (eachInvoice.toString().split("_")[1].equals(each.split("_")[0])) {
                    sum += Double.parseDouble(each.split("_")[5]);
                }
                
            }
            
            temp.add(eachInvoice.toString().split("_")[1] + "_"+ sum);
            result.add(sum);
        }

        double max = Collections.max(result);

        String id = new String("");
        for (String i : temp) {
            if (max == Double.parseDouble(i.toString().split("_")[1])) {
                id = i.split("_")[0];
                break;
            }
        }

        for (Staff each : this.staffs) {
            if (each.toString().split("_")[0].equals(id)) {
                if (id.contains("TV")) {
                    maxStaff = new SeasonalStaff(id, each.sName, Integer.parseInt(each.toString().split("_")[2]));
                }
                if (id.contains("CT")) {
                    maxStaff = new FullTimeStaff(id, each.sName, Integer.parseInt(each.toString().split("_")[3]), Double.parseDouble(each.toString().split("_")[2]));
                }
                if (id.contains("QL")) {
                    maxStaff = new Manager(id, each.sName, Integer.parseInt(each.toString().split("_")[3]), Double.parseDouble(each.toString().split("_")[2]), Integer.parseInt(each.toString().split("_")[4]));
                }
            }
        }

        return maxStaff;
    }

    // load file as list
    public static ArrayList<String> loadFile(String filePath) {
        String data = "";
        ArrayList<String> list = new ArrayList<String>();

        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader fReader = new BufferedReader(reader);

            while ((data = fReader.readLine()) != null) {
                list.add(data);
            }

            fReader.close();
            reader.close();

        } catch (Exception e) {
            System.out.println("Cannot load file");
        }
        return list;
    }

    public void displayStaffs() {
        for (Staff staff : this.staffs) {
            System.out.println(staff);
        }
    }

    public <E> boolean writeFile(String path, ArrayList<E> list) {
        try {
            FileWriter writer = new FileWriter(path);
            for (E tmp : list) {
                writer.write(tmp.toString());
                writer.write("\r\n");
            }

            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error.");
            return false;
        }

        return true;
    }

    public <E> boolean writeFile(String path, E object) {
        try {
            FileWriter writer = new FileWriter(path);

            writer.write(object.toString());
            writer.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error.");
            return false;
        }

        return true;
    }
}