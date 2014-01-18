package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneArrayOfNullableLongs_4 implements java.io.Serializable,
        AggregateRoot {
    public OneArrayOfNullableLongs_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneArrayOfNullableLongs = new Long[] {};
        this.calculatedOneArrayOfNullableLongs = new Long[] {};
        this.persistedOneArrayOfNullableLongs = new Long[] {};
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
        final OneArrayOfNullableLongs_4 other = (OneArrayOfNullableLongs_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneArrayOfNullableLongs_4(" + URI + ')'
                : "new OneArrayOfNullableLongs_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneArrayOfNullableLongs_4(
            final Long[] oneArrayOfNullableLongs) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneArrayOfNullableLongs(oneArrayOfNullableLongs);
    }

    @JsonCreator
    private OneArrayOfNullableLongs_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneArrayOfNullableLongs") final Long[] oneArrayOfNullableLongs,
            @JsonProperty("calculatedOneArrayOfNullableLongs") final Long[] calculatedOneArrayOfNullableLongs,
            @JsonProperty("persistedOneArrayOfNullableLongs") final Long[] persistedOneArrayOfNullableLongs) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneArrayOfNullableLongs = oneArrayOfNullableLongs == null
                ? new Long[] {}
                : oneArrayOfNullableLongs;
        this.calculatedOneArrayOfNullableLongs = calculatedOneArrayOfNullableLongs;
        this.persistedOneArrayOfNullableLongs = persistedOneArrayOfNullableLongs;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneArrayOfNullableLongs_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneArrayOfNullableLongs_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneArrayOfNullableLongs_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneArrayOfNullableLongs_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableLongs_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableLongs_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneArrayOfNullableLongs_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableLongs_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableLongs_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableLongs_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableLongs_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneArrayOfNullableLongs_4.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableLongs_4> search(
            final Specification<OneArrayOfNullableLongs_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableLongs_4> search(
            final Specification<OneArrayOfNullableLongs_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableLongs_4> search(
            final Specification<OneArrayOfNullableLongs_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableLongs_4> search(
            final Specification<OneArrayOfNullableLongs_4> specification,
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
                    .count(OneArrayOfNullableLongs_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneArrayOfNullableLongs_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneArrayOfNullableLongs_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableLongs_4 result) {
        this.URI = result.URI;

        this.oneArrayOfNullableLongs = result.oneArrayOfNullableLongs;
        this.calculatedOneArrayOfNullableLongs = result.calculatedOneArrayOfNullableLongs;
        this.persistedOneArrayOfNullableLongs = result.persistedOneArrayOfNullableLongs;
        this.ID = result.ID;
    }

    public OneArrayOfNullableLongs_4 persist() throws java.io.IOException {
        final OneArrayOfNullableLongs_4 result;
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

    public OneArrayOfNullableLongs_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneArrayOfNullableLongs_4.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private Long[] oneArrayOfNullableLongs;

    @JsonProperty("oneArrayOfNullableLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Long[] getOneArrayOfNullableLongs() {
        return oneArrayOfNullableLongs;
    }

    public OneArrayOfNullableLongs_4 setOneArrayOfNullableLongs(
            final Long[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableLongs\" cannot be null!");
        this.oneArrayOfNullableLongs = value;

        return this;
    }

    private Long[] calculatedOneArrayOfNullableLongs;

    @JsonProperty("calculatedOneArrayOfNullableLongs")
    public Long[] getCalculatedOneArrayOfNullableLongs() {
        return this.calculatedOneArrayOfNullableLongs;
    }

    private Long[] persistedOneArrayOfNullableLongs;

    @JsonProperty("persistedOneArrayOfNullableLongs")
    public Long[] getPersistedOneArrayOfNullableLongs() {
        return this.persistedOneArrayOfNullableLongs;
    }
}
