/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int elementosArribaMedia= 0;
        int elementosAbajoMedia = 0 ;
        double media = 0;
        double mediasuma = 0;
        for (int i = 0; i < arreglo.length; i++){
            media = media + arreglo[i];
            mediasuma = mediasuma + 1;
        }
        media = media / mediasuma;
        for (int x = 0; x < arreglo.length; x++ )
            if (arreglo [x] < media) {
                elementosArribaMedia =  elementosArribaMedia +  1;
            }else{
                 elementosAbajoMedia =  elementosAbajoMedia + 1;
            }
        
        System.out.printf("La media es: %f\nHay %d elementos arriba de la media"
                + "\nHay %d elementos debajo de la media\n",  media,
                elementosArribaMedia, elementosAbajoMedia);
    }

}
