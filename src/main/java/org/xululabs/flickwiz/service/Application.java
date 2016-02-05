package org.xululabs.flickwiz.service;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisNoOpBindingRegistry;

import com.beust.jcommander.JCommander;

public class Application {

	public static void main(String[] args) {

	
	 	String cmd = "";
		for (int i = 0; i < args.length; i++) {
			cmd = cmd +" "+ args[i];
		}

		System.out.println(cmd);
		
		//String cmd = "getMatch -i path_to_image -max 15 -o _output_file.txt";
		
		JCommander jcommander = new JCommander();
        jcommander.addCommand(new CommandGetMatch());
        
       jcommander.parse(cmd.split(" "));
        String parsedCommand = jcommander.getParsedCommand();
        
        CommandGetMatch getMatch = (CommandGetMatch) jcommander.getCommands().get(parsedCommand).getObjects().get(0);
        
        if(getMatch.isHelp()){
            jcommander.usage(parsedCommand);
            return;    
        }
        
         System.out.println(getMatch);
		
         
         ///////////////////// Query Images ////////////////////
        
         /*
         File queryImage=new File("queryImages/iron.jpg");
         System.out.println("Query Images Name : "+queryImage);
         
         MyRestService mService=new MyRestService();
         ResponseModel mResult=new ResponseModel();
         mResult=mService.getFeatureResult(queryImage);
         
         LinkedList<String> movieNames =new LinkedList<String>();
         movieNames=mResult.getNames();
         
         for(int i=0;i<movieNames.size();i++)
         {
        	 System.out.println(movieNames.get(i).toString());
        	 
         }
         */
         
         try {
        	 Loader.init();
        	 MyRestService mService=new MyRestService();
             	
			mService.readDataFromCSV();
			//mService.readLineByLine();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}