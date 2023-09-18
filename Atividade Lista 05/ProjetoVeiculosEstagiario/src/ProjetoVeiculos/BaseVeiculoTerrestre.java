package ProjetoVeiculos;

public class BaseVeiculoTerrestre extends BaseVeiculo {
    protected String chassi;
    protected String placa;
    protected String codigoRenavam;
    protected String crv;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public String getCrv() {
        return crv;
    }
    public void setCrv(String crv) {
        this.crv = crv;
    }
    
    public BaseVeiculoTerrestre(int codigo, String nome, String modelo, String cor, String tipoVeiculo, int anoModelo,
            int anoFabricacao, double pesoLiquido, double pesoTotal, int assentos, int rodas, int eixos,
            String fabricante, double potencia, String tipoCombustivel, String nomeProprietario, int qtdeOcupantes,
            String estadoUF, String cidadeUF, String chassi, String placa, String codigoRenavam, String crv) {
        super(codigo, nome, modelo, cor, tipoVeiculo, anoModelo, anoFabricacao, pesoLiquido, pesoTotal, assentos, rodas,
                eixos, fabricante, potencia, tipoCombustivel, nomeProprietario, qtdeOcupantes, estadoUF, cidadeUF);
        this.chassi = chassi;
        this.placa = placa;
        this.codigoRenavam = codigoRenavam;
        this.crv = crv;
    }
}
