package com.shine.poonam;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> 
{
   
	/*List<Student>findByNameAndAge(String name,int age);*/
	/*List<Student>findByfirstName(String firstName);*/
	/*@Query("select s from Student s")
	List<Student>all();*/
	@Query("select s from Student s where s.age=?1")
	Student getByAge(int age);
	
}
