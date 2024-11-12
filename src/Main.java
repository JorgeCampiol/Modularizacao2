import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char opcao = lerOpcaoDeConversao(scanner);

        if (opcao == 'C') {
            double celsius = lerTemperatura(scanner, "Celsius");
            double fahrenheit = converterCelsiusParaFahrenheit(celsius);
            mostrarResultado(fahrenheit, "Fahrenheit");
        } else if (opcao == 'F') {
            double fahrenheit = lerTemperatura(scanner, "Fahrenheit");
            double celsius = converterFahrenheitParaCelsius(fahrenheit);
            mostrarResultado(celsius, "Celsius");
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    private static char lerOpcaoDeConversao(Scanner scanner) {
        System.out.println("Digite 'C' para converter de Celsius para Fahrenheit ou 'F' para converter de Fahrenheit para Celsius:");
        return scanner.next().toUpperCase().charAt(0);
    }

    private static double lerTemperatura(Scanner scanner, String escala) {
        System.out.print("Digite a temperatura em " + escala + ": ");
        return scanner.nextDouble();
    }

    private static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double converterFahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static void mostrarResultado(double temperatura, String escala) {
        System.out.println("A temperatura em " + escala + " é: " + temperatura);
    }
}
