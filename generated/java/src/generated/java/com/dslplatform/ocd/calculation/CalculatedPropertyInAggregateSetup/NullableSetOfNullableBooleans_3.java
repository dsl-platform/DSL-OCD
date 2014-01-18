package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableSetOfNullableBooleans_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableSetOfNullableBooleans_3() {
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
        final NullableSetOfNullableBooleans_3 other = (NullableSetOfNullableBooleans_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableSetOfNullableBooleans_3(" + URI + ')'
                : "new NullableSetOfNullableBooleans_3(" + super.hashCode()
                        + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableSetOfNullableBooleans_3(
            final java.util.Set<Boolean> nullableSetOfNullableBooleans) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableSetOfNullableBooleans(nullableSetOfNullableBooleans);
    }

    @JsonCreator
    private NullableSetOfNullableBooleans_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableSetOfNullableBooleans") final java.util.Set<Boolean> nullableSetOfNullableBooleans,
            @JsonProperty("calculatedNullableSetOfNullableBooleans") final java.util.Set<Boolean> calculatedNullableSetOfNullableBooleans,
            @JsonProperty("persistedNullableSetOfNullableBooleans") final java.util.Set<Boolean> persistedNullableSetOfNullableBooleans) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableSetOfNullableBooleans = nullableSetOfNullableBooleans;
        this.calculatedNullableSetOfNullableBooleans = calculatedNullableSetOfNullableBooleans == null
                ? new java.util.HashSet<Boolean>()
                : calculatedNullableSetOfNullableBooleans;
        this.persistedNullableSetOfNullableBooleans = persistedNullableSetOfNullableBooleans == null
                ? new java.util.HashSet<Boolean>()
                : persistedNullableSetOfNullableBooleans;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableSetOfNullableBooleans_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableSetOfNullableBooleans_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableSetOfNullableBooleans_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableSetOfNullableBooleans_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableBooleans_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableBooleans_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableSetOfNullableBooleans_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableBooleans_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableBooleans_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableSetOfNullableBooleans_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableBooleans_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableSetOfNullableBooleans_3.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableBooleans_3> search(
            final Specification<NullableSetOfNullableBooleans_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableBooleans_3> search(
            final Specification<NullableSetOfNullableBooleans_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableSetOfNullableBooleans_3> search(
            final Specification<NullableSetOfNullableBooleans_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableBooleans_3> search(
            final Specification<NullableSetOfNullableBooleans_3> specification,
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
                    .count(NullableSetOfNullableBooleans_3.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableSetOfNullableBooleans_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableSetOfNullableBooleans_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableBooleans_3 result) {
        this.URI = result.URI;

        this.nullableSetOfNullableBooleans = result.nullableSetOfNullableBooleans;
        this.calculatedNullableSetOfNullableBooleans = result.calculatedNullableSetOfNullableBooleans;
        this.persistedNullableSetOfNullableBooleans = result.persistedNullableSetOfNullableBooleans;
        this.ID = result.ID;
    }

    public NullableSetOfNullableBooleans_3 persist() throws java.io.IOException {
        final NullableSetOfNullableBooleans_3 result;
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

    public NullableSetOfNullableBooleans_3 delete() throws java.io.IOException {
        try {
            return _crudProxy
                    .delete(NullableSetOfNullableBooleans_3.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<Boolean> nullableSetOfNullableBooleans;

    @JsonProperty("nullableSetOfNullableBooleans")
    public java.util.Set<Boolean> getNullableSetOfNullableBooleans() {
        return nullableSetOfNullableBooleans;
    }

    public NullableSetOfNullableBooleans_3 setNullableSetOfNullableBooleans(
            final java.util.Set<Boolean> value) {
        this.nullableSetOfNullableBooleans = value;

        return this;
    }

    private java.util.Set<Boolean> calculatedNullableSetOfNullableBooleans;

    @JsonProperty("calculatedNullableSetOfNullableBooleans")
    public java.util.Set<Boolean> getCalculatedNullableSetOfNullableBooleans() {
        return this.calculatedNullableSetOfNullableBooleans;
    }

    private java.util.Set<Boolean> persistedNullableSetOfNullableBooleans;

    @JsonProperty("persistedNullableSetOfNullableBooleans")
    public java.util.Set<Boolean> getPersistedNullableSetOfNullableBooleans() {
        return this.persistedNullableSetOfNullableBooleans;
    }
}
