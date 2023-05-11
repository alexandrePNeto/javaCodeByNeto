package com.neto.philippus.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.neto.philippus.controllers.LineController;
import com.neto.philippus.controllers.RegisterController;
import com.neto.philippus.models.LineModel;

public class LineView 
{

	
	public static void start() 
	{
		//	other var's
		Scanner input = new Scanner(System.in);
		ArrayList<LineModel> lines = new ArrayList<>();
		LineController lc = new LineController();
		RegisterController rc = new RegisterController();
			
		//	path do arquivo.
//		System.out.print("Insira o path do aquivo: ");
//		String path = input.nextLine().replace("\"", "");

//		System.out.print("Ecolha o tp d registro: ");
//		String tp_reg = input.nextLine();
//		if(tp_reg.contains("0"))
//			tp_reg.replace("0", "");
//		
//		System.out.println(rc.registerType(Integer.parseInt(tp_reg)));
		
		ArrayList<String> val_line = new ArrayList<>();
		System.out.println("Digite o valores desejados da linha: ");
		System.out.println("Digite \"sair\", para sair.");
		System.out.println();
		Boolean keep = true;
		do
		{
			int val = input.nextInt();
			
			input.nextLine();
			
			if(val.contains("sair"))
				keep = false;
				
			val_line.add(val);
		}while(!keep);
		
		for (String string : val_line) {
			System.out.println(string);
		}
		
//		String tempVal = input.nextLine();
	
		
//		File fileObj = new File(path);
//		try {
//			Scanner scanFile	= new Scanner(fileObj);
//			
//			int id = 1;
//			
//			while(scanFile.hasNext())
//			{
//				String line	= scanFile.nextLine().toString();
//				LineModel lineHere = new LineModel();
//				
//				lineHere.setContent(lc.lineContent(line).toString());
//				lineHere.setBollContent(lc.existContent(tempVal));
//				lineHere.setId(id++);
//				lineHere.setCountCaracters(lc.countCaracters(line));				
//				lines.add(lineHere);
//			}	//	while
//			scanFile.close();
//		} catch (FileNotFoundException e) {
//			e.getMessage();
//		}	//	try - cath
//	
//		System.out.println("--------------");
//		
//		for (LineModel lineModel : lines) 
//		{
//			System.out.println(lineModel.getContent());
//			System.out.println(lineModel.getBollContent());
//			System.out.println("ID: " + lineModel.getId());
//			System.out.println("Quantidade de caracteres: " +
//								lineModel.getCountCaracters());
//			System.out.println();
//		}	//	foreach
	
		input.close();
	}	//	start
}	//	LineView