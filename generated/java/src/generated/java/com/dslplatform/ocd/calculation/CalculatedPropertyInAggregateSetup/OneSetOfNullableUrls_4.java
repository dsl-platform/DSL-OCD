package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfNullableUrls_4 implements java.io.Serializable,
        AggregateRoot {
    public OneSetOfNullableUrls_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfNullableUrls = new java.util.HashSet<java.net.URI>();
        this.calculatedOneSetOfNullableUrls = new java.util.HashSet<java.net.URI>();
        this.persistedOneSetOfNullableUrls = new java.util.HashSet<java.net.URI>();
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
        final OneSetOfNullableUrls_4 other = (OneSetOfNullableUrls_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfNullableUrls_4(" + URI + ')'
                : "new OneSetOfNullableUrls_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfNullableUrls_4(
            final java.util.Set<java.net.URI> oneSetOfNullableUrls) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfNullableUrls(oneSetOfNullableUrls);
    }

    @JsonCreator
    private OneSetOfNullableUrls_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfNullableUrls") final java.util.Set<java.net.URI> oneSetOfNullableUrls,
            @JsonProperty("calculatedOneSetOfNullableUrls") final java.util.Set<java.net.URI> calculatedOneSetOfNullableUrls,
            @JsonProperty("persistedOneSetOfNullableUrls") final java.util.Set<java.net.URI> persistedOneSetOfNullableUrls) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfNullableUrls = oneSetOfNullableUrls == null
                ? new java.util.HashSet<java.net.URI>()
                : oneSetOfNullableUrls;
        this.calculatedOneSetOfNullableUrls = calculatedOneSetOfNullableUrls;
        this.persistedOneSetOfNullableUrls = persistedOneSetOfNullableUrls;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfNullableUrls_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfNullableUrls_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfNullableUrls_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfNullableUrls_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableUrls_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableUrls_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfNullableUrls_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableUrls_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableUrls_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfNullableUrls_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableUrls_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfNullableUrls_4.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableUrls_4> search(
            final Specification<OneSetOfNullableUrls_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableUrls_4> search(
            final Specification<OneSetOfNullableUrls_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfNullableUrls_4> search(
            final Specification<OneSetOfNullableUrls_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableUrls_4> search(
            final Specification<OneSetOfNullableUrls_4> specification,
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
                    .count(OneSetOfNullableUrls_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfNullableUrls_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfNullableUrls_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableUrls_4 result) {
        this.URI = result.URI;

        this.oneSetOfNullableUrls = result.oneSetOfNullableUrls;
        this.calculatedOneSetOfNullableUrls = result.calculatedOneSetOfNullableUrls;
        this.persistedOneSetOfNullableUrls = result.persistedOneSetOfNullableUrls;
        this.ID = result.ID;
    }

    public OneSetOfNullableUrls_4 persist() throws java.io.IOException {
        final OneSetOfNullableUrls_4 result;
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

    public OneSetOfNullableUrls_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfNullableUrls_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<java.net.URI> oneSetOfNullableUrls;

    @JsonProperty("oneSetOfNullableUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.net.URI> getOneSetOfNullableUrls() {
        return oneSetOfNullableUrls;
    }

    public OneSetOfNullableUrls_4 setOneSetOfNullableUrls(
            final java.util.Set<java.net.URI> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableUrls\" cannot be null!");
        this.oneSetOfNullableUrls = value;

        return this;
    }

    private java.util.Set<java.net.URI> calculatedOneSetOfNullableUrls;

    @JsonProperty("calculatedOneSetOfNullableUrls")
    public java.util.Set<java.net.URI> getCalculatedOneSetOfNullableUrls() {
        return this.calculatedOneSetOfNullableUrls;
    }

    private java.util.Set<java.net.URI> persistedOneSetOfNullableUrls;

    @JsonProperty("persistedOneSetOfNullableUrls")
    public java.util.Set<java.net.URI> getPersistedOneSetOfNullableUrls() {
        return this.persistedOneSetOfNullableUrls;
    }
}
