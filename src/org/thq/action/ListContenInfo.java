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
import org.thq.business.ContentInfo;
import org.thq.business.ContentInfoDAO;
import org.thq.form.ListContentInfoForm;

/**
 * @author tuanhq
 *
 */
public class ListContenInfo extends Action{
 /* (non-Javadoc)
 * @see org.apache.struts.action.Action#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
 */
@Override
public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
	try {
		ArrayList<ContentInfo> list = new ContentInfoDAO().getList();
		((ListContentInfoForm)form).setList(list);
		return mapping.findForward("list");
	} catch (Exception e) {
		// TODO: handle exception
	}
	return null;
}
}
