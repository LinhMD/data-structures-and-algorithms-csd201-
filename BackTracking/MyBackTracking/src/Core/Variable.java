package Core;

import java.util.Iterator;

public class Variable<E> {
    private final RealDomain<E> domain;
    E instantValue = null;
    Iterator<E> iterator;

    public Variable(RealDomain<E> domain) {
        this.domain = domain;
        this.iterator = domain.iterator();
    }
    
    public Variable(RealDomain<E> domain, E instantValue) {
        this.domain = domain;
        this.instantValue = instantValue;
        this.iterator = domain.iterator();
    }

    public void resetDomain(){
        this.iterator = domain.iterator();
    }
    public RealDomain<E> getDomain() {
        return domain;
    }

    public E getInstantValue() {
        return instantValue;
    }
    public void setInstantValue(E instantValue) {
        this.instantValue = instantValue;
    }
}
