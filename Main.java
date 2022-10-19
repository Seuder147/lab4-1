public class Main {
    public static void main(String[] args) throws FieldLengthLimitException{
        Manager CEO = new Manager("Mary","CEO");
        Employee headSales = new Employee("Jack","Head Sales");
        Employee headDeveloper = new Employee("Kate","Head Developer");
        headSales.manid = CEO.id;
        headDeveloper.manid = CEO.id;

        Employee sale1 = new Employee("Nick","Sales");
        Employee sale2 = new Employee("Luck","Sales");
        sale1.manid = headSales.id;
        sale2.manid = headSales.id;

        Employee develop1 = new Employee("Mey","Developer");
        Employee develop2 = new Employee("Lin","Developer");
        develop1.manid = headDeveloper.id;
        develop2.manid = headDeveloper.id;

        CEO.add(headSales);
        CEO.add(headDeveloper);

        headSales.add(sale1);
        headSales.add(sale2);

        headDeveloper.add(develop1);
        headDeveloper.add(develop2);

        CEO.printEmployee();

        for(Employee headEmployee : CEO.getSubordinates()){
            headEmployee.printEmployee();

            for (Employee employee : headEmployee.getSubordinates()){
                employee.printEmployee();
            }
        }
    }
}