package project;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.StringWriter;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
public class DemoTag2 extends SimpleTagSupport {
	String colname;
	StringWriter sw=new StringWriter();	
public String getColname() {
		return colname;
	}

	public void setColname(String colname) {
		this.colname = colname;
	}

@Override
public void doTag() throws JspException, IOException {
	JspWriter out=getJspContext().getOut();
	getJspBody().invoke(sw);
	String s1=sw.toString();
	
	out.print("<h1 style='color:"+colname+";'>"+s1.toUpperCase()+"</h1>");
}
}