package string.exercise;

public class StringService {


	public static String stringReverse(String s)
	{
		String revString = new StringBuffer(s).reverse().toString();
		return revString;
		
		}
	
	public static boolean stringLinearSearch(String s,char c)
	{
		boolean flag = false;
		char[] s1 = s.toCharArray();
				
		for(int i = 0;i<s1.length;i++)
		{
			if(c==s1[i])
			{
				flag = true;
				break;
			}
		}
	  return flag;		
	}
	
	public static String stringSearchReplace(String s,char c1,char c2)
	{
		
		char[] s1 = s.toCharArray();
		for(int i = 0;i<s1.length;i++)
		{
			if(c1==s1[i])
			{
				String repString = s.replace(s1[i], c2);
				return repString;	
			}
			
		}
		return null;
	  	
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String s = "First String Program";
		
		System.out.println("String reverse:" +StringService.stringReverse(s));
		
			
		boolean x = stringLinearSearch(s,'J');
		if(x)
		{
			System.out.println("The input key value is found in " +s);
		}
		else
		{
			System.out.println("The input key value is not found in " +s);
		}
		
				
		System.out.println("Before calling stringSearchReplace: " +s);
		String s2 = StringService.stringSearchReplace(s,'r','u');
		System.out.println("After calling stringSearchReplace: " +s2);		
	}

}
