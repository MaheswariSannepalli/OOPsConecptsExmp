package stateBoardSchoolsInfo;

class  StateBoardSchools{
	private int school_id ; 
	private String school_name ;
	
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public int getSchool_id() {
		return school_id;
	}
	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}
	
	//Departments are part of school . but they don't differ with every instance of school
	public static class SubjectDepartments{
		
		private int subject_code ; 
		private String subject_name ;
		
		public int getSubject_code() {
			return subject_code;
		}
		public void setSubject_code(int subject_code) {
			this.subject_code = subject_code;
		}
		public String getSubject_name() {
			return subject_name;
		}
		public void setSubject_name(String subject_name) {
			this.subject_name = subject_name;
		}
	}
	
	//But a school may have branches at different locations
	public class UserAddress{
		private String city;
		private int pin_code;
	
		public void setCity(String city)
		{
			this.city = city ;
		}
		public String getCity()
		{
			return city ;
		}
		public void setPin_code(int pin_code)
		{
			this.pin_code = pin_code ;
		}
		public int getPin_code()
		{
			return pin_code ;
		}
	}
}
