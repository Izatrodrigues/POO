package ProjetoVeiculos;

public class BaseVeiculo extends BaseIdentificador {
    protected String nome;
    protected String modelo;
    protected String cor;
    protected String tipoVeiculo;
    protected int anoModelo;
    protected int anoFabricacao;
    protected double pesoLiquido;
    protected double pesoTotal;
    protected int assentos;
    protected int rodas;
    protected int eixos;
    protected String fabricante;
    protected double potencia;
    protected String tipoCombustivel;
    protected String nomeProprietario;
    protected int qtdeOcupantes;
    protected String estadoUF;
    protected String cidadeUF;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        if (estadoUF != null && estadoUF.length() >= 2) {
            this.estadoUF = estadoUF.substring(0, 2);
        } else {
            this.estadoUF = estadoUF;
        }
    }    
    public String getCidadeUF() {
        return cidadeUF;
    }
    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }

    public BaseVeiculo(int codigo, String nome, String modelo, String cor, String tipoVeiculo, int anoModelo,
            int anoFabricacao, double pesoLiquido, double pesoTotal, int assentos, int rodas, int eixos,
            String fabricante, double potencia, String tipoCombustivel, String nomeProprietario, int qtdeOcupantes,
            String estadoUF, String cidadeUF) {
        super(codigo);
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.tipoVeiculo = tipoVeiculo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
        this.assentos = assentos;
        this.rodas = rodas;
        this.eixos = eixos;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.nomeProprietario = nomeProprietario;
        this.qtdeOcupantes = qtdeOcupantes;
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
    }
    }
    