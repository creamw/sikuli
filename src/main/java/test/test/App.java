package test.test;

import org.junit.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    public void findP() throws FindFailed
    {
        System.out.println( "Hello World!" );
        //ChromeDriver chromeDriver = new ChromeDriver();
        //chromeDriver.findElement("");
		/*
		 * ImagePath imagePath = new ImagePath(); imagePath.add("image");
		 */
        ImagePath.add("image");
        Screen screen = new Screen();
        screen.click("image\\wechat.png");
    }
    
   
}
