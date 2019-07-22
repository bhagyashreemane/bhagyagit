package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class DateAndtime {
 
	public void getcurrentDateTime()
	{
		 Date date =  Calendar.getInstance().getTime(); 
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");  
		String  strDate = formatter.format(date);  
		    System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
		    
		 
//System.out.println(LocalDateTime);
}
}

