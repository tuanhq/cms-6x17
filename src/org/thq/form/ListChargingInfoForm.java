/**
 * 
 */
package org.thq.form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;
import org.thq.business.ChargingInfo;

/**
 * @author tuanhq
 *
 */
public class ListChargingInfoForm extends ActionForm {
	private int total;
	private String cmc;
	private String t1;
	private String t2;
	
	

	/**
	 * @return the cmc
	 */
	public String getCmc() {
		return cmc;
	}

	/**
	 * @param cmc the cmc to set
	 */
	public void setCmc(String cmc) {
		this.cmc = cmc;
	}

	/**
	 * @return the t1
	 */
	public String getT1() {
		return t1;
	}

	/**
	 * @param t1 the t1 to set
	 */
	public void setT1(String t1) {
		this.t1 = t1;
	}

	/**
	 * @return the t2
	 */
	public String getT2() {
		return t2;
	}

	/**
	 * @param t2 the t2 to set
	 */
	public void setT2(String t2) {
		this.t2 = t2;
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	private ArrayList<ChargingInfo> chargingInfoList ;

	/**
	 * @return the chargingInfoList
	 */
	public ArrayList<ChargingInfo> getChargingInfoList() {
		return chargingInfoList;
	}

	/**
	 * @param chargingInfoList the chargingInfoList to set
	 */
	public void setChargingInfoList(ArrayList<ChargingInfo> chargingInfoList) {
		this.chargingInfoList = chargingInfoList;
	}
	/**
	 * 
	 */
	public ListChargingInfoForm() {
		// TODO Auto-generated constructor stub
	}
	
	public ListChargingInfoForm(ArrayList<ChargingInfo> chargingInfoList) {
		this.chargingInfoList = chargingInfoList;
	}
	

}
