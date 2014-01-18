package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneListOfOneBinaries_4 implements java.io.Serializable,
        AggregateRoot {
    public OneListOfOneBinaries_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneListOfOneBinaries = new java.util.ArrayList<byte[]>();
        this.calculatedOneListOfOneBinaries = new java.util.ArrayList<byte[]>();
        this.persistedOneListOfOneBinaries = new java.util.ArrayList<byte[]>();
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
        final OneListOfOneBinaries_4 other = (OneListOfOneBinaries_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneListOfOneBinaries_4(" + URI + ')'
                : "new OneListOfOneBinaries_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneListOfOneBinaries_4(
            final java.util.List<byte[]> oneListOfOneBinaries) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneListOfOneBinaries(oneListOfOneBinaries);
    }

    @JsonCreator
    private OneListOfOneBinaries_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneListOfOneBinaries") final java.util.List<byte[]> oneListOfOneBinaries,
            @JsonProperty("calculatedOneListOfOneBinaries") final java.util.List<byte[]> calculatedOneListOfOneBinaries,
            @JsonProperty("persistedOneListOfOneBinaries") final java.util.List<byte[]> persistedOneListOfOneBinaries) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneListOfOneBinaries = oneListOfOneBinaries == null
                ? new java.util.ArrayList<byte[]>()
                : oneListOfOneBinaries;
        this.calculatedOneListOfOneBinaries = calculatedOneListOfOneBinaries;
        this.persistedOneListOfOneBinaries = persistedOneListOfOneBinaries;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneListOfOneBinaries_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneListOfOneBinaries_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneListOfOneBinaries_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfOneBinaries_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneBinaries_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneBinaries_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfOneBinaries_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneBinaries_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneBinaries_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfOneBinaries_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneBinaries_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfOneBinaries_4.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneBinaries_4> search(
            final Specification<OneListOfOneBinaries_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneBinaries_4> search(
            final Specification<OneListOfOneBinaries_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfOneBinaries_4> search(
            final Specification<OneListOfOneBinaries_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneBinaries_4> search(
            final Specification<OneListOfOneBinaries_4> specification,
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
                    .count(OneListOfOneBinaries_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfOneBinaries_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfOneBinaries_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneBinaries_4 result) {
        this.URI = result.URI;

        this.oneListOfOneBinaries = result.oneListOfOneBinaries;
        this.calculatedOneListOfOneBinaries = result.calculatedOneListOfOneBinaries;
        this.persistedOneListOfOneBinaries = result.persistedOneListOfOneBinaries;
        this.ID = result.ID;
    }

    public OneListOfOneBinaries_4 persist() throws java.io.IOException {
        final OneListOfOneBinaries_4 result;
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

    public OneListOfOneBinaries_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneListOfOneBinaries_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<byte[]> oneListOfOneBinaries;

    @JsonProperty("oneListOfOneBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<byte[]> getOneListOfOneBinaries() {
        return oneListOfOneBinaries;
    }

    public OneListOfOneBinaries_4 setOneListOfOneBinaries(
            final java.util.List<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneBinaries\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneBinaries = value;

        return this;
    }

    private java.util.List<byte[]> calculatedOneListOfOneBinaries;

    @JsonProperty("calculatedOneListOfOneBinaries")
    public java.util.List<byte[]> getCalculatedOneListOfOneBinaries() {
        return this.calculatedOneListOfOneBinaries;
    }

    private java.util.List<byte[]> persistedOneListOfOneBinaries;

    @JsonProperty("persistedOneListOfOneBinaries")
    public java.util.List<byte[]> getPersistedOneListOfOneBinaries() {
        return this.persistedOneListOfOneBinaries;
    }
}
