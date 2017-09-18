package com.xzsoft.xip.seleniumtest.serviceImpl;

//import com.jcraft.jsch.Channel;
//import com.jcraft.jsch.ChannelExec;
//import com.jcraft.jsch.ChannelSftp;
//import com.jcraft.jsch.JSch;
//import com.jcraft.jsch.Session;
//import com.xzsoft.xip.platform.session.CurrentSessionVar;
import com.xzsoft.xip.seleniumtest.dao.TestPlatFormDao;
import com.xzsoft.xip.seleniumtest.model.TestPlatFormModel;
import com.xzsoft.xip.seleniumtest.service.TestPlatFormService;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.UUID;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.logging.Logger;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("testPlatFormService")
public class TestPlatFormServiceImpl
  implements TestPlatFormService
{

	public boolean readEntries(JarInputStream paramJarInputStream, String paramString) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean upload(String paramString1, int paramInt, String paramString2, String paramString3,
			String paramString4, String paramString5, InputStream paramInputStream, String paramString6,
			String paramString7) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public int getXmlCount(String paramString) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
//  @Resource
//  TestPlatFormDao testPlatFormDao;
//  String chmodStr = "";
//  Logger logger = Logger.getLogger("TestPlatFormServiceImpl");
//  
//  private void closeChannel(Channel channel)
//  {
//    if ((channel != null) && 
//      (channel.isConnected())) {
//      channel.disconnect();
//    }
//  }
//  
//  private void closeSession(Session session)
//  {
//    if ((session != null) && 
//      (session.isConnected())) {
//      session.disconnect();
//    }
//  }
//  
//  public boolean upload(String url, int port, String username, String password, String path, String filename, InputStream input, String IsNew, String comments)
//  {
//    boolean success = true;
//    Session sshSession = null;
//    ChannelSftp sftp = null;
//    String CreateFile = null;
//    String Username = "";String Userid = "";
//    
//    TestPlatFormModel model = new TestPlatFormModel();
//    
//    Userid = CurrentSessionVar.getUserId().toString();
//    Username = CurrentSessionVar.getUserName().toString();
//    String chmodStr_1;
//    Date d;
//    SimpleDateFormat sdf;
//    String dateNowStr;
//    Date getDate;
//    String UUID;
//    try
//    {
//      JSch jsch = new JSch();
//      sshSession = jsch.getSession(username, url, port);
//      sshSession.setPassword(password);
//      Properties sshConfig = new Properties();
//      sshConfig.put("StrictHostKeyChecking", "no");
//      sshSession.setConfig(sshConfig);
//      sshSession.connect();
//      
//      this.logger.info("Session connected!");
//      sftp = (ChannelSftp)sshSession.openChannel("sftp");
//      sftp.connect();
//      this.logger.info("ChannelSftp connected!");
//      
//      sftp.cd(path);
//      
//      this.logger.info("in path:" + path);
//      if ((IsNew.equals("Y")) || ("Y".equals(IsNew)))
//      {
//        sftp.rm("xip-seleniumtest-0.0.1-SNAPSHOT.jar");
//        sftp.put(input, "xip-seleniumtest-0.0.1-SNAPSHOT.jar");
//      }
//      CreateFile = "/usr/tmp/".concat(Username);
//      this.chmodStr = 
//      
//
//
//
//
//
//        ("cd /usr/tmp;\nif [ ! -d \"" + CreateFile + "\" ];\n then  mkdir " + CreateFile + "\n fi;\n" + "chmod 777 -R /usr/tmp;\n" + "unzip xip-seleniumtest-0.0.1-SNAPSHOT.jar -d ".concat(Username) + ";\n" + "export DISPLAY=:7;" + "java -cp selenium-server-standalone-2.24.1.jar:xip-seleniumtest-0.0.1-SNAPSHOT.jar org.testng.TestNG ./".concat(Username) + "/java/".concat(filename) + ".xml;" + "tar -zcf test-output.tar.gz test-output/\n;");
//      
//
//      System.out.println("chmodStr=" + this.chmodStr);
//      execCmd(sshSession, this.chmodStr);
//      sftp.get("test-output.tar.gz", "d:/");
//      
//      System.out.println("exeChomd end ......");
//    }
//    catch (Exception e)
//    {
//      e.printStackTrace();
//      success = false;
//    }
//    finally
//    {
//      String chmodStr_1;
//      Date d;
//      SimpleDateFormat sdf;
//      String dateNowStr;
//      Date getDate;
//      String UUID;
//      String chmodStr_1 = "cd /usr/tmp;\nrm -rf " + 
//        CreateFile + ";\n" + 
//        "rm -rf " + "test-output;\n" + 
//        "rm -rf " + "test-output.tar.gz;\n";
//      try
//      {
//        execCmd(sshSession, chmodStr_1);
//      }
//      catch (Exception e1)
//      {
//        e1.printStackTrace();
//      }
//      closeChannel(sftp);
//      closeSession(sshSession);
//      
//      Date d = new Date();
//      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//      String dateNowStr = sdf.format(d);
//      Date getDate = new Date();
//      try
//      {
//        getDate = sdf.parse(dateNowStr);
//      }
//      catch (ParseException e)
//      {
//        e.printStackTrace();
//      }
//      String UUID = UUID.randomUUID().toString();
//      model.setUUID(UUID);
//      model.setIsNew(IsNew);
//      model.setPassWord(password);
//      model.setPath(path);
//      model.setPort(port);
//      model.setUrl(url);
//      model.setUserName(username);
//      model.setXmlName(filename);
//      model.setCreatedate(getDate);
//      model.setUserId(Userid);
//      model.setComments(comments);
//      
//      this.testPlatFormDao.InsertTo(model);
//    }
//    return success;
//  }
//  
//  public static void execCmd(Session session, String command)
//    throws Exception
//  {
//    System.out.println(111);
//    if (session == null) {
//      throw new RuntimeException("Session is null!");
//    }
//    ChannelExec exec = (ChannelExec)session.openChannel("exec");
//    InputStream in = exec.getInputStream();
//    byte[] b = new byte[512];
//    exec.setCommand(command);
//    exec.connect();
//    while (in.read(b) > 0) {
//      System.out.println(new String(b));
//    }
//    if (!exec.isConnected()) {
//      exec.disconnect();
//    }
//  }
//  
//  public boolean readEntries(JarInputStream jarInput, String xml_name)
//    throws IOException
//  {
//    JarEntry entry = jarInput.getNextJarEntry();
//    String manifestEntry = null;
//    boolean flag = false;
//    while (entry != null)
//    {
//      System.out.println("Entry Name = " + entry.getName());
//      if (entry.getName().contains(xml_name))
//      {
//        flag = true;
//        break;
//      }
//      entry = jarInput.getNextJarEntry();
//    }
//    return flag;
//  }
//  
//  public int getXmlCount(String xml_name)
//    throws Exception
//  {
//    int count = this.testPlatFormDao.getXmlCount(xml_name);
//    return count;
//  }
}
