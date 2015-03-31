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
