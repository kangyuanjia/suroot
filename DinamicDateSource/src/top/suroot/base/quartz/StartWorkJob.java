package top.suroot.base.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
  
  
public class StartWorkJob implements Job {

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("定时器生效！");
		
	}  
  
  
}  