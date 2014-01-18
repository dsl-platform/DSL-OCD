package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneListOfNullableBooleans_4 implements java.io.Serializable,
        AggregateRoot {
    public OneListOfNullableBooleans_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneListOfNullableBooleans = new java.util.ArrayList<Boolean>();
        this.calculatedOneListOfNullableBooleans = new java.util.ArrayList<Boolean>();
        this.persistedOneListOfNullableBooleans = new java.util.ArrayList<Boolean>();
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
        final OneListOfNullableBooleans_4 other = (OneListOfNullableBooleans_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneListOfNullableBooleans_4(" + URI + ')'
                : "new OneListOfNullableBooleans_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneListOfNullableBooleans_4(
            final java.util.List<Boolean> oneListOfNullableBooleans) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneListOfNullableBooleans(oneListOfNullableBooleans);
    }

    @JsonCreator
    private OneListOfNullableBooleans_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneListOfNullableBooleans") final java.util.List<Boolean> oneListOfNullableBooleans,
            @JsonProperty("calculatedOneListOfNullableBooleans") final java.util.List<Boolean> calculatedOneListOfNullableBooleans,
            @JsonProperty("persistedOneListOfNullableBooleans") final java.util.List<Boolean> persistedOneListOfNullableBooleans) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneListOfNullableBooleans = oneListOfNullableBooleans == null
                ? new java.util.ArrayList<Boolean>()
                : oneListOfNullableBooleans;
        this.calculatedOneListOfNullableBooleans = calculatedOneListOfNullableBooleans;
        this.persistedOneListOfNullableBooleans = persistedOneListOfNullableBooleans;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneListOfNullableBooleans_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneListOfNullableBooleans_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneListOfNullableBooleans_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfNullableBooleans_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableBooleans_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableBooleans_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfNullableBooleans_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableBooleans_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableBooleans_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfNullableBooleans_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableBooleans_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfNullableBooleans_4.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableBooleans_4> search(
            final Specification<OneListOfNullableBooleans_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableBooleans_4> search(
            final Specification<OneListOfNullableBooleans_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfNullableBooleans_4> search(
            final Specification<OneListOfNullableBooleans_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableBooleans_4> search(
            final Specification<OneListOfNullableBooleans_4> specification,
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
                    .count(OneListOfNullableBooleans_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfNullableBooleans_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfNullableBooleans_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableBooleans_4 result) {
        this.URI = result.URI;

        this.oneListOfNullableBooleans = result.oneListOfNullableBooleans;
        this.calculatedOneListOfNullableBooleans = result.calculatedOneListOfNullableBooleans;
        this.persistedOneListOfNullableBooleans = result.persistedOneListOfNullableBooleans;
        this.ID = result.ID;
    }

    public OneListOfNullableBooleans_4 persist() throws java.io.IOException {
        final OneListOfNullableBooleans_4 result;
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

    public OneListOfNullableBooleans_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneListOfNullableBooleans_4.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<Boolean> oneListOfNullableBooleans;

    @JsonProperty("oneListOfNullableBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Boolean> getOneListOfNullableBooleans() {
        return oneListOfNullableBooleans;
    }

    public OneListOfNullableBooleans_4 setOneListOfNullableBooleans(
            final java.util.List<Boolean> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableBooleans\" cannot be null!");
        this.oneListOfNullableBooleans = value;

        return this;
    }

    private java.util.List<Boolean> calculatedOneListOfNullableBooleans;

    @JsonProperty("calculatedOneListOfNullableBooleans")
    public java.util.List<Boolean> getCalculatedOneListOfNullableBooleans() {
        return this.calculatedOneListOfNullableBooleans;
    }

    private java.util.List<Boolean> persistedOneListOfNullableBooleans;

    @JsonProperty("persistedOneListOfNullableBooleans")
    public java.util.List<Boolean> getPersistedOneListOfNullableBooleans() {
        return this.persistedOneListOfNullableBooleans;
    }
}
