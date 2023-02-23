package com.shine.poonam;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController 
{
	@Autowired
	StudentRepository Srepo;
	/*@RequestMapping("/Save")
	public String Save()
	{
		Student s=new Student();
		s.setName("sujal");
		s.setCity("ranchi");
		s.setAge(20);
		Srepo.save(s);
		return "Data saved";
	}*/
	
	//---------------------------------------------------//
	
	
	/*@RequestMapping("/{name}/{city}/{age}")
	public String input(@PathVariable String name,
			@PathVariable String city,
			@PathVariable Integer age)
	{
		Student s=new Student();
		s.setName(name);
		s.setCity(city);
		s.setAge(age);
		Srepo.save(s);
		return"data saVED";
	}*/
	
	//----------------------------------------------------//
	
	
	/*@RequestMapping("/saveall")
	public String Saveall()
	{
		Student s1=new Student();
		s1.setName("sujal");
		s1.setCity("ranchi");
		s1.setAge(20);
		
		Student s2=new Student();
		s2.setName("shashi");
		s2.setCity("patna");
		s2.setAge(25);
		
		Student s3=new Student();
		s3.setName("krishna");
		s3.setCity("dhanbad");
		s3.setAge(30);
		
		Student s4=new Student();
		s4.setName("suraj");
		s4.setCity("bokaro");
		s4.setAge(18);
		
		List<Student> list=Arrays.asList(s1,s2,s3,s4);
		Srepo.saveAll(list);
		return"all data saved";
	}*/
	
	//---------------------------------------------------------------//
	
	
	/*@RequestMapping("/all")
	public List<Student> all()
	{
		return Srepo.findAll();
	}*/
	
	//-------------------------------------------------------------------//
	
	/*@RequestMapping("/{id}")
	public Student byid(@PathVariable int id)
	{
		/*return Srepo.findById(id);
		return Srepo.deleteById(id);
	}*/
	
	//--------------------------------------------------------------------//
	
	/*@RequestMapping("/{id}")
	public String byid(@PathVariable int id)
	{
		Student s=new Student();
		s.setName("rahul");
		s.setCity("giridih");
		s.setAge(19);
		
		Srepo.save(s);
		return"data updated";
	}*/
	
	//---------------------------------------------------------------------------//
	
	/*@RequestMapping("/{name}/{age}")
	public List<Student> Byname(@PathVariable String name,@PathVariable int age)
	{
		return Srepo.findByNameAndAge(name,age);
	}*/
	
	//------------------------------------------------------------------------------//
	
	/*@RequestMapping("/{firstName}")
	public List<Student> ByfirstName(@PathVariable String firstName)
	{
		return Srepo.findByfirstName(firstName);
	}*/
	
	//------------------------------------------------------------------------//
	
	/*@RequestMapping("/all")
	public List<Student> all()
	{
		return Srepo.all();
	}*/
	
	//---------------------------------------------------------------------------//

	@RequestMapping("/age")
	public Student getByAge(@PathVariable int age)
	{
		return Srepo.getByAge(age);
	}
	
	//---------------------------------------------------------------------------//
}
