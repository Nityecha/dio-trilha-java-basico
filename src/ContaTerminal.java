import java.util.Scanner;

public class ContaTerminal {
        private String nomeCliente;
        private int numeroConta;
        private int agenciaConta;
        private double saldo;

       public void imprimirDadosConta(){
           Scanner sc = new Scanner(System.in);
           System.out.println("Por favor, digite o número da Agência !");
           agenciaConta = sc.nextInt();

           System.out.println("Por favor, digite o número da conta! ");
           numeroConta = sc.nextInt();

           System.out.println("Informe o nome do Usuário !");
           nomeCliente = sc.next();

           System.out.println("Informe o seu saldo ! ");
           saldo = sc.nextDouble();

           System.out.println("Olá, " + nomeCliente +
                              " obrigado por criar uma conta em nosso banco, sua agência é: " + agenciaConta +
                             " e conta:" + numeroConta +
                              " e seu saldo " + saldo + " já está disponível para saque");

       }

    }

