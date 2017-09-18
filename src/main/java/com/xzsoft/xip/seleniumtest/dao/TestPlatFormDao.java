package com.xzsoft.xip.seleniumtest.dao;

import com.xzsoft.xip.seleniumtest.model.TestPlatFormModel;

public abstract interface TestPlatFormDao
{
  public abstract int getXmlCount(String paramString);
  
  public abstract void InsertTo(TestPlatFormModel paramTestPlatFormModel);
}
