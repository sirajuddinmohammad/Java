import java.util.regex.*;    
import java.util.*;    
public Class Email
{  
public static void main(String args[])
{  
ArrayList<String> emails = new ArrayList<String>();  
emails.add("Saveetha@789");  
emails.add("saveetha@123");
String regex = "^(.+)@(.+)$";   
Pattern pattern = Pattern.compile(regex);
for(String email : emails)
{  
Matcher matcher = pattern.matcher(email);  
System.out.println(email +" : "+ matcher.matches()+"\n");  
}  
}  
}  