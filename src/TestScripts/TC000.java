package TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC000 {
@Test
	
	public void tc000()throws Exception
	{
		General g2=new General();
		g2.open();
		Thread.sleep(3000);
		g2.login();
		Thread.sleep(3000);
		g2.Enter();
		g2.Next();
		Thread.sleep(3000);
		g2.Last();
		Thread.sleep(3000);
		g2.Exit();
		g2.Logout();
		g2.close();
		
	}
}

