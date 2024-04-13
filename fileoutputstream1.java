import java.io.FileOutputStream;
public class FileOutputStreamExample{
public static void main(String args[])
{
try
{
FileOutputStream fout=new FileOutputStream("C://testout.txt");
String msg="welcome";
byte byteArray[]=msg.getByte();
fileOutputStream