package com.xzsoft.xip.seleniumtest.mapper;

import com.xzsoft.xip.seleniumtest.model.TestPlatFormModel;

public abstract interface TestPlatFormMapper
{
  public abstract int getXmlCount(String paramString)
    throws Exception;
  
  public abstract void InsertTo(TestPlatFormModel paramTestPlatFormModel)
    throws Exception;
}
