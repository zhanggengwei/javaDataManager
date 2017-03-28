package com.Servlet.demo;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.*;
/**
 * Created by vd on 2017/3/29.
 */
public class RegisterServlet
{
    public static void receiveRegiserServlet() throws IOException
    {
        ServerSocket socket = new ServerSocket(9090);
        while (true) {
            Socket socket1 = socket.accept();
            InputStream in = socket1.getInputStream();
            PrintStream out = new PrintStream(socket1.getOutputStream(), true);
            out.println("<font size=\"20\">注册成功</font>");
        }
    }
}
