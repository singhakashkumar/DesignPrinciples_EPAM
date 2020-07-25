package com.epam.Calculator;

import com.epam.presentationlayer.MainWindow;

public class App 
{
    public static void main( String[] args )
    {
    	try {	
	    	MainWindow w = new MainWindow();
	        w.setVisible(true);
    	} 
    	catch(Exception e) {
    		System.out.println(e + " while creating a window");
    	}

    }
}