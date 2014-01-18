package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfNullableLongs_4 implements java.io.Serializable,
        AggregateRoot {
    public OneSetOfNullableLongs_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfNullableLongs = new java.util.HashSet<Long>();
        this.calculatedOneSetOfNullableLongs = new java.util.HashSet<Long>();
        this.persistedOneSetOfNullableLongs = new java.util.HashSet<Long>();
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
        final OneSetOfNullableLongs_4 other = (OneSetOfNullableLongs_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfNullableLongs_4(" + URI + ')'
                : "new OneSetOfNullableLongs_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfNullableLongs_4(
            final java.util.Set<Long> oneSetOfNullableLongs) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfNullableLongs(oneSetOfNullableLongs);
    }

    @JsonCreator
    private OneSetOfNullableLongs_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfNullableLongs") final java.util.Set<Long> oneSetOfNullableLongs,
            @JsonProperty("calculatedOneSetOfNullableLongs") final java.util.Set<Long> calculatedOneSetOfNullableLongs,
            @JsonProperty("persistedOneSetOfNullableLongs") final java.util.Set<Long> persistedOneSetOfNullableLongs) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfNullableLongs = oneSetOfNullableLongs == null
                ? new java.util.HashSet<Long>()
                : oneSetOfNullableLongs;
        this.calculatedOneSetOfNullableLongs = calculatedOneSetOfNullableLongs;
        this.persistedOneSetOfNullableLongs = persistedOneSetOfNullableLongs;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfNullableLongs_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfNullableLongs_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfNullableLongs_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfNullableLongs_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableLongs_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableLongs_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfNullableLongs_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableLongs_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableLongs_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfNullableLongs_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableLongs_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfNullableLongs_4.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableLongs_4> search(
            final Specification<OneSetOfNullableLongs_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableLongs_4> search(
            final Specification<OneSetOfNullableLongs_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfNullableLongs_4> search(
            final Specification<OneSetOfNullableLongs_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableLongs_4> search(
            final Specification<OneSetOfNullableLongs_4> specification,
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
                    .count(OneSetOfNullableLongs_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfNullableLongs_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfNullableLongs_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableLongs_4 result) {
        this.URI = result.URI;

        this.oneSetOfNullableLongs = result.oneSetOfNullableLongs;
        this.calculatedOneSetOfNullableLongs = result.calculatedOneSetOfNullableLongs;
        this.persistedOneSetOfNullableLongs = result.persistedOneSetOfNullableLongs;
        this.ID = result.ID;
    }

    public OneSetOfNullableLongs_4 persist() throws java.io.IOException {
        final OneSetOfNullableLongs_4 result;
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

    public OneSetOfNullableLongs_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfNullableLongs_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<Long> oneSetOfNullableLongs;

    @JsonProperty("oneSetOfNullableLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Long> getOneSetOfNullableLongs() {
        return oneSetOfNullableLongs;
    }

    public OneSetOfNullableLongs_4 setOneSetOfNullableLongs(
            final java.util.Set<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableLongs\" cannot be null!");
        this.oneSetOfNullableLongs = value;

        return this;
    }

    private java.util.Set<Long> calculatedOneSetOfNullableLongs;

    @JsonProperty("calculatedOneSetOfNullableLongs")
    public java.util.Set<Long> getCalculatedOneSetOfNullableLongs() {
        return this.calculatedOneSetOfNullableLongs;
    }

    private java.util.Set<Long> persistedOneSetOfNullableLongs;

    @JsonProperty("persistedOneSetOfNullableLongs")
    public java.util.Set<Long> getPersistedOneSetOfNullableLongs() {
        return this.persistedOneSetOfNullableLongs;
    }
}
