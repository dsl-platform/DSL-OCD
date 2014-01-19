package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableSetOfNullableMonies_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableSetOfNullableMonies_3() {
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
        final NullableSetOfNullableMonies_3 other = (NullableSetOfNullableMonies_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableSetOfNullableMonies_3(" + URI + ')'
                : "new NullableSetOfNullableMonies_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableSetOfNullableMonies_3(
            final java.util.Set<java.math.BigDecimal> nullableSetOfNullableMonies) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableSetOfNullableMonies(nullableSetOfNullableMonies);
    }

    @JsonCreator
    private NullableSetOfNullableMonies_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableSetOfNullableMonies") final java.util.Set<java.math.BigDecimal> nullableSetOfNullableMonies,
            @JsonProperty("calculatedNullableSetOfNullableMonies") final java.util.Set<java.math.BigDecimal> calculatedNullableSetOfNullableMonies,
            @JsonProperty("persistedNullableSetOfNullableMonies") final java.util.Set<java.math.BigDecimal> persistedNullableSetOfNullableMonies) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableSetOfNullableMonies = nullableSetOfNullableMonies;
        this.calculatedNullableSetOfNullableMonies = calculatedNullableSetOfNullableMonies == null
                ? new java.util.HashSet<java.math.BigDecimal>()
                : calculatedNullableSetOfNullableMonies;
        this.persistedNullableSetOfNullableMonies = persistedNullableSetOfNullableMonies == null
                ? new java.util.HashSet<java.math.BigDecimal>()
                : persistedNullableSetOfNullableMonies;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableSetOfNullableMonies_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableSetOfNullableMonies_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableSetOfNullableMonies_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableSetOfNullableMonies_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableMonies_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableMonies_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableSetOfNullableMonies_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableMonies_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableMonies_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableSetOfNullableMonies_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableMonies_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableSetOfNullableMonies_3.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableMonies_3> search(
            final Specification<NullableSetOfNullableMonies_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableMonies_3> search(
            final Specification<NullableSetOfNullableMonies_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableSetOfNullableMonies_3> search(
            final Specification<NullableSetOfNullableMonies_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableMonies_3> search(
            final Specification<NullableSetOfNullableMonies_3> specification,
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
                    .count(NullableSetOfNullableMonies_3.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableSetOfNullableMonies_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableSetOfNullableMonies_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableMonies_3 result) {
        this.URI = result.URI;

        this.nullableSetOfNullableMonies = result.nullableSetOfNullableMonies;
        this.calculatedNullableSetOfNullableMonies = result.calculatedNullableSetOfNullableMonies;
        this.persistedNullableSetOfNullableMonies = result.persistedNullableSetOfNullableMonies;
        this.ID = result.ID;
    }

    public NullableSetOfNullableMonies_3 persist() throws java.io.IOException {
        final NullableSetOfNullableMonies_3 result;
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

    public NullableSetOfNullableMonies_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableSetOfNullableMonies_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<java.math.BigDecimal> nullableSetOfNullableMonies;

    @JsonProperty("nullableSetOfNullableMonies")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfNullableMonies() {
        return nullableSetOfNullableMonies;
    }

    public NullableSetOfNullableMonies_3 setNullableSetOfNullableMonies(
            final java.util.Set<java.math.BigDecimal> value) {
        this.nullableSetOfNullableMonies = value;

        this.nullableSetOfNullableMonies = value == null
                ? null
                : com.dslplatform.ocd.calculation.Guards.setScale(
                        this.nullableSetOfNullableMonies, 2);
        return this;
    }

    private java.util.Set<java.math.BigDecimal> calculatedNullableSetOfNullableMonies;

    @JsonProperty("calculatedNullableSetOfNullableMonies")
    public java.util.Set<java.math.BigDecimal> getCalculatedNullableSetOfNullableMonies() {
        return this.calculatedNullableSetOfNullableMonies;
    }

    private java.util.Set<java.math.BigDecimal> persistedNullableSetOfNullableMonies;

    @JsonProperty("persistedNullableSetOfNullableMonies")
    public java.util.Set<java.math.BigDecimal> getPersistedNullableSetOfNullableMonies() {
        return this.persistedNullableSetOfNullableMonies;
    }
}
