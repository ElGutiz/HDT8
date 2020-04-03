/**
 * @author Jose Abraham Gutierrez C., 19111
 * @date 03/04/2020
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    /**
     * Clase Main
     * @param args Clase main
     * @throws IOException excepcion
     */
    public static void main(String[] args) throws IOException {
        int op = 0;
        int op2 = 0;
        Scanner key1 = new Scanner(System.in);
        Scanner key2 = new Scanner(System.in);
        Scanner key3 = new Scanner(System.in);

        VectorHeap<Paciente> vectorheap = new VectorHeap<>();
        CustomHeap<Paciente> heapJCF = new CustomHeap<>();

        System.out.println("Ingrese el numero que quiere usar \n1.HeapVector\n2.Java Collection Framework con Priority Queue\n3.Salir\n");
        op = key2.nextInt();

        while (op != 3) {
            //Implementacion con HeapVector
            if (op == 1) {
                System.out.println("Ingrese el nombre del archivo .txt de los paciente a atender: ");
                String file = key1.nextLine();
                try {
                    //Se lee el archivo de texto
                    BufferedReader archivo = new BufferedReader(new FileReader(file));

                    String line;
                    while ((line = archivo.readLine()) != null) {
                        String[] temp = line.split(", ");
                        String nombre = temp[0];
                        String descrip = temp[1];
                        String code = temp[2];
                        vectorheap.add(new Paciente(nombre, descrip, code));
                    }
                    archivo.close();
                } catch (FileNotFoundException e) {
                    System.out.println("El archivo incorrecto!");
                }
                //Opciones
                System.out.println("Ingrese el numero que quiere usar \n1.HeapVector\n2.Java Collection Framework con Priority Queue\n3.Salir\n");
                op2 = key3.nextInt();
                while (op2 != 3) {
                    if (op2 == 1) {
                        if (!vectorheap.isEmpty()) {
                            System.out.println("El siguiente Paciente con mayor prioridad de ser atendida es:");
                            System.out.println(vectorheap.getFirst().toString());
                            System.out.println("Ingrese el numero que quiere usar \n1.HeapVector\n2.Java Collection Framework con Priority Queue\n3.Salir\n");
                            op2 = key3.nextInt();
                        } else {
                            System.out.println("Ya no hay Pacientes que atender");
                            System.out.println("Ingrese el numero que quiere usar \n1.HeapVector\n2.Java Collection Framework con Priority Queue\n3.Salir\n");
                            op2 = key3.nextInt();
                        }
                    } else if (op2 == 2) {
                        if (!vectorheap.isEmpty()) {
                            System.out.println("Se atendio a:");
                            System.out.println(vectorheap.remove().toString());
                            System.out.println("Ingrese el numero que quiere usar \n1.HeapVector\n2.Java Collection Framework con Priority Queue\n3.Salir\n");
                            op2 = key3.nextInt();
                        } else {
                            System.out.println("Ya no hay Pacientes que atender");
                            System.out.println("Ingrese el numero que quiere usar \n1.HeapVector\n2.Java Collection Framework con Priority Queue\n3.Salir\n");
                            op2 = key3.nextInt();
                        }
                    } else {
                        System.out.println("La opcion no es valida");
                        System.out.println("Ingrese el numero que quiere usar \n1.HeapVector\n2.Java Collection Framework con Priority Queue\n3.Salir\n");
                        op2 = key3.nextInt();
                    }
                }
                System.out.println("\n");
                System.out.println("Si desea utilizar otra implementacion ingrese el numero de la opcion correspondiente\n1.HeapVector\n2.Java Collection Framework con Priority Queue\n3.Salir\n");
                op = key2.nextInt();
                //Implementacion con JCF
            } else if (op == 2) {
                System.out.println("Ingrese el nombre del archivo .txt de los Pacientes a atender (Ej. Pacientes.txt): ");
                String file = key1.nextLine();
                try {
                    //Se lee el archivo de texto
                    BufferedReader archivo = new BufferedReader(new FileReader(file));

                    String line;
                    while ((line = archivo.readLine()) != null) {
                        String[] temp = line.split(", ");
                        String nombre = temp[0];
                        String descrip = temp[1];
                        String code = temp[2];
                        heapJCF.add(new Paciente(nombre, descrip, code));
                    }
                    archivo.close();
                } catch (FileNotFoundException e) {
                    System.out.println("Archivo Incorrecto!!");
                }
                //Opciones 
                System.out.println("Ingrese el numero de la opcion que desea realizar\n1.Revisar cual es el siguiente paciente \n2.Pedir al siguiente paciente \n3.Salir\n");
                op2 = key3.nextInt();
                while (op2 != 3) {
                    if (op2 == 1) {
                        System.out.println("El siguiente paciente con mayor prioridad de ser atendida es:");
                        System.out.println(heapJCF.check());
                        System.out.println("Ingrese el numero de la opcion que desea realizar\n1.Revisar cual es el siguiente paciente\n2.Pedir al siguiente paciente\n3.Salir\n");
                        op2 = key3.nextInt();
                    } else if (op2 == 2) {
                        System.out.println("Se atendio a:");
                        System.out.println(heapJCF.next());
                        System.out.println("Ingrese el numero de la opcion que desea realizar\n1.Revisar cual es el siguiente paciente \n2.Pedir al siguiente paciente \n3.Salir\n");
                        op2 = key3.nextInt();
                    } else {
                        System.out.println("La opcion no es valida");
                        System.out.println("Ingrese el numero de la opcion que desea realizar\n1.Revisar cual es el siguiente paciente \n2.Pedir al siguiente paciente \n3.Salir\n");
                        op2 = key3.nextInt();
                    }
                }
                System.out.println("\n");
                System.out.println("Si desea utilizar otra implementacion ingrese el numero de la opcion correspondiente\n1.HeapVector\n2.Java Collection Framework con Priority Queue\n3.Salir\n");
                op = key2.nextInt();
            } else {
                System.out.println("La opcion no es valida");
                System.out.println("Ingrese el numero de implementacion que desea utilizar \n1.HeapVector\n2.Java Collection Framework con Priority Queue\n3.Salir\n");
                op = key2.nextInt();
            }
        }
    }
}