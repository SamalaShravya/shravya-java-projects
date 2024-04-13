class strong number{
public static void main(String[]args)
Scannerr sc=new scanner(System.in);
int n=sc.next int();
int sum=strong(n);
if(sum>=n){
System.out.println("strong");
}
else
{
System.out.println("not strong"):
}
}
public static int strong(int n){
int sum=0;
while(n!=0){
int sum=n%10;
int fact=1;
for(int i=1;i<:sum;i++){
fact=fact*i;
sum=sum+fact;
}
n=n/10;
}
