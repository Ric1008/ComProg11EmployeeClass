public class Employee {
private int id;
private String firstName;
private String lastName;
private double salary;
static int plyeeNum=1 ;
Employee(){
    id=plyeeNum;
    plyeeNum++;
    firstName="Jade ";
    lastName="Doe ";
    salary=21 ;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName(){
    return firstName+lastName;
    }
    public double getYearSalary(){
    return salary*12;
    }
    public void raisesalary(int percent){
    double decimalPercent=percent/100;
    double extramoney=salary*decimalPercent;
            this.salary=salary+extramoney;
    }
    public String toString(){
        return "\"Employee [ "+id+", name = "+firstName+lastName+", "+salary+ " ]\"";
    }
}
