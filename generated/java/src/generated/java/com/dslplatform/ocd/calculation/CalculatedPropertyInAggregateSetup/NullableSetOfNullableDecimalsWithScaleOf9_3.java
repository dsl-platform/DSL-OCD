package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableSetOfNullableDecimalsWithScaleOf9_3 implements
        java.io.Serializable, AggregateRoot {
    public NullableSetOfNullableDecimalsWithScaleOf9_3() {
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
        final NullableSetOfNullableDecimalsWithScaleOf9_3 other = (NullableSetOfNullableDecimalsWithScaleOf9_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableSetOfNullableDecimalsWithScaleOf9_3(" + URI + ')'
                : "new NullableSetOfNullableDecimalsWithScaleOf9_3("
                        + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableSetOfNullableDecimalsWithScaleOf9_3(
            final java.util.Set<java.math.BigDecimal> nullableSetOfNullableDecimalsWithScaleOf9) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableSetOfNullableDecimalsWithScaleOf9(nullableSetOfNullableDecimalsWithScaleOf9);
    }

    @JsonCreator
    private NullableSetOfNullableDecimalsWithScaleOf9_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableSetOfNullableDecimalsWithScaleOf9") final java.util.Set<java.math.BigDecimal> nullableSetOfNullableDecimalsWithScaleOf9,
            @JsonProperty("calculatedNullableSetOfNullableDecimalsWithScaleOf9") final java.util.Set<java.math.BigDecimal> calculatedNullableSetOfNullableDecimalsWithScaleOf9,
            @JsonProperty("persistedNullableSetOfNullableDecimalsWithScaleOf9") final java.util.Set<java.math.BigDecimal> persistedNullableSetOfNullableDecimalsWithScaleOf9) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableSetOfNullableDecimalsWithScaleOf9 = nullableSetOfNullableDecimalsWithScaleOf9;
        this.calculatedNullableSetOfNullableDecimalsWithScaleOf9 = calculatedNullableSetOfNullableDecimalsWithScaleOf9 == null
                ? new java.util.HashSet<java.math.BigDecimal>()
                : calculatedNullableSetOfNullableDecimalsWithScaleOf9;
        this.persistedNullableSetOfNullableDecimalsWithScaleOf9 = persistedNullableSetOfNullableDecimalsWithScaleOf9 == null
                ? new java.util.HashSet<java.math.BigDecimal>()
                : persistedNullableSetOfNullableDecimalsWithScaleOf9;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableSetOfNullableDecimalsWithScaleOf9_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableSetOfNullableDecimalsWithScaleOf9_3 find(
            final String uri) throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableSetOfNullableDecimalsWithScaleOf9_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableSetOfNullableDecimalsWithScaleOf9_3.class,
                            uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableDecimalsWithScaleOf9_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableDecimalsWithScaleOf9_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableSetOfNullableDecimalsWithScaleOf9_3.class,
                            uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableDecimalsWithScaleOf9_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableDecimalsWithScaleOf9_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableSetOfNullableDecimalsWithScaleOf9_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableDecimalsWithScaleOf9_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableSetOfNullableDecimalsWithScaleOf9_3.class,
                            limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfNullableDecimalsWithScaleOf9_3> search(
            final Specification<NullableSetOfNullableDecimalsWithScaleOf9_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableDecimalsWithScaleOf9_3> search(
            final Specification<NullableSetOfNullableDecimalsWithScaleOf9_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableSetOfNullableDecimalsWithScaleOf9_3> search(
            final Specification<NullableSetOfNullableDecimalsWithScaleOf9_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfNullableDecimalsWithScaleOf9_3> search(
            final Specification<NullableSetOfNullableDecimalsWithScaleOf9_3> specification,
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
                    .count(NullableSetOfNullableDecimalsWithScaleOf9_3.class)
                    .get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableSetOfNullableDecimalsWithScaleOf9_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableSetOfNullableDecimalsWithScaleOf9_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableDecimalsWithScaleOf9_3 result) {
        this.URI = result.URI;

        this.nullableSetOfNullableDecimalsWithScaleOf9 = result.nullableSetOfNullableDecimalsWithScaleOf9;
        this.calculatedNullableSetOfNullableDecimalsWithScaleOf9 = result.calculatedNullableSetOfNullableDecimalsWithScaleOf9;
        this.persistedNullableSetOfNullableDecimalsWithScaleOf9 = result.persistedNullableSetOfNullableDecimalsWithScaleOf9;
        this.ID = result.ID;
    }

    public NullableSetOfNullableDecimalsWithScaleOf9_3 persist()
            throws java.io.IOException {
        final NullableSetOfNullableDecimalsWithScaleOf9_3 result;
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

    public NullableSetOfNullableDecimalsWithScaleOf9_3 delete()
            throws java.io.IOException {
        try {
            return _crudProxy.delete(
                    NullableSetOfNullableDecimalsWithScaleOf9_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<java.math.BigDecimal> nullableSetOfNullableDecimalsWithScaleOf9;

    @JsonProperty("nullableSetOfNullableDecimalsWithScaleOf9")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfNullableDecimalsWithScaleOf9() {
        return nullableSetOfNullableDecimalsWithScaleOf9;
    }

    public NullableSetOfNullableDecimalsWithScaleOf9_3 setNullableSetOfNullableDecimalsWithScaleOf9(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.nullableSetOfNullableDecimalsWithScaleOf9 = value;

        return this;
    }

    private java.util.Set<java.math.BigDecimal> calculatedNullableSetOfNullableDecimalsWithScaleOf9;

    @JsonProperty("calculatedNullableSetOfNullableDecimalsWithScaleOf9")
    public java.util.Set<java.math.BigDecimal> getCalculatedNullableSetOfNullableDecimalsWithScaleOf9() {
        return this.calculatedNullableSetOfNullableDecimalsWithScaleOf9;
    }

    private java.util.Set<java.math.BigDecimal> persistedNullableSetOfNullableDecimalsWithScaleOf9;

    @JsonProperty("persistedNullableSetOfNullableDecimalsWithScaleOf9")
    public java.util.Set<java.math.BigDecimal> getPersistedNullableSetOfNullableDecimalsWithScaleOf9() {
        return this.persistedNullableSetOfNullableDecimalsWithScaleOf9;
    }
}
