package Motorista;

public class MotoristaIniciante extends Motorista {

    public MotoristaIniciante(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamento = getValorBrutoArrecadado() * 0.75;

        if (getQuantidadeCorridas() > 5) {
            pagamento -= 50.00;
        }

        return pagamento;
    }
}
