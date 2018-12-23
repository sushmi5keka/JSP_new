package hi;


import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import org.apache.jasper.el.JspELException;


public class Hello extends SimpleTagSupport{
    public void doTag() throws JspELException,IOException{
   
    getJspContext().getOut().write("No idea !!! :-|");
    }
}
