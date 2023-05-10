package com.neto.philippus;

public interface Line 
{
	//	Retorna o contúdo completo da linha.
	String 	lineContent(String content);
	
	//	Retorna se existe determinhado valor,
	//	ou conteúdo da linha.
	String existContent(String valString);
	
	//	Retorna a quantidade de caracteres.
	int		countCaracters(String count);


}	//	Line