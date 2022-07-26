package studentsAndTeachersInfo;

//encapsulation - binding of variables with methods
class UserDetails{
	private int id ;
	private String name ;
	private int age ;
	private String gender ;
	private int phn_number ;
	private final int password ;
	
	UserDetails(int password)
	{
		this.password =  password ;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//data will be secured
	public int getPhn_number(int password) {
		if(this.password == password)
		{
		    return phn_number ; 
		}
		return 0 ;
	}
	public void setPhn_number(int phn_number,int password) {
		if(this.password == password)
		{
			this.phn_number = phn_number ;
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPassword_hash()
	{
		return Integer.hashCode(password);
	}
}
