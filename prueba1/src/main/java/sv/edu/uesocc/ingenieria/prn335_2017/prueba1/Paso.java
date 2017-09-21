/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.prueba1;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "paso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paso.findAll", query = "SELECT p FROM Paso p")
    , @NamedQuery(name = "Paso.findByIdPaso", query = "SELECT p FROM Paso p WHERE p.idPaso = :idPaso")
    , @NamedQuery(name = "Paso.findByNombre", query = "SELECT p FROM Paso p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Paso.findByComentarios", query = "SELECT p FROM Paso p WHERE p.comentarios = :comentarios")})
public class Paso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_paso")
    private Integer idPaso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 2147483647)
    @Column(name = "comentarios")
    private String comentarios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paso")
    private Collection<PostPaso> postPasoCollection;
    @JoinColumns({
        @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
        , @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")})
    @ManyToOne
    private RolCategoria rolCategoria;
    @JoinColumn(name = "id_tipo_paso", referencedColumnName = "id_tipo_paso")
    @ManyToOne
    private TipoPaso idTipoPaso;

    public Paso() {
    }

    public Paso(Integer idPaso) {
        this.idPaso = idPaso;
    }

    public Paso(Integer idPaso, String nombre) {
        this.idPaso = idPaso;
        this.nombre = nombre;
    }

    public Integer getIdPaso() {
        return idPaso;
    }

    public void setIdPaso(Integer idPaso) {
        this.idPaso = idPaso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @XmlTransient
    public Collection<PostPaso> getPostPasoCollection() {
        return postPasoCollection;
    }

    public void setPostPasoCollection(Collection<PostPaso> postPasoCollection) {
        this.postPasoCollection = postPasoCollection;
    }

    public RolCategoria getRolCategoria() {
        return rolCategoria;
    }

    public void setRolCategoria(RolCategoria rolCategoria) {
        this.rolCategoria = rolCategoria;
    }

    public TipoPaso getIdTipoPaso() {
        return idTipoPaso;
    }

    public void setIdTipoPaso(TipoPaso idTipoPaso) {
        this.idTipoPaso = idTipoPaso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaso != null ? idPaso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paso)) {
            return false;
        }
        Paso other = (Paso) object;
        if ((this.idPaso == null && other.idPaso != null) || (this.idPaso != null && !this.idPaso.equals(other.idPaso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.uesocc.ingenieria.prn335_2017.prueba1.Paso[ idPaso=" + idPaso + " ]";
    }
    
}
