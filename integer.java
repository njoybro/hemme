import java.util.*
class sumtoken
{ public static void main(string args[])
{scanner sc=new scanner (system.in);
system.out.println ("Enter the integer with space between integers & press enter:");
string digit = sc.nextLine();
stringTokenizer token = new stringTokenizer(digit);
int digit=0,sum=0;
system.out.println("Entered digits are :");
while(token.hasMoreToken());
{ string s=token.nextToken();
dig=integer.parseInt(5);
system.out.println("dig+"");
sum=sum+dig;
}
system.out.println("sum="+sum);
}
}
