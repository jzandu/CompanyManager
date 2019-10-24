import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Sesion implements CompanyManager{

    public void addCompany(String companyName, String description) {
        Company c = new Company();
        c.setCname(companyName);
        c.setDescription(description);
    }

    public void addEmployee(String name, String surname, Date birthday, double salary, String companyName) throws MyException {
        Employee e = new Employee();
        e.setName(name);
        e.setSurname(surname);
        e.setBirthday(birthday);
        e.setSalary(salary);
        e.setCompanyName(companyName);
    }

    public List<Employee> findAllEmployeesOrderedByName() {
        List<Employee> e = new (LinkedList<Employee>)employees();
        return null;
    }

    public List<Employee> findAllEmployeesOrderedBySalary() {
        return null;
    }

    public List<Employee> employees(String company) {
        return null;
    }

    public List<Company> findAllCompanies() {
        return null;
    }
}
