public class HumanResourceSystem {
    
    public static String[][] getEmployees(){

        String[][] employees = new String[4][];

        employees[0] = new String[] { "100", "Dave", "Team Leader" };
        employees[1] = new String[] { "101", "Ram", "Developer" };
        employees[2] = new String[] { "102", "Raj", "Developer" };
        employees[3] = new String[] { "103", "Rahul", "Tester" };

        return employees;
    }
    public static void main(String[] args) {
        
        ITarget itarget = new EmployeeAdapter();
        System.out.println("HR system passes employee string array to Adapter\n");
        itarget.processCompanySalary(getEmployees());
    }
}
