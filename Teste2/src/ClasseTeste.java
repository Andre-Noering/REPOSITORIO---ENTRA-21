import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class ClasseTeste {


    public static void main(String[] args) {
        Morse();
    }


    public static void Exe1() {
        int valA = 10;
        int valB = 20;
        int valC = 1;
        String valA_str = "";
        String valB_str = "";
        String saida = "";
        valC = valB;
        valB = valA;
        valA = valC;
        valA_str = String.valueOf(valA);
        valB_str = String.valueOf(valB);
        saida = valA_str + ", " + valB_str;
        System.out.println(saida);
    }

    public static void Exe2() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        int valor = leitor.nextInt();
        System.out.println(--valor);
    }

    public static void CalculaPerimetroeArea() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a medida da base: ");
        double base = scan.nextDouble();
        System.out.print("Digite a medida da altura: ");
        double altura = scan.nextDouble();
        double perimetro = (altura * 2) + (base * 2);
        double area = altura * base;
        String area_str = String.valueOf(area);
        String perimetro_str = String.valueOf(perimetro);
        System.out.println("O perímetro mede :" + perimetro + ". A área mede :" + area);
    }

    public static void CalculaDiasDeVida() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de anos de vida: ");
        int anos = scan.nextInt();
        System.out.print("Digite a quantidade de meses de vida: ");
        int meses = scan.nextInt();
        System.out.print("Digite a quantidade de dias de vida: ");
        int dias = scan.nextInt();
        meses *= 30;
        anos *= 365;
        dias += anos + meses;
        System.out.println(dias + " dias");
    }

    public static void CalculaVotosValidos() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de eleitores do município: ");
        int eleitores = scan.nextInt();
        System.out.print("Digite a quantidade de votos nulos registrados: ");
        int VtNulo = scan.nextInt();
        System.out.print("Digite a quantidade de votos brancos registrados: ");
        int VtBranco = scan.nextInt();
        int validos = eleitores - VtBranco - VtNulo;
        double porcValidos = (eleitores / 100) * validos;
        double porcNulos = (eleitores / 100) * VtNulo;
        double porcBranco = (eleitores / 100) * VtBranco;
        System.out.println("Votos válidos: " + validos);
        System.out.println("Porcentagem de votos válidos: " + porcValidos + "%");
        System.out.println("Porcentagem de votos nulos: " + porcNulos + "%");
        System.out.println("Porcentagem de votos brancos: " + porcBranco + "%");
    }

    public static void CalculaSalarioReajuste() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o sálario: R$");
        double salario = scan.nextDouble();
        System.out.print("Digite de quantos porcento será o ajuste: ");
        double ajuste = scan.nextDouble();
        ajuste += 100;
        salario = (salario / 100) * ajuste;
        System.out.println("O novo salário será de R$" + salario);
    }

    public static void CalculaCustoFabrica() {
        Scanner leitorCusto = new Scanner(System.in);
        System.out.print("Digite o custo de fábrica: R$");
        double custo = leitorCusto.nextDouble();
        double custo_imposto = (custo / 100) * 45;
        double custo_distribuidor = (custo / 100) * 28;
        double custo_total = custo + custo_distribuidor + custo_imposto;
        System.out.println("O valor para o consumidor será de R$" + custo_total);
    }

    public static void CalculaSalarioTotal() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o sálario fixo: R$");
        double salario = scan.nextDouble();
        System.out.print("Digite a quantidade de carros vendidos: ");
        double vendas = scan.nextDouble();
        System.out.print("Digite a taxa por venda: R$");
        double taxa = scan.nextDouble();
        System.out.print("Digite o valor total de suas vendas: R$");
        double valor_vendas = scan.nextDouble();
        double salario_total = (vendas * taxa) + ((valor_vendas / 100) * 5) + salario;
        System.out.println("O salário total do funcionário é de: R$" + salario_total);
    }

    public static void CalculaTempCelsius() {
        Scanner leitorFahrenheit = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double tempF = leitorFahrenheit.nextDouble();
        double tempC = (tempF - 32) * 5 / 9;
        System.out.println("A temperatura em graus celsius é de: " + tempC);
    }

    public static void CalculaMedia3Nums() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = (scan.nextDouble()) * 2;
        System.out.print("Digite a segunda nota: ");
        double nota2 = (scan.nextDouble()) * 3;
        System.out.print("Digite a terceira nota: ");
        double nota3 = (scan.nextDouble()) * 5;
        double nota_final = (nota1 + nota2 + nota3) / 10;
        System.out.println("A média final é: " + nota_final);
    }

    public static void CalculaMaiorQ10() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        double valor = scan.nextDouble();
        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }

    public static void CalculaPosOuNeg() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        double valor = scan.nextDouble();
        if (valor >= 0) {
            System.out.println("O valor é positivo");
        } else {
            System.out.println("O valor é negativo");
        }
    }

    public static void CalculaPrecDuzia() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de maçãs compradas: ");
        int quant = scan.nextInt();
        if (quant >= 12) {
            double valor = quant * 1.0;
            System.out.println("O custo é de : R$" + valor);
        } else {
            double valor = quant * 1.3;
            System.out.println("O custo é de : R$" + valor);
        }
    }

    public static void CalculaIdadeVoto() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int nasc = scan.nextInt();
        System.out.print("Digite o ano atual: ");
        int atual = scan.nextInt();
        int idade = atual - nasc;
        if (idade >= 16) {
            System.out.println("Você pode votar esse ano");
        } else {
            System.out.println("Você não pode votar esse ano");
        }
    }

    public static void CalculaMaiorMenor() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = scan.nextInt();
        if (valor1 > valor2) {
            System.out.println("O maior é: " + valor1);
        } else {
            System.out.println("O maior é: " + valor2);
        }
    }

    public static void OrdemCrescente() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = scan.nextInt();
        if (valor1 < valor2) {
            String ordem = String.valueOf(valor1) + ", " + String.valueOf(valor2);
            System.out.println(ordem);
        } else {
            String ordem = String.valueOf(valor2) + ", " + String.valueOf(valor1);
            System.out.println(ordem);
        }
    }

    public static void CalculaTempoXadrez() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o horário em que o jogo começou: ");
        int inicio = scan.nextInt();
        System.out.print("Digite o horário em que o jogo terminou: ");
        int fim = scan.nextInt();
        if (inicio < fim) {
            int tempo = (24 - fim) + inicio;
            int tempo_teste = tempo + inicio;
            if (tempo_teste > 24) {
                tempo = fim - inicio;
            }
            System.out.println("A partida durou " + tempo + " horas");
        } else if (inicio == fim) {
            System.out.println("A partida durou 24 horas");
        } else if (inicio > fim) {
            int tempo = (24 - inicio) + fim;
            System.out.println("A partida durou " + tempo + " horas");
        }
    }

    public static void CalculaSalarioHrExtra() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horas = scan.nextDouble();
        System.out.print("Digite o salário por hora: ");
        double salario = scan.nextDouble();
        double horas_nec = 40 * 4;
        if (horas > horas_nec) {
            double salario_extra = ((horas - horas_nec) * (salario + ((salario / 100) * 50))) + salario * horas_nec;
            System.out.println("O salário total será de R$" + salario_extra);
        } else {
            System.out.println("O salário total será de R$" + salario);
        }
    }

    public static void CalculaPesoIdeal() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite a sua altura: ");
        double altura = scan.nextDouble();
        String guarda_espaco = scan.nextLine();
        System.out.print("Digite o seu gênero (Masculino=M ou Feminino=F): ");
        String gene = scan.nextLine();
        if (Objects.equals(gene, "M")) {
            double peso_ideal = (72.7 * altura) - 58;
            System.out.println("Peso ideal: " + peso_ideal + "Kg");
        } else if (Objects.equals(gene, "F")) {
            double peso_ideal = (62.1 * altura) - 44.7;
            System.out.println("Peso ideal: " + peso_ideal + "Kg");
        }
    }

    public static void CalculaSalarioMaisComis() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o sálario fixo: R$");
        double salario = scan.nextDouble();
        System.out.print("Digite o valor total de suas vendas: R$");
        double valor_vendas = scan.nextDouble();
        if (valor_vendas > 1500) {
            double extra = (valor_vendas - 1500);
            double final_extra = (extra / 100) * 5;
            double final_normal = (1500 / 100) * 3;
            double comis = final_extra + final_normal;
            double salario_total = comis + salario;
            System.out.println("O salário total é de " + salario_total);
        } else {
            double comis = (valor_vendas / 100) * 3;
            double salario_total = comis + salario;
            System.out.println("O salário total é de R$" + salario_total);
        }
    }

    public static void CalculaSalarioPosOuNeg() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número da conta: ");
        double conta = scan.nextDouble();
        System.out.print("Digite o saldo da conta: ");
        double saldo = scan.nextDouble();
        System.out.print("Digite o valor da fatura de débito da conta: ");
        double debito = scan.nextDouble();
        System.out.print("Digite o valor da fatura de crédito da conta: ");
        double credito = scan.nextDouble();
        double saldo_atual = saldo - (debito + credito);
        if (saldo_atual >= 0) {
            System.out.println("Saldo atual positivo: R$" + saldo_atual);
        } else {
            System.out.println("Saldo atual negativo: R$" + saldo_atual);
        }
    }

    public static void CalculaQuantEstoque() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade atual em estoque do produto: ");
        int atual = scan.nextInt();
        System.out.print("Digite a quantidade máxima em estoque do produto: ");
        int max = scan.nextInt();
        System.out.print("Digite a quantidade mínima em estoque do produto: ");
        int min = scan.nextInt();
        double media = (max + min) / 2;
        if (media >= atual) {
            System.out.println("Quantidade média: " + media);
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Quantidade média: " + media);
            System.out.println("Efetuar compra");
        }
    }

    // Pós Atestado
    public static void CalculaFatorial() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int num = in.nextInt();
        int fator = 1;
        for (int i = 1; i <= num; i++) {
            fator *= i;
        }
        System.out.println("O fatorial do número é : " + fator);
    }

    public static void VerificaPIN() {
        int pin = 91352;
        for (int i = 2; i >= 0; i--) {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite o PIN de 5 dígitos: ");
            int user = in.nextInt();
            if (user == pin) {
                System.out.println("Acesso permitido");
                break;
            } else if (i > 0) {
                System.out.println("Acesso negado. Você tem " + i + " tentativas restantes.");
            } else {
                System.out.println("Acesso negado. Suas tentativas acabaram.");
            }
        }
    }

    public static void EscreveSiglaNome() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o nome e o sobrenome: ");
        String nomeComp = in.nextLine();
        String[] separados = nomeComp.split(" ");
        String nome = separados[0];
        String sobrenome = separados[1];
        System.out.println(nome.charAt(0) + ". " + sobrenome.charAt(0) + ".");
    }

    public static boolean escolhaValida(int escolha) {
        return escolha > -1 && escolha < 3;
    }

    public static String escolhaString(int escolha) {
        switch (escolha) {
            case 0:
                return "Pedra";
            case 1:
                return "Papel";
            case 2:
                return "Tesoura";
            default:
                return "";
        }
    }

    public static int vencedor(int escolhaJogador, int escolhaComputador) {
        if (escolhaJogador == 0 && escolhaComputador == 1 ||
                escolhaJogador == 1 && escolhaComputador == 2 ||
                escolhaJogador == 2 && escolhaComputador == 0) {
            return 2;
        } else if (escolhaComputador == 0 && escolhaJogador == 1 ||
                escolhaComputador == 1 && escolhaJogador == 2 ||
                escolhaComputador == 2 && escolhaJogador == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void PedraPapelTesoura() {


        System.out.println("PEDRA PAPEL TESOURA");

        String inf = "";
        boolean fim = false;
        int contVitJog = 0;
        int contVitComp = 0;
        Scanner in = new Scanner(System.in);
        while (!fim) {
            Random computador = new Random();
            System.out.println("JOGADOR, você escolhe Pedra (0), Papel (1) ou Tesoura (2)?");
            System.out.print("(Digite o valor numérico respectivo): ");
            int jog = in.nextInt();
            String jogSTR = escolhaString(jog);
            if (escolhaValida(jog)) {
                System.out.println("Você escolheu " + jogSTR);
            } else {
                System.err.println("Digite um valor válido.");
                break;
            }
            int comp = computador.nextInt(3);
            String compSTR = escolhaString(comp);
            System.out.println("O computador escolheu: " + compSTR);
            switch (vencedor(jog, comp)) {
                case 0:
                    System.out.println("(Jogador) " + jogSTR + " X " + compSTR + " (Computador)");
                    System.out.println("Empate");
                    break;
                case 1:
                    System.out.println("(Jogador) " + jogSTR + " X " + compSTR + " (Computador)");
                    System.out.println("Jogador Venceu!");
                    contVitJog++;
                    System.out.println("PLACAR : JOGADOR: " + contVitJog + "         COMPUTADOR: " + contVitComp);
                    break;
                case 2:
                    System.out.println("(Jogador) " + jogSTR + " X " + compSTR + " (Computador)");
                    System.out.println("Computador Venceu");
                    contVitComp++;
                    System.out.println("PLACAR : JOGADOR: " + contVitJog + "         COMPUTADOR: " + contVitComp);
                    break;
            }
            if (contVitJog == 10) {
                System.out.println("Você venceu o jogo!");
                fim = true;
            } else if (contVitComp == 10) {
                System.out.println("O computador venceu o jogo!");
                fim = true;
            }

        }
        System.out.println("Fim de jogo!");

    }


    public void VoltaMaiorEMenor() {
        Scanner in = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        int num = -1;
        boolean first = true;
        while (num != 0) {
            System.out.println("Digite um número(0 para sair): ");
            num = in.nextInt();
            if (first) {
                maior = num;
                menor = num;
            } else {
                if (num == 0) {
                    break;
                } else if (num > maior) {
                    maior = num;
                } else if (num < menor) {
                    menor = num;
                }
            }
        }
        System.out.println("O maior foi " + maior + " e o menor foi " + menor);

    }

    public void AdivinharNumero(){
        Random r= new Random();
        int numero=r.nextInt(101);
        Scanner in=new Scanner((System.in));
        int numUser=0;
        while (true){
            System.out.println("Digite o chute: ");
            int chute=in.nextInt();
            if (chute==numero){
                System.out.println("Você acertou!");
                break;
            } else if (chute>numero){
                System.out.println(("Chutou alto"));
            } else {
                System.out.println("Chutou baixo");
            }
        }
    }

    /*
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a palavra: ");
        String pal=in.nextLine();
        String contrario="";
        int cont=pal.length();
        cont--;
        for (int i=cont; i>=0; i--) {
            contrario += pal.charAt(i);
        }
        if (pal.equals(contrario)){
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo");
        }

        */ // Exercício Palíndromo
    /*
        Scanner in=new Scanner(System.in);
        System.out.println("Digite a palavra: ");

        String pal=in.nextLine();
        pal=pal.toUpperCase();
        char[] lista=new char [pal.length()];
        int contteste=pal.length()-1;
        boolean fim=false;
        int cont=0;
        int tent=6;
        int contF=0;
        for (int i = 0; i < pal.length(); i++) {
            lista[i]='_';
        }
        while (!fim) {
            cont=0;
            System.out.print("Digite uma letra: ");
            String letrains=in.nextLine();
            letrains=letrains.toUpperCase();
            for (int i = 0; i < pal.length(); i++) {
                char letra=letrains.charAt(0);
                if (lista[i]==letra){
                    System.out.println("Você já digitou essa letra.");
                    break;
                }
                if (pal.charAt(i)==letra){
                    lista[i]=letra;
                    cont+=1;
                }
            }
            if (cont==0){
                tent--;
                System.out.println("Você errou. "+tent+" tentativas restantes.");
            }
            if (tent==0){
                fim=true;
                System.out.println("Você foi enforcado violentamente!");
            }
            for (int i = 0; i < pal.length(); i++) {
                if (lista[i]=='_'){
                    contF++;
                }
            }
            System.out.println(lista);
            if (contF==0){
                fim=true;
                System.out.println("Você ganhou!");
            }

            contF=0;
        }*/ // Forca
    public static void Morse(){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite 1 para traduzir de português para Morse e 2 para traduzir de Morse para português: ");
        int tradutor = in.nextInt();
        in.nextLine();
        String palavraMorse = "";
        String palavraPort = "";
        if (tradutor == 1) {
            System.out.print("Digite a palavra: ");
            palavraPort = in.nextLine();
            palavraPort = palavraPort.toLowerCase();
            palavraMorse = palavraPort.replace("a", ".-|");
            palavraMorse = palavraMorse.replace("b", "-...|");
            palavraMorse = palavraMorse.replace("c", "-.-.|");
            palavraMorse = palavraMorse.replace("d", "-..|");
            palavraMorse = palavraMorse.replace("e", ".|");
            palavraMorse = palavraMorse.replace("f", "..-.|");
            palavraMorse = palavraMorse.replace("g", "--.|");
            palavraMorse = palavraMorse.replace("h", "....|");
            palavraMorse = palavraMorse.replace("i", "..|");
            palavraMorse = palavraMorse.replace("j", ".---|");
            palavraMorse = palavraMorse.replace("k", "-.-|");
            palavraMorse = palavraMorse.replace("l", ".-..|");
            palavraMorse = palavraMorse.replace("m", "--|");
            palavraMorse = palavraMorse.replace("n", "-.|");
            palavraMorse = palavraMorse.replace("o", "---|");
            palavraMorse = palavraMorse.replace("p", ".--.|");
            palavraMorse = palavraMorse.replace("q", "--.-|");
            palavraMorse = palavraMorse.replace("r", ".-.|");
            palavraMorse = palavraMorse.replace("s", "...|");
            palavraMorse = palavraMorse.replace("t", "-|");
            palavraMorse = palavraMorse.replace("u", "..-|");
            palavraMorse = palavraMorse.replace("v", "...-|");
            palavraMorse = palavraMorse.replace("w", ".--|");
            palavraMorse = palavraMorse.replace("x", "-..-|");
            palavraMorse = palavraMorse.replace("y", "-.--|");
            palavraMorse = palavraMorse.replace("z", "--..|");
            palavraMorse = palavraMorse.replace("1", ".----|");
            palavraMorse = palavraMorse.replace("2", "..---|");
            palavraMorse = palavraMorse.replace("3", "...--|");
            palavraMorse = palavraMorse.replace("4", "....-|");
            palavraMorse = palavraMorse.replace("5", ".....|");
            palavraMorse = palavraMorse.replace("6", "-....|");
            palavraMorse = palavraMorse.replace("7", "--...|");
            palavraMorse = palavraMorse.replace("8", "---..|");
            palavraMorse = palavraMorse.replace("9", "----.|");
            palavraMorse = palavraMorse.replace("0", "-----|");
            palavraMorse = palavraMorse.replace(" ", "*|");

            System.out.println(palavraMorse);
        } else if (tradutor == 2) {
            System.out.print("Digite a palavra em Morse na seguinte formatação: letra|letra|letra|, e *| para espaços: ");
            palavraMorse= in.nextLine();
            palavraPort= palavraMorse.replace("-.-.--|","!");
            palavraPort = palavraPort.replace(".----|", "1");
            palavraPort = palavraPort.replace("..---|", "2");
            palavraPort = palavraPort.replace("...--|", "3");
            palavraPort = palavraPort.replace("....-|", "4");
            palavraPort = palavraPort.replace(".....|", "5");
            palavraPort = palavraPort.replace("-....|", "6");
            palavraPort = palavraPort.replace("--...|", "7");
            palavraPort = palavraPort.replace("---..|", "8");
            palavraPort = palavraPort.replace("----.|", "9");
            palavraPort = palavraPort.replace("-----|", "0");
            palavraPort = palavraPort.replace("-...|", "b");
            palavraPort = palavraPort.replace("-.-.|", "c");
            palavraPort = palavraPort.replace(".-..|", "l");
            palavraPort = palavraPort.replace("--..|", "z");
            palavraPort = palavraPort.replace("-..|", "d");

            palavraPort = palavraPort.replace("..-.|", "f");
            palavraPort = palavraPort.replace(".--.|", "p");
            palavraPort = palavraPort.replace("--.|", "g");
            palavraPort = palavraPort.replace("....|", "h");
            palavraPort = palavraPort.replace(".---|", "j");
            palavraPort = palavraPort.replace("--.-|", "q");
            palavraPort = palavraPort.replace("-.-|", "k");
            palavraPort = palavraPort.replace("-.--|", "y");
            palavraPort = palavraPort.replace(".--|", "w");
            palavraPort = palavraPort.replace("---|", "o");
            palavraPort = palavraPort.replace("--|", "m");
            palavraPort = palavraPort.replace(".-.|", "r");
            palavraPort = palavraPort.replace("-.|", "n");
            palavraPort = palavraPort.replace("-..-|", "x");
            palavraPort = palavraPort.replace("...-|", "v");
            palavraPort = palavraPort.replace("..-|", "u");
            palavraPort = palavraPort.replace("...|", "s");
            palavraPort = palavraPort.replace(".-|", "a");
            palavraPort = palavraPort.replace("-|", "t");







            palavraPort = palavraPort.replace("*|", " ");
            palavraPort = palavraPort.replace("..|", "i");

            palavraPort = palavraPort.replace(".|", "e");
            System.out.println(palavraPort);
        }

    }
    public static void Lanchonete(){

    }
}







