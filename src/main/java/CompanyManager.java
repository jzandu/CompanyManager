
import java.util.Date;
import java.util.List;


public interface CompanyManager {

    void addCompany(String companyName, String description);
    void addEmployee(String name, String surname, Date birthday, double salary, String companyName);// throws MyException;
    List<Employee> findAllEmployeesOrderedByName();
    List<Employee> findAllEmployeesOrderedBySalary();
    List<Employee> employees(String company);
    List<Company> findAllCompanies();
}
