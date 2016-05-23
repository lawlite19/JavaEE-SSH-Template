package com.hhit.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hhit.base.BaseAction;
import com.hhit.entity.TestModel;
import com.hhit.util.QueryHelper;
@SuppressWarnings("serial")
@Controller
@Scope("prototype")
public class TestAction extends BaseAction<TestModel>{
	public String list() throws Exception{
		//分页--一行代码
		new QueryHelper(TestModel.class, "t")
		.preparePageBean(testService, pageNum, pageSize);
		return "list";
	}
}
