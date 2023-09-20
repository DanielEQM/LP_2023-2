public abstract class Pikinim {
    private int ataque;
    private int capacidad;
    private int cantidad;

    public void setAtaque(int ataque){
        this.ataque = ataque;
    }
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public int getAtaque(){
        return ataque;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public int getCantidad(){
        return cantidad;
    }
    public abstract void multiplicarse(int cantidad);
    public abstract void disminuir(int cantidad);
}