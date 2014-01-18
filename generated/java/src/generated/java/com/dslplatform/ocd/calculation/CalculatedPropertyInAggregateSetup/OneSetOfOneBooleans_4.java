package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfOneBooleans_4 implements java.io.Serializable,
        AggregateRoot {
    public OneSetOfOneBooleans_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfOneBooleans = new java.util.HashSet<Boolean>();
        this.calculatedOneSetOfOneBooleans = new java.util.HashSet<Boolean>();
        this.persistedOneSetOfOneBooleans = new java.util.HashSet<Boolean>();
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
        final OneSetOfOneBooleans_4 other = (OneSetOfOneBooleans_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfOneBooleans_4(" + URI + ')'
                : "new OneSetOfOneBooleans_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfOneBooleans_4(
            final java.util.Set<Boolean> oneSetOfOneBooleans) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfOneBooleans(oneSetOfOneBooleans);
    }

    @JsonCreator
    private OneSetOfOneBooleans_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfOneBooleans") final java.util.Set<Boolean> oneSetOfOneBooleans,
            @JsonProperty("calculatedOneSetOfOneBooleans") final java.util.Set<Boolean> calculatedOneSetOfOneBooleans,
            @JsonProperty("persistedOneSetOfOneBooleans") final java.util.Set<Boolean> persistedOneSetOfOneBooleans) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfOneBooleans = oneSetOfOneBooleans == null
                ? new java.util.HashSet<Boolean>()
                : oneSetOfOneBooleans;
        this.calculatedOneSetOfOneBooleans = calculatedOneSetOfOneBooleans;
        this.persistedOneSetOfOneBooleans = persistedOneSetOfOneBooleans;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfOneBooleans_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfOneBooleans_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfOneBooleans_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfOneBooleans_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneBooleans_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneBooleans_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfOneBooleans_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneBooleans_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneBooleans_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfOneBooleans_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneBooleans_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfOneBooleans_4.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneBooleans_4> search(
            final Specification<OneSetOfOneBooleans_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneBooleans_4> search(
            final Specification<OneSetOfOneBooleans_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfOneBooleans_4> search(
            final Specification<OneSetOfOneBooleans_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneBooleans_4> search(
            final Specification<OneSetOfOneBooleans_4> specification,
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
                    .count(OneSetOfOneBooleans_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfOneBooleans_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfOneBooleans_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneBooleans_4 result) {
        this.URI = result.URI;

        this.oneSetOfOneBooleans = result.oneSetOfOneBooleans;
        this.calculatedOneSetOfOneBooleans = result.calculatedOneSetOfOneBooleans;
        this.persistedOneSetOfOneBooleans = result.persistedOneSetOfOneBooleans;
        this.ID = result.ID;
    }

    public OneSetOfOneBooleans_4 persist() throws java.io.IOException {
        final OneSetOfOneBooleans_4 result;
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

    public OneSetOfOneBooleans_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfOneBooleans_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<Boolean> oneSetOfOneBooleans;

    @JsonProperty("oneSetOfOneBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Boolean> getOneSetOfOneBooleans() {
        return oneSetOfOneBooleans;
    }

    public OneSetOfOneBooleans_4 setOneSetOfOneBooleans(
            final java.util.Set<Boolean> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneBooleans\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneBooleans = value;

        return this;
    }

    private java.util.Set<Boolean> calculatedOneSetOfOneBooleans;

    @JsonProperty("calculatedOneSetOfOneBooleans")
    public java.util.Set<Boolean> getCalculatedOneSetOfOneBooleans() {
        return this.calculatedOneSetOfOneBooleans;
    }

    private java.util.Set<Boolean> persistedOneSetOfOneBooleans;

    @JsonProperty("persistedOneSetOfOneBooleans")
    public java.util.Set<Boolean> getPersistedOneSetOfOneBooleans() {
        return this.persistedOneSetOfOneBooleans;
    }
}
