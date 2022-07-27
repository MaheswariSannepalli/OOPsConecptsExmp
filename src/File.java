package stateBoardSchoolsInfo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//interface for database
interface DataBase
{
		void savesubject(StateBoardSchools.SubjectDepartments sjt);
		void saveSchool(StateBoardSchools s );
		void saveAddress(StateBoardSchools s , StateBoardSchools.UserAddress a);
		void subjectDetails();
		void schoolDetails() ;
}
//here we are choosing file fo storing
class File implements DataBase
{

		public void savesubject(StateBoardSchools.SubjectDepartments sjt) {
			
			try ( FileWriter fw = new FileWriter("C:subjects.txt");
					   BufferedWriter bw = new BufferedWriter(fw); ) 
			{
				bw.write(sjt.getSubject_code()+"  "+sjt.getSubject_name() );
			 } 
			catch (IOException e ) 
			{
			    System.out.println(e);
			}
		}
	    public void saveSchool(StateBoardSchools s) {
			
			try ( FileWriter fw = new FileWriter("C:schools.txt");
					   BufferedWriter bw = new BufferedWriter(fw); ) 
			{
				bw.write(s.getSchool_id()+"  "+s.getSchool_name() );
			 } 
			catch (IOException e ) 
			{
			    System.out.println(e);
			}
		}
	    public void saveAddress(StateBoardSchools s , StateBoardSchools.UserAddress a) {
			
			try ( FileWriter fw = new FileWriter("C:schoolAddresses.txt");
					   BufferedWriter bw = new BufferedWriter(fw); ) 
			{
				bw.write(s.getSchool_id()+"  "+a.getCity() +" "+a.getPin_code() );
			 } 
			catch (IOException e ) 
			{
			    System.out.println(e);
			}
		}
	    public void subjectDetails() {
			
			try ( FileReader fw = new FileReader("C:subjects.txt");
					   BufferedReader bw = new BufferedReader(fw); ) 
			{
				String line ;
				while((line = bw.readLine())!= null) {
				 System.out.println(line);}
			 } 
			catch (IOException e ) 
			{
				//checked to unchecked exception
				//an Exception which a user cannot recover  , without the file user will not be able to save . the exceptions which must be corrected are thrown as runtime exceptions
				if(e instanceof FileNotFoundException)
				{
					throw new RuntimeException(e);
				}
			}
		}
	    public void schoolDetails() {
			
			try ( FileReader fr = new FileReader("C:schoolAddresses.txt");
					   BufferedReader br = new BufferedReader(fr); ) 
			{
				 System.out.println(br.readLine());
			 } 
			catch (IOException e ) 
			{
				//an Exception which a user cannot recover  , without the file user will not be able to save . the exceptions which must be corrected are thrown as runtime exceptions
				if(e instanceof FileNotFoundException)
				{
					throw new RuntimeException(e);
				}
			}
	    }
}
