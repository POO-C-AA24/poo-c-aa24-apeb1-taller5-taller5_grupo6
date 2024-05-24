class Estudiante {
    private String nombreEst;
    private int edadEst;
    private Materia[] materia;

    public Estudiante(String nombreEst, int edadEst) {
        this.nombreEst = nombreEst;
        this.edadEst = edadEst;
    }

    public Materia[] getMateria() {
        return materia;
    }

    public void setMateria(Materia[] materia) {
        this.materia = materia;
    }
    

    @Override
    public String toString() {
     
        StringBuilder materiasStr = new StringBuilder();
        for (Materia mat : materia) {
            materiasStr.append(mat.toString()).append("\n");
        }
        return "Estudiante{" +
                "nombreEst='" + nombreEst + '\'' +
                ", edadEst=" + edadEst +
                ", materias=\n" + materiasStr +
                '}';
    }
}

