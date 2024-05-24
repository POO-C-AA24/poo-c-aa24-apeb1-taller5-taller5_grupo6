

import java.util.Random;
import java.util.Scanner;


public class Ejecutor {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese sus datos: nombre, edad");
        String nombreEstudiante = teclado.next();
        int edadEstudiante = teclado.nextInt();
        Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante);

        System.out.println("¿Cuántas materias desea ingresar?");
        int numMaterias = teclado.nextInt();

        Materia[] materias = new Materia[numMaterias];

        for (int i = 0; i < numMaterias; i++) {
            System.out.println("Ingrese el nombre de la materia: ");
            String nombreMateria = teclado.next();

            System.out.println("Ingrese la nota de ACD (0 a 3.5): ");
            double nota1 = teclado.nextDouble();
            System.out.println("Ingrese la nota de APE (0 a 3.5): ");
            double nota2 = teclado.nextDouble();
            System.out.println("Ingrese la nota de AA (0 a 3.0): ");
            double nota3 = teclado.nextDouble();

            Materia materia = new Materia(nombreMateria, nota1, nota2, nota3);
            materia.CalcularNota();
            materia.CalcularEstado();

            if ("Reprobado".equals(materia.getEstado())) {
                System.out.println("El estudiante ha reprobado la materia " + nombreMateria + ". ¿Desea rendir examen de recuperación? (1=Sí, 0=No)");
                int opcion = teclado.nextInt();
                if (opcion == 1) {
                    System.out.println("Ingrese la nota de recuperación: ");
                    double recuperacion = teclado.nextDouble();
                    materia.setRecuperacion(recuperacion);
                }
            }
            materias[i] = materia;
        }

        estudiante.setMateria(materias);

        System.out.println(estudiante);
    }
}
       