import java.io.*;  
import java.lang.*;  
class Main  
 {  
 public static void main(String args[])  
 {  
 try  
 {  
 FileReader fin = new FileReader("test.txt");  
 FileWriter fout = new FileWriter("copy.txt");  
 int i;  
 while((i=fin.read()) != -1)  
 {  
 fout.write(i);  
 }  
 fin.close();  
 fout.close();  
 }  
 catch(IOException e)  
 {  
 System.out.println(e.getMessage());  
 }  
 }  
}  
