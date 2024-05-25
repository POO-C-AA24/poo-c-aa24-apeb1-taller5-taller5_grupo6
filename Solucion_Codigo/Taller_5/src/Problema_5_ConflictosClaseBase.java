import java.util.Scanner;
import java.util.ArrayList;
public class Problema_5_ConflictosClaseBase {
    String nombre, fechaInicio, estadoAct;
    String nombreEvento, ubicacionEven, DescripcionEven, tipoEven;
    int nPaises,d,m,a,dc,mc,ac;
    Scanner entrada;
    ArrayList<String> paisesConflicto;
    String[] paises, tipoEvento, primerMundo, enDesarrollo;
    
    public Problema_5_ConflictosClaseBase(){
        this.paises = new String[]{"Ecuador", "Peru", "Chile", "Colombia", "Estados Unidos"};
        this.paisesConflicto = new ArrayList<>();
        this.entrada = new Scanner(System.in);
        this.tipoEvento = new String[]{"Batalla", "Trado de paz", "Reunion Diplomatica"};
        this.entrada = new Scanner(System.in);
        this.primerMundo = new String[paises.length];
        this.enDesarrollo = new String[paises.length];
        
    }
    
    public void generarConflictos(){
        ClasificarPaises();
        System.out.println("Ingrese el nombre del Conflicto: ");
        nombre=entrada.next();
        System.out.println("Ingrese los paises involucrados: ");
        nPaises= (int)(Math.random()*4+2);
        generarPaises(nPaises);
        System.out.println("Ingrese la fecha del conflicto: d/m/a");
        dc=entrada.nextInt();
        mc=entrada.nextInt();
        ac=entrada.nextInt();
        generarEvento();
        System.out.println("Ingrese el estado actual: ");
        determinarEstadoAactual();
        PresentarInformacion();
    }
    
    public void ClasificarPaises(){
        int l=0;
        for (int i = 0; i < paises.length; i++) {
            l=(int)(Math.random()*1+0);
            if (l==1){
                primerMundo[i]="Primer Mundo";
            }else{
                enDesarrollo[i]="En desarrollo";
            }
        }
    }
    
    public void generarPaises(int n){
        int[] n1 = new int[5];
        int n2=0;
        int i=0;
        do{
            boolean repetido=false;
            n2= (int)(Math.random()*4+0);
            for (int j = 0; j < n1.length; j++) {
                if (n2==n1[j]) {
                    j=n1.length;
                }else{
                   repetido=true;
                }
            }
            if (repetido) {
                n1[i]=n2;
                paisesConflicto.add(paises[n2]);
                i++;
            }
            
        }while(i<n);
    }
       
    public void generarEvento(){
        System.out.println("Ingrese el tipo de evento: ");
        nPaises= (int)(Math.random()*2+0);
        tipoEven=tipoEvento[nPaises];
        System.out.println("Ingrese el nombre del evento: ");
        nombreEvento=entrada.next();
        System.out.println("Ingrese la ubicacion del evento: ");
        nPaises= (int)(Math.random()*4+0);
        ubicacionEven=paises[nPaises];
        System.out.println("Ingrese la fecha del evento: d/m/a");
        d=entrada.nextInt();
        m=entrada.nextInt();
        a=entrada.nextInt();
        System.out.println("Descripcion del evento: ");
        DescripcionEven=entrada.next();
    }
    
    public void determinarEstadoAactual(){
        double porcentaje = (double) paisesConflicto.size() / paises.length * 100;
        if (tipoEven.equals("Batalla")) {
            for (int i = 0; i < paisesConflicto.size(); i++) {
                for (int j = 0; j < primerMundo.length; j++) {
                    if (paisesConflicto.get(i).equals(primerMundo[j])){
                        estadoAct="Guerra Mundial";
                        return;
                    }
                }
            }
            if (porcentaje>50) {
                estadoAct="Guerra Mundial";
                return;
            }else if ((30<= porcentaje)) {
                estadoAct="Convocar a la ONU a reunion urgente";
                return;
            }
            porcentaje=(int)(Math.random()*100+0);
            if (porcentaje>50) {
                estadoAct="Convocar a la ONU a reunion urgente";
                return;
            }else{
                estadoAct="No determinado";
            }
        }
    }
    
    public void PresentarInformacion(){
        System.out.println("\n\n--------------------Coflicto--------------------");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Paises Involucrados: ");
        LeerPaises();
        System.out.println("Fecha: "+ dc +"/"+ mc +"/"+ ac);
        System.out.println("Estado del Conflicto: "+estadoAct);
        System.out.println("Evento N");
        System.out.println("Nombre: "+nombreEvento);
        System.out.println("Ubicacion del Evento: "+ubicacionEven);
        System.out.println("Fecha Evento: "+ d +"/"+ m +"/"+ a);
        System.out.println("Descripcion Evento: \n"+DescripcionEven);
    }
    
    public void LeerPaises(){
        for (int i = 0; i < paisesConflicto.size(); i++) {
            System.out.println("Pais N"+i+": "+paisesConflicto.get(i));
        }
    }
}
