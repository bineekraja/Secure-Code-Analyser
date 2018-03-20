/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securecode;

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
 * @author Vikash Anand
 */
@Entity
@Table(name = "cpp", catalog = "securecode", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cpp.findAll", query = "SELECT c FROM Cpp c")
    , @NamedQuery(name = "Cpp.findById", query = "SELECT c FROM Cpp c WHERE c.id = :id")
    , @NamedQuery(name = "Cpp.findByStringId", query = "SELECT c FROM Cpp c WHERE c.stringId = :stringId")
    , @NamedQuery(name = "Cpp.findByString", query = "SELECT c FROM Cpp c WHERE c.string = :string")
    , @NamedQuery(name = "Cpp.findByDescription", query = "SELECT c FROM Cpp c WHERE c.description = :description")})
public class Cpp implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private long id;
    @Id
    @Basic(optional = false)
    @Column(name = "stringId")
    private String stringId;
    @Column(name = "string")
    private String string;
    @Column(name = "description")
    private String description;

    public Cpp() {
    }

    public Cpp(String stringId) {
        this.stringId = stringId;
    }

    public Cpp(String stringId, long id) {
        this.stringId = stringId;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        long oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getStringId() {
        return stringId;
    }

    public void setStringId(String stringId) {
        String oldStringId = this.stringId;
        this.stringId = stringId;
        changeSupport.firePropertyChange("stringId", oldStringId, stringId);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        String oldString = this.string;
        this.string = string;
        changeSupport.firePropertyChange("string", oldString, string);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stringId != null ? stringId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cpp)) {
            return false;
        }
        Cpp other = (Cpp) object;
        if ((this.stringId == null && other.stringId != null) || (this.stringId != null && !this.stringId.equals(other.stringId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "securecode.Cpp[ stringId=" + stringId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
