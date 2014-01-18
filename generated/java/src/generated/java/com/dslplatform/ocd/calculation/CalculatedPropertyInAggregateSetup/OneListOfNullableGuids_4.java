package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneListOfNullableGuids_4 implements java.io.Serializable,
        AggregateRoot {
    public OneListOfNullableGuids_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneListOfNullableGuids = new java.util.ArrayList<java.util.UUID>();
        this.calculatedOneListOfNullableGuids = new java.util.ArrayList<java.util.UUID>();
        this.persistedOneListOfNullableGuids = new java.util.ArrayList<java.util.UUID>();
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
        final OneListOfNullableGuids_4 other = (OneListOfNullableGuids_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneListOfNullableGuids_4(" + URI + ')'
                : "new OneListOfNullableGuids_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneListOfNullableGuids_4(
            final java.util.List<java.util.UUID> oneListOfNullableGuids) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneListOfNullableGuids(oneListOfNullableGuids);
    }

    @JsonCreator
    private OneListOfNullableGuids_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneListOfNullableGuids") final java.util.List<java.util.UUID> oneListOfNullableGuids,
            @JsonProperty("calculatedOneListOfNullableGuids") final java.util.List<java.util.UUID> calculatedOneListOfNullableGuids,
            @JsonProperty("persistedOneListOfNullableGuids") final java.util.List<java.util.UUID> persistedOneListOfNullableGuids) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneListOfNullableGuids = oneListOfNullableGuids == null
                ? new java.util.ArrayList<java.util.UUID>()
                : oneListOfNullableGuids;
        this.calculatedOneListOfNullableGuids = calculatedOneListOfNullableGuids;
        this.persistedOneListOfNullableGuids = persistedOneListOfNullableGuids;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneListOfNullableGuids_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneListOfNullableGuids_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneListOfNullableGuids_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfNullableGuids_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableGuids_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableGuids_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfNullableGuids_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableGuids_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableGuids_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfNullableGuids_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableGuids_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfNullableGuids_4.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableGuids_4> search(
            final Specification<OneListOfNullableGuids_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableGuids_4> search(
            final Specification<OneListOfNullableGuids_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfNullableGuids_4> search(
            final Specification<OneListOfNullableGuids_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableGuids_4> search(
            final Specification<OneListOfNullableGuids_4> specification,
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
                    .count(OneListOfNullableGuids_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfNullableGuids_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfNullableGuids_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableGuids_4 result) {
        this.URI = result.URI;

        this.oneListOfNullableGuids = result.oneListOfNullableGuids;
        this.calculatedOneListOfNullableGuids = result.calculatedOneListOfNullableGuids;
        this.persistedOneListOfNullableGuids = result.persistedOneListOfNullableGuids;
        this.ID = result.ID;
    }

    public OneListOfNullableGuids_4 persist() throws java.io.IOException {
        final OneListOfNullableGuids_4 result;
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

    public OneListOfNullableGuids_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneListOfNullableGuids_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<java.util.UUID> oneListOfNullableGuids;

    @JsonProperty("oneListOfNullableGuids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.UUID> getOneListOfNullableGuids() {
        return oneListOfNullableGuids;
    }

    public OneListOfNullableGuids_4 setOneListOfNullableGuids(
            final java.util.List<java.util.UUID> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableGuids\" cannot be null!");
        this.oneListOfNullableGuids = value;

        return this;
    }

    private java.util.List<java.util.UUID> calculatedOneListOfNullableGuids;

    @JsonProperty("calculatedOneListOfNullableGuids")
    public java.util.List<java.util.UUID> getCalculatedOneListOfNullableGuids() {
        return this.calculatedOneListOfNullableGuids;
    }

    private java.util.List<java.util.UUID> persistedOneListOfNullableGuids;

    @JsonProperty("persistedOneListOfNullableGuids")
    public java.util.List<java.util.UUID> getPersistedOneListOfNullableGuids() {
        return this.persistedOneListOfNullableGuids;
    }
}
