import java.io.*;
import java.util.*;
import java.util.Scanner;
class vow
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enetr string: ");
		String s1=s.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||
			s1.charAt(i)=='o'||s1.charAt(i)=='u'||s1.charAt(i)=='A'||
			s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U')
			{
				continue;
			}
			else
			{
				System.out.print(s1.charAt(i));
			}
		}
	}
}
			