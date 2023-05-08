package ClassPack;

public class Employee {
  private String employeeName;
  private String employeeJobTitle;
  private int salary;
  
  public Employee(String employeeName, String employeeJobTitle, int salary){
    this.employeeName = employeeName;
    this.employeeJobTitle = employeeJobTitle;
    this.salary = salary;
  }
  public String getEmployeeName(){
    return employeeName;
    
  }
  public String getemployeeJobTitle(){
    return employeeJobTitle;

  }
  public int getSalary(int salary){
    int attendance = 24;

    int getSalary = attendance * salary;

    return getSalary;
  }

}



