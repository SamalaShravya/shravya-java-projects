import java.io.FileOutputStream;
class FileOutputStreamexample
{
public static void main(String[]args)
{
try
{
FileOutputStream fout=new
FileOutputStream("C:\\stream\\iostream.txt");
fout.write(65);
fout.flush();
fout.close();
System.out.println("Success..");
}
catch(Exception e)
{
System.out.println(e);
}
}
}