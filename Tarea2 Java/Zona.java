public class Zona {
    private boolean completada;

    public Zona(boolean completada){
        this.completada = completada;
    }

    public boolean getCompletada(){
        return completada;
    }

    public void setCompletada(boolean completada){
        this.completada = completada;
    }

    public void interactuar(Pikinim[] pikinims){
        System.out.println("No queda nada que hacer acá");
    }

    public void tipeZone(){
        System.out.println("Lomiar: Parece que ya he explorado esta zona...");
        System.out.println("        A este paso me quedaré sin oxigeno... Tengo que apurarme...\n");
    }
    
    public String datos(){
        return "";
    }
}
