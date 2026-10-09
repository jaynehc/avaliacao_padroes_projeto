
import Motorista.Motorista;
import Motorista.MotoristaIniciante;
import Motorista.MotoristaPremium;
import Motorista.MotoristaParceiroFrotista;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.forLanguageTag("pt-BR"));

        MotoristaIniciante iniciante =
                new MotoristaIniciante("Carlos Silva", "ABC-1234");

        MotoristaPremium premium =
                new MotoristaPremium("Ana Souza", "DEF-5678");

        MotoristaParceiroFrotista frotista =
                new MotoristaParceiroFrotista("Pedro Santos", "GHI-9012");

        // Corridas do motorista iniciante
        iniciante.registrarCorrida(30.00);
        iniciante.registrarCorrida(25.00);
        iniciante.registrarCorrida(40.00);
        iniciante.registrarCorrida(35.00);
        iniciante.registrarCorrida(20.00);
        iniciante.registrarCorrida(45.00);

        // Corridas do motorista premium
        premium.registrarCorrida(50.00);
        premium.registrarCorrida(35.00);
        premium.registrarCorrida(60.00);

        // Corridas do parceiro frotista
        frotista.registrarCorrida(40.00);
        frotista.registrarCorrida(50.00);
        frotista.registrarCorrida(30.00);

        // Polimorfismo: todos são tratados como Motorista
        Motorista[] motoristas = {
                iniciante,
                premium,
                frotista
        };

        System.out.println("==============================================");
        System.out.println("       RELATORIO DO SISTEMA DE CORRIDAS");
        System.out.println("==============================================");

        for (Motorista motorista : motoristas) {

            System.out.println("\nMotorista: " + motorista.getNome());
            System.out.println("Placa: " + motorista.getPlacaVeiculo());

            System.out.printf(
                    "Quantidade de corridas: %d%n",
                    motorista.getQuantidadeCorridas()
            );

            System.out.printf(
                    "Valor bruto arrecadado: R$ %.2f%n",
                    motorista.getValorBrutoArrecadado()
            );

            System.out.printf(
                    "Pagamento liquido: R$ %.2f%n",
                    motorista.calcularPagamentoLiquido()
            );

            System.out.println("----------------------------------------------");
        }
    }
}
