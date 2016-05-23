package com.hhit.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 容器初始化类，可以缓存一些公共的信息
 * @author bob
 *
 */
public class InitListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
//		// 获取容器与相关的Service对象
//		ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
//		IPrivilegeService privilegeService = (IPrivilegeService) ac.getBean("privilegeServiceImpl");
//		IDataTypeService dataTypeService=(IDataTypeService) ac.getBean("dataTypeServiceImpl");
//		
//		
//		// 准备数据：topPrivilegeList
//		List<Privilege> topPrivilegeList = privilegeService.findTopList();
//		sce.getServletContext().setAttribute("topPrivilegeList", topPrivilegeList);
//		System.out.println("------------> 已准备数据topPrivilegeList <------------");
//
//		// 准备数据：secondPrivilegeList
//		List<Privilege> secondPrivilegeList = privilegeService.findSecondList(topPrivilegeList);
//		sce.getServletContext().setAttribute("secondPrivilegeList", secondPrivilegeList);
//		System.out.println("------------> 已准备数据secondPrivilegeList <------------");
//
//		// 准备数据：allPrivilegeUrls
//		Collection<String> allPrivilegeUrls = privilegeService.getAllPrivilegeUrls();
//		sce.getServletContext().setAttribute("allPrivilegeUrls", allPrivilegeUrls);
//		System.out.println("------------> 已准备数据allPrivilegeUrls <------------");
//		
//		//准备数据：dataTypeList
//		List<DataType> dataTypeList=dataTypeService.findAll();
//		sce.getServletContext().setAttribute("dataTypeList", dataTypeList);
//		System.out.println("------------> 已准备数据dataTypeList <------------");
	
	}

	public void contextDestroyed(ServletContextEvent arg0) {

	}
}
