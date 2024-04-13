interface A
{
int a = 5;
void show();
}
class Main implements A
{
int b = 10;

public void show(){
System.out.println("show()method");
}
void print()
{
System.out.println("Print()method");
}
public static void main(String[]args)
{
A obj = new Main();
obj.show();
//obj.print();
System.out.println(A,a);
//System.out.println(obj.b);
}
}