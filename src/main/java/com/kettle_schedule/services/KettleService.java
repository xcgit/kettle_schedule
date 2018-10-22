package com.kettle_schedule.services;

import org.pentaho.di.core.Result;
/**
 * kettle的处理
 */
public interface KettleService {


    /**
     * 调用trans文件 带参数的
     * @param params
     * @param transFileName
     * @throws Exception
     */
    void  callNativeTrans(String[] params,String transFilePath);


    /**
     * 调用job文件
     * @param jobName
     * @throws Exception
     */
     void callNativeJob(String jobPath);
}
