package klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import klu.model.Department;


public interface ClientRepository extends JpaRepository<Department, Long> 
{

	@Query("delete Department d where d.DepartmentId=?1")
	int deleteById(String depid);



}
