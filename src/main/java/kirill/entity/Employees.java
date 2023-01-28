package kirill.entity;

import javax.persistence.*;

@Entity
public class Employees {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", nullable = true, length = 15)
    private String name;
    @Column(name = "surname", nullable = true, length = 25)
    private String surname;
    @Column(name = "department", nullable = true, length = 20)
    private String department;
    @Column(name = "salary", nullable = true)
    private Integer salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


}
