package ProjetoVeiculos;

public class BaseCategoriaBCDE extends BaseVeiculoTerrestre{
    protected int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public BaseCategoriaBCDE(int codigo, String nome, String modelo, String cor, String tipoVeiculo, int anoModelo,
            int anoFabricacao, double pesoLiquido, double pesoTotal, int assentos, int rodas, int eixos,
            String fabricante, double potencia, String tipoCombustivel, String nomeProprietario, int qtdeOcupantes,
            String estadoUF, String cidadeUF, String chassi, String placa, String codigoRenavam, String crv,
            int portas) {
        super(codigo, nome, modelo, cor, tipoVeiculo, anoModelo, anoFabricacao, pesoLiquido, pesoTotal, assentos, rodas,
                eixos, fabricante, potencia, tipoCombustivel, nomeProprietario, qtdeOcupantes, estadoUF, cidadeUF,
                chassi, placa, codigoRenavam, crv);
        this.portas = portas;
    }
}
