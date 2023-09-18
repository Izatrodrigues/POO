package ProjetoVeiculos;

public class Aviao extends BaseVeiculo{
    private String prefixoAeronautico;
    private String matricula;
    private String rab;
    private int portas;
    private int qtdeMotores;
    
    public String getPrefixoAeronautico() {
        return prefixoAeronautico;
    }
    public void setPrefixoAeronautico(String prefixoAeronautico) {
        this.prefixoAeronautico = prefixoAeronautico;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getRab() {
        return rab;
    }
    public void setRab(String rab) {
        this.rab = rab;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public Aviao(int codigo, String nome, String modelo, String cor, String tipoVeiculo, int anoModelo,
            int anoFabricacao, double pesoLiquido, double pesoTotal, int assentos, int rodas, int eixos,
            String fabricante, double potencia, String tipoCombustivel, String nomeProprietario, int qtdeOcupantes,
            String estadoUF, String cidadeUF, String prefixoAeronautico, String matricula, String rab, int portas,
            int qtdeMotores) {
        super(codigo, nome, modelo, cor, tipoVeiculo, anoModelo, anoFabricacao, pesoLiquido, pesoTotal, assentos, rodas,
                eixos, fabricante, potencia, tipoCombustivel, nomeProprietario, qtdeOcupantes, estadoUF, cidadeUF);
        this.prefixoAeronautico = prefixoAeronautico;
        this.matricula = matricula;
        this.rab = rab;
        this.portas = portas;
        this.qtdeMotores = qtdeMotores;
    }

}
