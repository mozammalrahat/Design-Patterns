import java.util.ArrayList;

public class EmployeeAdapter extends ThirdPartyBillingSystem implements ITarget {

    @Override
    public void processCompanySalary(String[][] employeeInfo) {
        
        String employeeID = null;
        String employeeName = null;
        String designation = null;
        
        ArrayList<Employee>employeeList = new ArrayList<Employee>();

        for(int i=0;i<employeeInfo.length;i++){

            for(int j = 0; j<employeeInfo[i].length;j++){
                
                if(j==0)
                    employeeID = employeeInfo[i][j];
                else if(j==1)
                    employeeName = employeeInfo[i][j];
                else if(j==2)
                    designation = employeeInfo[i][j];

                
            }

            employeeList.add(new Employee(Integer.parseInt(employeeID), employeeName, designation));
        }
        System.out.println("Adapter converted Array of Employee to ArrayList of Employee : \n"+employeeList+"\n"+
						"then call the processSalary method inherited from the ThirdPartyBillingSystem for processing the employee salary");
				processSalary(employeeList);
    }
    
}
