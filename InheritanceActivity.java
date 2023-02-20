class Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;

    public Employee(long employeeId, String employeeName, String employeeAddress, Long employeePhone, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);

    }

    public double calculateTransportAllowance(){
        return (10.0/100)*basicSalary;
    }
}

 class Manager extends Employee {
    public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }

     @Override
     public double calculateTransportAllowance() {
         return (15.0/100)*basicSalary;
     }
 }

 class Trainee extends Employee {
    public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }
}

public class InheritanceActivity {
    public static void main(String[] args) {
        Manager m = new Manager(126534, "Peter", "Chennai, India", 237844, 65000);
        Trainee t = new Trainee(29846, "Jack", "Mumbai, India", 442085, 45000);
        System.out.println(m.employeeName +"'s salary: " + m.calculateSalary());
        System.out.println(m.employeeName +"'s transport allowance: " + m.calculateTransportAllowance());
        System.out.println(t.employeeName +"'s salary: " + t.calculateSalary());
        System.out.println(t.employeeName +"'s transport allowance: " + t.calculateTransportAllowance());
    }
}