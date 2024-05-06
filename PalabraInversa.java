public class PalabraInversa {

    private String Palabra;
    int a;
    public String mostrarPalabra(){
        return Palabra;

    }
    public int mostrarNumero(){
        return a;

    }
    public void mostrarPalabra(String Palabra){
        this.Palabra=Palabra;
    }
    public void mostrarNumero(int a){
        this.a=a;
    }
    public String getPalabra() {
        return Palabra;
    }
    public void setPalabra(String palabra) {
        Palabra = palabra;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    @Override
    public String toString() {
        return "PalabraInversa [Palabra=" + Palabra + "]";
    }

}