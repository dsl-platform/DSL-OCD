package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableSetOfNullableStringsWithMaxLengthOf9_5 implements
        java.io.Serializable, AggregateRoot {
    public NullableSetOfNullableStringsWithMaxLengthOf9_5() {
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
        final NullableSetOfNullableStringsWithMaxLengthOf9_5 other = (NullableSetOfNullableStringsWithMaxLengthOf9_5) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableSetOfNullableStringsWithMaxLengthOf9_5(" + URI + ')'
                : "new NullableSetOfNullableStringsWithMaxLengthOf9_5("
                        + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableSetOfNullableStringsWithMaxLengthOf9_5(
            final java.util.Set<String> nullableSetOfNullableStringsWithMaxLengthOf9) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableSetOfNullableStringsWithMaxLengthOf9(nullableSetOfNullableStringsWithMaxLengthOf9);
    }

    @JsonCreator
    private NullableSetOfNullableStringsWithMaxLengthOf9_5(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableSetOfNullableStringsWithMaxLengthOf9") final java.util.Set<String> nullableSetOfNullableStringsWithMaxLengthOf9) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableSetOfNullableStringsWithMaxLengthOf9 = nullableSetOfNullableStringsWithMaxLengthOf9;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableSetOfNullableStringsWithMaxLengthOf9_5 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableSetOfNullableStringsWithMaxLengthOf9_5 find(
            final String uri) throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableSetOfNullableStringsWithMaxLengthOf9_5 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableSetOfNullableStringsWithMaxLengthOf9_5.class,
                            uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableStringsWithMaxLengthOf9_5> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableStringsWithMaxLengthOf9_5> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableSetOfNullableStringsWithMaxLengthOf9_5.class,
                            uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableStringsWithMaxLengthOf9_5> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableStringsWithMaxLengthOf9_5> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableSetOfNullableStringsWithMaxLengthOf9_5> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableStringsWithMaxLengthOf9_5> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(
                            NullableSetOfNullableStringsWithMaxLengthOf9_5.class,
                            limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableStringsWithMaxLengthOf9_5> search(
            final Specification<NullableSetOfNullableStringsWithMaxLengthOf9_5> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableStringsWithMaxLengthOf9_5> search(
            final Specification<NullableSetOfNullableStringsWithMaxLengthOf9_5> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableSetOfNullableStringsWithMaxLengthOf9_5> search(
            final Specification<NullableSetOfNullableStringsWithMaxLengthOf9_5> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableStringsWithMaxLengthOf9_5> search(
            final Specification<NullableSetOfNullableStringsWithMaxLengthOf9_5> specification,
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
                    .count(NullableSetOfNullableStringsWithMaxLengthOf9_5.class)
                    .get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableSetOfNullableStringsWithMaxLengthOf9_5> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableSetOfNullableStringsWithMaxLengthOf9_5> specification,
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
            final com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableStringsWithMaxLengthOf9_5 result) {
        this.URI = result.URI;

        this.nullableSetOfNullableStringsWithMaxLengthOf9 = result.nullableSetOfNullableStringsWithMaxLengthOf9;
        this.ID = result.ID;
    }

    public NullableSetOfNullableStringsWithMaxLengthOf9_5 persist()
            throws java.io.IOException {
        final NullableSetOfNullableStringsWithMaxLengthOf9_5 result;
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

    public NullableSetOfNullableStringsWithMaxLengthOf9_5 delete()
            throws java.io.IOException {
        try {
            return _crudProxy.delete(
                    NullableSetOfNullableStringsWithMaxLengthOf9_5.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<String> nullableSetOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("nullableSetOfNullableStringsWithMaxLengthOf9")
    public java.util.Set<String> getNullableSetOfNullableStringsWithMaxLengthOf9() {
        return nullableSetOfNullableStringsWithMaxLengthOf9;
    }

    public NullableSetOfNullableStringsWithMaxLengthOf9_5 setNullableSetOfNullableStringsWithMaxLengthOf9(
            final java.util.Set<String> value) {
        if (value != null)
            com.dslplatform.ocd.snowflake.Guards.checkLength(value, 9);
        this.nullableSetOfNullableStringsWithMaxLengthOf9 = value;

        return this;
    }
}
