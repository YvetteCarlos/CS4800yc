import java.util.ArrayList;
import java.util.List;

public class Inheritance {
    public static void main(String[] args){
    List<baseEmployee> empInfo = new ArrayList<>();
        empInfo.add(new baseEmployee("Joe", "Jones", "111-11-1111","$2,500","","","","",""));
        empInfo.add(new baseEmployee("Stephanie", "Smith", "222-22-2222","","$25","32","","",""));
        empInfo.add(new baseEmployee("Mary", "Quinn", "333-33-3333","","$19","47","","",""));
        empInfo.add(new baseEmployee("Nicole", "Dior", "444-44-4444","","","","15%","$50,000",""));
        empInfo.add(new baseEmployee("Renwa", "Chanel", "555-55-5555","$1,700","","","","",""));
        empInfo.add(new baseEmployee("Mike", "Davenport", "666-66-6666","","","","","","$95,000"));
        empInfo.add(new baseEmployee("Mahnaz", "Vaziri", "777-77-7777","","","","22%","$40,000",""));

        System.out.printf("%-14s%-14s%-15s%-18s%-10s%-14s%-14s%-16s%-18s\n",
                "First name:", "Last name:", "Social Sec#:",
                "Weekly Salary:" , "Wage:", "Hrs. Worked:",
                "Com. rate:", "Gross Salary:", "Base Salary:");
        for (baseEmployee e: empInfo){
            System.out.printf("%-14s%-14s%-15s%-18s%-10s%-14s%-14s%-16s%-18s",
                                e.getFirstName(),e.getLastName(),e.getSsn(),e.getWklySal(),
                                e.getWage(),e.getHoursWorked(),e.getComRate(),e.getGrossSales(),
                                e.getBaseSalary());
            System.out.println();
        }
        }
    }
class Employee {
    //instance variables
   private String firstName;
   private String lastName;
   private String ssn;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setSsn(String ssn){
        this.ssn = ssn;
    }

    public String getSsn(){
        return ssn;
    }
}

class SalariedEmployee extends Employee{
    //instance variables
    private String wklySal;

    public String getWklySal() {
        return wklySal;
    }

    public void setWklySal(String wklySal) {
        this.wklySal = wklySal;
    }

}

class HourlyEmployee extends SalariedEmployee{
    //instance variables
    private String wage;//wage

    public String getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(String hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    private String hoursWorked; //#hrsworked

    public String getWage() {
        return wage;
    }
    public void setWage(String wage) {
        this.wage = wage;
    }
}

class ComissionEmployee extends HourlyEmployee{
    //instance variables
    private String comRate;//commission rate
    private String grossSales;//gross sales

    public String getComRate() {
        return comRate;
    }

    public void setComRate(String comRate) {
        this.comRate = comRate;
    }

    public String getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(String grossSales) {
        this.grossSales = grossSales;
    }

}

class baseEmployee  extends ComissionEmployee{
    private String baseSalary;

    public String getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(String baseSalary) {
        this.baseSalary = baseSalary;
    }

    public baseEmployee(String firstName, String lastName, String ssn, String wklySal,
                        String wage, String hoursWorked, String comRate, String grossSales, String baseSalary){
        super();
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSsn(ssn);
        this.setWklySal(wklySal);
        this.setWage(wage);
        this.setHoursWorked(hoursWorked);
        this.setComRate(comRate);
        this.setGrossSales(grossSales);
        this.setBaseSalary(baseSalary);
    }
}




