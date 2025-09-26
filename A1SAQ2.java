import java.io.*;
public class A1SAQ2
{
public static void main (String[] args)throws IOException
{
int n,rev=0,rem;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number:");
n=Integer.parseInt(br.readLine());
while(n!=0){
rem=n%10;
rev=(rev*10)+rem;
n=n/10;
}
System.out.println("Reverse is:"+rev);
}
}