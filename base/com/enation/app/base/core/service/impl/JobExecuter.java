package com.enation.app.base.core.service.impl;

import com.enation.app.base.core.plugin.job.JobExecutePluginsBundle;
import com.enation.app.base.core.service.IJobExecuter;

/**
 * 任务执行器
 * @author kingapex
 *
 */ 
public class JobExecuter implements IJobExecuter {
	private JobExecutePluginsBundle jobExecutePluginsBundle;

	@Override
	public void everyHour() {
		jobExecutePluginsBundle.everyHourExcecute();
	}

	@Override 
	public void everyDay() {
		try{
			this.jobExecutePluginsBundle.everyDayExcecute();
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}

	@Override
	public void everyMonth() {
		jobExecutePluginsBundle.everyMonthExcecute();
	}

	@Override
	public void everySecond() {
		jobExecutePluginsBundle.everySecondExcecute();
	}
	
	public JobExecutePluginsBundle getJobExecutePluginsBundle() {
		return jobExecutePluginsBundle;
	}

	public void setJobExecutePluginsBundle(
			JobExecutePluginsBundle jobExecutePluginsBundle) {
		this.jobExecutePluginsBundle = jobExecutePluginsBundle;
	}
	

}
