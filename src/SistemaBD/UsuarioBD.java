package SistemaBD;

/**
 *
 * @author roban
 */
public class UsuarioBD {
    private int id_persona;
    private String usr_name;
    private String nombre;
    private String contra;
    private int num_tel;
    private String Direccion;
    private String rol;

    public UsuarioBD(int id_persona, String usr_name, String nombre, String contra, int num_tel, String Direccion, String rol) {
        this.id_persona = id_persona;
        this.usr_name = usr_name;
        this.nombre = nombre;
        this.contra = contra;
        this.num_tel = num_tel;
        this.Direccion = Direccion;
        this.rol = rol;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getUsr_name() {
        return usr_name;
    }

    public void setUsr_name(String usr_name) {
        this.usr_name = usr_name;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(int num_tel) {
        this.num_tel = num_tel;
    }
    
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
}
