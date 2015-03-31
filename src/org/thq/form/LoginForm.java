/**
 * 
 */
package org.thq.form;

import org.apache.struts.action.ActionForm;

/**
 * @author tuanhq
 *
 */
public class LoginForm extends ActionForm{
	private String userName;
	private String passWord;
	/**
	 * 
	 */
	
	public LoginForm() {
		
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}
	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	

}
