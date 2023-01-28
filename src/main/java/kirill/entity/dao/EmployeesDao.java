package kirill.entity.dao;

import kirill.entity.Employees;

import java.util.List;

public interface EmployeesDao {
    public List<Employees> getAllemps();

   public void saveEmp(Employees emps) ;

    public Employees getEmployee(int id);
    public void removeEmp(int id);
}
