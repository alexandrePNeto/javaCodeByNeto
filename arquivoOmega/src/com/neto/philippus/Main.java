package com.neto.philippus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		//	other var's
		Scanner input = new Scanner(System.in );
		ArrayList<LineModel> lines = new ArrayList<>();
		
		//	path do arquivo.
		System.out.print("Insira o path do aquivo: ");
		String path = input.nextLine().replace("\"", "");
			
		File fileObj = new File(path);
		try {
			Scanner scanFile	= new Scanner(fileObj);
			
			int id = 1;
			
			while(scanFile.hasNext())
			{
				String line	= scanFile.nextLine().toString();
				LineModel lineHere = new LineModel();
				LineController lc = new LineController();
				lineHere.setContent(lc.lineContent(line).toString());
				lineHere.setId(id++);
				lineHere.setCountCaracters(lc.countCaracters(line));				
				lines.add(lineHere);

			}	//	while
			scanFile.close();
		} catch (FileNotFoundException e) {
			e.getMessage();
		}	//	try - cath
	
		System.out.println("--------------");
		
		for (LineModel lineModel : lines) {
			System.out.println(lineModel.getContent());
			System.out.println("ID: " + lineModel.getId());
			System.out.println("Quantidade de caracteres: " +
								lineModel.getCountCaracters());
		}	//	foreach

		input.close();
	}	//	main
}	//
