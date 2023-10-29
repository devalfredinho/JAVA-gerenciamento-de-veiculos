import java.util.*;
import java.lang.*;
import java.io.*;

class Automovel {
    // Atributos do Automóvel
    private int anoFab;
    private int anoModelo;
    private String montadora;
    private String nome;
    private int km;

    public Automovel() {
        this.anoFab = 0;
        this.anoModelo = 0;
        this.montadora = "";
        this.nome = "";
        this.km = 0;
    }

    public Automovel(int ano) {
        this.anoFab = ano;
        this.anoModelo = 0;
        this.montadora = "";
        this.nome = "";
        this.km = 0;
    }

    // Implementando os Getters e Setters
    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void buzinar() {
        System.out.println("Buzinando um automóvel...");
    }
}

    // Carro e Moto herdam Automóvel
class Carro extends Automovel {
    private int numeroBancos;
    private String modelo;

    public Carro() {
        super();
        this.numeroBancos = 0;
        this.modelo = "";
    }

    // Aqui se encontra o atributo adicional para a Classe Carro
    public Carro(int ano) {
        super(ano);
        this.numeroBancos = 0;
        this.modelo = "";
    }

    public int getNumeroBancos() {
        return numeroBancos;
    }

    public void setNumeroBancos(int numeroBancos) {
        this.numeroBancos = numeroBancos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void buzinar() {
    }
}

class Moto extends Automovel {
    private String tipo;
    private String modelo;

    // Aqui se encontra o atributo adicional para a Classe Moto
    public Moto() {
        super();
        this.tipo = "";
        this.modelo = "";
    }

    public Moto(int ano) {
        super(ano);
        this.tipo = "";
        this.modelo = "";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void buzinar() {
    }
}

//Concluimos que os outros atributos, como "anoModelo", "montadora", "nome" e "km", são herdados da classe pai Automovel.
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(2020);
        carro.setMontadora("Lamborghini"); // Aqui Define a montadora do carro
        carro.setNome("Lamborghini Aventador"); // Aqui Define o nome do carro
        carro.setModelo("Aventador SVJ"); // Aqui Define o modelo do carro
        carro.setNumeroBancos(2); // Aqui define o número de bancos
        carro.setKm(5000); // Aqui define a quilometragem

        Moto moto = new Moto(2022);
        moto.setMontadora("Ducati"); // Aqui Define a montadora da moto
        moto.setNome("Ducati Panigale V4"); // Aqui Define o nome da moto
        moto.setTipo("Esportiva"); // Aqui Define o tipo da moto
        moto.setModelo("Panigale V4 R"); // Aqui define o modelo da moto
        moto.setKm(1000); // Aqui define a quilometragem

        // O polimorfismo se encontra onde existe 2 métodos com 2 nomes
        Automovel veiculo1 = carro;
        Automovel veiculo2 = moto;

        veiculo1.buzinar();
        veiculo2.buzinar();
        
        // printando as informações dos veículos
        System.out.println("Carro:");
        System.out.println("Ano de Fabricação: " + carro.getAnoFab());
        System.out.println("Montadora: " + carro.getMontadora());
        System.out.println("Nome: " + carro.getNome());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Número de Bancos: " + carro.getNumeroBancos());
        System.out.println("Quilometragem: " + carro.getKm() + " km");

        System.out.println("\nMoto:");
        System.out.println("Ano de Fabricação: " + moto.getAnoFab());
        System.out.println("Montadora: " + moto.getMontadora());
        System.out.println("Nome: " + moto.getNome());
        System.out.println("Tipo: " + moto.getTipo());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Quilometragem: " + moto.getKm() + " km");
    }
}