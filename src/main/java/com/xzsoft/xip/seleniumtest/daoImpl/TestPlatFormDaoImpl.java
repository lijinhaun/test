package com.xzsoft.xip.seleniumtest.daoImpl;

import com.xzsoft.xip.seleniumtest.dao.TestPlatFormDao;
import com.xzsoft.xip.seleniumtest.mapper.TestPlatFormMapper;
import com.xzsoft.xip.seleniumtest.model.TestPlatFormModel;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository("testPlatFormDao")
public class TestPlatFormDaoImpl
  implements TestPlatFormDao
{
  @Resource
  TestPlatFormMapper testPlatFormMapper;
  
  public int getXmlCount(String xml_name)
  {
    int count = 0;
    try
    {
      count = this.testPlatFormMapper.getXmlCount(xml_name);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return count;
  }
  
  public void InsertTo(TestPlatFormModel model)
  {
    try
    {
      this.testPlatFormMapper.InsertTo(model);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}
