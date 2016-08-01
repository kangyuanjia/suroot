package top.suroot.base.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.suroot.base.aop.DynamicDataSourceAnnotation;
import top.suroot.base.dao.BaseDao;
import top.suroot.base.datasource.DataSourceContextHolder;
import top.suroot.base.service.BaseService;

@Service("baseService")
@DynamicDataSourceAnnotation
public class BaseServiceImpl implements BaseService {
	
	@Autowired
	private BaseDao baseDao;
	
	
	@DynamicDataSourceAnnotation(dataSource = DataSourceContextHolder.DATA_SOURCE_B)
	public void changeDataSource() {
		//System.out.println("切换数据源serviceImple");
		int count = baseDao.selectTestFromDatabaseB();
		System.out.println(count);
	}
	//@LogAnnotation(loginInfo = "info" ,operateDescribe = "Test", operateFunction = "log" ,operateMethod = "log")
	public void log() {
		//System.out.println("不切换数据源");
		int count = baseDao.selectTestFromDatabaseA();
		System.out.println(count);
	}
}
