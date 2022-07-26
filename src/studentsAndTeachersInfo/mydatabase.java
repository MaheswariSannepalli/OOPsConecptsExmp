package studentsAndTeachersInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//database interface contains common features for implementing any database
interface database{
	void saveTeacher(UserDetails s , int salary);
	void saveStudent(UserDetails s );
	void showTeacher(int id,int password);
	void showStudent(int id,int password);
}

//our database , we can choose any database but the function input and output should be same . makes it easy to change for new environment
class mydatabase implements database{
	
	//in this database we are storing details in list and map
    ArrayList<UserDetails> students = new  ArrayList<UserDetails>();
    Map<UserDetails,Integer> teachers = new  HashMap<UserDetails,Integer>();
    
    
	public void saveTeacher(UserDetails s , int salary) {
		teachers.put(s,salary);
	}
	public void showTeacher(int id,int password) 
	{
		Iterator<Entry<UserDetails, Integer>> itr = teachers.entrySet().iterator();
    
        while(itr.hasNext())
        {
             Map.Entry<UserDetails, Integer> entry = itr.next();
             //checking password and id and displaying data
             if(entry.getKey().getId() == id && entry.getKey().getPassword_hash() == Integer.hashCode(password))
             {
            	     UserDetails u = entry.getKey();
	            	System.out.println("name : "+u.getId()+" id : "+u.getName()+" gender : "+u.getGender()+ " age : "+u.getAge() +" phn number : "+u.getPhn_number(password)+" salary : "+entry.getValue());
	            }
	            break ;
        }
	}
    public void saveStudent(UserDetails s) {
		students.add(s) ;
	}
	public void showStudent(int id,int password) {
		 Iterator it = students.iterator();
	        while (it.hasNext()) {
	        	UserDetails u = (UserDetails) it.next();
	        	  //checking password and id and displaying data
	            if( u.getId() == id && u.getPassword_hash() == Integer.hashCode(password) )
	            {
	            	System.out.println("name : "+u.getId()+" id : "+u.getName()+" gender : "+u.getGender()+ " age : "+u.getAge() +" phn number : "+u.getPhn_number(password));
	            }
	            break ;
	        }
	}
}