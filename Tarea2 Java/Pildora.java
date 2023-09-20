public class Pildora extends Zona {
    private int cantidad;

    Pildora(int cantidad){
        super(false);
        this.cantidad = cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void interactuar(Pikinim[] pikinims){
        if(!getCompletada()){
            System.out.println("Lomiar: Parece que a las criaturas les interesa mucho esta rara");
            System.out.println("        pildora, tal vez se la deba dar a alguno de estos...\n");
            System.out.println("(Escoge el tipo de Pikinim al que se la quieres entregar)");
            System.out.println("[1] >> Amarillo\n[2] >> Magenta\n[3] >> Cyan");
            System.out.print("Lomiar: Ya me decidi, se la entregare a "); 
            int opt = Juego.scanner.nextInt();
            switch(opt){
                case 1: pikinims[0].multiplicarse(getCantidad()); break;
                case 2: pikinims[1].multiplicarse(getCantidad()); break;
                case 3: pikinims[2].multiplicarse(getCantidad()); break;
            }
            setCompletada(true);  
        } else {
            super.interactuar(pikinims);
        }
    }
    
    public void tipeZone(){
        System.out.println(">>> Zona Pildora <<<");
        if(!getCompletada()){
            System.out.println("Lomiar: No se donde me encuento, pero me encontre una pildora muy rara...");
            System.out.println("        Parece que estas criaturas les gusta esa cosa, tal vez sea mejor darselas...\n");
            System.out.println("(Hay "+getCantidad()+" Pildoras, podrás multiplicar alguno de tus pikinims!)");
        } else {
            super.tipeZone();
        }
    }

    public String datos(){
        return "Pildora hay "+getCantidad()+" Pildoras";
    }
}
