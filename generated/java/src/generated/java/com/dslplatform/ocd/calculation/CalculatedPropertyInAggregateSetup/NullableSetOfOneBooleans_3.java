package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableSetOfOneBooleans_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableSetOfOneBooleans_3() {
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
        final NullableSetOfOneBooleans_3 other = (NullableSetOfOneBooleans_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableSetOfOneBooleans_3(" + URI + ')'
                : "new NullableSetOfOneBooleans_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableSetOfOneBooleans_3(
            final java.util.Set<Boolean> nullableSetOfOneBooleans) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableSetOfOneBooleans(nullableSetOfOneBooleans);
    }

    @JsonCreator
    private NullableSetOfOneBooleans_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableSetOfOneBooleans") final java.util.Set<Boolean> nullableSetOfOneBooleans,
            @JsonProperty("calculatedNullableSetOfOneBooleans") final java.util.Set<Boolean> calculatedNullableSetOfOneBooleans,
            @JsonProperty("persistedNullableSetOfOneBooleans") final java.util.Set<Boolean> persistedNullableSetOfOneBooleans) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableSetOfOneBooleans = nullableSetOfOneBooleans;
        this.calculatedNullableSetOfOneBooleans = calculatedNullableSetOfOneBooleans == null
                ? new java.util.HashSet<Boolean>()
                : calculatedNullableSetOfOneBooleans;
        this.persistedNullableSetOfOneBooleans = persistedNullableSetOfOneBooleans == null
                ? new java.util.HashSet<Boolean>()
                : persistedNullableSetOfOneBooleans;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableSetOfOneBooleans_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableSetOfOneBooleans_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableSetOfOneBooleans_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableSetOfOneBooleans_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfOneBooleans_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneBooleans_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableSetOfOneBooleans_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfOneBooleans_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneBooleans_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableSetOfOneBooleans_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneBooleans_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableSetOfOneBooleans_3.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfOneBooleans_3> search(
            final Specification<NullableSetOfOneBooleans_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneBooleans_3> search(
            final Specification<NullableSetOfOneBooleans_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableSetOfOneBooleans_3> search(
            final Specification<NullableSetOfOneBooleans_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneBooleans_3> search(
            final Specification<NullableSetOfOneBooleans_3> specification,
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
                    .count(NullableSetOfOneBooleans_3.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableSetOfOneBooleans_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableSetOfOneBooleans_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneBooleans_3 result) {
        this.URI = result.URI;

        this.nullableSetOfOneBooleans = result.nullableSetOfOneBooleans;
        this.calculatedNullableSetOfOneBooleans = result.calculatedNullableSetOfOneBooleans;
        this.persistedNullableSetOfOneBooleans = result.persistedNullableSetOfOneBooleans;
        this.ID = result.ID;
    }

    public NullableSetOfOneBooleans_3 persist() throws java.io.IOException {
        final NullableSetOfOneBooleans_3 result;
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

    public NullableSetOfOneBooleans_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableSetOfOneBooleans_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<Boolean> nullableSetOfOneBooleans;

    @JsonProperty("nullableSetOfOneBooleans")
    public java.util.Set<Boolean> getNullableSetOfOneBooleans() {
        return nullableSetOfOneBooleans;
    }

    public NullableSetOfOneBooleans_3 setNullableSetOfOneBooleans(
            final java.util.Set<Boolean> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneBooleans = value;

        return this;
    }

    private java.util.Set<Boolean> calculatedNullableSetOfOneBooleans;

    @JsonProperty("calculatedNullableSetOfOneBooleans")
    public java.util.Set<Boolean> getCalculatedNullableSetOfOneBooleans() {
        return this.calculatedNullableSetOfOneBooleans;
    }

    private java.util.Set<Boolean> persistedNullableSetOfOneBooleans;

    @JsonProperty("persistedNullableSetOfOneBooleans")
    public java.util.Set<Boolean> getPersistedNullableSetOfOneBooleans() {
        return this.persistedNullableSetOfOneBooleans;
    }
}
