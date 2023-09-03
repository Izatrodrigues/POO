package ProjetoEstagiario;

import java.time.LocalDate;

    public class Passageiro extends BaseDados {
        private String numeroCartao;

        public String getNumeroCartao() {
            return numeroCartao;
        }

        public void setNumeroCartao(String numeroCartao) {
            this.numeroCartao = numeroCartao;
        }
        
        private Passageiro(int codigo, String nome, String telefone, LocalDate dataNascimento,
                        String documento, String usuario, String email, String senha, String registro,
                        String numeroCartao) {
            super(codigo, nome, telefone, dataNascimento, documento, usuario, email, senha, registro);
            this.numeroCartao = numeroCartao;
        }
    
        public static Passageiro criarPassageiro(int codigo, String nome, String telefone, LocalDate dataNascimento,
                                                String documento, String usuario, String email, String senha, String registro,
                                                String numeroCartao) {
            return new Passageiro(codigo, nome, telefone, dataNascimento, documento, usuario, email, senha, registro, numeroCartao);
        }
}