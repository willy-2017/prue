/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.prueba1;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "tipo_seccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoSeccion.findAll", query = "SELECT t FROM TipoSeccion t")
    , @NamedQuery(name = "TipoSeccion.findByIdTipoSeccion", query = "SELECT t FROM TipoSeccion t WHERE t.idTipoSeccion = :idTipoSeccion")
    , @NamedQuery(name = "TipoSeccion.findByNombre", query = "SELECT t FROM TipoSeccion t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TipoSeccion.findByActivo", query = "SELECT t FROM TipoSeccion t WHERE t.activo = :activo")
    , @NamedQuery(name = "TipoSeccion.findByDescripcion", query = "SELECT t FROM TipoSeccion t WHERE t.descripcion = :descripcion")})
public class TipoSeccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_seccion")
    private Integer idTipoSeccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "activo")
    private Boolean activo;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idTipoSeccion")
    private Collection<Seccion> seccionCollection;

    public TipoSeccion() {
    }

    public TipoSeccion(Integer idTipoSeccion) {
        this.idTipoSeccion = idTipoSeccion;
    }

    public TipoSeccion(Integer idTipoSeccion, String nombre) {
        this.idTipoSeccion = idTipoSeccion;
        this.nombre = nombre;
    }

    public Integer getIdTipoSeccion() {
        return idTipoSeccion;
    }

    public void setIdTipoSeccion(Integer idTipoSeccion) {
        this.idTipoSeccion = idTipoSeccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Seccion> getSeccionCollection() {
        return seccionCollection;
    }

    public void setSeccionCollection(Collection<Seccion> seccionCollection) {
        this.seccionCollection = seccionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoSeccion != null ? idTipoSeccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoSeccion)) {
            return false;
        }
        TipoSeccion other = (TipoSeccion) object;
        if ((this.idTipoSeccion == null && other.idTipoSeccion != null) || (this.idTipoSeccion != null && !this.idTipoSeccion.equals(other.idTipoSeccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.uesocc.ingenieria.prn335_2017.prueba1.TipoSeccion[ idTipoSeccion=" + idTipoSeccion + " ]";
    }
    
}
