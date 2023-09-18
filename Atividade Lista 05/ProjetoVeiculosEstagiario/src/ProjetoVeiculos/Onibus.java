package ProjetoVeiculos;

public class Onibus extends BaseCategoriaBCDE{
    private int qtdeMotores;

    public int getQtdeMotores() {
        return qtdeMotores;
    }

    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }

    public Onibus(int codigo, String nome, String modelo, String cor, String tipoVeiculo, int anoModelo,
            int anoFabricacao, double pesoLiquido, double pesoTotal, int assentos, int rodas, int eixos,
            String fabricante, double potencia, String tipoCombustivel, String nomeProprietario, int qtdeOcupantes,
            String estadoUF, String cidadeUF, String chassi, String placa, String codigoRenavam, String crv, int portas,
            int qtdeMotores) {
        super(codigo, nome, modelo, cor, tipoVeiculo, anoModelo, anoFabricacao, pesoLiquido, pesoTotal, assentos, rodas,
                eixos, fabricante, potencia, tipoCombustivel, nomeProprietario, qtdeOcupantes, estadoUF, cidadeUF,
                chassi, placa, codigoRenavam, crv, portas);
        this.qtdeMotores = qtdeMotores;
    }

}
