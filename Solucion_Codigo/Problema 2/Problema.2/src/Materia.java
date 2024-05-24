class Materia {
    private String materia;
    private double notaACD, notaAPE, notaAA;
    private double recuperacion;
    private double notaTotal;
    private String estado;

    public Materia(String materia, double notaACD, double notaAPE, double notaAA) {
        this.materia = materia;
        this.notaACD = notaACD;
        this.notaAPE = notaAPE;
        this.notaAA = notaAA;
        this.recuperacion = 0;
        CalcularNota();
        CalcularEstado();
        
    }

    public void CalcularNota() {
        this.notaTotal = this.notaACD + this.notaAPE + this.notaAA;
    }

    public void CalcularEstado() {
        this.estado = this.notaTotal >= 7 ? "Aprobado" : "Reprobado";
    }

    public void CalcularRecuperacion() {
        this.notaTotal = this.recuperacion + (this.notaTotal * 0.60);
        CalcularEstado();
    }

    public double getRecuperacion() {
        return recuperacion;
    }

    public double getNotaTotal() {
        return notaTotal;
    }

    public void setRecuperacion(double recuperacion) {
        this.recuperacion = recuperacion;
        CalcularRecuperacion();
    }

    public void setNotaTotal(double notaTotal) {
        this.notaTotal = notaTotal;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Materia{" + "materia='" + materia + '\'' + 
                ", notaACD=" + notaACD + 
                ", notaAPE=" + notaAPE + 
                ", notaAA=" + notaAA + 
                ", recuperacion=" + recuperacion + 
                ", notaTotal=" + notaTotal + 
                ", estado='" + estado + '\'' + '}';
    }
}
