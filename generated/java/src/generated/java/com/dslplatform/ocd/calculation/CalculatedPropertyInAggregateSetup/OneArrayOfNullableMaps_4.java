package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneArrayOfNullableMaps_4 implements java.io.Serializable,
        AggregateRoot {
    @SuppressWarnings("unchecked")
    public OneArrayOfNullableMaps_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneArrayOfNullableMaps = new java.util.Map[] {};
        this.calculatedOneArrayOfNullableMaps = new java.util.Map[] {};
        this.persistedOneArrayOfNullableMaps = new java.util.Map[] {};
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
        final OneArrayOfNullableMaps_4 other = (OneArrayOfNullableMaps_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneArrayOfNullableMaps_4(" + URI + ')'
                : "new OneArrayOfNullableMaps_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneArrayOfNullableMaps_4(
            final java.util.Map<String, String>[] oneArrayOfNullableMaps) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneArrayOfNullableMaps(oneArrayOfNullableMaps);
    }

    @JsonCreator
    private OneArrayOfNullableMaps_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneArrayOfNullableMaps") final java.util.Map<String, String>[] oneArrayOfNullableMaps,
            @JsonProperty("calculatedOneArrayOfNullableMaps") final java.util.Map<String, String>[] calculatedOneArrayOfNullableMaps,
            @JsonProperty("persistedOneArrayOfNullableMaps") final java.util.Map<String, String>[] persistedOneArrayOfNullableMaps) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneArrayOfNullableMaps = oneArrayOfNullableMaps == null
                ? new java.util.Map[] {}
                : oneArrayOfNullableMaps;
        this.calculatedOneArrayOfNullableMaps = calculatedOneArrayOfNullableMaps;
        this.persistedOneArrayOfNullableMaps = persistedOneArrayOfNullableMaps;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneArrayOfNullableMaps_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneArrayOfNullableMaps_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneArrayOfNullableMaps_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneArrayOfNullableMaps_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableMaps_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableMaps_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneArrayOfNullableMaps_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableMaps_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableMaps_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableMaps_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableMaps_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneArrayOfNullableMaps_4.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableMaps_4> search(
            final Specification<OneArrayOfNullableMaps_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableMaps_4> search(
            final Specification<OneArrayOfNullableMaps_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableMaps_4> search(
            final Specification<OneArrayOfNullableMaps_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableMaps_4> search(
            final Specification<OneArrayOfNullableMaps_4> specification,
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
                    .count(OneArrayOfNullableMaps_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneArrayOfNullableMaps_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneArrayOfNullableMaps_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableMaps_4 result) {
        this.URI = result.URI;

        this.oneArrayOfNullableMaps = result.oneArrayOfNullableMaps;
        this.calculatedOneArrayOfNullableMaps = result.calculatedOneArrayOfNullableMaps;
        this.persistedOneArrayOfNullableMaps = result.persistedOneArrayOfNullableMaps;
        this.ID = result.ID;
    }

    public OneArrayOfNullableMaps_4 persist() throws java.io.IOException {
        final OneArrayOfNullableMaps_4 result;
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

    public OneArrayOfNullableMaps_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneArrayOfNullableMaps_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Map<String, String>[] oneArrayOfNullableMaps;

    @JsonProperty("oneArrayOfNullableMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Map<String, String>[] getOneArrayOfNullableMaps() {
        return oneArrayOfNullableMaps;
    }

    public OneArrayOfNullableMaps_4 setOneArrayOfNullableMaps(
            final java.util.Map<String, String>[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableMaps\" cannot be null!");
        this.oneArrayOfNullableMaps = value;

        return this;
    }

    private java.util.Map<String, String>[] calculatedOneArrayOfNullableMaps;

    @JsonProperty("calculatedOneArrayOfNullableMaps")
    public java.util.Map<String, String>[] getCalculatedOneArrayOfNullableMaps() {
        return this.calculatedOneArrayOfNullableMaps;
    }

    private java.util.Map<String, String>[] persistedOneArrayOfNullableMaps;

    @JsonProperty("persistedOneArrayOfNullableMaps")
    public java.util.Map<String, String>[] getPersistedOneArrayOfNullableMaps() {
        return this.persistedOneArrayOfNullableMaps;
    }
}
