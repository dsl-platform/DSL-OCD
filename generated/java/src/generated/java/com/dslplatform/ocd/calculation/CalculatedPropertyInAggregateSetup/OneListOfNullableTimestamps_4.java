package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneListOfNullableTimestamps_4 implements java.io.Serializable,
        AggregateRoot {
    public OneListOfNullableTimestamps_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneListOfNullableTimestamps = new java.util.ArrayList<org.joda.time.DateTime>();
        this.calculatedOneListOfNullableTimestamps = new java.util.ArrayList<org.joda.time.DateTime>();
        this.persistedOneListOfNullableTimestamps = new java.util.ArrayList<org.joda.time.DateTime>();
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
        final OneListOfNullableTimestamps_4 other = (OneListOfNullableTimestamps_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneListOfNullableTimestamps_4(" + URI + ')'
                : "new OneListOfNullableTimestamps_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneListOfNullableTimestamps_4(
            final java.util.List<org.joda.time.DateTime> oneListOfNullableTimestamps) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneListOfNullableTimestamps(oneListOfNullableTimestamps);
    }

    @JsonCreator
    private OneListOfNullableTimestamps_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneListOfNullableTimestamps") final java.util.List<org.joda.time.DateTime> oneListOfNullableTimestamps,
            @JsonProperty("calculatedOneListOfNullableTimestamps") final java.util.List<org.joda.time.DateTime> calculatedOneListOfNullableTimestamps,
            @JsonProperty("persistedOneListOfNullableTimestamps") final java.util.List<org.joda.time.DateTime> persistedOneListOfNullableTimestamps) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneListOfNullableTimestamps = oneListOfNullableTimestamps == null
                ? new java.util.ArrayList<org.joda.time.DateTime>()
                : oneListOfNullableTimestamps;
        this.calculatedOneListOfNullableTimestamps = calculatedOneListOfNullableTimestamps;
        this.persistedOneListOfNullableTimestamps = persistedOneListOfNullableTimestamps;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneListOfNullableTimestamps_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneListOfNullableTimestamps_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneListOfNullableTimestamps_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfNullableTimestamps_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableTimestamps_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableTimestamps_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfNullableTimestamps_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableTimestamps_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableTimestamps_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfNullableTimestamps_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableTimestamps_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfNullableTimestamps_4.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableTimestamps_4> search(
            final Specification<OneListOfNullableTimestamps_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableTimestamps_4> search(
            final Specification<OneListOfNullableTimestamps_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfNullableTimestamps_4> search(
            final Specification<OneListOfNullableTimestamps_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableTimestamps_4> search(
            final Specification<OneListOfNullableTimestamps_4> specification,
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
                    .count(OneListOfNullableTimestamps_4.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfNullableTimestamps_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfNullableTimestamps_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableTimestamps_4 result) {
        this.URI = result.URI;

        this.oneListOfNullableTimestamps = result.oneListOfNullableTimestamps;
        this.calculatedOneListOfNullableTimestamps = result.calculatedOneListOfNullableTimestamps;
        this.persistedOneListOfNullableTimestamps = result.persistedOneListOfNullableTimestamps;
        this.ID = result.ID;
    }

    public OneListOfNullableTimestamps_4 persist() throws java.io.IOException {
        final OneListOfNullableTimestamps_4 result;
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

    public OneListOfNullableTimestamps_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneListOfNullableTimestamps_4.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<org.joda.time.DateTime> oneListOfNullableTimestamps;

    @JsonProperty("oneListOfNullableTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.joda.time.DateTime> getOneListOfNullableTimestamps() {
        return oneListOfNullableTimestamps;
    }

    public OneListOfNullableTimestamps_4 setOneListOfNullableTimestamps(
            final java.util.List<org.joda.time.DateTime> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableTimestamps\" cannot be null!");
        this.oneListOfNullableTimestamps = value;

        return this;
    }

    private java.util.List<org.joda.time.DateTime> calculatedOneListOfNullableTimestamps;

    @JsonProperty("calculatedOneListOfNullableTimestamps")
    public java.util.List<org.joda.time.DateTime> getCalculatedOneListOfNullableTimestamps() {
        return this.calculatedOneListOfNullableTimestamps;
    }

    private java.util.List<org.joda.time.DateTime> persistedOneListOfNullableTimestamps;

    @JsonProperty("persistedOneListOfNullableTimestamps")
    public java.util.List<org.joda.time.DateTime> getPersistedOneListOfNullableTimestamps() {
        return this.persistedOneListOfNullableTimestamps;
    }
}