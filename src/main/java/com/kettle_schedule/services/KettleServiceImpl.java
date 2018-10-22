package com.kettle_schedule.services;

import org.pentaho.di.core.KettleEnvironment;

import org.pentaho.di.core.util.EnvUtil;
import org.pentaho.di.job.Job;
import org.pentaho.di.job.JobMeta;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;
import org.springframework.stereotype.Service;

@Service
public class KettleServiceImpl implements KettleService {


    @Override
    public void callNativeTrans(String[] params,String transFilePath) {

        try {
            // 初始化
            KettleEnvironment.init();
            KettleEnvironment.init();
            EnvUtil.environmentInit();
            TransMeta transMeta = new TransMeta(transFilePath);
            //转换
            Trans trans = new Trans(transMeta);
            //执行
            trans.execute(params);
            //等待结束
            trans.waitUntilFinished();
            //抛出异常
            if (trans.getErrors() > 0) {
                try {
                    throw new Exception("There are errors during transformation exception!(传输过程中发生异常)");
                } catch (Exception e) {

                }

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }



    @Override
    public void callNativeJob(String jobPath) {
          // 初始化
        try{
                      KettleEnvironment.init();
                      JobMeta  jobMeta  =  new JobMeta(jobPath,null);
                      Job  job  =  new Job(null,  jobMeta);
                      //向Job 脚本传递参数，脚本中获取参数值：${参数名}    
                      //job.setVariable(paraname,  paravalue);    
                        job.start();    
                        job.waitUntilFinished();    
                        if  (job.getErrors() > 0) {
                        throw  new  Exception("There are errors during job exception!(执行job发生异常)");  
                       }}
                       catch(Exception e){
                    e.printStackTrace();

                       }
    }
}
