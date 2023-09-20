public class Amarillo extends Pikinim{

    Amarillo(){
        setAtaque(1);
        setCapacidad(3);
        setCantidad(10);
    }
    public void disminuir(int cantidad){
        setCantidad(getCantidad() - cantidad);
    }
    public void multiplicarse(int cantidad){
        setCantidad(getCantidad() + (int) Math.ceil(cantidad * 1.5));
    }
}
