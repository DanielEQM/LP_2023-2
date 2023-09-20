public class Enemigo extends Zona implements Ilevantable{
    private int vida;
    private int peso;
    private int ataque;

    Enemigo(int vida, int peso, int ataque){
        super(false);
        this.vida = vida;
        this.peso = peso;
        this.ataque = ataque;
    }
    public void setVida(int vida){
        this.vida = vida;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    public void setAtaque(int ataque){
        this.ataque = ataque;
    }

    public int getVida(){
        return vida;
    }

    public int getPeso(){
        return peso;
    }

    public int getAtaque(){
        return ataque;
    }

    public void Levantar(Pikinim[] pikinims){
        int levantar = 0;
        for(Pikinim p: pikinims){
            levantar += p.getCapacidad() * p.getCantidad();
        }
        if(levantar >= getPeso()){
            //System.out.println("Enemigo");
            int opt = Juego.scanner.nextInt();
            switch(opt){
                case 1: pikinims[0].multiplicarse(getPeso()); break;
                case 2: pikinims[1].multiplicarse(getPeso()); break;
                case 3: pikinims[2].multiplicarse(getPeso()); break;
            }
        }
    }

    public boolean Pelear(Pikinim[] pikinims){
        int fuerza = 0;
        for(Pikinim p: pikinims){
            fuerza += p.getAtaque() * p.getCantidad();
        }
        setVida(getVida() - fuerza);
        pikinims[Juego.random.nextInt(3)].disminuir(getAtaque());
        if(getVida() <= 0){
            setVida(0);
            return true;
        }
        return false;
    }

    public void interactuar(Pikinim[] pikinims){
        setCompletada(Pelear(pikinims));
        if(getCompletada() == true){
            Levantar(pikinims);
        }
        System.out.println("Enemigo");
    }
    
    public void tipeZone(){
        System.out.println(">>> Zona Enemigo <<<\n");
        if(!getCompletada()){
            System.out.println("Lomiar: Maldita sea, es un enemigo formidable");
            System.out.println("        Espero resistan estas criaturas...\n");
            System.out.println("(Este Enemigo es bastante resistente, tienes");
            System.out.println(" que usar toda tu fuerza para vencerlo)");
            System.out.println("----->>> Datos Enemigo <<<-----");
            System.out.println("Vida actual  >> "+getVida()+" HP\nAtaque Total >> "+getAtaque()+" DMG\nSu peso es   >> "+getPeso()+" W");
            System.out.println("-------------------------------\n");
        } else {
            super.tipeZone();
        }
    }

    public String datos(){
        return "Enemigo!! Su vida: "+getVida()+"| Su ataque: "+getAtaque()+"| Su peso: "+getPeso();
    }
}
