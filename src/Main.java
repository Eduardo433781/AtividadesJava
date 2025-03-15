



public class Main {
    public static void main(String[] args) {



        //Média de três números
        int num01 = 10;
        int num02 = 20;
        int num03 = 30;
        int media= (num01+num02+num03)/3;

        double media01 = (num01+num02+num03)/3.0;
        float media02 = (num01+num02+num03)/3.0f;
        long media03 = (num01+num02+num03)/3L;

        System.out.println("A média do inteiro é: "+ media);
        System.out.println("A média do número real é: "+ media01);
        System.out.println("A média do número float é:"+ media02);
        System.out.println("A média do número long é"+ media03);









        //Declaração de Long
        long distancia = 149600000L;

        System.out.println("A distância da Terra ao Sol é: " + distancia + " km.");










        //Valor Unicode de um Caractere
        char letra = 'A';
        char letra1 = 'B';
        char letra2 = 'C';
        char letra3 = 'D';


        int valorUnicode = letra;



        System.out.println("O valor Unicode de '" + letra + "' é: " + valorUnicode);
        System.out.println("O valor Unicode de '" + letra1 + "' é: " + valorUnicode);
        System.out.println("O valor Unicode de '" + letra2 + "' é: " + valorUnicode);
        System.out.println("O valor Unicode de '" + letra3 + "' é: " + valorUnicode);










        //Tipos Booleanos

        int numero1 = 100;
        boolean menorQueCem = numero1 <= 100;

        System.out.println("O número " + numero1 + " é menor que 100? " + menorQueCem);

        int numero2 = 201;
        boolean igualMaior = numero2 >= 200;
        System.out.println("O número " + numero2 + " é igual ou maior que 200? " + igualMaior);






        //Usando Arrays

        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Primeiro número: " + numeros[0]);
        System.out.println("Último número: " + numeros[numeros.length - 1]);



        int[] numeros1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        System.out.println("Primeiro número: " + numeros1[0]);
        System.out.println("Ultimo número: " + numeros1[numeros1.length - 1]);




        //Calculando a Área de um Retângulo

        double largura = 5.0;
        double altura = 3.0;
        double area = largura * altura;

        System.out.println("A área do retângulo é: " + area);


        double largura1 = 5.0;
        double altura1 = 3.0;
        double area1 = largura1 * altura1 / 2;
        System.out.println("A área do Triângulo é: " + area1);


        //Trabalhando com Strings

        String nome = "Eduardo";
        int idade = 18;
        double altura2 = 1.60;



        System.out.println("Meu nome é " + nome + " e eu faço curso no Senai");
        System.out.println("Eu tenho " + idade + " anos e " + altura2 + " de altura");

        











        }
    }
