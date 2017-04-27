/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author Alisher
 */
@WebFilter(filterName = "FormatFilter", urlPatterns = {"/*"})
public class FormatFilter implements Filter {
    
    private static int ok = 0;
    public static String ans;
    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        chain.doFilter(request, response);
        PrintWriter out=response.getWriter();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            ok++;
            ans += "Annonim " + dateFormat.format(date) + "<br>";
            ans += "Message: Default " + MyFilter.correctStr;
            //out.print("<br>" + ans + " asn <br>");
            /*
            if (ok % 2 == 1) {    
                out.print("Annonim " + dateFormat.format(date) + "<br>");
                out.print("Message: " + MyFilter.correctStr);
                ok++;
            }*/
    }

 
    public void destroy() {        
    }

    /**
     * Init method for this filter
     */
    public void init(FilterConfig filterConfig) { }
   
}
