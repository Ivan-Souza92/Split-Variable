
public class TrianguloRefactoring {
    private float seno;
    private float cosseno;
    private float tangente;

    public void SenoCossenoETangente(float hipotenusa, float catetoAdjacente, float catetoOposto){
        this.seno = catetoOposto/hipotenusa;
        this.cosseno = catetoAdjacente/hipotenusa;
        this.tangente = catetoOposto/catetoAdjacente;
    }

    public double getSeno() {
        return seno;
    }

    public double getCosseno() {
        return cosseno;
    }

    public double getTangente() {
        return tangente;
    }
}
