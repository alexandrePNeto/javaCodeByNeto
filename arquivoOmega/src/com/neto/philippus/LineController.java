package com.neto.philippus;

public class LineController implements Line
{
	@Override
	public String lineContent(String content) {
		if (content != "" 
			|| content == " "
			|| !content.contains("!?;,'\""))
			if(content.substring(-1, content.length()) != ".")
				content+=".";
		
		return "Conteúdo: " + content;
	}	//	lineContent

	@Override
	public int lineId(int id) {
		return id;
	}	//	lineId

	@Override
	public int countCaracters(String line) {
		int countOffLine = 0;
		
		//	TODO pega a linha e contar por aqui.
		
		return countOffLine;
	}	//	countCaracters
}