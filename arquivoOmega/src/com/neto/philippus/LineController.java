package com.neto.philippus;

public class LineController implements Line
{
	protected static String lineContent;
	
	@SuppressWarnings("static-access")
	@Override
	public String lineContent(String content) {
		this.lineContent = content;
		
		return "Conteúdo: " + content;
	}	//	lineContent

	@Override
	public int countCaracters(String line) {
		int	countOffLine	= 0;
		
		for (int i = 0; i < line.length(); i++)
			countOffLine++;
		
		return countOffLine;
	}	//	countCaracters

	
	private static Boolean existContentBoll(String val) {
		if(lineContent.contains(val))
			return true;
		else
			return false;
	}	//	existContentBoll

	@Override
	public String existContent(String valString) {
		if(existContentBoll(valString))
			return "Tem o valor: " + valString + ".";
		else
			return "Não tem o valor: " + valString + ".";
	}	//	existContent
}