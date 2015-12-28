class fourReplaceSpace{
	public static void main(String[] args)
	{
		char [] chArray = new char[18];
		String str = "Ms John Smith";
		for(int i = 0 ; i <str.length();i++)
		{
			chArray[i] = str.charAt(i);
		}
		System.out.println("Before String is: " + String.valueOf(chArray));
		System.out.println("Length is: " + chArray.length);
		replaceSpaceInString(chArray);
		System.out.println("Length is: " + chArray.length);
		System.out.println("After String is: " + String.valueOf(chArray));
	}
	private static void replaceSpaceInString(char[] chArray)
	{
		for(int i = 0 ; i < chArray.length;i++)
		{
			if(chArray[i] == ' ')
			{
				twoRightShifts(chArray,i);
				chArray[i] = '%';
				chArray[i+1] = '2';
				chArray[i+2] = '0';
			}				
		}
	}
	private static void twoRightShifts(char[] chArray,int i )
	{
		for(int j = chArray.length-1 ; j>i+2;j--)
		{
			chArray[j] = chArray[j-2];
		}
	}
}