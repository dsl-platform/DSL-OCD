package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableListOfNullableDecimalsWithScaleOf9_3 implements
        java.io.Serializable, AggregateRoot {
    public NullableListOfNullableDecimalsWithScaleOf9_3() {
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
        final NullableListOfNullableDecimalsWithScaleOf9_3 other = (NullableListOfNullableDecimalsWithScaleOf9_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableListOfNullableDecimalsWithScaleOf9_3(" + URI + ')'
                : "new NullableListOfNullableDecimalsWithScaleOf9_3("
                        + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableListOfNullableDecimalsWithScaleOf9_3(
            final java.util.List<java.math.BigDecimal> nullableListOfNullableDecimalsWithScaleOf9) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableListOfNullableDecimalsWithScaleOf9(nullableListOfNullableDecimalsWithScaleOf9);
    }

    @JsonCreator
    private NullableListOfNullableDecimalsWithScaleOf9_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableListOfNullableDecimalsWithScaleOf9") final java.util.List<java.math.BigDecimal> nullableListOfNullableDecimalsWithScaleOf9,
            @JsonProperty("calculatedNullableListOfNullableDecimalsWithScaleOf9") final java.util.List<java.math.BigDecimal> calculatedNullableListOfNullableDecimalsWithScaleOf9,
            @JsonProperty("persistedNullableListOfNullableDecimalsWithScaleOf9") final java.util.List<java.math.BigDecimal> persistedNullableListOfNullableDecimalsWithScaleOf9) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableListOfNullableDecimalsWithScaleOf9 = nullableListOfNullableDecimalsWithScaleOf9;
        this.calculatedNullableListOfNullableDecimalsWithScaleOf9 = calculatedNullableListOfNullableDecimalsWithScaleOf9 == null
                ? new java.util.ArrayList<java.math.BigDecimal>()
                : calculatedNullableListOfNullableDecimalsWithScaleOf9;
        this.persistedNullableListOfNullableDecimalsWithScaleOf9 = persistedNullableListOfNullableDecimalsWithScaleOf9 == null
                ? new java.util.ArrayList<java.math.BigDecimal>()
                : persistedNullableListOfNullableDecimalsWithScaleOf9;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableListOfNullableDecimalsWithScaleOf9_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableListOfNullableDecimalsWithScaleOf9_3 find(
            final String uri) throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableListOfNullableDecimalsWithScaleOf9_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableListOfNullableDecimalsWithScaleOf9_3.class,
                            uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableListOfNullableDecimalsWithScaleOf9_3.class,
                            uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(
                            NullableListOfNullableDecimalsWithScaleOf9_3.class,
                            limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_3> search(
            final Specification<NullableListOfNullableDecimalsWithScaleOf9_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_3> search(
            final Specification<NullableListOfNullableDecimalsWithScaleOf9_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_3> search(
            final Specification<NullableListOfNullableDecimalsWithScaleOf9_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_3> search(
            final Specification<NullableListOfNullableDecimalsWithScaleOf9_3> specification,
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
                    .count(NullableListOfNullableDecimalsWithScaleOf9_3.class)
                    .get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableListOfNullableDecimalsWithScaleOf9_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableListOfNullableDecimalsWithScaleOf9_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableDecimalsWithScaleOf9_3 result) {
        this.URI = result.URI;

        this.nullableListOfNullableDecimalsWithScaleOf9 = result.nullableListOfNullableDecimalsWithScaleOf9;
        this.calculatedNullableListOfNullableDecimalsWithScaleOf9 = result.calculatedNullableListOfNullableDecimalsWithScaleOf9;
        this.persistedNullableListOfNullableDecimalsWithScaleOf9 = result.persistedNullableListOfNullableDecimalsWithScaleOf9;
        this.ID = result.ID;
    }

    public NullableListOfNullableDecimalsWithScaleOf9_3 persist()
            throws java.io.IOException {
        final NullableListOfNullableDecimalsWithScaleOf9_3 result;
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

    public NullableListOfNullableDecimalsWithScaleOf9_3 delete()
            throws java.io.IOException {
        try {
            return _crudProxy.delete(
                    NullableListOfNullableDecimalsWithScaleOf9_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<java.math.BigDecimal> nullableListOfNullableDecimalsWithScaleOf9;

    @JsonProperty("nullableListOfNullableDecimalsWithScaleOf9")
    public java.util.List<java.math.BigDecimal> getNullableListOfNullableDecimalsWithScaleOf9() {
        return nullableListOfNullableDecimalsWithScaleOf9;
    }

    public NullableListOfNullableDecimalsWithScaleOf9_3 setNullableListOfNullableDecimalsWithScaleOf9(
            final java.util.List<java.math.BigDecimal> value) {
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.nullableListOfNullableDecimalsWithScaleOf9 = value;

        return this;
    }

    private java.util.List<java.math.BigDecimal> calculatedNullableListOfNullableDecimalsWithScaleOf9;

    @JsonProperty("calculatedNullableListOfNullableDecimalsWithScaleOf9")
    public java.util.List<java.math.BigDecimal> getCalculatedNullableListOfNullableDecimalsWithScaleOf9() {
        return this.calculatedNullableListOfNullableDecimalsWithScaleOf9;
    }

    private java.util.List<java.math.BigDecimal> persistedNullableListOfNullableDecimalsWithScaleOf9;

    @JsonProperty("persistedNullableListOfNullableDecimalsWithScaleOf9")
    public java.util.List<java.math.BigDecimal> getPersistedNullableListOfNullableDecimalsWithScaleOf9() {
        return this.persistedNullableListOfNullableDecimalsWithScaleOf9;
    }
}
