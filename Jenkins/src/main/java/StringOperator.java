
public class StringOperator {
	public String reverseString(String word)
	{
		int i;
		String reverse="";
		for(i=word.length()-1;i>=0;i--)
		{
			reverse+=word.charAt(i);
		}
		return reverse;
	}

	public String encryptName(String word)
	{
		int i;
		String encrypt ="";
		for(i=0;i<word.length();i++)
		{
			encrypt+=(char) ((int) word.charAt(i)+1);
		}
		return encrypt;
	}
}
