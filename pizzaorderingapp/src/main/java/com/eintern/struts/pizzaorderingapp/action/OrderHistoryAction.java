package com.eintern.struts.pizzaorderingapp.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.eintern.struts.pizzaorderingapp.action.form.OrderHistoryForm;
import com.eintern.struts.pizzaorderingapp.delegate.OrderDelegate;
import com.eintern.struts.pizzaorderingapp.model.entities.Order;

public class OrderHistoryAction extends Action {
	
	private static final OrderDelegate orderDeLegate = new OrderDelegate();
	
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		// TODO Auto-generated method stub
		OrderHistoryForm ohForm = (OrderHistoryForm) form;
		List<Order> orders = orderDeLegate.getOrderHistory(ohForm.getName());
		request.setAttribute("orders", orders);
		
		if(orders.size() > 9){
			request.setAttribute("offer", "50% off next order");
			return mapping.findForward("vipHistory");
		}
		
		return mapping.findForward("history");
	}
	
}
