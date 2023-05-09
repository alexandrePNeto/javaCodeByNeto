package com.neto.philippus;

public class LineController implements Line
{
	@Override
	public String lineContent(String content) {
		//	TODO colocar ou tirar pontos
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