package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfNullableTimestamps_4 implements java.io.Serializable,
        AggregateRoot {
    public OneSetOfNullableTimestamps_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfNullableTimestamps = new java.util.HashSet<org.joda.time.DateTime>();
        this.calculatedOneSetOfNullableTimestamps = new java.util.HashSet<org.joda.time.DateTime>();
        this.persistedOneSetOfNullableTimestamps = new java.util.HashSet<org.joda.time.DateTime>();
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
        final OneSetOfNullableTimestamps_4 other = (OneSetOfNullableTimestamps_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfNullableTimestamps_4(" + URI + ')'
                : "new OneSetOfNullableTimestamps_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfNullableTimestamps_4(
            final java.util.Set<org.joda.time.DateTime> oneSetOfNullableTimestamps) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfNullableTimestamps(oneSetOfNullableTimestamps);
    }

    @JsonCreator
    private OneSetOfNullableTimestamps_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfNullableTimestamps") final java.util.Set<org.joda.time.DateTime> oneSetOfNullableTimestamps,
            @JsonProperty("calculatedOneSetOfNullableTimestamps") final java.util.Set<org.joda.time.DateTime> calculatedOneSetOfNullableTimestamps,
            @JsonProperty("persistedOneSetOfNullableTimestamps") final java.util.Set<org.joda.time.DateTime> persistedOneSetOfNullableTimestamps) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfNullableTimestamps = oneSetOfNullableTimestamps == null
                ? new java.util.HashSet<org.joda.time.DateTime>()
                : oneSetOfNullableTimestamps;
        this.calculatedOneSetOfNullableTimestamps = calculatedOneSetOfNullableTimestamps;
        this.persistedOneSetOfNullableTimestamps = persistedOneSetOfNullableTimestamps;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfNullableTimestamps_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfNullableTimestamps_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfNullableTimestamps_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfNullableTimestamps_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableTimestamps_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableTimestamps_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfNullableTimestamps_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableTimestamps_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableTimestamps_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfNullableTimestamps_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableTimestamps_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfNullableTimestamps_4.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableTimestamps_4> search(
            final Specification<OneSetOfNullableTimestamps_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableTimestamps_4> search(
            final Specification<OneSetOfNullableTimestamps_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfNullableTimestamps_4> search(
            final Specification<OneSetOfNullableTimestamps_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableTimestamps_4> search(
            final Specification<OneSetOfNullableTimestamps_4> specification,
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
                    .count(OneSetOfNullableTimestamps_4.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfNullableTimestamps_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfNullableTimestamps_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableTimestamps_4 result) {
        this.URI = result.URI;

        this.oneSetOfNullableTimestamps = result.oneSetOfNullableTimestamps;
        this.calculatedOneSetOfNullableTimestamps = result.calculatedOneSetOfNullableTimestamps;
        this.persistedOneSetOfNullableTimestamps = result.persistedOneSetOfNullableTimestamps;
        this.ID = result.ID;
    }

    public OneSetOfNullableTimestamps_4 persist() throws java.io.IOException {
        final OneSetOfNullableTimestamps_4 result;
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

    public OneSetOfNullableTimestamps_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfNullableTimestamps_4.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<org.joda.time.DateTime> oneSetOfNullableTimestamps;

    @JsonProperty("oneSetOfNullableTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.joda.time.DateTime> getOneSetOfNullableTimestamps() {
        return oneSetOfNullableTimestamps;
    }

    public OneSetOfNullableTimestamps_4 setOneSetOfNullableTimestamps(
            final java.util.Set<org.joda.time.DateTime> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableTimestamps\" cannot be null!");
        this.oneSetOfNullableTimestamps = value;

        return this;
    }

    private java.util.Set<org.joda.time.DateTime> calculatedOneSetOfNullableTimestamps;

    @JsonProperty("calculatedOneSetOfNullableTimestamps")
    public java.util.Set<org.joda.time.DateTime> getCalculatedOneSetOfNullableTimestamps() {
        return this.calculatedOneSetOfNullableTimestamps;
    }

    private java.util.Set<org.joda.time.DateTime> persistedOneSetOfNullableTimestamps;

    @JsonProperty("persistedOneSetOfNullableTimestamps")
    public java.util.Set<org.joda.time.DateTime> getPersistedOneSetOfNullableTimestamps() {
        return this.persistedOneSetOfNullableTimestamps;
    }
}
