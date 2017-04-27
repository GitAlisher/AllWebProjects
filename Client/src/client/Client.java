/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Alisher
 */
import java.io.*;
import java.util.*;
import java.net.*;

public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String str = "\r\n";
		int port = 80;
		String host = "dl.iitu.kz";
		String request = "GET http://dl.iitu.kz HTTP/1.0" + str+str;
		byte []b = new byte[4000];

		Socket socket = new Socket(host,port);
		BufferedInputStream in = new BufferedInputStream(socket.getInputStream());
		BufferedOutputStream out = new BufferedOutputStream(socket.getOutputStream());
		out.write(request.getBytes());
		out.flush();
		
		in.read(b);
		
		String s = new String(b);
		Scanner line = new Scanner(s);
		String  next = "";
		while(line.hasNext()){
			next += line.nextLine() + str;
			String str1 = line.nextLine(); 
			if(str1.isEmpty())break;
		}
		
		try
        {
            OutputStream f = new FileOutputStream("result.html", true);
            OutputStreamWriter writer = new OutputStreamWriter(f);
            BufferedWriter outw = new BufferedWriter(writer);
            for(int i = 0; i < s.length(); i++)
            {
                outw.write(s.charAt(i));
                outw.flush();
            }
        }
        catch(IOException ex)
        {
            System.err.println(ex);
        }
		System.out.println(next);
    }
    
}
