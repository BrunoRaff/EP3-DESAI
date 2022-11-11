package isil.pe.jpaep3.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_Direccion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String direccion1;

    private String direccion2;

    @ManyToOne
    @JoinColumn(name = "id_ciudad")
    private Ciudad ciudad;
    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;

    private int nroDireccion;

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

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getNroDireccion() {
        return nroDireccion;
    }

    public void setNroDireccion(int nroDireccion) {
        this.nroDireccion = nroDireccion;
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
