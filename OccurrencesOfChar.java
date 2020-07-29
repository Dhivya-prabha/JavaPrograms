package Learning;


public class OccurrencesOfChar {
public static void main(String[] args) {



			// Check number of occurrences of a char (eg 'e') in a String
			
			String str = "welcome to chennai";
			char[] charArray = str.toCharArray();
			
			int length = str.length();
			int count = 0;
			
			for(int i = 0;i<length;i++)
			{
				if(charArray[i] == 'e')
				{
					count = count + 1;
					
				}
				
			}
	System.out.println(count);
		}

	}