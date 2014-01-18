package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneArrayOfNullableTimestamps_4 implements java.io.Serializable,
        AggregateRoot {
    public OneArrayOfNullableTimestamps_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneArrayOfNullableTimestamps = new org.joda.time.DateTime[] {};
        this.calculatedOneArrayOfNullableTimestamps = new org.joda.time.DateTime[] {};
        this.persistedOneArrayOfNullableTimestamps = new org.joda.time.DateTime[] {};
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
        final OneArrayOfNullableTimestamps_4 other = (OneArrayOfNullableTimestamps_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneArrayOfNullableTimestamps_4(" + URI + ')'
                : "new OneArrayOfNullableTimestamps_4(" + super.hashCode()
                        + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneArrayOfNullableTimestamps_4(
            final org.joda.time.DateTime[] oneArrayOfNullableTimestamps) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneArrayOfNullableTimestamps(oneArrayOfNullableTimestamps);
    }

    @JsonCreator
    private OneArrayOfNullableTimestamps_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneArrayOfNullableTimestamps") final org.joda.time.DateTime[] oneArrayOfNullableTimestamps,
            @JsonProperty("calculatedOneArrayOfNullableTimestamps") final org.joda.time.DateTime[] calculatedOneArrayOfNullableTimestamps,
            @JsonProperty("persistedOneArrayOfNullableTimestamps") final org.joda.time.DateTime[] persistedOneArrayOfNullableTimestamps) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneArrayOfNullableTimestamps = oneArrayOfNullableTimestamps == null
                ? new org.joda.time.DateTime[] {}
                : oneArrayOfNullableTimestamps;
        this.calculatedOneArrayOfNullableTimestamps = calculatedOneArrayOfNullableTimestamps;
        this.persistedOneArrayOfNullableTimestamps = persistedOneArrayOfNullableTimestamps;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneArrayOfNullableTimestamps_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneArrayOfNullableTimestamps_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneArrayOfNullableTimestamps_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneArrayOfNullableTimestamps_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableTimestamps_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableTimestamps_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneArrayOfNullableTimestamps_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableTimestamps_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableTimestamps_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableTimestamps_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableTimestamps_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneArrayOfNullableTimestamps_4.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableTimestamps_4> search(
            final Specification<OneArrayOfNullableTimestamps_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableTimestamps_4> search(
            final Specification<OneArrayOfNullableTimestamps_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableTimestamps_4> search(
            final Specification<OneArrayOfNullableTimestamps_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableTimestamps_4> search(
            final Specification<OneArrayOfNullableTimestamps_4> specification,
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
                    .count(OneArrayOfNullableTimestamps_4.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneArrayOfNullableTimestamps_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneArrayOfNullableTimestamps_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableTimestamps_4 result) {
        this.URI = result.URI;

        this.oneArrayOfNullableTimestamps = result.oneArrayOfNullableTimestamps;
        this.calculatedOneArrayOfNullableTimestamps = result.calculatedOneArrayOfNullableTimestamps;
        this.persistedOneArrayOfNullableTimestamps = result.persistedOneArrayOfNullableTimestamps;
        this.ID = result.ID;
    }

    public OneArrayOfNullableTimestamps_4 persist() throws java.io.IOException {
        final OneArrayOfNullableTimestamps_4 result;
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

    public OneArrayOfNullableTimestamps_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneArrayOfNullableTimestamps_4.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private org.joda.time.DateTime[] oneArrayOfNullableTimestamps;

    @JsonProperty("oneArrayOfNullableTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.DateTime[] getOneArrayOfNullableTimestamps() {
        return oneArrayOfNullableTimestamps;
    }

    public OneArrayOfNullableTimestamps_4 setOneArrayOfNullableTimestamps(
            final org.joda.time.DateTime[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableTimestamps\" cannot be null!");
        this.oneArrayOfNullableTimestamps = value;

        return this;
    }

    private org.joda.time.DateTime[] calculatedOneArrayOfNullableTimestamps;

    @JsonProperty("calculatedOneArrayOfNullableTimestamps")
    public org.joda.time.DateTime[] getCalculatedOneArrayOfNullableTimestamps() {
        return this.calculatedOneArrayOfNullableTimestamps;
    }

    private org.joda.time.DateTime[] persistedOneArrayOfNullableTimestamps;

    @JsonProperty("persistedOneArrayOfNullableTimestamps")
    public org.joda.time.DateTime[] getPersistedOneArrayOfNullableTimestamps() {
        return this.persistedOneArrayOfNullableTimestamps;
    }
}
