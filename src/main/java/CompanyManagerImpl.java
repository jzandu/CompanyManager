import java.util.*;

public class CompanyManagerImpl implements CompanyManager{
    /*Nos hace falta crear la lista como atributo */
    List<Employee> employees;
    HashSet<Company> companies;

    /*Hay que crear el constructor siempre*/
    public CompanyManagerImpl() {
        this.employees = new LinkedList<Employee>();
        this.companies = new HashSet<>();
    }

    public void addCompany(String companyName, String description) {
        Company c = new Company(companyName, description);
        this.companies.add(c);

    }

    public void addEmployee(String name, String surname, Date birthday, double salary, String companyName){//throws MyException {
        Employee e = new Employee(name,surname, birthday, salary,companyName);
        this.employees.add(e);
    }

    public List<Employee> findAllEmployeesOrderedByName() {
        List e = new LinkedList<Employee>();
        e.addAll(this.employees);
        Collections.sort(e);
        return e;
    }

    public List<Employee> findAllEmployeesOrderedBySalary() {
        List e = new LinkedList<Employee>();
        e.addAll(this.employees);
        List e2 = new ListIterator<Employee>();
        Collection.sort(e.salary);
        return null;
    }

    public List<Employee> employees(String company) {
        return null;
    }

    public List<Company> findAllCompanies() {
        return null;
    }
}
