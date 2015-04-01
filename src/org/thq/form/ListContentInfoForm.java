/**
 * 
 */
package org.thq.form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;
import org.thq.business.ContentInfo;

/**
 * @author tuanhq
 *
 */
public class ListContentInfoForm extends ActionForm{
	int id;
	String mo;
	String mt;
	String prefix;
	String active;
	ArrayList<ContentInfo> list;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the mo
	 */
	public String getMo() {
		return mo;
	}

	/**
	 * @param mo the mo to set
	 */
	public void setMo(String mo) {
		this.mo = mo;
	}

	/**
	 * @return the mt
	 */
	public String getMt() {
		return mt;
	}

	/**
	 * @param mt the mt to set
	 */
	public void setMt(String mt) {
		this.mt = mt;
	}

	/**
	 * @return the prefix
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * @param prefix the prefix to set
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	/**
	 * @return the active
	 */
	public String getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(String active) {
		this.active = active;
	}

	/**
	 * @return the list
	 */
	public ArrayList<ContentInfo> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<ContentInfo> list) {
		this.list = list;
	}

	/**
	 * 
	 */
	public ListContentInfoForm() {
		// TODO Auto-generated constructor stub
	}

}
