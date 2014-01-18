package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneListOfNullableLongs_4 implements java.io.Serializable,
        AggregateRoot {
    public OneListOfNullableLongs_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneListOfNullableLongs = new java.util.ArrayList<Long>();
        this.calculatedOneListOfNullableLongs = new java.util.ArrayList<Long>();
        this.persistedOneListOfNullableLongs = new java.util.ArrayList<Long>();
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
        final OneListOfNullableLongs_4 other = (OneListOfNullableLongs_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneListOfNullableLongs_4(" + URI + ')'
                : "new OneListOfNullableLongs_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneListOfNullableLongs_4(
            final java.util.List<Long> oneListOfNullableLongs) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneListOfNullableLongs(oneListOfNullableLongs);
    }

    @JsonCreator
    private OneListOfNullableLongs_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneListOfNullableLongs") final java.util.List<Long> oneListOfNullableLongs,
            @JsonProperty("calculatedOneListOfNullableLongs") final java.util.List<Long> calculatedOneListOfNullableLongs,
            @JsonProperty("persistedOneListOfNullableLongs") final java.util.List<Long> persistedOneListOfNullableLongs) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneListOfNullableLongs = oneListOfNullableLongs == null
                ? new java.util.ArrayList<Long>()
                : oneListOfNullableLongs;
        this.calculatedOneListOfNullableLongs = calculatedOneListOfNullableLongs;
        this.persistedOneListOfNullableLongs = persistedOneListOfNullableLongs;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneListOfNullableLongs_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneListOfNullableLongs_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneListOfNullableLongs_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfNullableLongs_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableLongs_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableLongs_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfNullableLongs_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableLongs_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableLongs_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfNullableLongs_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableLongs_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfNullableLongs_4.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableLongs_4> search(
            final Specification<OneListOfNullableLongs_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableLongs_4> search(
            final Specification<OneListOfNullableLongs_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfNullableLongs_4> search(
            final Specification<OneListOfNullableLongs_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableLongs_4> search(
            final Specification<OneListOfNullableLongs_4> specification,
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
                    .count(OneListOfNullableLongs_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfNullableLongs_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfNullableLongs_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableLongs_4 result) {
        this.URI = result.URI;

        this.oneListOfNullableLongs = result.oneListOfNullableLongs;
        this.calculatedOneListOfNullableLongs = result.calculatedOneListOfNullableLongs;
        this.persistedOneListOfNullableLongs = result.persistedOneListOfNullableLongs;
        this.ID = result.ID;
    }

    public OneListOfNullableLongs_4 persist() throws java.io.IOException {
        final OneListOfNullableLongs_4 result;
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

    public OneListOfNullableLongs_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneListOfNullableLongs_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<Long> oneListOfNullableLongs;

    @JsonProperty("oneListOfNullableLongs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Long> getOneListOfNullableLongs() {
        return oneListOfNullableLongs;
    }

    public OneListOfNullableLongs_4 setOneListOfNullableLongs(
            final java.util.List<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableLongs\" cannot be null!");
        this.oneListOfNullableLongs = value;

        return this;
    }

    private java.util.List<Long> calculatedOneListOfNullableLongs;

    @JsonProperty("calculatedOneListOfNullableLongs")
    public java.util.List<Long> getCalculatedOneListOfNullableLongs() {
        return this.calculatedOneListOfNullableLongs;
    }

    private java.util.List<Long> persistedOneListOfNullableLongs;

    @JsonProperty("persistedOneListOfNullableLongs")
    public java.util.List<Long> getPersistedOneListOfNullableLongs() {
        return this.persistedOneListOfNullableLongs;
    }
}
