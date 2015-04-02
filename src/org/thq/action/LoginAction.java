/**
 * 
 */
package org.thq.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.thq.business.User;



/**
 * @author tuanhq
 *
 */
public class LoginAction extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response){
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		if("6x17".equalsIgnoreCase(userName) && "123456".equalsIgnoreCase(passWord)){
			User user = new User();
			user.setUser(userName);
			user.setPass(passWord);
			request.getSession().setAttribute("onlineUser", user);			
			return new ActionForward("/listCharge.do",true);
		}else{
			return mapping.findForward("failure");
		}
	}
			

}
