package padrões;

import tasks.calculadoraRemuneracao;

/**Classe é referente aos profissionais que recebem remuneração com comissão sobre vendas feitas pelo funcionário.
*/

 public class ProfissionalComissão extends Profissional implements calculadoraRemuneracao {

    double totalVendas;

    public  ProfissionalComissão(String nome, String dataNascimento, String cpf, int matricula, double totalVendas) {
        super(nome, dataNascimento, cpf, matricula);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public double calculaRemuneracao(double porcentagem) {
        double comissao = porcentagem * totalVendas;
        return comissao + totalVendas;
    }

    @Override
    public String toString() {
        return "ProfissionalComissão{" +
                "nome='" + getNome() + '\'' +
                ", dataNascimento='" + getDataNascimento() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", matricula=" + getMatricula() +
                ", totalVendas=" + totalVendas +
                '}';
    }
}
