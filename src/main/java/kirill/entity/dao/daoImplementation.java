package kirill.entity.dao;

import kirill.entity.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
 public class daoImplementation implements EmployeesDao{
    @Autowired
    private SessionFactory sessionFactory;

    public List<Employees> getAllemps() {
    Session session = sessionFactory.getCurrentSession();
    List<Employees> allemployees = session.createQuery("from Employees", Employees.class)
            .getResultList();
    return allemployees;
    }

   @Override
   public void saveEmp(Employees emps) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(emps);
   }

    @Override
    public Employees getEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employees emp = session.get(Employees.class,id);
        return emp;
    }

    @Override
    public void removeEmp(int id) {
        Session session = sessionFactory.getCurrentSession();
       session.createQuery("delete from Employees where id=:empid")
               .setParameter("empid", id)
               .executeUpdate();
    }
}
