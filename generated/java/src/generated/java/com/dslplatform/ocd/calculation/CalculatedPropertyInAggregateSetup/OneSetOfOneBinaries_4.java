package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfOneBinaries_4 implements java.io.Serializable,
        AggregateRoot {
    public OneSetOfOneBinaries_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfOneBinaries = new java.util.HashSet<byte[]>();
        this.calculatedOneSetOfOneBinaries = new java.util.HashSet<byte[]>();
        this.persistedOneSetOfOneBinaries = new java.util.HashSet<byte[]>();
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
        final OneSetOfOneBinaries_4 other = (OneSetOfOneBinaries_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfOneBinaries_4(" + URI + ')'
                : "new OneSetOfOneBinaries_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfOneBinaries_4(
            final java.util.Set<byte[]> oneSetOfOneBinaries) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfOneBinaries(oneSetOfOneBinaries);
    }

    @JsonCreator
    private OneSetOfOneBinaries_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfOneBinaries") final java.util.Set<byte[]> oneSetOfOneBinaries,
            @JsonProperty("calculatedOneSetOfOneBinaries") final java.util.Set<byte[]> calculatedOneSetOfOneBinaries,
            @JsonProperty("persistedOneSetOfOneBinaries") final java.util.Set<byte[]> persistedOneSetOfOneBinaries) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfOneBinaries = oneSetOfOneBinaries == null
                ? new java.util.HashSet<byte[]>()
                : oneSetOfOneBinaries;
        this.calculatedOneSetOfOneBinaries = calculatedOneSetOfOneBinaries;
        this.persistedOneSetOfOneBinaries = persistedOneSetOfOneBinaries;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfOneBinaries_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfOneBinaries_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfOneBinaries_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfOneBinaries_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneBinaries_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneBinaries_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfOneBinaries_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneBinaries_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneBinaries_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfOneBinaries_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneBinaries_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfOneBinaries_4.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneBinaries_4> search(
            final Specification<OneSetOfOneBinaries_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneBinaries_4> search(
            final Specification<OneSetOfOneBinaries_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfOneBinaries_4> search(
            final Specification<OneSetOfOneBinaries_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneBinaries_4> search(
            final Specification<OneSetOfOneBinaries_4> specification,
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
                    .count(OneSetOfOneBinaries_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfOneBinaries_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfOneBinaries_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneBinaries_4 result) {
        this.URI = result.URI;

        this.oneSetOfOneBinaries = result.oneSetOfOneBinaries;
        this.calculatedOneSetOfOneBinaries = result.calculatedOneSetOfOneBinaries;
        this.persistedOneSetOfOneBinaries = result.persistedOneSetOfOneBinaries;
        this.ID = result.ID;
    }

    public OneSetOfOneBinaries_4 persist() throws java.io.IOException {
        final OneSetOfOneBinaries_4 result;
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

    public OneSetOfOneBinaries_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfOneBinaries_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<byte[]> oneSetOfOneBinaries;

    @JsonProperty("oneSetOfOneBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<byte[]> getOneSetOfOneBinaries() {
        return oneSetOfOneBinaries;
    }

    public OneSetOfOneBinaries_4 setOneSetOfOneBinaries(
            final java.util.Set<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneBinaries\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneBinaries = value;

        return this;
    }

    private java.util.Set<byte[]> calculatedOneSetOfOneBinaries;

    @JsonProperty("calculatedOneSetOfOneBinaries")
    public java.util.Set<byte[]> getCalculatedOneSetOfOneBinaries() {
        return this.calculatedOneSetOfOneBinaries;
    }

    private java.util.Set<byte[]> persistedOneSetOfOneBinaries;

    @JsonProperty("persistedOneSetOfOneBinaries")
    public java.util.Set<byte[]> getPersistedOneSetOfOneBinaries() {
        return this.persistedOneSetOfOneBinaries;
    }
}