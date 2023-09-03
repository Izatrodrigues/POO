package ProjetoEstagiario;

import java.time.LocalDate;

    public class Funcionario extends BaseDados {
        private String cracha;
        private String contaCorrente;

        public String getCracha() {
            return cracha;
        }

        public void setCracha(String cracha) {
            this.cracha = cracha;
        }

        public String getContaCorrente() {
            return contaCorrente;
        }

        public void setContaCorrente(String contaCorrente) {
            this.contaCorrente = contaCorrente;
        }

        private Funcionario(int codigo, String nome, String telefone, LocalDate dataNascimento,
                            String documento, String usuario, String email, String senha, String registro,
                            String cracha, String contaCorrente) {
            super(codigo, nome, telefone, dataNascimento, documento, usuario, email, senha, registro);
            this.cracha = cracha;
            this.contaCorrente = contaCorrente;
        }

        public static Funcionario criarFuncionario(int codigo, String nome, String telefone, LocalDate dataNascimento,
                                                String documento, String usuario, String email, String senha, String registro,
                                                String cracha, String contaCorrente) {
            return new Funcionario(codigo, nome, telefone, dataNascimento, documento, usuario, email, senha, registro, cracha, contaCorrente);
        }
    }