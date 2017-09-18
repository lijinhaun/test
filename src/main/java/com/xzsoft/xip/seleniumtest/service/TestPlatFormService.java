package com.xzsoft.xip.seleniumtest.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarInputStream;

public abstract interface TestPlatFormService
{
  public abstract boolean readEntries(JarInputStream paramJarInputStream, String paramString)
    throws IOException;
  
  public abstract boolean upload(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5, InputStream paramInputStream, String paramString6, String paramString7)
    throws Exception;
  
  public abstract int getXmlCount(String paramString)
    throws Exception;
}
