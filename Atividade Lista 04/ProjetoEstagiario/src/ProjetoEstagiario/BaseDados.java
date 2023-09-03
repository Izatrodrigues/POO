package ProjetoEstagiario;

import java.time.LocalDate;

    public class BaseDados extends BasePessoa {
        
        protected String usuario;
        protected String email;
        protected String senha;
        protected String registro;

        public String getUsuario() {
            return usuario;
        }
        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getSenha() {
            return senha;
        }
        public void setSenha(String senha) {
            this.senha = senha;
        }
        public String getRegistro() {
            return registro;
        }
        public void setRegistro(String registro) {
            this.registro = registro;
        }
        
        public BaseDados(int codigo, String nome, String telefone, LocalDate dataNascimento, String documento,
                String usuario, String email, String senha, String registro) {
            super(codigo, nome, telefone, dataNascimento, documento);
            this.usuario = usuario;
            this.email = email;
            this.senha = senha;
            this.registro = registro;
        }
}
