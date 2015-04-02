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
import org.thq.form.ListContentInfoForm;

/**
 * @author tuanhq
 *
 */
public class EditContentInfoAction extends Action {
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.struts.action.Action#execute(org.apache.struts.action.ActionMapping
	 * , org.apache.struts.action.ActionForm,
	 * javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		if (request.getSession().getAttribute("onlineUser")==null){
			return new ActionForward("/login.do",true);
		}
		ListContentInfoForm listContentInfo = (ListContentInfoForm) form;
		String method = request.getMethod();
		String action = request.getParameter("action");
		String mo = request.getParameter("mo");
		String mt = request.getParameter("mt");
		if ("GET".equalsIgnoreCase(method)) {// first request

			if ("add".equalsIgnoreCase(action)) {
				listContentInfo.setId(0);
				return mapping.findForward("edit");
			} else if ("edit".equalsIgnoreCase(action)) {
				int id = Integer.parseInt(request.getParameter("id"));
				ContentInfo dto = new ContentInfoDAO().getDtoById(id);
				listContentInfo.setId(id);
				listContentInfo.setMo(dto.getMo());
				listContentInfo.setMt(dto.getMt());
				return mapping.findForward("edit");
			} else if ("delete".equalsIgnoreCase(action)) {
				int id = Integer.parseInt(request.getParameter("id"));
				new ContentInfoDAO().deleteDtoById(id);
				return new ActionForward("/listContent.do", true);
			} else {
				return new ActionForward("/listContent.do", true);
			}

		} else {// insert or update
			int id = 0;
			try {
				id = Integer.parseInt(request.getParameter("id"));
			} catch (Exception e) {
				id = 0;
			}
			ContentInfo dto = new ContentInfo();
			dto.setId(id);
			dto.setMo(mo);
			dto.setMt(mt);
			new ContentInfoDAO().editContentInfo(dto);
			return new ActionForward("/listContent.do", true);

		}

	}

}
