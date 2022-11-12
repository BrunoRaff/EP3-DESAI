package isil.pe.jpaep3.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_Ciudad")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
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
