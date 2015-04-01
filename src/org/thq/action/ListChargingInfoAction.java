/**
 * 
 */
package org.thq.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.thq.business.ChargingInfo;
import org.thq.business.ChargingInfoDAO;
import org.thq.form.ListChargingInfoForm;

/**
 * @author tuanhq
 *
 */
public class ListChargingInfoAction extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response){
		String commandCode = request.getParameter("cmc");
		String fromDate = request.getParameter("t1");
		String toDate = request.getParameter("t2");
		try {
			ChargingInfoDAO chargingDAO = new ChargingInfoDAO();			
			ArrayList<ChargingInfo> list = chargingDAO.getLists(fromDate, toDate, commandCode);
			int total = chargingDAO.getListsSize(fromDate, toDate, commandCode);
			((ListChargingInfoForm)form).setChargingInfoList(list);
			((ListChargingInfoForm)form).setTotal(total);
			return mapping.findForward("list");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
		
	}


}
