package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneListOfNullableUrls_4 implements java.io.Serializable,
        AggregateRoot {
    public OneListOfNullableUrls_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneListOfNullableUrls = new java.util.ArrayList<java.net.URI>();
        this.calculatedOneListOfNullableUrls = new java.util.ArrayList<java.net.URI>();
        this.persistedOneListOfNullableUrls = new java.util.ArrayList<java.net.URI>();
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
        final OneListOfNullableUrls_4 other = (OneListOfNullableUrls_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneListOfNullableUrls_4(" + URI + ')'
                : "new OneListOfNullableUrls_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneListOfNullableUrls_4(
            final java.util.List<java.net.URI> oneListOfNullableUrls) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneListOfNullableUrls(oneListOfNullableUrls);
    }

    @JsonCreator
    private OneListOfNullableUrls_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneListOfNullableUrls") final java.util.List<java.net.URI> oneListOfNullableUrls,
            @JsonProperty("calculatedOneListOfNullableUrls") final java.util.List<java.net.URI> calculatedOneListOfNullableUrls,
            @JsonProperty("persistedOneListOfNullableUrls") final java.util.List<java.net.URI> persistedOneListOfNullableUrls) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneListOfNullableUrls = oneListOfNullableUrls == null
                ? new java.util.ArrayList<java.net.URI>()
                : oneListOfNullableUrls;
        this.calculatedOneListOfNullableUrls = calculatedOneListOfNullableUrls;
        this.persistedOneListOfNullableUrls = persistedOneListOfNullableUrls;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneListOfNullableUrls_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneListOfNullableUrls_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneListOfNullableUrls_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfNullableUrls_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableUrls_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableUrls_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfNullableUrls_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableUrls_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableUrls_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfNullableUrls_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableUrls_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfNullableUrls_4.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableUrls_4> search(
            final Specification<OneListOfNullableUrls_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableUrls_4> search(
            final Specification<OneListOfNullableUrls_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfNullableUrls_4> search(
            final Specification<OneListOfNullableUrls_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableUrls_4> search(
            final Specification<OneListOfNullableUrls_4> specification,
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
                    .count(OneListOfNullableUrls_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfNullableUrls_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfNullableUrls_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableUrls_4 result) {
        this.URI = result.URI;

        this.oneListOfNullableUrls = result.oneListOfNullableUrls;
        this.calculatedOneListOfNullableUrls = result.calculatedOneListOfNullableUrls;
        this.persistedOneListOfNullableUrls = result.persistedOneListOfNullableUrls;
        this.ID = result.ID;
    }

    public OneListOfNullableUrls_4 persist() throws java.io.IOException {
        final OneListOfNullableUrls_4 result;
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

    public OneListOfNullableUrls_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneListOfNullableUrls_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<java.net.URI> oneListOfNullableUrls;

    @JsonProperty("oneListOfNullableUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.net.URI> getOneListOfNullableUrls() {
        return oneListOfNullableUrls;
    }

    public OneListOfNullableUrls_4 setOneListOfNullableUrls(
            final java.util.List<java.net.URI> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableUrls\" cannot be null!");
        this.oneListOfNullableUrls = value;

        return this;
    }

    private java.util.List<java.net.URI> calculatedOneListOfNullableUrls;

    @JsonProperty("calculatedOneListOfNullableUrls")
    public java.util.List<java.net.URI> getCalculatedOneListOfNullableUrls() {
        return this.calculatedOneListOfNullableUrls;
    }

    private java.util.List<java.net.URI> persistedOneListOfNullableUrls;

    @JsonProperty("persistedOneListOfNullableUrls")
    public java.util.List<java.net.URI> getPersistedOneListOfNullableUrls() {
        return this.persistedOneListOfNullableUrls;
    }
}
