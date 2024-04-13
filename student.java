class Studentapp{

int rollno;
static String branch;
static String collegename;
public static void main(String[]args)
{
Studentapp shravya=new Studentapp();
Studentapp mallesh=new Studentapp();
Studentapp naresh=new Studentapp();
Studentapp lokesh=new Studentapp();

shravya.rollno=14;
shravya.branch="ece";
shravya.collegename="Spec";

mallesh.rollno=94;
mallesh.branch="ece";
mallesh.collegename="Spec";

naresh.rollno=74;
naresh.branch="ece";
naresh.collegename="Spec";

lokesh.rollno=72;
lokesh.branch="ece";
lokesh.collegename="Spec";

System.out.println(shravya.rollno+""+shravya.branch+""+shravya.collegename);
System.out.println(shravya.rollno+""+mallesh.branch+""+mallesh.collegename);
System.out.println(shravya.rollno+""+naresh.branch+""+naresh.collegename);
System.out.println(shravya.rollno+""+lokesh.branch+""+lokesh.collegename);
}
}




