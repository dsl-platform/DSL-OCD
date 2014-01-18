package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfOneLongs_4 implements java.io.Serializable, AggregateRoot {
    public OneSetOfOneLongs_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfOneLongs = new java.util.HashSet<Long>();
        this.calculatedOneSetOfOneLongs = new java.util.HashSet<Long>();
        this.persistedOneSetOfOneLongs = new java.util.HashSet<Long>();
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
        final OneSetOfOneLongs_4 other = (OneSetOfOneLongs_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfOneLongs_4(" + URI + ')'
                : "new OneSetOfOneLongs_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfOneLongs_4(
            final java.util.Set<Long> oneSetOfOneLongs) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfOneLongs(oneSetOfOneLongs);
    }

    @JsonCreator
    private OneSetOfOneLongs_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfOneLongs") final java.util.Set<Long> oneSetOfOneLongs,
            @JsonProperty("calculatedOneSetOfOneLongs") final java.util.Set<Long> calculatedOneSetOfOneLongs,
            @JsonProperty("persistedOneSetOfOneLongs") final java.util.Set<Long> persistedOneSetOfOneLongs) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfOneLongs = oneSetOfOneLongs == null
                ? new java.util.HashSet<Long>()
                : oneSetOfOneLongs;
        this.calculatedOneSetOfOneLongs = calculatedOneSetOfOneLongs;
        this.persistedOneSetOfOneLongs = persistedOneSetOfOneLongs;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfOneLongs_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfOneLongs_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfOneLongs_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfOneLongs_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneLongs_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneLongs_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfOneLongs_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneLongs_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneLongs_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfOneLongs_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneLongs_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfOneLongs_4.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneLongs_4> search(
            final Specification<OneSetOfOneLongs_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneLongs_4> search(
            final Specification<OneSetOfOneLongs_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfOneLongs_4> search(
            final Specification<OneSetOfOneLongs_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneLongs_4> search(
            final Specification<OneSetOfOneLongs_4> specification,
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
                    .resolve(DomainProxy.class).count(OneSetOfOneLongs_4.class)
                    .get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfOneLongs_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfOneLongs_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneLongs_4 result) {
        this.URI = result.URI;

        this.oneSetOfOneLongs = result.oneSetOfOneLongs;
        this.calculatedOneSetOfOneLongs = result.calculatedOneSetOfOneLongs;
        this.persistedOneSetOfOneLongs = result.persistedOneSetOfOneLongs;
        this.ID = result.ID;
    }

    public OneSetOfOneLongs_4 persist() throws java.io.IOException {
        final OneSetOfOneLongs_4 result;
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

    public OneSetOfOneLongs_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfOneLongs_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<Long> oneSetOfOneLongs;

    @JsonProperty("oneSetOfOneLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Long> getOneSetOfOneLongs() {
        return oneSetOfOneLongs;
    }

    public OneSetOfOneLongs_4 setOneSetOfOneLongs(
            final java.util.Set<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneLongs\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneLongs = value;

        return this;
    }

    private java.util.Set<Long> calculatedOneSetOfOneLongs;

    @JsonProperty("calculatedOneSetOfOneLongs")
    public java.util.Set<Long> getCalculatedOneSetOfOneLongs() {
        return this.calculatedOneSetOfOneLongs;
    }

    private java.util.Set<Long> persistedOneSetOfOneLongs;

    @JsonProperty("persistedOneSetOfOneLongs")
    public java.util.Set<Long> getPersistedOneSetOfOneLongs() {
        return this.persistedOneSetOfOneLongs;
    }
}
