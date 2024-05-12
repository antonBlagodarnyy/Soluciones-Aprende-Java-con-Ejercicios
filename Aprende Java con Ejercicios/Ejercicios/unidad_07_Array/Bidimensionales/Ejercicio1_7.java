package unidad_07_Array.Bidimensionales;
/*
Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura.
 */
public class Ejercicio1_7 {
    public static void main(String[] args) {
        int cols=6,rows=3;
        int num [][] = new int [rows][cols];
        num [0][0]=0;
        num [0][1]=30;
        num [0][2]=2;
        num [0][5]=5;
        num [1][0]=75;
        num [1][4]=0;
        num [2][2]=-2;
        num [2][3]=9;
        num [2][5]=11;


        for (int i = 0; i < rows; i++) {
            System.out.print("Row: "+i+": ");

            for (int j = 0; j < cols; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
