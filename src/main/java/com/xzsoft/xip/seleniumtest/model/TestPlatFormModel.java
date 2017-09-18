package com.xzsoft.xip.seleniumtest.model;

import java.util.Date;

public class TestPlatFormModel
{
  private String Url;
  private int Port;
  private String UserName;
  private String UserId;
  private String PassWord;
  private String Path;
  private String XmlName;
  private String IsNew;
  private String FileId;
  private String UUID;
  private Date createdate;
  private String comments;
  
  public String getComments()
  {
    return this.comments;
  }
  
  public void setComments(String comments)
  {
    this.comments = comments;
  }
  
  public String getUserId()
  {
    return this.UserId;
  }
  
  public void setUserId(String userId)
  {
    this.UserId = userId;
  }
  
  public Date getCreatedate()
  {
    return this.createdate;
  }
  
  public void setCreatedate(Date createdate)
  {
    this.createdate = createdate;
  }
  
  public String getUUID()
  {
    return this.UUID;
  }
  
  public void setUUID(String uUID)
  {
    this.UUID = uUID;
  }
  
  public String getFileId()
  {
    return this.FileId;
  }
  
  public void setFileId(String fileId)
  {
    this.FileId = fileId;
  }
  
  public String getIsNew()
  {
    return this.IsNew;
  }
  
  public void setIsNew(String isNew)
  {
    this.IsNew = isNew;
  }
  
  public String getUrl()
  {
    return this.Url;
  }
  
  public void setUrl(String url)
  {
    this.Url = url;
  }
  
  public int getPort()
  {
    return this.Port;
  }
  
  public void setPort(int port)
  {
    this.Port = port;
  }
  
  public String getUserName()
  {
    return this.UserName;
  }
  
  public void setUserName(String userName)
  {
    this.UserName = userName;
  }
  
  public String getPassWord()
  {
    return this.PassWord;
  }
  
  public void setPassWord(String passWord)
  {
    this.PassWord = passWord;
  }
  
  public String getPath()
  {
    return this.Path;
  }
  
  public void setPath(String path)
  {
    this.Path = path;
  }
  
  public String getXmlName()
  {
    return this.XmlName;
  }
  
  public void setXmlName(String xmlName)
  {
    this.XmlName = xmlName;
  }
}
