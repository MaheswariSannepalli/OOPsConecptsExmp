package studentsAndTeachersInfo;

//abstraction is provided by this interface , user will not know the internal working of the functions 
interface MemberOfSchool{
	//for displaying details of any member of school
	void displayDetails(int id,int password);
	//for saving details
	void saveDetails(int id , String name , int age , String gender , int phn_number , int password);
}


public class User {
	public static void main(String[] args)
	{
		//a student object is created
		MemberOfSchool m1 = new student();
	    m1. saveDetails(3456,"maheswari",19,"female",897486337,123456);
	    m1.displayDetails(3456,123456);
	    
		MemberOfSchool m2 = new MathsTeacher();
	    m2. saveDetails(7856,"sree",29,"female",77486337,123456);
	    m2.displayDetails(7856,123456);
	}
}

