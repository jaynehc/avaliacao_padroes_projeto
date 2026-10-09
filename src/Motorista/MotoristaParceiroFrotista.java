package Motorista;

public class MotoristaParceiroFrotista extends Motorista {

    public MotoristaParceiroFrotista(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamento =
                getValorBrutoArrecadado() * 0.80 - 80.00;

        return Math.max(0.0, pagamento);
    }
}
