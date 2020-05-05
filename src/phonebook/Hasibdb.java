/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package phonebook;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Md. Hasibur Rashid
 */
@Entity
@Table(name = "HASIBDB", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Hasibdb.findAll", query = "SELECT h FROM Hasibdb h"),
    @NamedQuery(name = "Hasibdb.findById", query = "SELECT h FROM Hasibdb h WHERE h.id = :id"),
    @NamedQuery(name = "Hasibdb.findByName", query = "SELECT h FROM Hasibdb h WHERE h.name = :name"),
    @NamedQuery(name = "Hasibdb.findByMobile", query = "SELECT h FROM Hasibdb h WHERE h.mobile = :mobile"),
    @NamedQuery(name = "Hasibdb.findByEmail", query = "SELECT h FROM Hasibdb h WHERE h.email = :email"),
    @NamedQuery(name = "Hasibdb.findByFacebookid", query = "SELECT h FROM Hasibdb h WHERE h.facebookid = :facebookid"),
    @NamedQuery(name = "Hasibdb.findByAddress", query = "SELECT h FROM Hasibdb h WHERE h.address = :address")})
public class Hasibdb implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "MOBILE")
    private String mobile;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "FACEBOOKID")
    private String facebookid;
    @Column(name = "ADDRESS")
    private String address;

    public Hasibdb() {
    }

    public Hasibdb(Integer id) {
        this.id = id;
    }

    public Hasibdb(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        String oldMobile = this.mobile;
        this.mobile = mobile;
        changeSupport.firePropertyChange("mobile", oldMobile, mobile);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getFacebookid() {
        return facebookid;
    }

    public void setFacebookid(String facebookid) {
        String oldFacebookid = this.facebookid;
        this.facebookid = facebookid;
        changeSupport.firePropertyChange("facebookid", oldFacebookid, facebookid);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hasibdb)) {
            return false;
        }
        Hasibdb other = (Hasibdb) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "phonebook.Hasibdb[id=" + id + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
