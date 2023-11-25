import java.io.*;
import java.util.*;
public class reversed
{
public static void main(String[] args) 
{
int d=0,i;
String a,b="";
Scanner sc=new Scanner (System.in);
a=sc.next();
d=a.length();
for(i=d-1;i>=0;i--)
{
b=b+a.charAt(i);
}
System.out.println("srt: "+b);
}
}
