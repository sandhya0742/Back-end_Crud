package com.management.Services;
import com.management.Entity.Employee;
import com.management.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServices {
    @Autowired
    private EmployeeRepo repo;
    public List<Employee>listAll(){
        return repo.findAll();
    }
    public void  save(Employee employee)
    {
        repo.save(employee);
    }
    public  Employee get(Long id){
        return repo.findById(id).get();
    }
    public  void  delete(Long id){
        repo.deleteById(id);
    }
}
