package pk;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class Login implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

    public Login() {
    }

    public String getName() {
        return name;
    }

    public void setName(String user_name) {
        this.name = user_name;
    }
    
    public String getClear(){
    	this.name = "";
    	return "";
    }
}

