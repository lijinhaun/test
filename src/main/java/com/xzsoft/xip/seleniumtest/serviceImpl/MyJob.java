package com.xzsoft.xip.seleniumtest.serviceImpl;

import com.xzsoft.seleniumtest.util.SpringBeanFactory;
import com.xzsoft.xip.seleniumtest.service.TestPlatFormService;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyJob
  implements Job
{
  public MyJob()
  {
    System.out.println("myjob------------------------------------------------------------");
  }
  
  public void execute(JobExecutionContext context)
    throws JobExecutionException
  {
    JobDataMap dataMap = context.getJobDetail().getJobDataMap();
    String url = dataMap.getString("url");
    Integer port = Integer.valueOf(dataMap.getInt("port"));
    String userName = dataMap.getString("userName");
    String password = dataMap.getString("password");
    String path = dataMap.getString("path");
    String xml_name = dataMap.getString("xml_name");
    String is_new = dataMap.getString("is_new");
    
    File jarFile = new File("D:\\Test\\xip-seleniumtest-0.0.1-SNAPSHOT.jar");
    InputStream instream = null;
    try
    {
      instream = new BufferedInputStream(new FileInputStream(jarFile));
    }
    catch (FileNotFoundException e1)
    {
      e1.printStackTrace();
    }
    try
    {
      TestPlatFormService testPlatFormService = SpringBeanFactory.getBean("testPlatFormService");
      boolean bool = testPlatFormService.upload(url, port.intValue(), userName, password, "/usr/tmp/", xml_name, instream, is_new, "");
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}
