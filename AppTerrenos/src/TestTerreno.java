public class TestTerreno {
    public static void main(String[] args) {
        Terreno t1 = new Terreno(40, 10, 2);
        Terreno t2 = new Terreno(21, 12, 2);
        Terreno t3 = new Terreno(10, 10, 2);
        t1.calcularArea();
        t1.calcularCostoFinal();
        System.out.println(t1);
        t2.calcularArea();
        t2.calcularCostoFinal();
        System.out.println(t2);
        t3.calcularArea();
        t3.calcularCostoFinal();
        System.out.println(t3);
    }
}
