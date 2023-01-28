package kirill.entity.service;

import kirill.entity.Employees;
import kirill.entity.dao.EmployeesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeesDao employeesDao;
    @Override
    @Transactional
    public List<Employees> getAllemps() {
        return employeesDao.getAllemps();
    }

    @Override
    @Transactional
    public void saveEmp(Employees emps) {
        employeesDao.saveEmp(emps);

    }
    @Override
    @Transactional
    public Employees getEmployee(int id) {
        return employeesDao.getEmployee(id);
    }

    @Override
    @Transactional
    public void removeEmp(int id) {
        employeesDao.removeEmp(id);
    }
}
