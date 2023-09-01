package Myprogramme;


import java.io.IOException;

import org.apache.commons.io.output.AppendableWriter;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class Reportingtool2layout{
	@Test
	public void report() throws IOException
	{
		Layout layout=new PatternLayout("%d %c %m %n");
		FileAppender append=new FileAppender(layout,"./Reports/r1.log");
		BasicConfigurator.configure();
		Logger log=Logger.getLogger(this.getClass().getName());
		log.error("tc error");
		log.warn("warning while tc runs");
		log.info("info");
	}

}
