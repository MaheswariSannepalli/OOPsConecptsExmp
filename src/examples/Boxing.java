package examples;

import java.util.ArrayList;

class PrimitiveToPrimitive{
	
	 public static void addValues()
	 {
        int total = 0;
        int num =10 ;
        long startTime = System.nanoTime();
       for (int i = 0; i< 10000; i++) 
       {
     	 //no  unboxing or boxing
          total = total + num ;
       }
     long elapsedTime = System.nanoTime() - startTime;

     System.out.println( " PrimitiveToPrimitive finding total sum : "+elapsedTime/10000 + "milli seconds"); 
	 }
}

class ObjectToObject{
	 public static void addValues()
	 {
        Long total = 0L;
    	Integer num =10 ;
        long startTime = System.nanoTime();
       for (int i = 0; i< 10000; i++) 
       {
     	 // 2 unboxings and  boxing
          total = total + num ;
       }
     long elapsedTime = System.nanoTime() - startTime;

     System.out.println( "ObjectToObject finding total sum : "+elapsedTime/10000 + "milli seconds"); 
	 }
}
class PrimitiveToObject{
	 public static void addValues()
	 {
       Long total = 0L;
       int num =10 ;
       long startTime = System.nanoTime();
       for (int i = 0; i< 10000; i++) 
       {
     	 // unboxing and  boxing
          total = total + num ;
       }
     long elapsedTime = System.nanoTime() - startTime;

     System.out.println( "ObjectToPrimitive finding total sum : "+elapsedTime/10000 + "milli seconds"); 
	 }
}
class ObjectToPrimitive{
	 public static void addValues()
	 {
        long total = 0;
        Integer num =10 ;
        long startTime = System.nanoTime();
       for (int i = 0; i< 10000; i++) 
       {
     	 // unboxing 
          total = total + num ;
       }
     long elapsedTime = System.nanoTime() - startTime;

     System.out.println( "PrimitiveToObject finding total sum : "+elapsedTime/10000 + "milli seconds"); 
	 }
}
public class Boxing {

	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>(10000);
		Integer num =10 ;
		long startTime = System.nanoTime();
		for(int i=0;i<10000;i++)
		{
			list.add(num) ;
		}
		long elapsedTime = System.nanoTime() - startTime;

	     System.out.println( "ObjectToObject adding to arraylist : "+elapsedTime/10000 + "milli seconds"); 

		ArrayList<Integer> list2 = new ArrayList<>(10000);
		long startTime2 = System.nanoTime();
		for(int i=0;i<10000;i++)
		{
			list2.add(i) ;
		}
		long elapsedTime2 = System.nanoTime() - startTime2;

	     System.out.println( "PrimitiveToObject adding to arraylist  : "+elapsedTime2/10000 + "milli seconds"); 
		ObjectToObject.addValues();
		ObjectToPrimitive.addValues();
		PrimitiveToObject.addValues();
		PrimitiveToPrimitive.addValues();
	}
}
