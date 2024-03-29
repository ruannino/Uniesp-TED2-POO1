package padroes;

import tasks.calculadoraRemuneracao;

/**Classe é referente aos profissionais que recebem remuneração fixas
 */

public class ProfissionalSalario extends Profissional implements calculadoraRemuneracao {

    double salarioFixo;


    public ProfissionalSalario(String nome, String dataNascimento, String cpf, int matricula, double salarioFixo) {
        super(nome, dataNascimento, cpf, matricula);
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo( double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calculaRemuneracao(double porcentagem) {
        double comissao = salarioFixo;
        return salarioFixo;
    }

    @Override
    public String toString() {
        return "ProfissionalSalario{" +
                "nome='" + getNome() + '\'' +
                ", data de nascimento='" + getDataNascimento() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", matricula=" + getMatricula() +
                ", salarioFixo=" + salarioFixo +
                '}';
    }
}
