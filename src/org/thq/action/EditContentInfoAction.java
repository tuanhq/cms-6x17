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
import org.thq.business.ContentInfo;
import org.thq.business.ContentInfoDAO;

/**
 * @author tuanhq
 *
 */
public class EditContentInfoAction extends Action {
	/* (non-Javadoc)
	 * @see org.apache.struts.action.Action#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String mo = request.getParameter("mo");
		String mt = request.getParameter("mo");
		int id = 0;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			id =0;
		}
		ContentInfo dto = new ContentInfo();
		dto.setId(id);
		dto.setMo(mo);
		dto.setMt(mt);
		new ContentInfoDAO().editContentInfo(dto);
		return mapping.findForward("list");
		
		
		
	}

}
