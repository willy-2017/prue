/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.prueba1;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "post_seccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PostSeccion.findAll", query = "SELECT p FROM PostSeccion p")
    , @NamedQuery(name = "PostSeccion.findByIdPost", query = "SELECT p FROM PostSeccion p WHERE p.postSeccionPK.idPost = :idPost")
    , @NamedQuery(name = "PostSeccion.findByIdSeccion", query = "SELECT p FROM PostSeccion p WHERE p.postSeccionPK.idSeccion = :idSeccion")
    , @NamedQuery(name = "PostSeccion.findByValor", query = "SELECT p FROM PostSeccion p WHERE p.valor = :valor")})
public class PostSeccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PostSeccionPK postSeccionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "valor")
    private String valor;
    @JoinColumn(name = "id_post", referencedColumnName = "id_post", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Post post;

    public PostSeccion() {
    }

    public PostSeccion(PostSeccionPK postSeccionPK) {
        this.postSeccionPK = postSeccionPK;
    }

    public PostSeccion(PostSeccionPK postSeccionPK, String valor) {
        this.postSeccionPK = postSeccionPK;
        this.valor = valor;
    }

    public PostSeccion(int idPost, int idSeccion) {
        this.postSeccionPK = new PostSeccionPK(idPost, idSeccion);
    }

    public PostSeccionPK getPostSeccionPK() {
        return postSeccionPK;
    }

    public void setPostSeccionPK(PostSeccionPK postSeccionPK) {
        this.postSeccionPK = postSeccionPK;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (postSeccionPK != null ? postSeccionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostSeccion)) {
            return false;
        }
        PostSeccion other = (PostSeccion) object;
        if ((this.postSeccionPK == null && other.postSeccionPK != null) || (this.postSeccionPK != null && !this.postSeccionPK.equals(other.postSeccionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.uesocc.ingenieria.prn335_2017.prueba1.PostSeccion[ postSeccionPK=" + postSeccionPK + " ]";
    }
    
}
