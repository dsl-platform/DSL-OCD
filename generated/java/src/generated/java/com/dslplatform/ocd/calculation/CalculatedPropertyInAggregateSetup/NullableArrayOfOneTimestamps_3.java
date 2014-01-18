package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableArrayOfOneTimestamps_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableArrayOfOneTimestamps_3() {
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
        final NullableArrayOfOneTimestamps_3 other = (NullableArrayOfOneTimestamps_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableArrayOfOneTimestamps_3(" + URI + ')'
                : "new NullableArrayOfOneTimestamps_3(" + super.hashCode()
                        + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableArrayOfOneTimestamps_3(
            final org.joda.time.DateTime[] nullableArrayOfOneTimestamps) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableArrayOfOneTimestamps(nullableArrayOfOneTimestamps);
    }

    @JsonCreator
    private NullableArrayOfOneTimestamps_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableArrayOfOneTimestamps") final org.joda.time.DateTime[] nullableArrayOfOneTimestamps,
            @JsonProperty("calculatedNullableArrayOfOneTimestamps") final org.joda.time.DateTime[] calculatedNullableArrayOfOneTimestamps,
            @JsonProperty("persistedNullableArrayOfOneTimestamps") final org.joda.time.DateTime[] persistedNullableArrayOfOneTimestamps) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableArrayOfOneTimestamps = nullableArrayOfOneTimestamps;
        this.calculatedNullableArrayOfOneTimestamps = calculatedNullableArrayOfOneTimestamps == null
                ? new org.joda.time.DateTime[] {}
                : calculatedNullableArrayOfOneTimestamps;
        this.persistedNullableArrayOfOneTimestamps = persistedNullableArrayOfOneTimestamps == null
                ? new org.joda.time.DateTime[] {}
                : persistedNullableArrayOfOneTimestamps;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableArrayOfOneTimestamps_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableArrayOfOneTimestamps_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableArrayOfOneTimestamps_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableArrayOfOneTimestamps_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfOneTimestamps_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneTimestamps_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableArrayOfOneTimestamps_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfOneTimestamps_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneTimestamps_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableArrayOfOneTimestamps_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneTimestamps_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableArrayOfOneTimestamps_3.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfOneTimestamps_3> search(
            final Specification<NullableArrayOfOneTimestamps_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneTimestamps_3> search(
            final Specification<NullableArrayOfOneTimestamps_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableArrayOfOneTimestamps_3> search(
            final Specification<NullableArrayOfOneTimestamps_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneTimestamps_3> search(
            final Specification<NullableArrayOfOneTimestamps_3> specification,
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
                    .count(NullableArrayOfOneTimestamps_3.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableArrayOfOneTimestamps_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableArrayOfOneTimestamps_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneTimestamps_3 result) {
        this.URI = result.URI;

        this.nullableArrayOfOneTimestamps = result.nullableArrayOfOneTimestamps;
        this.calculatedNullableArrayOfOneTimestamps = result.calculatedNullableArrayOfOneTimestamps;
        this.persistedNullableArrayOfOneTimestamps = result.persistedNullableArrayOfOneTimestamps;
        this.ID = result.ID;
    }

    public NullableArrayOfOneTimestamps_3 persist() throws java.io.IOException {
        final NullableArrayOfOneTimestamps_3 result;
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

    public NullableArrayOfOneTimestamps_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableArrayOfOneTimestamps_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private org.joda.time.DateTime[] nullableArrayOfOneTimestamps;

    @JsonProperty("nullableArrayOfOneTimestamps")
    public org.joda.time.DateTime[] getNullableArrayOfOneTimestamps() {
        return nullableArrayOfOneTimestamps;
    }

    public NullableArrayOfOneTimestamps_3 setNullableArrayOfOneTimestamps(
            final org.joda.time.DateTime[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneTimestamps = value;

        return this;
    }

    private org.joda.time.DateTime[] calculatedNullableArrayOfOneTimestamps;

    @JsonProperty("calculatedNullableArrayOfOneTimestamps")
    public org.joda.time.DateTime[] getCalculatedNullableArrayOfOneTimestamps() {
        return this.calculatedNullableArrayOfOneTimestamps;
    }

    private org.joda.time.DateTime[] persistedNullableArrayOfOneTimestamps;

    @JsonProperty("persistedNullableArrayOfOneTimestamps")
    public org.joda.time.DateTime[] getPersistedNullableArrayOfOneTimestamps() {
        return this.persistedNullableArrayOfOneTimestamps;
    }
}
