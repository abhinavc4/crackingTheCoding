
class threeCheckPermutation{
	public static void main(String[] args)
	{
		String str1 = "Charlie";
		String str2 = "liehacrb";
		if(true == checkPermutation(str1,str2))
		{
			System.out.println("It is the same string");
		}
		else
		{
			System.out.println("not the same string");
		}
	}
	private static Boolean checkPermutation(String str1,String str2)
	{
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length() != str2.length())
		{
			return false;
		}
		int[] countHolderStr1 = new int[26];
		int[] countHolderStr2 = new int[26];
		for(int i = 0 ; i <str1.length() ; i++)
		{	
			int val = str1.charAt(i) - 'a';
			countHolderStr1[val]++;
		}
		for(int i = 0 ; i <str2.length() ; i++)
		{	
			int val = str2.charAt(i) - 'a';
			countHolderStr2[val]++;
		}
		for(int i = 0 ; i <countHolderStr2.length ; i++)
		{	
			if(countHolderStr1[i]!=countHolderStr2[i])
			{
				return false;
			}
		}
		return true;
	}
}