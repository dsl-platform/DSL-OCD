package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableSetOfOneTimestamps_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableSetOfOneTimestamps_3() {
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
        final NullableSetOfOneTimestamps_3 other = (NullableSetOfOneTimestamps_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableSetOfOneTimestamps_3(" + URI + ')'
                : "new NullableSetOfOneTimestamps_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableSetOfOneTimestamps_3(
            final java.util.Set<org.joda.time.DateTime> nullableSetOfOneTimestamps) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableSetOfOneTimestamps(nullableSetOfOneTimestamps);
    }

    @JsonCreator
    private NullableSetOfOneTimestamps_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableSetOfOneTimestamps") final java.util.Set<org.joda.time.DateTime> nullableSetOfOneTimestamps,
            @JsonProperty("calculatedNullableSetOfOneTimestamps") final java.util.Set<org.joda.time.DateTime> calculatedNullableSetOfOneTimestamps,
            @JsonProperty("persistedNullableSetOfOneTimestamps") final java.util.Set<org.joda.time.DateTime> persistedNullableSetOfOneTimestamps) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableSetOfOneTimestamps = nullableSetOfOneTimestamps;
        this.calculatedNullableSetOfOneTimestamps = calculatedNullableSetOfOneTimestamps == null
                ? new java.util.HashSet<org.joda.time.DateTime>()
                : calculatedNullableSetOfOneTimestamps;
        this.persistedNullableSetOfOneTimestamps = persistedNullableSetOfOneTimestamps == null
                ? new java.util.HashSet<org.joda.time.DateTime>()
                : persistedNullableSetOfOneTimestamps;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableSetOfOneTimestamps_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableSetOfOneTimestamps_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableSetOfOneTimestamps_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableSetOfOneTimestamps_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfOneTimestamps_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneTimestamps_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableSetOfOneTimestamps_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfOneTimestamps_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneTimestamps_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableSetOfOneTimestamps_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneTimestamps_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableSetOfOneTimestamps_3.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfOneTimestamps_3> search(
            final Specification<NullableSetOfOneTimestamps_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneTimestamps_3> search(
            final Specification<NullableSetOfOneTimestamps_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableSetOfOneTimestamps_3> search(
            final Specification<NullableSetOfOneTimestamps_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneTimestamps_3> search(
            final Specification<NullableSetOfOneTimestamps_3> specification,
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
                    .count(NullableSetOfOneTimestamps_3.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableSetOfOneTimestamps_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableSetOfOneTimestamps_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneTimestamps_3 result) {
        this.URI = result.URI;

        this.nullableSetOfOneTimestamps = result.nullableSetOfOneTimestamps;
        this.calculatedNullableSetOfOneTimestamps = result.calculatedNullableSetOfOneTimestamps;
        this.persistedNullableSetOfOneTimestamps = result.persistedNullableSetOfOneTimestamps;
        this.ID = result.ID;
    }

    public NullableSetOfOneTimestamps_3 persist() throws java.io.IOException {
        final NullableSetOfOneTimestamps_3 result;
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

    public NullableSetOfOneTimestamps_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableSetOfOneTimestamps_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<org.joda.time.DateTime> nullableSetOfOneTimestamps;

    @JsonProperty("nullableSetOfOneTimestamps")
    public java.util.Set<org.joda.time.DateTime> getNullableSetOfOneTimestamps() {
        return nullableSetOfOneTimestamps;
    }

    public NullableSetOfOneTimestamps_3 setNullableSetOfOneTimestamps(
            final java.util.Set<org.joda.time.DateTime> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneTimestamps = value;

        return this;
    }

    private java.util.Set<org.joda.time.DateTime> calculatedNullableSetOfOneTimestamps;

    @JsonProperty("calculatedNullableSetOfOneTimestamps")
    public java.util.Set<org.joda.time.DateTime> getCalculatedNullableSetOfOneTimestamps() {
        return this.calculatedNullableSetOfOneTimestamps;
    }

    private java.util.Set<org.joda.time.DateTime> persistedNullableSetOfOneTimestamps;

    @JsonProperty("persistedNullableSetOfOneTimestamps")
    public java.util.Set<org.joda.time.DateTime> getPersistedNullableSetOfOneTimestamps() {
        return this.persistedNullableSetOfOneTimestamps;
    }
}
