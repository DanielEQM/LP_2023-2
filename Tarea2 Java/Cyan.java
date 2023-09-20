public class Cyan extends Pikinim{

    Cyan(){
        setAtaque(1);
        setCapacidad(1);
        setCantidad(10);
    }
    public void disminuir(int cantidad){
        setCantidad(getCantidad() - cantidad);
    }
    public void multiplicarse(int cantidad){
        setCantidad(getCantidad() + cantidad * 3);
    }
}
