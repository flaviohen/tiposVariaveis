import java.math.*;
import java.util.Date;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
public class TiposVariaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variaveis tipo inteiro
		/*int variavel, variavel2;
		
		variavel = 1;
		
		System.out.println("Variavel tipo inteiro: " + variavel);
		
		variavel = Integer.MAX_VALUE;
		variavel2 = Integer.MIN_VALUE;
		
		System.out.println("Tamanho maximo de variavel tipo inteiro: " + variavel);
		System.out.println("Tamanho minimo de variavel tipo inteiro: " + variavel2);
		
		variavel = 2147483647;
		variavel2 = -2147483648;
		*/
		
		//Variavel tipo caractere
		
		/*char caractere = 'A';
		
		System.out.println("Variavel tipo caractere: " + caractere);
		
		caractere = 'B';
		*/
		
		//Variavel tipo cadeia de caractere ou texto
		
		/*String cadeiaCaractere = new String();
		
		cadeiaCaractere = "Texto com mais de uma letra ou numero 1234";
		
		System.out.println("Variavel tipo cadeia de caractere: " + cadeiaCaractere);
		
		cadeiaCaractere = "1.5";
		
		System.out.println(cadeiaCaractere);
		*/
		
		//Variavel tipo ponto flutuante
		
		/*float variavel, variavel2;
		
		variavel = 1.5f;
		
		System.out.println("Variavel tipo float: " + variavel);
		
		variavel = Float.MAX_VALUE;
		variavel2 = Float.MIN_VALUE;
		
		BigDecimal max = new BigDecimal(variavel);
		BigDecimal min = new BigDecimal(variavel2);
		
		System.out.println(variavel);
		System.out.println(variavel2);
		
		System.out.println("Tamanho maximo variavel tipo float: " + max.toPlainString());
		System.out.println("Tamanho minimo variavel tipo float: " + min.toPlainString());
		*/
		
		/*double variavel3, variavel4;
		variavel3 = 2.80;
		variavel4 = 5.01;
		
		System.out.println("Variavel tipo double: " + variavel3 + "-" + variavel4);
		
		variavel3 = Double.MAX_VALUE;
		variavel4 = Double.MIN_VALUE;
		
		BigDecimal max2 = new BigDecimal(variavel3);
		BigDecimal min2 = new BigDecimal(variavel4);
		
		System.out.println(variavel3);
		System.out.println(variavel4);
		
		System.out.println("Tamanho maximo variavel tipo double: " + max2.toPlainString());
		System.out.println("Tamanho minimo variavel tipo double: " + min2.toPlainString());
		
		
		BigDecimal variavel5 = new BigDecimal(123.99);
		
		System.out.println(variavel5);
		*/
		
		//Variavel tipo data
		
		/*Date data1 = new Date();
		
		System.out.println("Variavel tipo data: " + data1);
		
		System.out.println(data1);
		
		System.out.println(data1.toString());
		
		//Definindo a forma de mostrar a data
		SimpleDateFormat forma = new SimpleDateFormat("dd/MM/yyyy");
		
		String data4 = forma.format(data1);
		
		System.out.println("Data com formato definido: " + data4);
		
		
		LocalDate date = LocalDate.now();
		
		DateTimeFormatter forma2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String date2 = forma2.format(date);
		
		System.out.println("Outro tipo Data definindo formato: " + date2);
		*/
		//Variavel tipo verdadeiro ou falso
		
		Boolean variavel6 = false;
		
		System.out.println("Tipo variavel verdadeiro ou falso: " + variavel6);
		System.out.println("Tipo variavel verdadeiro ou falso: " + !variavel6);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
