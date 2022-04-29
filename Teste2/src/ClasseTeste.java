import java.util.Objects;
import java.util.Scanner;

public class ClasseTeste {

    public static void main(String[] args) {

    /*
        int valA=10;
        int valB=20;
        int valC=1;
        String valA_str="";
        String valB_str="";
        String saida="";
        valC=valB;
        valB=valA;
        valA=valC;
        valA_str=String.valueOf(valA);
        valB_str=String.valueOf(valB);
        saida=valA_str+", "+valB_str;
        System.out.println(saida);
        */ //Exercício 1
    /*
        Exercício 2:
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        int valor = leitor.nextInt();
        System.out.println(--valor);
        */ //Exercício 2
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a medida da base: ");
        double base = scan.nextDouble();
        System.out.print("Digite a medida da altura: ");
        double altura = scan.nextDouble();
        double perimetro=(altura*2)+(base*2);
        double area=altura*base;
        String area_str=String.valueOf(area);
        String perimetro_str=String.valueOf(perimetro);
        System.out.println("O perímetro mede :"+perimetro+". A área mede :"+area);
        */ //Exercício 3
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de anos de vida: ");
        int anos = scan.nextInt();
        System.out.print("Digite a quantidade de meses de vida: ");
        int meses = scan.nextInt();
        System.out.print("Digite a quantidade de dias de vida: ");
        int dias = scan.nextInt();
        meses*=30;
        anos*=365;
        dias+=anos+meses;
        System.out.println(dias + " dias");
        */ //Exercício 4
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de eleitores do município: ");
        int eleitores = scan.nextInt();
        System.out.print("Digite a quantidade de votos nulos registrados: ");
        int VtNulo = scan.nextInt();
        System.out.print("Digite a quantidade de votos brancos registrados: ");
        int VtBranco = scan.nextInt();
        int validos=eleitores-VtBranco-VtNulo;
        double porcValidos=(eleitores/100)*validos;
        double porcNulos=(eleitores/100)*VtNulo;
        double porcBranco=(eleitores/100)*VtBranco;
        System.out.println("Votos válidos: " + validos);
        System.out.println("Porcentagem de votos válidos: " + porcValidos + "%");
        System.out.println("Porcentagem de votos nulos: " + porcNulos + "%");
        System.out.println("Porcentagem de votos brancos: " + porcBranco + "%");
        */ //Exercício 5
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o sálario: R$");
        double salario = scan.nextDouble();
        System.out.print("Digite de quantos porcento será o ajuste: ");
        double ajuste =scan.nextDouble();
        ajuste+=100;
        salario=(salario/100)*ajuste;
        System.out.println("O novo salário será de R$" + salario);
        */ //Exercício 6
    /*
        Scanner leitorCusto = new Scanner(System.in);
        System.out.print("Digite o custo de fábrica: R$");
        double custo = leitorCusto.nextDouble();
        double custo_imposto=(custo/100)*45;
        double custo_distribuidor=(custo/100)*28;
        double custo_total=custo+custo_distribuidor+custo_imposto;
        System.out.println("O valor para o consumidor será de R$" + custo_total);
        */ //Exercício 7
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o sálario fixo: R$");
        double salario = scan.nextDouble();
        System.out.print("Digite a quantidade de carros vendidos: ");
        double vendas = scan.nextDouble();
        System.out.print("Digite a taxa por venda: R$");
        double taxa = scan.nextDouble();
        System.out.print("Digite o valor total de suas vendas: R$");
        double valor_vendas = scan.nextDouble();
        double salario_total=(vendas*taxa)+((valor_vendas/100)*5)+salario;
        System.out.println("O salário total do funcionário é de: R$" + salario_total);
        */ //Exercício 8
    /*
        Scanner leitorFahrenheit = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double tempF = leitorFahrenheit.nextDouble();
        double tempC= (tempF-32)*5/9;
        System.out.println("A temperatura em graus celsius é de: " + tempC);
        */ //Exercício 9
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = (scan.nextDouble())*2;
        System.out.print("Digite a segunda nota: ");
        double nota2 = (scan.nextDouble())*3;
        System.out.print("Digite a terceira nota: ");
        double nota3 = (scan.nextDouble())*5;
        double nota_final=(nota1+nota2+nota3)/10;
        System.out.println("A média final é: " + nota_final);
        */ //Exercício 10
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        double valor = scan.nextDouble();
        if (valor>10){
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
        */ //Exercício 11
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        double valor = scan.nextDouble();
        if (valor>=0){
            System.out.println("O valor é positivo");
        } else {
            System.out.println("O valor é negativo");
        }
        */ //Exercício 12
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de maçãs compradas: ");
        int quant = scan.nextInt();
        if (quant>=12){
            double valor=quant*1.0;
            System.out.println("O custo é de : R$" + valor);
        } else {
            double valor=quant*1.3;
            System.out.println("O custo é de : R$" + valor);
        }

     */ //Exercício 13
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int nasc = scan.nextInt();
        System.out.print("Digite o ano atual: ");
        int atual = scan.nextInt();
        int idade=atual-nasc;
        if (idade>=16){
            System.out.println("Você pode votar esse ano");
        } else {
            System.out.println("Você não pode votar esse ano");
        }

     */ //Exercício 14
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = scan.nextInt();
        if (valor1>valor2){
            System.out.println("O maior é: " + valor1);
        } else {
            System.out.println("O maior é: " + valor2);
        }
     */ //Exercício 15
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = scan.nextInt();
        if (valor1<valor2){
            String ordem= String.valueOf(valor1) + ", " + String.valueOf(valor2);
            System.out.println(ordem);
        } else {
            String ordem= String.valueOf(valor2) + ", " + String.valueOf(valor1);
            System.out.println(ordem);
        }

     */ //Exercício 16
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o horário em que o jogo começou: ");
        int inicio = scan.nextInt();
        System.out.print("Digite o horário em que o jogo terminou: ");
        int fim = scan.nextInt();
        if (inicio<fim){
            int tempo=(24-fim)+inicio;
            int tempo_teste=tempo+inicio;
            if (tempo_teste>24){
                tempo=fim-inicio;
            }
            System.out.println("A partida durou " + tempo + " horas");
        } else if (inicio==fim){
            System.out.println("A partida durou 24 horas");
        } else if (inicio>fim){
            int tempo=(24-inicio)+fim;
            System.out.println("A partida durou " + tempo + " horas");
        }

     */ //Exercício 17
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horas = scan.nextDouble();
        System.out.print("Digite o salário por hora: ");
        double salario = scan.nextDouble();
        double horas_nec=40*5*4;
        if (horas>horas_nec){
            double salario_extra=((horas-horas_nec)*(salario+((salario/100)*50)))+salario*horas_nec;
            System.out.println("O salário total será de R$" + salario_extra);
        } else {
            System.out.println("O salário total será de R$" + salario);
        }

     */ //Exercício 18
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite a sua altura: ");
        double altura = scan.nextDouble();
        String guarda_espaco=scan.nextLine();
        System.out.print("Digite o seu gênero (Masculino=M ou Feminino=F): ");
        String gene=scan.nextLine();
        if (Objects.equals(gene, "M")){
            double peso_ideal=(72.7*altura)-58;
            System.out.println("Peso ideal: " + peso_ideal + "Kg");
        } else if (Objects.equals(gene, "F")){
            double peso_ideal=(62.1*altura)-44.7;
            System.out.println("Peso ideal: "+ peso_ideal + "Kg");
        }

     */ //Exercício 19
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o sálario fixo: R$");
        double salario = scan.nextDouble();
        System.out.print("Digite o valor total de suas vendas: R$");
        double valor_vendas = scan.nextDouble();
        if (valor_vendas>1500){
            double extra=(valor_vendas-1500);
            double final_extra=(extra/100)*5;
            double final_normal=(1500/100)*3;
            double comis=final_extra+final_normal;
            double salario_total=comis+salario;
            System.out.println("O salário total é de " + salario_total);
        } else {
            double comis=(valor_vendas/100)*3;
            double salario_total=comis+salario;
            System.out.println("O salário total é de R$" + salario_total);
        }

     */ //Exercício 20
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número da conta: ");
        double conta = scan.nextDouble();
        System.out.print("Digite o saldo da conta: ");
        double saldo = scan.nextDouble();
        System.out.print("Digite o valor da fatura de débito da conta: ");
        double debito = scan.nextDouble();
        System.out.print("Digite o valor da fatura de crédito da conta: ");
        double credito = scan.nextDouble();
        double saldo_atual=saldo-(debito+credito);
        if (saldo_atual>=0){
            System.out.println("Saldo atual positivo: R$" + saldo_atual);
        } else {
            System.out.println("Saldo atual negativo: R$" + saldo_atual);
        }

     */ //Exercício 21
    /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade atual em estoque do produto: ");
        int atual = scan.nextInt();
        System.out.print("Digite a quantidade máxima em estoque do produto: ");
        int max= scan.nextInt();
        System.out.print("Digite a quantidade mínima em estoque do produto: ");
        int min = scan.nextInt();
        double media=(max+min)/2;
        if (media>=atual){
            System.out.println("Quantidade média: "+media);
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Quantidade média: "+media);
            System.out.println("Efetuar compra");
        }

     */ //Exercício 22

    }

}

