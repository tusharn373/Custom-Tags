package project;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
public class DemoTag1 extends SimpleTagSupport{
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out=getJspContext().getOut();
		out.print("<h2 style='color:Blue;Background-color:yellow;'>Welcome to First Tag Demo!!</h2>");
	
	}

}