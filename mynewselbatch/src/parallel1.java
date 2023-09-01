import java.io.Reader;
import java.util.Properties;

import org.testng.annotations.Test;

public class parallel1 {
	@Test
	public void Test1()
	{
		Properties p=new Properties();
		p.load(newfileInputStream("./p.properties"));
		String val=p.getProperty("baseURL");
		System.out.println(val);
	}
	@Test
	public void test2(String )

	

}
