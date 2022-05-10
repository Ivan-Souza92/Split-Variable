
public class TrianguloRefactoring {
    private float seno;
    private float cosseno;
    private float tangente;

    public void SenoCossenoETangente(float hipotenusa, float catetoAdjacente, float catetoOposto){
        this.seno = catetoOposto/hipotenusa;
        this.cosseno = catetoAdjacente/hipotenusa;
        this.tangente = catetoOposto/catetoAdjacente;
    }

    public float getSeno() {
        return seno;
    }

    public float getCosseno() {
        return cosseno;
    }

    public float getTangente() {
        return tangente;
    }
}
