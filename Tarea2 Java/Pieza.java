public class Pieza extends Zona implements Ilevantable {
    private int peso;

    Pieza(int peso){
        super(false);
        this.peso = peso;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }

    public int getPeso(){
        return peso;
    }

    public void Levantar(Pikinim[] pikinims){
        int levantar = 0;
        for(Pikinim p: pikinims){
            levantar += p.getCantidad() * p.getCapacidad();
        }
        System.out.println("Lomiar: Todos estan intentando levantar la pieza, espero lo logremos\n");
        if(levantar >= getPeso()){
            System.out.println("Lomiar: ¡Con la ayuda de todos lo hemos podido levantar!");
            System.out.println("        Que alivio que no hubo problemas");
            Juego.piezasE--;
            setCompletada(true);
        } else {
            System.out.println("Lomiar: Me lo imaginaba, no somos suficientes para levantarla");
            System.out.println("        Lo mejor es buscar otro camino para llevarnosla luego");
        }
    }

    public void interactuar(Pikinim[] pikinims){
        if(!getCompletada()){
            System.out.println("Lomiar: He encontrado una pieza afortunadamente, me pregunto");
            System.out.println("        si seremos suficientes para llevarla...");
            Levantar(pikinims);
        }else{
            super.interactuar(pikinims);
        }
    }
    
    public void tipeZone(){
        System.out.println(">>> Zona Pieza <<<");
        if(!getCompletada()){
            System.out.println("Lomiar: Despues de caminar un rato, me encontre una pieza de mi nave!");
            System.out.println("        Parece que estas criaturas van a tener que ayudarme un poco...\n");
            System.out.println("(Esta Pieza pesa "+getPeso()+", se necesitaran muchos pikinims para levantarla");
            System.out.println("afortunadamente Lumiar tiene a sus pikinims para ayudarlo)\n");
        } else {
            super.tipeZone();
        }
    }

    public String datos(){
        return "Pieza, peso: "+getPeso();
    }
}
