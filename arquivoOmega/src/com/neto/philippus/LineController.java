package com.neto.philippus;

public class LineController implements Line
{
	@Override
	public String lineContent(String content) {
		//	TODO colocar ou tirar pontos
		return "Conteúdo: " + content;
	}	//	lineContent

	@Override
	public int countCaracters(String line) {
		int	countOffLine	= 0;
		
		for (int i = 0; i < line.length(); i++)
			countOffLine++;
		
		return countOffLine;
	}	//	countCaracters
}