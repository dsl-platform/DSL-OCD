package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableListOfNullableBooleans_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableListOfNullableBooleans_3() {
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
        final NullableListOfNullableBooleans_3 other = (NullableListOfNullableBooleans_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableListOfNullableBooleans_3(" + URI + ')'
                : "new NullableListOfNullableBooleans_3(" + super.hashCode()
                        + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableListOfNullableBooleans_3(
            final java.util.List<Boolean> nullableListOfNullableBooleans) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableListOfNullableBooleans(nullableListOfNullableBooleans);
    }

    @JsonCreator
    private NullableListOfNullableBooleans_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableListOfNullableBooleans") final java.util.List<Boolean> nullableListOfNullableBooleans,
            @JsonProperty("calculatedNullableListOfNullableBooleans") final java.util.List<Boolean> calculatedNullableListOfNullableBooleans,
            @JsonProperty("persistedNullableListOfNullableBooleans") final java.util.List<Boolean> persistedNullableListOfNullableBooleans) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableListOfNullableBooleans = nullableListOfNullableBooleans;
        this.calculatedNullableListOfNullableBooleans = calculatedNullableListOfNullableBooleans == null
                ? new java.util.ArrayList<Boolean>()
                : calculatedNullableListOfNullableBooleans;
        this.persistedNullableListOfNullableBooleans = persistedNullableListOfNullableBooleans == null
                ? new java.util.ArrayList<Boolean>()
                : persistedNullableListOfNullableBooleans;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableListOfNullableBooleans_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableListOfNullableBooleans_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableListOfNullableBooleans_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableListOfNullableBooleans_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableBooleans_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableBooleans_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableListOfNullableBooleans_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableBooleans_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableBooleans_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableListOfNullableBooleans_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableBooleans_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableListOfNullableBooleans_3.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableBooleans_3> search(
            final Specification<NullableListOfNullableBooleans_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableBooleans_3> search(
            final Specification<NullableListOfNullableBooleans_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableListOfNullableBooleans_3> search(
            final Specification<NullableListOfNullableBooleans_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableBooleans_3> search(
            final Specification<NullableListOfNullableBooleans_3> specification,
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
                    .count(NullableListOfNullableBooleans_3.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableListOfNullableBooleans_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableListOfNullableBooleans_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableBooleans_3 result) {
        this.URI = result.URI;

        this.nullableListOfNullableBooleans = result.nullableListOfNullableBooleans;
        this.calculatedNullableListOfNullableBooleans = result.calculatedNullableListOfNullableBooleans;
        this.persistedNullableListOfNullableBooleans = result.persistedNullableListOfNullableBooleans;
        this.ID = result.ID;
    }

    public NullableListOfNullableBooleans_3 persist()
            throws java.io.IOException {
        final NullableListOfNullableBooleans_3 result;
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

    public NullableListOfNullableBooleans_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableListOfNullableBooleans_3.class,
                    URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<Boolean> nullableListOfNullableBooleans;

    @JsonProperty("nullableListOfNullableBooleans")
    public java.util.List<Boolean> getNullableListOfNullableBooleans() {
        return nullableListOfNullableBooleans;
    }

    public NullableListOfNullableBooleans_3 setNullableListOfNullableBooleans(
            final java.util.List<Boolean> value) {
        this.nullableListOfNullableBooleans = value;

        return this;
    }

    private java.util.List<Boolean> calculatedNullableListOfNullableBooleans;

    @JsonProperty("calculatedNullableListOfNullableBooleans")
    public java.util.List<Boolean> getCalculatedNullableListOfNullableBooleans() {
        return this.calculatedNullableListOfNullableBooleans;
    }

    private java.util.List<Boolean> persistedNullableListOfNullableBooleans;

    @JsonProperty("persistedNullableListOfNullableBooleans")
    public java.util.List<Boolean> getPersistedNullableListOfNullableBooleans() {
        return this.persistedNullableListOfNullableBooleans;
    }
}
