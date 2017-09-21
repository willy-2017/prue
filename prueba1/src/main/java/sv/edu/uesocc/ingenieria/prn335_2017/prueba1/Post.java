/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.prueba1;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "post")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Post.findAll", query = "SELECT p FROM Post p")
    , @NamedQuery(name = "Post.findByIdPost", query = "SELECT p FROM Post p WHERE p.idPost = :idPost")
    , @NamedQuery(name = "Post.findByFecha", query = "SELECT p FROM Post p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "Post.findByAprobacionComentarios", query = "SELECT p FROM Post p WHERE p.aprobacionComentarios = :aprobacionComentarios")
    , @NamedQuery(name = "Post.findByTitulo", query = "SELECT p FROM Post p WHERE p.titulo = :titulo")
    , @NamedQuery(name = "Post.findByDescripcion", query = "SELECT p FROM Post p WHERE p.descripcion = :descripcion")})
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_post")
    private Integer idPost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "aprobacion_comentarios")
    private Boolean aprobacionComentarios;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "titulo")
    private String titulo;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @ManyToMany(mappedBy = "postCollection")
    private Collection<Meta> metaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private Collection<PostPaso> postPasoCollection;
    @OneToMany(mappedBy = "idPost")
    private Collection<Cometario> cometarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private Collection<PostSeccion> postSeccionCollection;
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne
    private Categoria idCategoria;
    @JoinColumn(name = "id_tipo_post", referencedColumnName = "id_tipo_post")
    @ManyToOne
    private TipoPost idTipoPost;

    public Post() {
    }

    public Post(Integer idPost) {
        this.idPost = idPost;
    }

    public Post(Integer idPost, Date fecha, String titulo) {
        this.idPost = idPost;
        this.fecha = fecha;
        this.titulo = titulo;
    }

    public Integer getIdPost() {
        return idPost;
    }

    public void setIdPost(Integer idPost) {
        this.idPost = idPost;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getAprobacionComentarios() {
        return aprobacionComentarios;
    }

    public void setAprobacionComentarios(Boolean aprobacionComentarios) {
        this.aprobacionComentarios = aprobacionComentarios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Meta> getMetaCollection() {
        return metaCollection;
    }

    public void setMetaCollection(Collection<Meta> metaCollection) {
        this.metaCollection = metaCollection;
    }

    @XmlTransient
    public Collection<PostPaso> getPostPasoCollection() {
        return postPasoCollection;
    }

    public void setPostPasoCollection(Collection<PostPaso> postPasoCollection) {
        this.postPasoCollection = postPasoCollection;
    }

    @XmlTransient
    public Collection<Cometario> getCometarioCollection() {
        return cometarioCollection;
    }

    public void setCometarioCollection(Collection<Cometario> cometarioCollection) {
        this.cometarioCollection = cometarioCollection;
    }

    @XmlTransient
    public Collection<PostSeccion> getPostSeccionCollection() {
        return postSeccionCollection;
    }

    public void setPostSeccionCollection(Collection<PostSeccion> postSeccionCollection) {
        this.postSeccionCollection = postSeccionCollection;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public TipoPost getIdTipoPost() {
        return idTipoPost;
    }

    public void setIdTipoPost(TipoPost idTipoPost) {
        this.idTipoPost = idTipoPost;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPost != null ? idPost.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Post)) {
            return false;
        }
        Post other = (Post) object;
        if ((this.idPost == null && other.idPost != null) || (this.idPost != null && !this.idPost.equals(other.idPost))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.uesocc.ingenieria.prn335_2017.prueba1.Post[ idPost=" + idPost + " ]";
    }
    
}
