class oneUniqueString
{
	public static void main(String[] args)
	{
		System.out.println("It works");
		String uniqueString = "cid";
		if(true == checkIfUniqueString(uniqueString))
		{
			System.out.println("Unique strings");
		}
		else
		{
			System.out.println("not unique strings");
		}
	}
	public static Boolean checkIfUniqueString(String uniqueString)
	{
		int checker = 0;
		for(int i = 0; i < uniqueString.length();i++)
		{
			int val = uniqueString.charAt(i) -'a';
			if((checker & (1 << val))>0)
			{
				return false;
			}
			else
			{
				checker |= 1<<val;
			}
		}
		return true;
	}
}