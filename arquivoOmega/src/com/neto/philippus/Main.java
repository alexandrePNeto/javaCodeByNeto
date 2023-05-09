package com.neto.philippus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		//	other var's
		Scanner input		= new Scanner(System.in );
		int	count			= 0;
		
		
		
		//	path do arquivo.
		System.out.print("Insira o path do aquivo: ");
		String path			= input.nextLine().replace("\"", "");
			
		File fileObj		= new File(path);
		try {
			Scanner scanFile	= new Scanner(fileObj);
			
			while(scanFile.hasNext())
			{
				String line	= scanFile.nextLine().toString();
				if(line.contains("\\n"));
					count ++;
					
				System.out.println(line);
			}

			scanFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		System.out.println("--------------");
		System.out.println();
		System.out.println("Path: " + path);
		System.out.println("Count: " + count);
		
		//	var do arquivo.
		
		
		input.close();
	}	//
}	//
