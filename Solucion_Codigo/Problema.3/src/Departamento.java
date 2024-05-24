public class Departamento {
    public String nombre;
    public int numeroEmpleados;
    public double produccionAnual;
    public char categoria;

    public Departamento(String nombre, int numeroEmpleados, double produccionAnual) {
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.produccionAnual = produccionAnual;
        calcularCategoria();
    }

    private void calcularCategoria() {
        if (numeroEmpleados > 20 && produccionAnual > 1000000) {
            categoria = 'A';
        } else if (numeroEmpleados >= 20 && produccionAnual >= 1000000) {
            categoria = 'B';
        } else if (numeroEmpleados >= 10 && produccionAnual >= 500000) {
            categoria = 'C';
        } else {
            categoria = 'D'; 
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public double getProduccionAnual() {
        return produccionAnual;
    }

    public char getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", numeroEmpleados=" + numeroEmpleados +
                ", produccionAnual=" + produccionAnual +
                ", categoria=" + categoria +
                '}';
    }
}

