import java.io.*;
public class string2
{
public static void main(String[]args)
{
try(FileInputStream fin=new
FileInputStream("C\\stream\\iostream.txt")
{
int i=0;
String word=" ";
while(i=fin.read())!=-1)
{
word=word+(char)i;
}
System.out.println("hi"+" "+word);
}
catch(Exception e)
{
System.out.println(e);
}
}
}