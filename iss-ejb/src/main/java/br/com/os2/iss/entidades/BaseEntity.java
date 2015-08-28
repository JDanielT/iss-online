package br.com.os2.iss.entidades;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author daniel
 */
public abstract class BaseEntity implements Serializable {
    
    public abstract Integer getId();
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.getId());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BaseEntity other = (BaseEntity) obj;
        return Objects.equals(this.getId(), other.getId());
    }
    
}
