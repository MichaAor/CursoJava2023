package EjercitacionClase.Encapsulamiento;

public class Usuario {
    private String nombreUsuario;
    private String password;
    private String direccion;
    private String telefono;

    public Usuario(String nombreUsuario,
                   String passworUsuario,
                   String direccion,
                   String telefono){
        this.nombreUsuario = nombreUsuario;
        this.password = algoritmoencriptadorPassword(passworUsuario);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void blanquearPassword (){
        this.password = "";
    }
    public void encriptarPassword(String password){
        this.password = algoritmoencriptadorPassword(password);
    }

    public String desencriptarPassword(){
        return (algoritmodesencriptadorPassword(this.password));
    }

    private String algoritmoencriptadorPassword(String password){
        return("claveencriptada");
    }

    private String algoritmodesencriptadorPassword(String password){
        return("clavedesencriptada");
    }
}
