package com.eintern.struts.pizzaorderingapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.config.ForwardConfig;

import com.eintern.struts.pizzaorderingapp.delegate.OrderDelegate;
import com.eintern.struts.pizzaorderingapp.model.entities.Order;
import com.eintern.struts.pizzaorderingapp.model.entities.OrderStatus;

public class OrderAction extends Action {
	private static final OrderDelegate orderDeLegate = new OrderDelegate();
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		DynaActionForm oForm = (DynaActionForm )form;
		OrderStatus status = orderDeLegate.processOrder(new Order((String)oForm.get("name"),
				(String)oForm.get("toppings")));
		request.setAttribute("orderStatus", status);
		
		return mapping.findForward("confirmation");
	}
	
}
