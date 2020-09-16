/*
	Program to apply the String split method.
	sample code maybe be found at:  http://www.java-examples.com/java-string-split-example
*/

public class StringSplitMethodTest
{
	public static void main(String [] args)
	{
	
		String id = "345-67-8912";						//original string
		
		String [] idTemp = id.split("-");				//temporary storage after split
																// note: string is split into an array of strings
																
		String idConcatenated = null;							//string storage of concatenated, split string
		
		for(int i = 0; i < idTemp.length; i++)		//loop through string to concatenate split elements
		{
			if(idConcatenated == null)					//remove initial null value during first iteration of loop
				idConcatenated = idTemp[i];			//store first parsed element set
			else
				idConcatenated += idTemp[i];			//store remaining parsed element sets
		}
			
		System.out.println("ID as a string: " + idConcatenated);			//display parsed id without hyphens
				
		int idConverted = Integer.parseInt(idConcatenated);
		
		System.out.println("ID as an integer: " + idConverted);				//display id as integer
		
		System.out.println("Testing validity of id as integer: " + (idConverted + 8));
	}
	
}