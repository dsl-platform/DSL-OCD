package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableSetOfOneIntegers_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableSetOfOneIntegers_3() {
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
        final NullableSetOfOneIntegers_3 other = (NullableSetOfOneIntegers_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableSetOfOneIntegers_3(" + URI + ')'
                : "new NullableSetOfOneIntegers_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableSetOfOneIntegers_3(
            final java.util.Set<Integer> nullableSetOfOneIntegers) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableSetOfOneIntegers(nullableSetOfOneIntegers);
    }

    @JsonCreator
    private NullableSetOfOneIntegers_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableSetOfOneIntegers") final java.util.Set<Integer> nullableSetOfOneIntegers,
            @JsonProperty("calculatedNullableSetOfOneIntegers") final java.util.Set<Integer> calculatedNullableSetOfOneIntegers,
            @JsonProperty("persistedNullableSetOfOneIntegers") final java.util.Set<Integer> persistedNullableSetOfOneIntegers) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableSetOfOneIntegers = nullableSetOfOneIntegers;
        this.calculatedNullableSetOfOneIntegers = calculatedNullableSetOfOneIntegers == null
                ? new java.util.HashSet<Integer>()
                : calculatedNullableSetOfOneIntegers;
        this.persistedNullableSetOfOneIntegers = persistedNullableSetOfOneIntegers == null
                ? new java.util.HashSet<Integer>()
                : persistedNullableSetOfOneIntegers;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableSetOfOneIntegers_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableSetOfOneIntegers_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableSetOfOneIntegers_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableSetOfOneIntegers_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfOneIntegers_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneIntegers_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableSetOfOneIntegers_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfOneIntegers_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneIntegers_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableSetOfOneIntegers_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneIntegers_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableSetOfOneIntegers_3.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfOneIntegers_3> search(
            final Specification<NullableSetOfOneIntegers_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneIntegers_3> search(
            final Specification<NullableSetOfOneIntegers_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableSetOfOneIntegers_3> search(
            final Specification<NullableSetOfOneIntegers_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneIntegers_3> search(
            final Specification<NullableSetOfOneIntegers_3> specification,
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
                    .count(NullableSetOfOneIntegers_3.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableSetOfOneIntegers_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableSetOfOneIntegers_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneIntegers_3 result) {
        this.URI = result.URI;

        this.nullableSetOfOneIntegers = result.nullableSetOfOneIntegers;
        this.calculatedNullableSetOfOneIntegers = result.calculatedNullableSetOfOneIntegers;
        this.persistedNullableSetOfOneIntegers = result.persistedNullableSetOfOneIntegers;
        this.ID = result.ID;
    }

    public NullableSetOfOneIntegers_3 persist() throws java.io.IOException {
        final NullableSetOfOneIntegers_3 result;
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

    public NullableSetOfOneIntegers_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableSetOfOneIntegers_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<Integer> nullableSetOfOneIntegers;

    @JsonProperty("nullableSetOfOneIntegers")
    public java.util.Set<Integer> getNullableSetOfOneIntegers() {
        return nullableSetOfOneIntegers;
    }

    public NullableSetOfOneIntegers_3 setNullableSetOfOneIntegers(
            final java.util.Set<Integer> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneIntegers = value;

        return this;
    }

    private java.util.Set<Integer> calculatedNullableSetOfOneIntegers;

    @JsonProperty("calculatedNullableSetOfOneIntegers")
    public java.util.Set<Integer> getCalculatedNullableSetOfOneIntegers() {
        return this.calculatedNullableSetOfOneIntegers;
    }

    private java.util.Set<Integer> persistedNullableSetOfOneIntegers;

    @JsonProperty("persistedNullableSetOfOneIntegers")
    public java.util.Set<Integer> getPersistedNullableSetOfOneIntegers() {
        return this.persistedNullableSetOfOneIntegers;
    }
}
