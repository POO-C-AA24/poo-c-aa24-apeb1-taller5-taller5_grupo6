
import java.util.Scanner;
public class Ejecutor3 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la empresa:");
        String nombreEmpresa = teclado.nextLine();
        System.out.println("Ingrese el RUC de la empresa:");
        String rucEmpresa = teclado.nextLine();
        System.out.println("Ingrese la dirección de la empresa:");
        String direccionEmpresa = teclado.nextLine();

        
        Empresa empresa = new Empresa(nombreEmpresa, rucEmpresa, direccionEmpresa);

        System.out.println("Ingrese el número de departamentos: ");
        int numDepartamentos = teclado.nextInt();
        teclado.nextLine();

        Departamento[] departamentos = new Departamento[numDepartamentos];

        for (int i = 0; i < numDepartamentos; i++) {
            System.out.println("Ingrese el nombre del departamento, número de empleados y producción anual:");
            String[] datosDepto = teclado.nextLine().split(",");
            String nombre = datosDepto[0].trim();
            int empleados = Integer.parseInt(datosDepto[1].trim());
            double produccion = Double.parseDouble(datosDepto[2].trim());

            departamentos[i] = new Departamento(nombre, empleados, produccion);
        }

        System.out.println(empresa);
        for (Departamento depto : departamentos) {
            System.out.println(depto);
        }
    }
}