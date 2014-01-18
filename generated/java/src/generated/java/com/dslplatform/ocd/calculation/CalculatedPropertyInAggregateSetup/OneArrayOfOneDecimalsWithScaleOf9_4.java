package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneArrayOfOneDecimalsWithScaleOf9_4 implements
        java.io.Serializable, AggregateRoot {
    public OneArrayOfOneDecimalsWithScaleOf9_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneArrayOfOneDecimalsWithScaleOf9 = new java.math.BigDecimal[] {};
        this.calculatedOneArrayOfOneDecimalsWithScaleOf9 = new java.math.BigDecimal[] {};
        this.persistedOneArrayOfOneDecimalsWithScaleOf9 = new java.math.BigDecimal[] {};
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
        final OneArrayOfOneDecimalsWithScaleOf9_4 other = (OneArrayOfOneDecimalsWithScaleOf9_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneArrayOfOneDecimalsWithScaleOf9_4(" + URI + ')'
                : "new OneArrayOfOneDecimalsWithScaleOf9_4(" + super.hashCode()
                        + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneArrayOfOneDecimalsWithScaleOf9_4(
            final java.math.BigDecimal[] oneArrayOfOneDecimalsWithScaleOf9) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneArrayOfOneDecimalsWithScaleOf9(oneArrayOfOneDecimalsWithScaleOf9);
    }

    @JsonCreator
    private OneArrayOfOneDecimalsWithScaleOf9_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneArrayOfOneDecimalsWithScaleOf9") final java.math.BigDecimal[] oneArrayOfOneDecimalsWithScaleOf9,
            @JsonProperty("calculatedOneArrayOfOneDecimalsWithScaleOf9") final java.math.BigDecimal[] calculatedOneArrayOfOneDecimalsWithScaleOf9,
            @JsonProperty("persistedOneArrayOfOneDecimalsWithScaleOf9") final java.math.BigDecimal[] persistedOneArrayOfOneDecimalsWithScaleOf9) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneArrayOfOneDecimalsWithScaleOf9 = oneArrayOfOneDecimalsWithScaleOf9 == null
                ? new java.math.BigDecimal[] {}
                : oneArrayOfOneDecimalsWithScaleOf9;
        this.calculatedOneArrayOfOneDecimalsWithScaleOf9 = calculatedOneArrayOfOneDecimalsWithScaleOf9;
        this.persistedOneArrayOfOneDecimalsWithScaleOf9 = persistedOneArrayOfOneDecimalsWithScaleOf9;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneArrayOfOneDecimalsWithScaleOf9_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneArrayOfOneDecimalsWithScaleOf9_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneArrayOfOneDecimalsWithScaleOf9_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneArrayOfOneDecimalsWithScaleOf9_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfOneDecimalsWithScaleOf9_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneDecimalsWithScaleOf9_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneArrayOfOneDecimalsWithScaleOf9_4.class, uris)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfOneDecimalsWithScaleOf9_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneDecimalsWithScaleOf9_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneArrayOfOneDecimalsWithScaleOf9_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneDecimalsWithScaleOf9_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneArrayOfOneDecimalsWithScaleOf9_4.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfOneDecimalsWithScaleOf9_4> search(
            final Specification<OneArrayOfOneDecimalsWithScaleOf9_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneDecimalsWithScaleOf9_4> search(
            final Specification<OneArrayOfOneDecimalsWithScaleOf9_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneArrayOfOneDecimalsWithScaleOf9_4> search(
            final Specification<OneArrayOfOneDecimalsWithScaleOf9_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneDecimalsWithScaleOf9_4> search(
            final Specification<OneArrayOfOneDecimalsWithScaleOf9_4> specification,
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
                    .count(OneArrayOfOneDecimalsWithScaleOf9_4.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneArrayOfOneDecimalsWithScaleOf9_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneArrayOfOneDecimalsWithScaleOf9_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneDecimalsWithScaleOf9_4 result) {
        this.URI = result.URI;

        this.oneArrayOfOneDecimalsWithScaleOf9 = result.oneArrayOfOneDecimalsWithScaleOf9;
        this.calculatedOneArrayOfOneDecimalsWithScaleOf9 = result.calculatedOneArrayOfOneDecimalsWithScaleOf9;
        this.persistedOneArrayOfOneDecimalsWithScaleOf9 = result.persistedOneArrayOfOneDecimalsWithScaleOf9;
        this.ID = result.ID;
    }

    public OneArrayOfOneDecimalsWithScaleOf9_4 persist()
            throws java.io.IOException {
        final OneArrayOfOneDecimalsWithScaleOf9_4 result;
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

    public OneArrayOfOneDecimalsWithScaleOf9_4 delete()
            throws java.io.IOException {
        try {
            return _crudProxy.delete(OneArrayOfOneDecimalsWithScaleOf9_4.class,
                    URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.math.BigDecimal[] oneArrayOfOneDecimalsWithScaleOf9;

    @JsonProperty("oneArrayOfOneDecimalsWithScaleOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfOneDecimalsWithScaleOf9() {
        return oneArrayOfOneDecimalsWithScaleOf9;
    }

    public OneArrayOfOneDecimalsWithScaleOf9_4 setOneArrayOfOneDecimalsWithScaleOf9(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneDecimalsWithScaleOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.oneArrayOfOneDecimalsWithScaleOf9 = value;

        return this;
    }

    private java.math.BigDecimal[] calculatedOneArrayOfOneDecimalsWithScaleOf9;

    @JsonProperty("calculatedOneArrayOfOneDecimalsWithScaleOf9")
    public java.math.BigDecimal[] getCalculatedOneArrayOfOneDecimalsWithScaleOf9() {
        return this.calculatedOneArrayOfOneDecimalsWithScaleOf9;
    }

    private java.math.BigDecimal[] persistedOneArrayOfOneDecimalsWithScaleOf9;

    @JsonProperty("persistedOneArrayOfOneDecimalsWithScaleOf9")
    public java.math.BigDecimal[] getPersistedOneArrayOfOneDecimalsWithScaleOf9() {
        return this.persistedOneArrayOfOneDecimalsWithScaleOf9;
    }
}
