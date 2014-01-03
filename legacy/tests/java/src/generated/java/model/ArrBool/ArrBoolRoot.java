package model.ArrBool;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class ArrBoolRoot implements java.io.Serializable, AggregateRoot {
    public ArrBoolRoot() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.arrBool = new boolean[] {};
    }

    private transient final ServiceLocator _serviceLocator;

    private transient final DomainProxy _domainProxy;

    private transient final CrudProxy _crudProxy;

    private String URI;

    @JsonProperty("URI")
    public String getURI() {
        return this.URI;
    }

    @Override
    public int hashCode() {
        return URI != null ? URI.hashCode() : super.hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;
        final ArrBoolRoot other = (ArrBoolRoot) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null ? "ArrBoolRoot(" + URI + ')' : "new ArrBoolRoot("
                + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public ArrBoolRoot(
            final boolean[] arrBool) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setArrBool(arrBool);
    }

    @JsonCreator
    private ArrBoolRoot(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("arrBool") final boolean[] arrBool) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.arrBool = arrBool == null ? new boolean[] {} : arrBool;
    }

    private int ID;

    @JsonProperty("ID")
    public int getID() {
        return ID;
    }

    private ArrBoolRoot setID(final int value) {
        this.ID = value;

        return this;
    }

    public static ArrBoolRoot find(final String uri) throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static ArrBoolRoot find(final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class).read(ArrBoolRoot.class, uri)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<ArrBoolRoot> find(final Iterable<String> uris)
            throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<ArrBoolRoot> find(final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).find(ArrBoolRoot.class, uris)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<ArrBoolRoot> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<ArrBoolRoot> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<ArrBoolRoot> findAll(final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<ArrBoolRoot> findAll(final Integer limit,
            final Integer offset, final ServiceLocator locator)
            throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(ArrBoolRoot.class, limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<ArrBoolRoot> search(
            final Specification<ArrBoolRoot> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<ArrBoolRoot> search(
            final Specification<ArrBoolRoot> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<ArrBoolRoot> search(
            final Specification<ArrBoolRoot> specification,
            final Integer limit, final Integer offset)
            throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<ArrBoolRoot> search(
            final Specification<ArrBoolRoot> specification,
            final Integer limit, final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .search(specification, limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count() throws java.io.IOException {
        return count(Bootstrap.getLocator());
    }

    public static long count(final ServiceLocator locator)
            throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).count(ArrBoolRoot.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(final Specification<ArrBoolRoot> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(final Specification<ArrBoolRoot> specification,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).count(specification).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private void updateWithAnother(final model.ArrBool.ArrBoolRoot result) {
        this.URI = result.URI;

        this.arrBool = result.arrBool;
        this.ID = result.ID;
    }

    public ArrBoolRoot persist() throws java.io.IOException {
        final ArrBoolRoot result;
        try {
            result = this.URI == null ? _crudProxy.create(this).get()
                    : _crudProxy.update(this).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
        this.updateWithAnother(result);
        return this;
    }

    public ArrBoolRoot delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(ArrBoolRoot.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private boolean[] arrBool;

    @JsonProperty("arrBool")
    public boolean[] getArrBool() {
        return arrBool;
    }

    public ArrBoolRoot setArrBool(final boolean[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrBool\" cannot be null!");
        this.arrBool = value;

        return this;
    }
}
