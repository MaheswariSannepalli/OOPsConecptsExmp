package stateBoardSchoolsInfo;

public class User {
	 public static void main(String[] args)
	    {
		   //static class instances
		   StateBoardSchools.SubjectDepartments subject1 = new  StateBoardSchools.SubjectDepartments();
		 	subject1.setSubject_code(76989);
		 	subject1.setSubject_name("mathematics");
		 	SaveDetails.subject(subject1);
		 	System.out.println("subject detaiils saved successfully");
		 	
		 	StateBoardSchools.SubjectDepartments subject2 = new  StateBoardSchools.SubjectDepartments();
		 	subject2.setSubject_code(76988);
		 	subject2.setSubject_name("science");
		 	SaveDetails.subject(subject2);
		 	System.out.println("subject detaiils saved successfully");
		 	
		 	StateBoardSchools.SubjectDepartments subject3 = new  StateBoardSchools.SubjectDepartments();
		 	subject3.setSubject_code(76987);
		 	subject3.setSubject_name("telugu");
		 	SaveDetails.subject(subject3);
		 	System.out.println("subject detaiils saved successfully");
		 	
		 	StateBoardSchools.SubjectDepartments subject4 = new  StateBoardSchools.SubjectDepartments();
		 	subject4.setSubject_code(76986);
		 	subject4.setSubject_name("social");
		 	SaveDetails.subject(subject4);
		 	System.out.println("subject detaiils saved successfully");
		 	
		 	//instances of outer class
		 	StateBoardSchools school1 = new StateBoardSchools();
		 	school1.setSchool_id(8976);
		 	school1.setSchool_name("vidya vikas");
		 	SaveDetails.school(school1);
		 	System.out.println("school detaiils saved successfully");
		 	
		 	//instances of non-static inner class
		 	StateBoardSchools.UserAddress address1 = school1.new UserAddress();
		 	address1.setCity("jangareddy gudem");
		 	address1.setPin_code(507121);
		 	SaveDetails.address(school1,address1);
		 	System.out.println("school address detaiils saved successfully");
		 	
		 	StateBoardSchools.UserAddress address2 = school1.new UserAddress();
		 	address2.setCity("aswaraopet");
		 	address2.setPin_code(507098);
		 	SaveDetails.address(school1,address2);
		 	System.out.println("school address detaiils saved successfully");
		 	
		 	displayDetails.subjectDetails();
		 	displayDetails.schoolDetails();
	    }
}
