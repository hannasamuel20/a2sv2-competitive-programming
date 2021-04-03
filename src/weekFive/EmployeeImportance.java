package weekFive;


import java.util.List;

// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

public class EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        Employee emp = getEmployee(employees,id);
        return doDfs(employees,emp.subordinates,emp.id);

    }

    public Employee getEmployee(List<Employee> employees,int id){
        for(int i=0; i<employees.size(); i++){
            if(employees.get(i).id == id){
                return employees.get(i);
            }
        }
        return null;
    }

    public int doDfs(List<Employee> employees,List<Integer> subordinates,int id){

        if(subordinates.size() == 0){
            return getEmployee(employees,id).importance;
        }

        Employee emp = getEmployee(employees,id);
        int imp = emp.importance;

        for(int i=0; i<subordinates.size(); i++){
            Employee emp2 = getEmployee(employees,subordinates.get(i));
            imp +=  doDfs(employees,emp2.subordinates,emp2.id);


        }



        return  imp;

    }
}
