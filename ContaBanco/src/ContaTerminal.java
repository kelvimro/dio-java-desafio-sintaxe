import java.util.Scanner;
/*
 * This project is dedicated to submitting the Sintax Challenge https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe
 * from the Java course at Digital Innovation One (DIO) - https://web.dio.me/.
 */

public class ContaTerminal {
    static Scanner scanner = new Scanner(System.in);

    // Account class to pratice OOP
    public static class Account {
        private String accountNumber;
        private int agency;
        private String clientName;
        private double balance;

        // Constructor to initialize the account with data values
        public Account(int agency, String accountNumber, String clientName, double balance) {
            this.agency = agency;
            this.accountNumber = accountNumber;
            this.clientName = clientName;
            this.balance = balance;
        }

        // Method to print the account data whet it is created
        public void accountReview() {
            System.out.println("Olá " + clientName
                    + ", obrigado por criar sua conta em nosso banco, sua agencia é "
                    + agency
                    + ", conta " + accountNumber
                    // Using String.format to format the balance to 2 decimal places
                    + " e seu saldo " + String.format("%.2f", balance)
                    + " já esta disponivel para saque.");
        }
    }

    public static void main(String[] args) throws Exception {
        // Variables to store the account data before creating the account
        String accountNumber;
        int agency;
        String clientName;
        double balance;

        // Ussing the scanner to pratice the input of data
        System.out.println("Bem-vindo ao banco simples.");
        System.out.println("Por favor, digite o número da agencia: ");
        agency = scanner.nextInt();
        // Consume the line break left by the scanner.nextInt()
        scanner.nextLine();

        System.out.println("Agora, o número da conta: ");
        accountNumber = scanner.nextLine();

        System.out.println("Informe seu nome completo: ");
        clientName = scanner.nextLine();

        System.out.println("Por fim, seu saldo: ");
        balance = scanner.nextInt();

        // Creating the account with the data provided by the user5
        Account account = new Account(agency, accountNumber, clientName, balance);
        account.accountReview();
    }
}
