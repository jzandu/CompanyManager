import java.util.*;

public class CompanyManagerImpl implements CompanyManager{

    public void addCompany(String companyName, String description) {
        Company c = new Company();
        c.setCname(companyName);
        c.setDescription(description);
    }

    public void addEmployee(String name, String surname, Date birthday, double salary, String companyName){//throws MyException {
        Employee e = new Employee();
        e.setName(name);
        e.setSurname(surname);
        e.setBirthday(birthday);
        e.setSalary(salary);
        e.setCompanyName(companyName);
    }

    public List<Employee> findAllEmployeesOrderedByName() {
        return Collections.sort(Comparator.naturalOrder());
    }

    //public List<Employee> findAllEmployeesOrderedByName() {
      //  List e = new List<Employee>;
        //return e.sort(Comparator.naturalOrder());
    //}

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
