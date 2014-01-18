package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableArrayOfOneDates_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableArrayOfOneDates_3() {
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
        final NullableArrayOfOneDates_3 other = (NullableArrayOfOneDates_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableArrayOfOneDates_3(" + URI + ')'
                : "new NullableArrayOfOneDates_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableArrayOfOneDates_3(
            final org.joda.time.LocalDate[] nullableArrayOfOneDates) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableArrayOfOneDates(nullableArrayOfOneDates);
    }

    @JsonCreator
    private NullableArrayOfOneDates_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableArrayOfOneDates") final org.joda.time.LocalDate[] nullableArrayOfOneDates,
            @JsonProperty("calculatedNullableArrayOfOneDates") final org.joda.time.LocalDate[] calculatedNullableArrayOfOneDates,
            @JsonProperty("persistedNullableArrayOfOneDates") final org.joda.time.LocalDate[] persistedNullableArrayOfOneDates) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableArrayOfOneDates = nullableArrayOfOneDates;
        this.calculatedNullableArrayOfOneDates = calculatedNullableArrayOfOneDates == null
                ? new org.joda.time.LocalDate[] {}
                : calculatedNullableArrayOfOneDates;
        this.persistedNullableArrayOfOneDates = persistedNullableArrayOfOneDates == null
                ? new org.joda.time.LocalDate[] {}
                : persistedNullableArrayOfOneDates;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableArrayOfOneDates_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableArrayOfOneDates_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableArrayOfOneDates_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableArrayOfOneDates_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfOneDates_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneDates_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableArrayOfOneDates_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfOneDates_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneDates_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableArrayOfOneDates_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneDates_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableArrayOfOneDates_3.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfOneDates_3> search(
            final Specification<NullableArrayOfOneDates_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneDates_3> search(
            final Specification<NullableArrayOfOneDates_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableArrayOfOneDates_3> search(
            final Specification<NullableArrayOfOneDates_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneDates_3> search(
            final Specification<NullableArrayOfOneDates_3> specification,
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
                    .count(NullableArrayOfOneDates_3.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableArrayOfOneDates_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableArrayOfOneDates_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneDates_3 result) {
        this.URI = result.URI;

        this.nullableArrayOfOneDates = result.nullableArrayOfOneDates;
        this.calculatedNullableArrayOfOneDates = result.calculatedNullableArrayOfOneDates;
        this.persistedNullableArrayOfOneDates = result.persistedNullableArrayOfOneDates;
        this.ID = result.ID;
    }

    public NullableArrayOfOneDates_3 persist() throws java.io.IOException {
        final NullableArrayOfOneDates_3 result;
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

    public NullableArrayOfOneDates_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableArrayOfOneDates_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private org.joda.time.LocalDate[] nullableArrayOfOneDates;

    @JsonProperty("nullableArrayOfOneDates")
    public org.joda.time.LocalDate[] getNullableArrayOfOneDates() {
        return nullableArrayOfOneDates;
    }

    public NullableArrayOfOneDates_3 setNullableArrayOfOneDates(
            final org.joda.time.LocalDate[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneDates = value;

        return this;
    }

    private org.joda.time.LocalDate[] calculatedNullableArrayOfOneDates;

    @JsonProperty("calculatedNullableArrayOfOneDates")
    public org.joda.time.LocalDate[] getCalculatedNullableArrayOfOneDates() {
        return this.calculatedNullableArrayOfOneDates;
    }

    private org.joda.time.LocalDate[] persistedNullableArrayOfOneDates;

    @JsonProperty("persistedNullableArrayOfOneDates")
    public org.joda.time.LocalDate[] getPersistedNullableArrayOfOneDates() {
        return this.persistedNullableArrayOfOneDates;
    }
}
