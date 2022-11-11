package isil.pe.jpaep3.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_Cliente",uniqueConstraints = {
        @UniqueConstraint(columnNames = "email",name="email_unique")
})
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;

    private String apellidos;

    private String email;
    @ManyToOne
    @JoinColumn(name = "id_direccion")
    private Direccion direccion;

    private Date fchaCreacion;
    private String usuCreacion;

    @PostPersist
    public void postPersistFcha(){
        this.fchaCreacion=new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Date getFchaCreacion() {
        return fchaCreacion;
    }

    public void setFchaCreacion(Date fchaCreacion) {
        this.fchaCreacion = fchaCreacion;
    }

    public String getUsuCreacion() {
        return usuCreacion;
    }

    public void setUsuCreacion(String usuCreacion) {
        this.usuCreacion = usuCreacion;
    }
}
