
abstract class Veiculo {
    public String marca;
    public String modelo;
    private int ano;


    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract String informacoesVeiculo();

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 0) { 
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano deve ser um número positivo.");
        }
    }
}

class Carro extends Veiculo {
    public int numeroPortas; 

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String informacoesVeiculo() {
        return "Carro: Marca = " + marca + ", Modelo = " + modelo +
               ", Ano = " + getAno() + ", Número de Portas = " + numeroPortas;
    }
}

class Moto extends Veiculo {
    private int cilindrada; 


    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        if (cilindrada > 0) { 
            this.cilindrada = cilindrada;
        } else {
            throw new IllegalArgumentException("Cilindrada deve ser um número positivo.");
        }
    }


    @Override
    public String informacoesVeiculo() {
        return "Moto: Marca = " + marca + ", Modelo = " + modelo +
               ", Ano = " + getAno() + ", Cilindrada = " + cilindrada + "cc";
    }
}


public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        System.out.println(carro.informacoesVeiculo());

        Moto moto = new Moto("Honda", "CBR", 2018, 650);
        System.out.println(moto.informacoesVeiculo());
    }
}
