package com.techelevator.sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.List;

public class NewPurchaseLog {

	public NewPurchaseLog() {
		// TODO Auto-generated constructor stub
	}
	

	/**public void logFile() throws IOException  {
		File systemLogFile = new File("log.txt");
		List<String> list = getList();
		try(FileWriter logWriter = new FileWriter(systemLogFile, true)){
			for(String str : list) {
				logWriter.write(str);
				logWriter.write("\n");
			}
		}
	}
	public List<String> log(String name, double beginningAmount, double endAmount) {
		
		LocalDateTime time = LocalDateTime.now();
		DecimalFormat myFormat = new DecimalFormat("#.00");
		String str = time + " " + name + " " + beginningAmount + " " + myFormat.format(endAmount);
		list.add(str);
		return list;
	}
	//public List<String> getList(){
		//return this.list;
	//}**/

}
