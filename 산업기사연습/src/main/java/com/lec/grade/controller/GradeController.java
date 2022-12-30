package com.lec.grade.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lec.grade.action.Action;
import com.lec.grade.action.ActionForward;

@WebServlet("*.gd")
public class GradeController extends HttpServlet{
	
	Action action = null;
	ActionForward forward= null;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(req, resp);
	}
	
	private void doProcess(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
			
			req.setCharacterEncoding("utf-8");
		
			String requestURI = req.getRequestURI(); //주소 풀네임
			String contextPath = req.getContextPath(); //주소 패키지
			String command = requestURI.substring(contextPath.length());
			
			if(command.equals("/gradList.gd")) {
				
				
				
				
			}else if(command.equals("/gradSelect.gd")) {
				
			}else if(command.equals("/gradInsertForm.gd")) {
				
			}else if(command.equals("/gradInsert.gd")) {
				
			}else if(command.equals("/gradDeleteForm.gd")) {
				
			}else if(command.equals("/gradDelete.gd")) {
				
			}else if(command.equals("/gradUpdateForm.gd")) {
				
			}else if(command.equals("/gradUpdate.gd")) {
				
			}
			
			
			if(forward!=null) { // 포워드에 객체가 있다면
				if(forward.isRedirect()) { //리다이렉트가 트루라면
					res.sendRedirect(forward.getPath());
				} else {
					RequestDispatcher dispatcher = req.getRequestDispatcher(forward.getPath()); //리다이렉트가 펄스라면
					dispatcher.forward(req, res);
					
					//디스패쳐 : 
				}
			}
			
			
		
		
		
	} 

}
