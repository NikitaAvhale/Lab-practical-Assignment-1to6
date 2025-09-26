import java.io.*;
public class A1SAQ1
{
public static void main (String[] args)throws IOException
{
int n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number:");
n=Integer.parseInt(br.readLine());
for(int i=1;i<=10;i++)
{
System.out.println(n + " x " + i + " = " + (n * i));
}
}
}
