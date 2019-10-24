import java.util.Date;

public class Employee implements Comparable {
    private String name;
    private String surname;
    private Date birthday;
    private double salary;
    private String companyName;

    public Employee(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    //public int compareTo(Employee o) {
      //  return o.getName().compareTo(this.name);
    //}


    @Override
    public int compareTo(Employee o) {
        Employee e = new Employee();
        e.setName("Aa");
        return (int)(o.name - e.name);
    }
}
