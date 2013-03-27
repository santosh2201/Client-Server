import java.lang.*;
import java.io.*;
import java.net.*;

class Client 
{
        public static void main(String args[]) 
        {
                String data = "You will never walk alone";
                String filePath = "../2.jpg" ;
                try 
                {
                        Socket skt = new Socket("192.168.169.168", 5000);
                        System.out.print("Connected to server!\n");
                        File myFile = new File(filePath);                       
                        //PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
                        System.out.print("Sending file named: '" + myFile.getName() + "'\n");
                        //out.print(myFile.getName());
                        //out.close();
                        System.out.println("hello world!!!");  
                        int i;
                        FileInputStream fis = new FileInputStream(filePath);
                        DataOutputStream os = new DataOutputStream(skt.getOutputStream());
                        while((i=fis.read())>-1)
                                os.write(i);
                        fis.close();
                        os.close();
                        skt.close();
                                                 
                }
                catch(Exception e) 
                {
                        System.out.print("Whoops! It didn't work!\n");
                        System.out.print(e);
                }
        }

}
