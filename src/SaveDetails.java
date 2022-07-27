package stateBoardSchoolsInfo;

class SaveDetails{
	static DataBase db = new File();
	public static void subject(StateBoardSchools.SubjectDepartments sjt)
	{
		db.savesubject(sjt );
	}
	public static void school(StateBoardSchools s)
	{
		db.saveSchool(s) ;
	}
	public static void address(StateBoardSchools s , StateBoardSchools.UserAddress a)
	{
		db.saveAddress(s,a) ;
	}
}
class displayDetails{
	static DataBase db = new File();
	public static void subjectDetails()
	{
		db.subjectDetails();
	}
	public static void schoolDetails()
	{
		db.schoolDetails();
	}
}