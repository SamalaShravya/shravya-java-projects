 class Student1
{
int id;
String name;
Student1(int id,String name)
{
this.id=id;
this.name=name;
}
void display(){
System.out.println(id+" "+name);
}
public static void main(String args[]){
Student1 s1 = new Student1(111,"Shravya");
Student1 s2 = new Student1(112,"Suchithra");
s1.display();
s2.display();
}
}