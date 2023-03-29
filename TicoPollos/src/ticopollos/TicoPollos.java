package ticopollos;
import java.util.Scanner;
public class TicoPollos 
{

    public static void main(String[] args) 
    {
        Scanner Scan = new Scanner(System.in);
        int [][] Patio = new int[8][8];
        int pollos;
        int pollo = 0;
        int columna;
        int renglon;
        String Direccion;
        int pasos;
        int count = 1;
        System.out.println("ingrese la cantidad de pollos:");
        pollos = Scan.nextInt();
        for (int i = 0; i<pollos; i++)
        {
            System.out.println("ingrese la columna del pollo ["+(i+1)+"]:");
            columna = Scan.nextInt();
            System.out.println("ingrese el renglon del pollo ["+(i+1)+"]:");
            renglon = Scan.nextInt();
            Patio[renglon][columna] = 8;
            while(pollo == i )
            {
                System.out.println("a donde se dirige el pollo ["+(i+1)+"]?(a,b,i,d)");
                Direccion = Scan.next().substring(0);
                System.out.println("ingrese la cantidad de pasos que da el pollo ["+(i+1)+"]:");
                pasos = Scan.nextInt();
                pasos = pasos-1;
                while(pasos!=0)
                {
                    if (null != Direccion)
                    switch (Direccion) {
                        case "a" -> {
                            if ((Patio[renglon+count][columna])!=8)
                                Patio[renglon+count][columna] = Patio[renglon+count][columna]+1;
                            count = count+1;
                            pasos = pasos-1;
                        }
                        case "b" -> {
                            System.out.print(Patio[renglon-count][columna]);
                            if ((Patio[renglon-count][columna])!=8)
                                Patio[renglon-count][columna] = Patio[renglon-count][columna]+1;
                            count = count+1;
                            pasos = pasos-1;
                        }
                        case "i" -> {
                            if ((Patio[renglon][columna-count])!=8)
                                Patio[renglon][columna-count] = Patio[renglon][columna-count]+1;
                            count = count+1;
                            pasos = pasos-1;
                        }
                        case "d" -> {
                            if ((Patio[renglon][columna+count])!=8)
                                Patio[renglon][columna+count] = Patio[renglon][columna+count]+1;
                            count = count+1;
                            pasos = pasos-1;
                        }
                        default -> pasos = pasos-1;
                    }
                }
                pollo = pollo+1;
            }
        }
        for (int i = 0; i<= 8; i++)
        {
            for (int j = 0; j<=8;j++)
            {
                System.out.print(Patio[i][j]);
            }
            System.out.print("/n");
        }
    }
    
}
