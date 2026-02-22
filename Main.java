/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.uv.fiee.iinf.paradigmas.code;

/**
 *
 * @author itzia
 */
public class Main {

    public static void main(String[] args) {

        Integer[] intVector = {101, 99, 12, 19, 21, 111, 345, 25, 77, 81};
        Integer[] resultInt = Utils.ordena(intVector);
        Utils.imprimir(resultInt);

        Double[] floatVector = {19.1, 456.6, 23.45, 12.34, 11.11, 354.55, 78.45, 28.33, 45.99, 108.88};
        Double[] resultFloat = Utils.ordena(floatVector);
        Utils.imprimir(resultFloat);

        //Esto debe fallar
        // String[] strVector = {"zz", "aa", "cc", "hh", "bb", "ee", "ll"};
        // String[] resultStr = Utils.ordena(strVector);
    }
}
