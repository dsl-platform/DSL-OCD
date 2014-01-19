package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableListOfOneBinaries_5 implements java.io.Serializable,
        AggregateRoot {
    public NullableListOfOneBinaries_5() {
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
        final NullableListOfOneBinaries_5 other = (NullableListOfOneBinaries_5) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableListOfOneBinaries_5(" + URI + ')'
                : "new NullableListOfOneBinaries_5(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableListOfOneBinaries_5(
            final java.util.List<byte[]> nullableListOfOneBinaries) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableListOfOneBinaries(nullableListOfOneBinaries);
    }

    @JsonCreator
    private NullableListOfOneBinaries_5(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableListOfOneBinaries") final java.util.List<byte[]> nullableListOfOneBinaries) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableListOfOneBinaries = nullableListOfOneBinaries;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableListOfOneBinaries_5 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableListOfOneBinaries_5 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableListOfOneBinaries_5 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableListOfOneBinaries_5.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfOneBinaries_5> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfOneBinaries_5> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableListOfOneBinaries_5.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfOneBinaries_5> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfOneBinaries_5> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableListOfOneBinaries_5> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfOneBinaries_5> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableListOfOneBinaries_5.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfOneBinaries_5> search(
            final Specification<NullableListOfOneBinaries_5> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfOneBinaries_5> search(
            final Specification<NullableListOfOneBinaries_5> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableListOfOneBinaries_5> search(
            final Specification<NullableListOfOneBinaries_5> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfOneBinaries_5> search(
            final Specification<NullableListOfOneBinaries_5> specification,
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
                    .count(NullableListOfOneBinaries_5.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableListOfOneBinaries_5> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableListOfOneBinaries_5> specification,
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
            final com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneBinaries_5 result) {
        this.URI = result.URI;

        this.nullableListOfOneBinaries = result.nullableListOfOneBinaries;
        this.ID = result.ID;
    }

    public NullableListOfOneBinaries_5 persist() throws java.io.IOException {
        final NullableListOfOneBinaries_5 result;
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

    public NullableListOfOneBinaries_5 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableListOfOneBinaries_5.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<byte[]> nullableListOfOneBinaries;

    @JsonProperty("nullableListOfOneBinaries")
    public java.util.List<byte[]> getNullableListOfOneBinaries() {
        return nullableListOfOneBinaries;
    }

    public NullableListOfOneBinaries_5 setNullableListOfOneBinaries(
            final java.util.List<byte[]> value) {
        com.dslplatform.ocd.snowflake.Guards.checkNulls(value);
        this.nullableListOfOneBinaries = value;

        return this;
    }
}
