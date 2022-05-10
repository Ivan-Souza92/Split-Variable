

public class TrianguloR {

    private float temp;

    public void SenoCossenoETangente(float hipotenusa, float catetoAdjacente,float catetoOposto){

        this.temp = catetoOposto/hipotenusa;
        System.out.println(this.temp);
        this.temp = catetoAdjacente/hipotenusa;
        System.out.println(this.temp);
        this.temp = catetoOposto/catetoAdjacente;
        System.out.println(this.temp);
    }
}
