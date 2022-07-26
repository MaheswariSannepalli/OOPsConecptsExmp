package studentsAndTeachersInfo;

class student implements MemberOfSchool{
	
	database db = new mydatabase();
	public void displayDetails(int id,int password)
	{
		db.showStudent(id,password);
	}
	public void saveDetails(int id , String name , int age , String gender , int phn_number , int password) 
	{
		 UserDetails u1  = new UserDetails(password);
	   	   u1.setId(id);
		   u1.setAge(age);
		   u1 .setName(name);
		   u1 .setGender(gender);
		   u1 .setPhn_number(phn_number,password);
	       db.saveStudent(u1);
	} 
}

//in future the school may extend it's system for workers or part timers also . then this employee interface can be implemented for them also
interface Employee{
    int getSalary();
}

//display details is the common method for all teachers
//multiple inheritance is achieved here by interfaces
abstract class teacher implements MemberOfSchool , Employee{

	database db = new mydatabase();
	public void displayDetails(int id,int password)
	{
		db.showTeacher(id,password);
	}
}

//inheritance
class MathsTeacher extends teacher{

	private int salary =  800000 ;
	public int getSalary() {
		return salary ;
	}
	public void saveDetails(int id , String name , int age , String gender , int phn_number , int password)
	{
		   UserDetails u1  = new UserDetails(password);
	   	   u1.setId(id);
		   u1.setAge(age);
		   u1 .setName(name);
		   u1 .setGender(gender);
		   u1 .setPhn_number(phn_number,password);
	       db.saveTeacher(u1,salary);	
	}
}


class ScienceTeacher extends teacher{

	private int salary =  750000 ;
	public int getSalary() {
		return salary ;
	}
	public void saveDetails(int id , String name , int age , String gender , int phn_number , int password)
	{
		   UserDetails u1  = new UserDetails(password);
	   	   u1.setId(id);
		   u1.setAge(age);
		   u1 .setName(name);
		   u1 .setGender(gender);
		   u1 .setPhn_number(phn_number,password);
	       db.saveTeacher(u1,salary);	
	}
}