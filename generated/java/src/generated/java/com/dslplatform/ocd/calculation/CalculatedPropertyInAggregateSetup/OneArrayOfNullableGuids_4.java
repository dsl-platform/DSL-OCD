package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneArrayOfNullableGuids_4 implements java.io.Serializable,
        AggregateRoot {
    public OneArrayOfNullableGuids_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneArrayOfNullableGuids = new java.util.UUID[] {};
        this.calculatedOneArrayOfNullableGuids = new java.util.UUID[] {};
        this.persistedOneArrayOfNullableGuids = new java.util.UUID[] {};
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
        final OneArrayOfNullableGuids_4 other = (OneArrayOfNullableGuids_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneArrayOfNullableGuids_4(" + URI + ')'
                : "new OneArrayOfNullableGuids_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneArrayOfNullableGuids_4(
            final java.util.UUID[] oneArrayOfNullableGuids) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneArrayOfNullableGuids(oneArrayOfNullableGuids);
    }

    @JsonCreator
    private OneArrayOfNullableGuids_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneArrayOfNullableGuids") final java.util.UUID[] oneArrayOfNullableGuids,
            @JsonProperty("calculatedOneArrayOfNullableGuids") final java.util.UUID[] calculatedOneArrayOfNullableGuids,
            @JsonProperty("persistedOneArrayOfNullableGuids") final java.util.UUID[] persistedOneArrayOfNullableGuids) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneArrayOfNullableGuids = oneArrayOfNullableGuids == null
                ? new java.util.UUID[] {}
                : oneArrayOfNullableGuids;
        this.calculatedOneArrayOfNullableGuids = calculatedOneArrayOfNullableGuids;
        this.persistedOneArrayOfNullableGuids = persistedOneArrayOfNullableGuids;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneArrayOfNullableGuids_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneArrayOfNullableGuids_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneArrayOfNullableGuids_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneArrayOfNullableGuids_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableGuids_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableGuids_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneArrayOfNullableGuids_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableGuids_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableGuids_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableGuids_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableGuids_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneArrayOfNullableGuids_4.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableGuids_4> search(
            final Specification<OneArrayOfNullableGuids_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableGuids_4> search(
            final Specification<OneArrayOfNullableGuids_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableGuids_4> search(
            final Specification<OneArrayOfNullableGuids_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableGuids_4> search(
            final Specification<OneArrayOfNullableGuids_4> specification,
            final Integer limit,
            final Integer offset,
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
                    .resolve(DomainProxy.class)
                    .count(OneArrayOfNullableGuids_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneArrayOfNullableGuids_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneArrayOfNullableGuids_4> specification,
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

    private void updateWithAnother(
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableGuids_4 result) {
        this.URI = result.URI;

        this.oneArrayOfNullableGuids = result.oneArrayOfNullableGuids;
        this.calculatedOneArrayOfNullableGuids = result.calculatedOneArrayOfNullableGuids;
        this.persistedOneArrayOfNullableGuids = result.persistedOneArrayOfNullableGuids;
        this.ID = result.ID;
    }

    public OneArrayOfNullableGuids_4 persist() throws java.io.IOException {
        final OneArrayOfNullableGuids_4 result;
        try {
            result = this.URI == null
                    ? _crudProxy.create(this).get()
                    : _crudProxy.update(this).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
        this.updateWithAnother(result);
        return this;
    }

    public OneArrayOfNullableGuids_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneArrayOfNullableGuids_4.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.UUID[] oneArrayOfNullableGuids;

    @JsonProperty("oneArrayOfNullableGuids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.UUID[] getOneArrayOfNullableGuids() {
        return oneArrayOfNullableGuids;
    }

    public OneArrayOfNullableGuids_4 setOneArrayOfNullableGuids(
            final java.util.UUID[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableGuids\" cannot be null!");
        this.oneArrayOfNullableGuids = value;

        return this;
    }

    private java.util.UUID[] calculatedOneArrayOfNullableGuids;

    @JsonProperty("calculatedOneArrayOfNullableGuids")
    public java.util.UUID[] getCalculatedOneArrayOfNullableGuids() {
        return this.calculatedOneArrayOfNullableGuids;
    }

    private java.util.UUID[] persistedOneArrayOfNullableGuids;

    @JsonProperty("persistedOneArrayOfNullableGuids")
    public java.util.UUID[] getPersistedOneArrayOfNullableGuids() {
        return this.persistedOneArrayOfNullableGuids;
    }
}
