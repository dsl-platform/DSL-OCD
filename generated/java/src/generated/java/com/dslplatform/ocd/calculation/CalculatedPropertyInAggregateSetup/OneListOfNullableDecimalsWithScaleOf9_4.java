package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneListOfNullableDecimalsWithScaleOf9_4 implements
        java.io.Serializable, AggregateRoot {
    public OneListOfNullableDecimalsWithScaleOf9_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneListOfNullableDecimalsWithScaleOf9 = new java.util.ArrayList<java.math.BigDecimal>();
        this.calculatedOneListOfNullableDecimalsWithScaleOf9 = new java.util.ArrayList<java.math.BigDecimal>();
        this.persistedOneListOfNullableDecimalsWithScaleOf9 = new java.util.ArrayList<java.math.BigDecimal>();
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
        final OneListOfNullableDecimalsWithScaleOf9_4 other = (OneListOfNullableDecimalsWithScaleOf9_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null ? "OneListOfNullableDecimalsWithScaleOf9_4(" + URI
                + ')' : "new OneListOfNullableDecimalsWithScaleOf9_4("
                + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneListOfNullableDecimalsWithScaleOf9_4(
            final java.util.List<java.math.BigDecimal> oneListOfNullableDecimalsWithScaleOf9) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneListOfNullableDecimalsWithScaleOf9(oneListOfNullableDecimalsWithScaleOf9);
    }

    @JsonCreator
    private OneListOfNullableDecimalsWithScaleOf9_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneListOfNullableDecimalsWithScaleOf9") final java.util.List<java.math.BigDecimal> oneListOfNullableDecimalsWithScaleOf9,
            @JsonProperty("calculatedOneListOfNullableDecimalsWithScaleOf9") final java.util.List<java.math.BigDecimal> calculatedOneListOfNullableDecimalsWithScaleOf9,
            @JsonProperty("persistedOneListOfNullableDecimalsWithScaleOf9") final java.util.List<java.math.BigDecimal> persistedOneListOfNullableDecimalsWithScaleOf9) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneListOfNullableDecimalsWithScaleOf9 = oneListOfNullableDecimalsWithScaleOf9 == null
                ? new java.util.ArrayList<java.math.BigDecimal>()
                : oneListOfNullableDecimalsWithScaleOf9;
        this.calculatedOneListOfNullableDecimalsWithScaleOf9 = calculatedOneListOfNullableDecimalsWithScaleOf9;
        this.persistedOneListOfNullableDecimalsWithScaleOf9 = persistedOneListOfNullableDecimalsWithScaleOf9;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneListOfNullableDecimalsWithScaleOf9_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneListOfNullableDecimalsWithScaleOf9_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneListOfNullableDecimalsWithScaleOf9_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfNullableDecimalsWithScaleOf9_4.class, uri)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableDecimalsWithScaleOf9_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableDecimalsWithScaleOf9_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfNullableDecimalsWithScaleOf9_4.class, uris)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableDecimalsWithScaleOf9_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableDecimalsWithScaleOf9_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfNullableDecimalsWithScaleOf9_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableDecimalsWithScaleOf9_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfNullableDecimalsWithScaleOf9_4.class,
                            limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableDecimalsWithScaleOf9_4> search(
            final Specification<OneListOfNullableDecimalsWithScaleOf9_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableDecimalsWithScaleOf9_4> search(
            final Specification<OneListOfNullableDecimalsWithScaleOf9_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfNullableDecimalsWithScaleOf9_4> search(
            final Specification<OneListOfNullableDecimalsWithScaleOf9_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableDecimalsWithScaleOf9_4> search(
            final Specification<OneListOfNullableDecimalsWithScaleOf9_4> specification,
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
                    .count(OneListOfNullableDecimalsWithScaleOf9_4.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfNullableDecimalsWithScaleOf9_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfNullableDecimalsWithScaleOf9_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableDecimalsWithScaleOf9_4 result) {
        this.URI = result.URI;

        this.oneListOfNullableDecimalsWithScaleOf9 = result.oneListOfNullableDecimalsWithScaleOf9;
        this.calculatedOneListOfNullableDecimalsWithScaleOf9 = result.calculatedOneListOfNullableDecimalsWithScaleOf9;
        this.persistedOneListOfNullableDecimalsWithScaleOf9 = result.persistedOneListOfNullableDecimalsWithScaleOf9;
        this.ID = result.ID;
    }

    public OneListOfNullableDecimalsWithScaleOf9_4 persist()
            throws java.io.IOException {
        final OneListOfNullableDecimalsWithScaleOf9_4 result;
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

    public OneListOfNullableDecimalsWithScaleOf9_4 delete()
            throws java.io.IOException {
        try {
            return _crudProxy.delete(
                    OneListOfNullableDecimalsWithScaleOf9_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<java.math.BigDecimal> oneListOfNullableDecimalsWithScaleOf9;

    @JsonProperty("oneListOfNullableDecimalsWithScaleOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.math.BigDecimal> getOneListOfNullableDecimalsWithScaleOf9() {
        return oneListOfNullableDecimalsWithScaleOf9;
    }

    public OneListOfNullableDecimalsWithScaleOf9_4 setOneListOfNullableDecimalsWithScaleOf9(
            final java.util.List<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableDecimalsWithScaleOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.oneListOfNullableDecimalsWithScaleOf9 = value;

        return this;
    }

    private java.util.List<java.math.BigDecimal> calculatedOneListOfNullableDecimalsWithScaleOf9;

    @JsonProperty("calculatedOneListOfNullableDecimalsWithScaleOf9")
    public java.util.List<java.math.BigDecimal> getCalculatedOneListOfNullableDecimalsWithScaleOf9() {
        return this.calculatedOneListOfNullableDecimalsWithScaleOf9;
    }

    private java.util.List<java.math.BigDecimal> persistedOneListOfNullableDecimalsWithScaleOf9;

    @JsonProperty("persistedOneListOfNullableDecimalsWithScaleOf9")
    public java.util.List<java.math.BigDecimal> getPersistedOneListOfNullableDecimalsWithScaleOf9() {
        return this.persistedOneListOfNullableDecimalsWithScaleOf9;
    }
}
