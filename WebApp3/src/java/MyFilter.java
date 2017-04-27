import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class MyFilter implements Filter{
        public static String correctStr;
	public void init(FilterConfig arg0) throws ServletException {}
	
        private String checkStr(String str) {
            String[] BlockStr = {"string1", "string2", "string3", "string4", "string5", "string6", "<script>", "#include", "<iostream>", "java.io.PrintWriter;"};
            
            for (int i = 0; i < BlockStr.length; i++) {
                if (BlockStr[i].equals(str.toLowerCase())) {
                    String ans = "";
                    for (int j = 0; j < BlockStr[i].length(); j++) {
                        if (j % 2 == 0)
                            ans += '*';
                        else
                            ans += str.charAt(j);
                    }
                    return ans;
                }
            }
            return str;
        }
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out=resp.getWriter();
		String com = req.getParameter("comments");
                out.print("filter is invoked before <br>" );
		String word = "";
                correctStr = "";
                for (int i = 0; i < com.length(); i++) {
                    if (com.charAt(i) == ' ') {
                        correctStr += checkStr(word) + ' ';
                        word = "";
                        out.print(word);
                    } else
                        word += com.charAt(i);
                }

                correctStr += checkStr(word);

                //out.print(correctStr);

		chain.doFilter(req, resp);//sends request to next resource
		
		out.print("filter is invoked after");
		
		
	}
	public void destroy() {}

	

}
