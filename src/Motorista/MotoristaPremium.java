package Motorista;

public class MotoristaPremium extends Motorista {

    public MotoristaPremium(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double brutoComBonus =
                getValorBrutoArrecadado()
                        + (getQuantidadeCorridas() * 2.00);

        return brutoComBonus * 0.85;
    }
}
