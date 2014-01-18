package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneListOfOneDecimalsWithScaleOf9_4 implements
        java.io.Serializable, AggregateRoot {
    public OneListOfOneDecimalsWithScaleOf9_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneListOfOneDecimalsWithScaleOf9 = new java.util.ArrayList<java.math.BigDecimal>();
        this.calculatedOneListOfOneDecimalsWithScaleOf9 = new java.util.ArrayList<java.math.BigDecimal>();
        this.persistedOneListOfOneDecimalsWithScaleOf9 = new java.util.ArrayList<java.math.BigDecimal>();
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
        final OneListOfOneDecimalsWithScaleOf9_4 other = (OneListOfOneDecimalsWithScaleOf9_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneListOfOneDecimalsWithScaleOf9_4(" + URI + ')'
                : "new OneListOfOneDecimalsWithScaleOf9_4(" + super.hashCode()
                        + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneListOfOneDecimalsWithScaleOf9_4(
            final java.util.List<java.math.BigDecimal> oneListOfOneDecimalsWithScaleOf9) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneListOfOneDecimalsWithScaleOf9(oneListOfOneDecimalsWithScaleOf9);
    }

    @JsonCreator
    private OneListOfOneDecimalsWithScaleOf9_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneListOfOneDecimalsWithScaleOf9") final java.util.List<java.math.BigDecimal> oneListOfOneDecimalsWithScaleOf9,
            @JsonProperty("calculatedOneListOfOneDecimalsWithScaleOf9") final java.util.List<java.math.BigDecimal> calculatedOneListOfOneDecimalsWithScaleOf9,
            @JsonProperty("persistedOneListOfOneDecimalsWithScaleOf9") final java.util.List<java.math.BigDecimal> persistedOneListOfOneDecimalsWithScaleOf9) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneListOfOneDecimalsWithScaleOf9 = oneListOfOneDecimalsWithScaleOf9 == null
                ? new java.util.ArrayList<java.math.BigDecimal>()
                : oneListOfOneDecimalsWithScaleOf9;
        this.calculatedOneListOfOneDecimalsWithScaleOf9 = calculatedOneListOfOneDecimalsWithScaleOf9;
        this.persistedOneListOfOneDecimalsWithScaleOf9 = persistedOneListOfOneDecimalsWithScaleOf9;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneListOfOneDecimalsWithScaleOf9_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneListOfOneDecimalsWithScaleOf9_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneListOfOneDecimalsWithScaleOf9_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfOneDecimalsWithScaleOf9_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfOneDecimalsWithScaleOf9_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfOneDecimalsWithScaleOf9_4.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_4> search(
            final Specification<OneListOfOneDecimalsWithScaleOf9_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_4> search(
            final Specification<OneListOfOneDecimalsWithScaleOf9_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_4> search(
            final Specification<OneListOfOneDecimalsWithScaleOf9_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneDecimalsWithScaleOf9_4> search(
            final Specification<OneListOfOneDecimalsWithScaleOf9_4> specification,
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
                    .count(OneListOfOneDecimalsWithScaleOf9_4.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfOneDecimalsWithScaleOf9_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfOneDecimalsWithScaleOf9_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneDecimalsWithScaleOf9_4 result) {
        this.URI = result.URI;

        this.oneListOfOneDecimalsWithScaleOf9 = result.oneListOfOneDecimalsWithScaleOf9;
        this.calculatedOneListOfOneDecimalsWithScaleOf9 = result.calculatedOneListOfOneDecimalsWithScaleOf9;
        this.persistedOneListOfOneDecimalsWithScaleOf9 = result.persistedOneListOfOneDecimalsWithScaleOf9;
        this.ID = result.ID;
    }

    public OneListOfOneDecimalsWithScaleOf9_4 persist()
            throws java.io.IOException {
        final OneListOfOneDecimalsWithScaleOf9_4 result;
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

    public OneListOfOneDecimalsWithScaleOf9_4 delete()
            throws java.io.IOException {
        try {
            return _crudProxy.delete(OneListOfOneDecimalsWithScaleOf9_4.class,
                    URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<java.math.BigDecimal> oneListOfOneDecimalsWithScaleOf9;

    @JsonProperty("oneListOfOneDecimalsWithScaleOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.math.BigDecimal> getOneListOfOneDecimalsWithScaleOf9() {
        return oneListOfOneDecimalsWithScaleOf9;
    }

    public OneListOfOneDecimalsWithScaleOf9_4 setOneListOfOneDecimalsWithScaleOf9(
            final java.util.List<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneDecimalsWithScaleOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.oneListOfOneDecimalsWithScaleOf9 = value;

        return this;
    }

    private java.util.List<java.math.BigDecimal> calculatedOneListOfOneDecimalsWithScaleOf9;

    @JsonProperty("calculatedOneListOfOneDecimalsWithScaleOf9")
    public java.util.List<java.math.BigDecimal> getCalculatedOneListOfOneDecimalsWithScaleOf9() {
        return this.calculatedOneListOfOneDecimalsWithScaleOf9;
    }

    private java.util.List<java.math.BigDecimal> persistedOneListOfOneDecimalsWithScaleOf9;

    @JsonProperty("persistedOneListOfOneDecimalsWithScaleOf9")
    public java.util.List<java.math.BigDecimal> getPersistedOneListOfOneDecimalsWithScaleOf9() {
        return this.persistedOneListOfOneDecimalsWithScaleOf9;
    }
}
