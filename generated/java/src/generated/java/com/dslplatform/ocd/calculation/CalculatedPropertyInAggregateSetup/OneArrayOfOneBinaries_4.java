package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneArrayOfOneBinaries_4 implements java.io.Serializable,
        AggregateRoot {
    public OneArrayOfOneBinaries_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneArrayOfOneBinaries = new byte[][] {};
        this.calculatedOneArrayOfOneBinaries = new byte[][] {};
        this.persistedOneArrayOfOneBinaries = new byte[][] {};
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
        final OneArrayOfOneBinaries_4 other = (OneArrayOfOneBinaries_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneArrayOfOneBinaries_4(" + URI + ')'
                : "new OneArrayOfOneBinaries_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneArrayOfOneBinaries_4(
            final byte[][] oneArrayOfOneBinaries) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneArrayOfOneBinaries(oneArrayOfOneBinaries);
    }

    @JsonCreator
    private OneArrayOfOneBinaries_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneArrayOfOneBinaries") final byte[][] oneArrayOfOneBinaries,
            @JsonProperty("calculatedOneArrayOfOneBinaries") final byte[][] calculatedOneArrayOfOneBinaries,
            @JsonProperty("persistedOneArrayOfOneBinaries") final byte[][] persistedOneArrayOfOneBinaries) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneArrayOfOneBinaries = oneArrayOfOneBinaries == null
                ? new byte[][] {}
                : oneArrayOfOneBinaries;
        this.calculatedOneArrayOfOneBinaries = calculatedOneArrayOfOneBinaries;
        this.persistedOneArrayOfOneBinaries = persistedOneArrayOfOneBinaries;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneArrayOfOneBinaries_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneArrayOfOneBinaries_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneArrayOfOneBinaries_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneArrayOfOneBinaries_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfOneBinaries_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneBinaries_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneArrayOfOneBinaries_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfOneBinaries_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneBinaries_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneArrayOfOneBinaries_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneBinaries_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneArrayOfOneBinaries_4.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfOneBinaries_4> search(
            final Specification<OneArrayOfOneBinaries_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneBinaries_4> search(
            final Specification<OneArrayOfOneBinaries_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneArrayOfOneBinaries_4> search(
            final Specification<OneArrayOfOneBinaries_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneBinaries_4> search(
            final Specification<OneArrayOfOneBinaries_4> specification,
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
                    .count(OneArrayOfOneBinaries_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneArrayOfOneBinaries_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneArrayOfOneBinaries_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneBinaries_4 result) {
        this.URI = result.URI;

        this.oneArrayOfOneBinaries = result.oneArrayOfOneBinaries;
        this.calculatedOneArrayOfOneBinaries = result.calculatedOneArrayOfOneBinaries;
        this.persistedOneArrayOfOneBinaries = result.persistedOneArrayOfOneBinaries;
        this.ID = result.ID;
    }

    public OneArrayOfOneBinaries_4 persist() throws java.io.IOException {
        final OneArrayOfOneBinaries_4 result;
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

    public OneArrayOfOneBinaries_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneArrayOfOneBinaries_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private byte[][] oneArrayOfOneBinaries;

    @JsonProperty("oneArrayOfOneBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public byte[][] getOneArrayOfOneBinaries() {
        return oneArrayOfOneBinaries;
    }

    public OneArrayOfOneBinaries_4 setOneArrayOfOneBinaries(final byte[][] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneBinaries\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneArrayOfOneBinaries = value;

        return this;
    }

    private byte[][] calculatedOneArrayOfOneBinaries;

    @JsonProperty("calculatedOneArrayOfOneBinaries")
    public byte[][] getCalculatedOneArrayOfOneBinaries() {
        return this.calculatedOneArrayOfOneBinaries;
    }

    private byte[][] persistedOneArrayOfOneBinaries;

    @JsonProperty("persistedOneArrayOfOneBinaries")
    public byte[][] getPersistedOneArrayOfOneBinaries() {
        return this.persistedOneArrayOfOneBinaries;
    }
}
