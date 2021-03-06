public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;
    

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if (nombre.length() < 3){
            System.out.println("Error el nombre posee menos de 3 car�cteres");
        }
        if (numeroMatricula.length() < 4){
            System.out.println("Error la matricula posee menos de 4 car�cteres");
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }
    
    public String devuelveDetalles() {
        return (nombre + " (" + numeroMatricula + ") - " + edad + " a�os");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        int substringNombreMax = 3;
        int substringMatriculaMax = 4;
        if (nombre.length() < 3) {
            substringNombreMax = nombre.length();
        }
        if (numeroMatricula.length() < 4) {
            substringMatriculaMax = numeroMatricula.length();
        }
        return nombre.substring(0, substringNombreMax) + numeroMatricula.substring(0, substringMatriculaMax);
    }
}
