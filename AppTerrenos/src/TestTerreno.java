import java.util.Scanner;
public class TestTerreno {
    public static void main(String[] args) {
        double ancho, alto, valorMetroCuadrado, descuento = 0;
        Scanner teclado = new Scanner(System.in);
        String op = "S", terreno="Plano";
        while (op.equals("S")){
            System.out.println("Deseas calcular terrenos?");
            op = teclado.next();
            if (op.equals("N")) break;
            System.out.println("Dame el ancho: ");
            ancho=teclado.nextDouble();
            System.out.println("Dame el alto: ");
            alto=teclado.nextDouble();
            System.out.println("Dame el Valor por metro cuadrado: ");
            valorMetroCuadrado=teclado.nextDouble();
            System.out.println("Tipo de Terreno: ");
            terreno=teclado.next();
            Terreno tx = new Terreno(ancho, alto, valorMetroCuadrado,terreno, descuento);
            tx.calcularArea();
            tx.calcularValorTerreno();
            tx.elTerrenoPlano();
            System.out.println("LOS DATOS SON: "+tx);
        }
        /*Terreno t1 = new Terreno();
        Terreno t2 = new Terreno(9, 20, 3);
        t2.calcularArea();
        t2.calcularValorTerreno();
        System.out.println(t1);
        System.out.println(t2);*/
    }
}

class Terreno{
    public double ancho;
    public double largo;
    public double valorMetroCuadrado;
    public double area;
    public double costoDelTerreno;
    public String terreno;
    public double descuento;

    public Terreno() {}

    public Terreno(double ancho, double largo, double valorMetroCuadrado, String terreno, double descuento) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetroCuadrado = valorMetroCuadrado;
        this.terreno=terreno;
        this.descuento=descuento;
    }
    
    public void calcularArea(){
        this.area=this.ancho*this.largo;
    }
    
    public void calcularValorTerreno(){
        this.costoDelTerreno=this.area*this.valorMetroCuadrado;
        descuento=costoDelTerreno;
        if (this.area>=300) {
            //this.costoDelTerreno=this.area*this.valorMetroCuadrado*(0.8);
            costoDelTerreno *= 0.8;
            //this.descuento=this.area*this.valorMetroCuadrado*(0.2);
            descuento*=0.2;
        }else if(this.area>=200){
            //this.costoDelTerreno=(this.area*this.valorMetroCuadrado)*(0.9);
            costoDelTerreno *= 0.9;
            //this.descuento=this.area*this.valorMetroCuadrado*(0.1);
            descuento*=0.1;
        }
    }
    
    public void elTerrenoPlano(){
        this.terreno=(this.terreno.equals("Plano"))?"No son gratis":"Gratis";
    }

    @Override
    public String toString() {
        return "Terreno{" + "ancho=" + ancho + ", largo=" + largo + ", valorMetroCuadrado=" + valorMetroCuadrado + ", area=" + area + ", costoDelTerreno=" + costoDelTerreno + ", Escritura=" + terreno + ", descuento=" + descuento + '}';
    }
    
}