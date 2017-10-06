package com.vaannila.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vaannila.form.HelloWorldForm;

public class HelloWorldAction extends Action {
//this is my change in file
@Override
public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	HelloWorldForm hwForm = (HelloWorldForm) form;
	hwForm.setMessage("Hello World");
	return mapping.findForward("success");
	
	// this is my third change
	// this last 
}
}
