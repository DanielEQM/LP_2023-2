public class Magenta extends Pikinim{
    Magenta(){
        setAtaque(2);
        setCapacidad(1);
        setCantidad(10);
    }
    public void disminuir(int cantidad){
        setCantidad(getCantidad() - cantidad);
    }
    public void multiplicarse(int cantidad){
        setCantidad(getCantidad() + cantidad * getAtaque());
    }
}
