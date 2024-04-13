class Student9
{
int id;
String name;
int age;
Student9(int i,String n,int a)
{
id=i;
name=n;
age=a;
}
void display()
{
System.out.println(id+" "+name+" "+age);
}
public static void main(String args[])
{
Student9 s1=new Student9(111, "Shravya",20);
Student9 s2=new Student9(222, "Suchithra",19);
s1.display();
s2.display();
}
}
