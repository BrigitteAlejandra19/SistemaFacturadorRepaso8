package com.company;

import java.util.Random;

public class Matricula {

    final static String ALFABETICO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final static String NUMEROS = "1234567890";

    public static String obtenerCaracteres(Integer longitud){
        return obtenerAleatorio(longitud, ALFABETICO);
    }

    public static String obtenerNumeros(Integer longitud){
        return obtenerAleatorio(longitud, NUMEROS);

    }

    public static String obtenerMatriculaVieja(){
       return obtenerCaracteres(3) + obtenerNumeros(3);
    }

    public static String obtenerMatriculaNueva(){
        return obtenerCaracteres(2) + obtenerNumeros(3) + obtenerCaracteres(2) ;
    }

    private static String obtenerAleatorio(Integer longitud, String valores) {
        String numFac = "";

        final int N = valores.length();
        Random rnd = new Random();
        for (int i = 0; i < longitud; i++) {
            numFac += valores.charAt(rnd.nextInt(N));
        }
        return numFac;
    }



    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println(Matricula.obtenerMatriculaVieja());
            System.out.println(Matricula.obtenerMatriculaNueva());
        }
    }


}
