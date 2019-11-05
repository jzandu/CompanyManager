import java.util.Date;

 public class Employee implements Comparable<Employee>{
    private String name;
    private String surname;
    private Date birthday;
    private double salary;
    private String companyName;

    public Employee(){
    }

    public Employee(String name, String surname, Date birthday, double salary, String companyName) {
        this.setName(name);
        this.setSurname(surname);
        this.setBirthday(birthday);
        this.setSalary(salary);
        this.setCompanyName(companyName);
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
    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }


}
