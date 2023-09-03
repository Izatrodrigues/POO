package ProjetoEstagiario;

import java.time.LocalDate;

    public class BasePessoa extends BaseIdentificador {
    
        protected String nome;
        protected String telefone;
        protected LocalDate dataNascimento;
        protected String documento;

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getTelefone() {
            return telefone;
        }
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
        public LocalDate getDataNascimento() {
            return dataNascimento;
        }
        public void setDataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
        }
        public String getDocumento() {
            return documento;
        }
        public void setDocumento(String documento) {
            this.documento = documento;
        }
        public BasePessoa(int codigo, String nome, String telefone, LocalDate dataNascimento, String documento) {
            super(codigo);
            this.nome = nome;
            this.telefone = telefone;
            this.dataNascimento = dataNascimento;
            this.documento = documento;
        } 
}
