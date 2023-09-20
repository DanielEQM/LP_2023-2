import java.util.Random;
import java.util.Scanner;

public class Juego{
    static int piezasE = 3;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args){
        int turnos = 1, pos = 5, antTurn = 0;
        Amarillo amarillo = new Amarillo();
        Magenta magenta = new Magenta();
        Cyan cyan = new Cyan();
        Pieza pieza0 = new Pieza(50);
        Enemigo enemigo1 = new Enemigo(130, 20, 25);
        Enemigo enemigo2 = new Enemigo(50, 20, 15);
        Enemigo enemigo6 = new Enemigo(45,8, 10);
        Enemigo enemigo9 = new Enemigo(75, 15, 20);
        Pildora pildora3 = new Pildora(25);
        Pildora pildora8 = new Pildora(15);
        Muralla muralla4 = new Muralla(50);
        Muralla muralla10 = new Muralla(150);
        Pieza pieza5 = new Pieza(100);
        Pieza pieza7 = new Pieza(35);
        Zona[] zonas = {pieza0, enemigo1, enemigo2, pildora3, muralla4, pieza5, enemigo6, pieza7, pildora8,enemigo9, muralla10};
        Pikinim[] pikinims = {amarillo, magenta, cyan};
        System.out.println("Acabas de llegar a un planeta extraño...\nUnas extrañas criaturas de este planeta parece que te van a ayudar...");
        //System.out.println("");
        while(piezasE != 0 || turnos == 30){
            System.out.println("\n¡Turno "+turnos+"!\n");
            System.out.println("Tienes los siguientes Pikinims:\n----------\nAmarillos >> "+pikinims[0].getCantidad()+"\n Magenta  >> "+pikinims[1].getCantidad()+"\n   Cyan   >> "+pikinims[2].getCantidad()+"\n----------\n");        
            zonas[pos%11].tipeZone();
            System.out.println("Lomiar: Me pregunto que es lo mejor que puedo hacer...");
            if(pos - 1 == -1){
                pos = 11;
                antTurn = 0;
            }    
            System.out.println("[1] Ir a la derecha (Zona "+zonas[(pos-1)%11].datos()+")");
            System.out.println("[2] Ir a la izquierda (Zona "+zonas[(pos+1)%11].datos()+")");
            System.out.println("[3] Quedarse en esta zona (Zona "+zonas[pos%11].datos()+")");
            System.out.print("Cual es tu elección: "); 
            int opt = scanner.nextInt();
            System.out.println();
            if(opt == 1){
                zonas[(pos-1)%11].interactuar(pikinims);
                antTurn = pos % 11;
                pos--;
                pos = pos % 11;
            } else if(opt == 2){
                zonas[(pos+1)%11].interactuar(pikinims);
                antTurn = pos % 11;
                pos++;
                pos = pos % 11;
            } else if(opt == 3){
                zonas[pos%11].interactuar(pikinims);
            }
            System.out.println(antTurn+" "+pos); 
            turnos++;
        }
        scanner.close();
    }
}