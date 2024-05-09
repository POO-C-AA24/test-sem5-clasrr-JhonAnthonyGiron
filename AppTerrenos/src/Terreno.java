public class Terreno{
    public double alto, ancho, vmc, area, costoFinal;
    public Terreno(double alto, double ancho, double vmc) {
        this.alto = alto;
        this.ancho = ancho;
        this.vmc = vmc;
    }
    public void calcularArea(){
        this.area = this.alto*this.ancho;}
    public void calcularCostoFinal(){
        costoFinal = area*vmc;
        if (area > 300)
            costoFinal *= 0.8; //costoFinal =  (area*vmc) - ( area*vmc)*0.2;
        else if (area >= 200)
                costoFinal *= 0.9; //costoFinal =  (area*vmc) - (area*vmc)*0.1;
    }

    @Override
    public String toString() {
        return "Terreno{" + "alto=" + alto + ", ancho=" + ancho + ", vmc=" + vmc + ", area=" + area + ", costoFinal=" + costoFinal + '}';
    }
    
}