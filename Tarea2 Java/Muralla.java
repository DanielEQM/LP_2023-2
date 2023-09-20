public class Muralla extends Zona {
    private int vida;

    Muralla(int vida){
        super(false);
        this.vida = vida;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public int getVida(){
        return vida;
    }

    public boolean TryRomper(Pikinim[] pikinims){
        int poder = 0;
        for(Pikinim p: pikinims){
            poder += p.getAtaque() * p.getCantidad();
        }
        setVida(getVida() - poder);
        if(getVida() <= 0){
            //System.out.println("");
            setVida(0);
            return true;
        }
        else{
            //System.out.println("");
            return false;
        }
    }

    public void interactuar(Pikinim[] pikinims){
        if(!getCompletada()){
            System.out.println("Lomiar: ");
            setCompletada(TryRomper(pikinims));
        }
        System.out.println("Muralla");
    }
    
    public void tipeZone(){
        System.out.println(">>> Zona Muralla <<<");
        if(!getCompletada()){
            System.out.println("Lomiar: Este muro me esta dando muchos problemas...");
            System.out.println("        Espero que podamos derrotarlo luego");
            System.out.println("        Parece que estas criaturas estan listos para el combate...\n");
            System.out.println("(Este muro tiene mucha resistencia, necesitas la fuerza de todos tus pikinims para");
            System.out.println(" bajarle "+getVida()+" de vida)\n");
        } else {
            super.tipeZone();
        }
    }

    public String datos(){
        return "Muralla, su vida es de: "+getVida();
    }
}
