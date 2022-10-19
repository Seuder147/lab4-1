import java.util.ArrayList;
import java.util.List;

public class Employee {
    protected int id;
    protected static int nextid = 0;
    protected String name;
    protected String dept;
    int manid;
    protected List<Employee> subordinates;

    public Employee(String name, String dept) throws FieldLengthLimitException{
        this.id = nextid++;
        if(name.length() > 20){
            throw new FieldLengthLimitException("Name must be less then 20 sumbols");
        }
        else {
            this.name = name;
        }
        this.dept = dept;
        subordinates = new ArrayList<Employee>();
    }
    public Employee(){
    }

    public String getName() {
        return name;
    }

    public void add(Employee a){
        subordinates.add(a);
    }

    public void remove(Employee a){
        subordinates.remove(a);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public void printEmployee(){
        System.out.println("Employee : Name " + name + " , dept " + dept + " managerID : " + manid);
    }
}
