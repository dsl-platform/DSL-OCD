package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableArrayOfOneUrls_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableArrayOfOneUrls_3() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
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
        final NullableArrayOfOneUrls_3 other = (NullableArrayOfOneUrls_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableArrayOfOneUrls_3(" + URI + ')'
                : "new NullableArrayOfOneUrls_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableArrayOfOneUrls_3(
            final java.net.URI[] nullableArrayOfOneUrls) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableArrayOfOneUrls(nullableArrayOfOneUrls);
    }

    @JsonCreator
    private NullableArrayOfOneUrls_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableArrayOfOneUrls") final java.net.URI[] nullableArrayOfOneUrls,
            @JsonProperty("calculatedNullableArrayOfOneUrls") final java.net.URI[] calculatedNullableArrayOfOneUrls,
            @JsonProperty("persistedNullableArrayOfOneUrls") final java.net.URI[] persistedNullableArrayOfOneUrls) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableArrayOfOneUrls = nullableArrayOfOneUrls;
        this.calculatedNullableArrayOfOneUrls = calculatedNullableArrayOfOneUrls == null
                ? new java.net.URI[] {}
                : calculatedNullableArrayOfOneUrls;
        this.persistedNullableArrayOfOneUrls = persistedNullableArrayOfOneUrls == null
                ? new java.net.URI[] {}
                : persistedNullableArrayOfOneUrls;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableArrayOfOneUrls_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableArrayOfOneUrls_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableArrayOfOneUrls_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableArrayOfOneUrls_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfOneUrls_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneUrls_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableArrayOfOneUrls_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfOneUrls_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneUrls_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableArrayOfOneUrls_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneUrls_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableArrayOfOneUrls_3.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfOneUrls_3> search(
            final Specification<NullableArrayOfOneUrls_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneUrls_3> search(
            final Specification<NullableArrayOfOneUrls_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableArrayOfOneUrls_3> search(
            final Specification<NullableArrayOfOneUrls_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneUrls_3> search(
            final Specification<NullableArrayOfOneUrls_3> specification,
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
                    .count(NullableArrayOfOneUrls_3.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableArrayOfOneUrls_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableArrayOfOneUrls_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneUrls_3 result) {
        this.URI = result.URI;

        this.nullableArrayOfOneUrls = result.nullableArrayOfOneUrls;
        this.calculatedNullableArrayOfOneUrls = result.calculatedNullableArrayOfOneUrls;
        this.persistedNullableArrayOfOneUrls = result.persistedNullableArrayOfOneUrls;
        this.ID = result.ID;
    }

    public NullableArrayOfOneUrls_3 persist() throws java.io.IOException {
        final NullableArrayOfOneUrls_3 result;
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

    public NullableArrayOfOneUrls_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableArrayOfOneUrls_3.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.net.URI[] nullableArrayOfOneUrls;

    @JsonProperty("nullableArrayOfOneUrls")
    public java.net.URI[] getNullableArrayOfOneUrls() {
        return nullableArrayOfOneUrls;
    }

    public NullableArrayOfOneUrls_3 setNullableArrayOfOneUrls(
            final java.net.URI[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneUrls = value;

        return this;
    }

    private java.net.URI[] calculatedNullableArrayOfOneUrls;

    @JsonProperty("calculatedNullableArrayOfOneUrls")
    public java.net.URI[] getCalculatedNullableArrayOfOneUrls() {
        return this.calculatedNullableArrayOfOneUrls;
    }

    private java.net.URI[] persistedNullableArrayOfOneUrls;

    @JsonProperty("persistedNullableArrayOfOneUrls")
    public java.net.URI[] getPersistedNullableArrayOfOneUrls() {
        return this.persistedNullableArrayOfOneUrls;
    }
}
