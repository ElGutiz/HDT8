/**
 * @author Jose Abraham Gutierrez C., 19111
 * @date 03/04/2020
 */
public class Paciente implements Comparable<Paciente> {
    // Atributos utilizados
    private String name;
    private String description;
    private String code;

    /**
     *Constructor
     * @param name nombre del paciente
     * @param description descripcion
     * @param code codigo del paciente
     */
    public Paciente (String name, String description, String code) {
        this.name = name;
        this.description = description;
        this.code = code;
    }

    /**
     * Este metodo edita el toString
     * @return un STring ordenado
     */
    @Override
    public String toString() {

        return this.getNombre() + " |  " + this.getDescription() + " | " + this.getCode();
    }

    /**
     * Compara los codigos de emergencia
     * @param p un paciente
     * @return un int
     */
    @Override
    public int compareTo(Paciente p) {
        return this.getCode().compareTo(p.getCode());
    }

    /**
     * Se hace un get del nombre del paciente
     * @return un String
     */
    public String getNombre() {
        return name;
    }
    /**
     * Se hace un set del nombre
     * @param name un string con el nombre
     */
    public void setNombre(String name) {
        this.name = name;
    }

    /**
     * Se obtiene el codigo
     * @return un string
     */
    public String getCode() {
        return code;
    }


    /***
     * Se le hace un get a la descripcion
     * @return string
     */
    public String getDescription() {
        return description;
    }

    /**
     * Se le hace set a la descripcion
     * @param description un string
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Se le hace un set al codde
     * @param code es un string
     */
    public void setCode(String code) {
        this.code = code;
    }
}