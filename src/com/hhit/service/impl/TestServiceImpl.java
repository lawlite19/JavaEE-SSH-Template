package com.hhit.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hhit.base.DaoSupportImpl;
import com.hhit.entity.TestModel;
import com.hhit.service.ITestService;
@Service
@Transactional
public class TestServiceImpl extends DaoSupportImpl<TestModel> implements ITestService{


}
