#include <iostream>
#include <limits>
#include <string>
#include <cfloat>
#include <iomanip>
#include <ctime>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	
	/*int variavel = 1;
	int variavel2;
	
	std::cout << "Variavel tipo inteiro: " << variavel << std::endl;
	
	std::cin >> variavel;
	
	std::cout << variavel << std::endl;
	
	variavel = INT_MAX;
	variavel2 = INT_MIN;
	
	std::cout << "Tamanho maximo de variavel tipo inteiro: " << variavel << std::endl;
	std::cout << "Tamanho minimo de variavel tipo inteiro: " << variavel2 << std::endl;
	*/
	
	//Tipo de variavel caractere
	
	/*char caractere = 'A';
	
	std::cout << "Variavel tipo caractere: " << caractere << std::endl;
	
	caractere = 'B';
	
	std::cout << caractere << std::endl;
	*/
	
	//Tipo de variavel cadeia de caractere ou Texto
	
	/*std::string variavel = "Variavel que pode armazenar varios caracteres letras ou numeros texto no geral";
	
	std::cout << "Variavel tipo cadeia de caractere ou texto: " << variavel << std::endl;
	*/
	
	//Tipo de variaveis ponto flutuante
	
	/*float variavel = 1.56f;
	float variavel2;
	
	std::cout << "Tipo variavel ponto flutuante: " << variavel << std::endl;
	
	variavel = FLT_MAX;
	variavel2 = FLT_MIN;
	
	std::cout << variavel << std::endl;
	std::cout << variavel2 << std::endl;
	
	std::cout << std::fixed << std::setprecision(1000);
	std::cout << "Tamanho maximo de variavel tipo float: " << variavel << std::endl;
	
	std::cout << std::fixed << std::setprecision(1000);
	std::cout << "Tamanho minimo de variavel tipo float: " << variavel2 << std::endl;
	
	double variavel3 = 1.70;
	double variavel4;
	
	std::cout << "Tipo variavel ponto flutuante double: " << variavel3 << std::endl;
	
	variavel3 = DBL_MAX;
	variavel4 = DBL_MIN;
	
	std::cout << variavel3 << std::endl;
	std::cout << variavel4 << std::endl;
	
	std::cout << std::fixed << std::setprecision(1000);
	std::cout << "Tamanho maximo variavel tipo double: " << variavel3 << std::endl;
	
	std::cout << std::fixed << std::setprecision(1000);
	std::cout << "Tamanho minimo variavel tipo double: " << variavel4 << std::endl;
	*/
	//Variavel tipo data
	/*
	std::time_t t = std::time(nullptr);
	std::tm* now = std::localtime(&t);
	
	std::cout << "Ano: " << (now -> tm_year + 1900) << std::endl;
	std::cout << "Mes: " << (now -> tm_mon + 1) << std::endl;
	std::cout << "Dia: " << (now -> tm_mday) << std::endl;
	*/
	//Variavel tipo verdadeiro ou falso
	
	bool variavel6 = false;
	
	std::cout << "Tipo variavel verdadeiro ou falso: " << variavel6 << std::endl;
	std::cout << "Tipo variavel verdadeiro ou falso: " << !variavel6 << std::endl;
	
	//no caso do c++ mostra 0 para false e 1 para verdadeiro
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	system("pause");
}