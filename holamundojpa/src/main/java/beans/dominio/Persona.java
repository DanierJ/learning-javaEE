package beans.dominio;

import javax.persistence.*;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private int id;

    @Column(nullable = false, length = 30)
    private String nombre;
    @Column(name = "apellido_paterno", nullable = false, length = 30)
    private String apePaterno;
    @Column(name = "apellido_materno", nullable = false, length = 30)
    private String apeMaterno;
    @Column(nullable = false, length = 60)
    private String email;
    @Column(nullable = false, length = 30)
    private String telefono;

    public Persona() {}

    public Persona(int idPersona) {
        this.id = idPersona;
    }

    public Persona(String nombre, String apePaterno, String apeMaterno, String email, String telefono) {
        this.nombre = nombre;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.email = email;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apePaterno='" + apePaterno + '\'' +
                ", apeMaterno='" + apeMaterno + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
