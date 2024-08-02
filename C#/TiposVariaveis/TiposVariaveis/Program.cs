using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http.Headers;
using System.Text;
using System.Threading.Tasks;

namespace TiposVariaveis
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //-- Variaveis tipo inteiro
            /*int variavel = new int();
            int variavel2 = new int();

            variavel = 1;

            variavel = int.MinValue;
            variavel2 = int.MaxValue;

            Console.WriteLine("Menor valor de variavel tipo inteiro: " + variavel);
            Console.WriteLine("Maior valor de variavel tipo inteiro: " + variavel2);

            variavel = -2147483648;
            variavel2 = 2147483647;*/

            //Variavel tipo caractere

            /*char caractere = 'A';

            Console.WriteLine("Variavel do tipo caractere: " + caractere);

            caractere = 'B';

            Console.WriteLine(caractere);*/

            //Variavel tipo cadeia de caractere ou texto

            /*string cadeiaCaractere;

            cadeiaCaractere = "Texto com mais de uma letra ou numero 123";

            Console.WriteLine(cadeiaCaractere);*/

            //Variavel de ponto flutuante ou real

            /*float variavel = new float();
            float variavel2 = new float();

            variavel = 1.50f;

            Console.WriteLine("Variavel tipo ponto flutuante: " + variavel);

            string variavel3 = float.MinValue.ToString("F");
            string variavel4 = float.MaxValue.ToString("F");

            Console.WriteLine("Tamanho minimo de uma variavel do tipo float: " + variavel3);
            Console.WriteLine("Tamanho maximo de uma variavel do tipo float: " + variavel4);

            variavel = -340282300000000000000000000000000000000.00f;
            variavel2 = 340282300000000000000000000000000000000.00f;
            */

            //Variavel tipo double

            /*double variavel = new double();
            double variavel2 = new double();

            variavel = 1.90;
            variavel2 = 2.01;

            Console.WriteLine("Variavel do tipo double: " + variavel);
            Console.WriteLine("Variavel do tipo double: " + variavel2);

            string variavel3 = double.MaxValue.ToString("F");
            string variavel4 = double.MinValue.ToString("F");

            Console.WriteLine("Valor maximo de variavel tipo double: " + variavel3);
            Console.WriteLine("Valor minimo de variavel tipo double: " + variavel4);
            */

            //Variavel tipo decimal

            /*decimal variavel = new decimal();
            decimal variavel2 = new decimal();

            variavel = 1.20M;
            variavel2 = 2.01M;

            Console.WriteLine("Tipo variavel decimal: " + variavel);
            Console.WriteLine("Tipo variavel decimal " + variavel2);

            string variavel3 = decimal.MaxValue.ToString("F");
            string variavel4 = decimal.MinValue.ToString("F");

            Console.WriteLine("Tamanho maximo variavel tipo decimal: " + variavel3);
            Console.WriteLine("Tamanho minimo variavel tipo decimal: " + variavel4);
            */
            
            //Variavel tipo data

            /*DateTime variavel = new DateTime();

            variavel = DateTime.Now;

            Console.WriteLine("Tipo de variavel data: " + variavel);
            */

            //Tipo de variavel verdadeiro ou falso

            bool variavel = new bool();

            Console.WriteLine("Tipo variavel verdadeiro ou falso: " + variavel);

            Console.WriteLine("Tipo variavel verdadeiro ou falso: " + !variavel);























        }
    }
}
