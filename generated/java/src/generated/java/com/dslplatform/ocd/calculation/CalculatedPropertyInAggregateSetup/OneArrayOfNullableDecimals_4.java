package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneArrayOfNullableDecimals_4 implements java.io.Serializable,
        AggregateRoot {
    public OneArrayOfNullableDecimals_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneArrayOfNullableDecimals = new java.math.BigDecimal[] {};
        this.calculatedOneArrayOfNullableDecimals = new java.math.BigDecimal[] {};
        this.persistedOneArrayOfNullableDecimals = new java.math.BigDecimal[] {};
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
        final OneArrayOfNullableDecimals_4 other = (OneArrayOfNullableDecimals_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneArrayOfNullableDecimals_4(" + URI + ')'
                : "new OneArrayOfNullableDecimals_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneArrayOfNullableDecimals_4(
            final java.math.BigDecimal[] oneArrayOfNullableDecimals) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneArrayOfNullableDecimals(oneArrayOfNullableDecimals);
    }

    @JsonCreator
    private OneArrayOfNullableDecimals_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneArrayOfNullableDecimals") final java.math.BigDecimal[] oneArrayOfNullableDecimals,
            @JsonProperty("calculatedOneArrayOfNullableDecimals") final java.math.BigDecimal[] calculatedOneArrayOfNullableDecimals,
            @JsonProperty("persistedOneArrayOfNullableDecimals") final java.math.BigDecimal[] persistedOneArrayOfNullableDecimals) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneArrayOfNullableDecimals = oneArrayOfNullableDecimals == null
                ? new java.math.BigDecimal[] {}
                : oneArrayOfNullableDecimals;
        this.calculatedOneArrayOfNullableDecimals = calculatedOneArrayOfNullableDecimals;
        this.persistedOneArrayOfNullableDecimals = persistedOneArrayOfNullableDecimals;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneArrayOfNullableDecimals_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneArrayOfNullableDecimals_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneArrayOfNullableDecimals_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneArrayOfNullableDecimals_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableDecimals_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableDecimals_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneArrayOfNullableDecimals_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableDecimals_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableDecimals_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableDecimals_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableDecimals_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneArrayOfNullableDecimals_4.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableDecimals_4> search(
            final Specification<OneArrayOfNullableDecimals_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableDecimals_4> search(
            final Specification<OneArrayOfNullableDecimals_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableDecimals_4> search(
            final Specification<OneArrayOfNullableDecimals_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableDecimals_4> search(
            final Specification<OneArrayOfNullableDecimals_4> specification,
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
                    .count(OneArrayOfNullableDecimals_4.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneArrayOfNullableDecimals_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneArrayOfNullableDecimals_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableDecimals_4 result) {
        this.URI = result.URI;

        this.oneArrayOfNullableDecimals = result.oneArrayOfNullableDecimals;
        this.calculatedOneArrayOfNullableDecimals = result.calculatedOneArrayOfNullableDecimals;
        this.persistedOneArrayOfNullableDecimals = result.persistedOneArrayOfNullableDecimals;
        this.ID = result.ID;
    }

    public OneArrayOfNullableDecimals_4 persist() throws java.io.IOException {
        final OneArrayOfNullableDecimals_4 result;
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

    public OneArrayOfNullableDecimals_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneArrayOfNullableDecimals_4.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.math.BigDecimal[] oneArrayOfNullableDecimals;

    @JsonProperty("oneArrayOfNullableDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfNullableDecimals() {
        return oneArrayOfNullableDecimals;
    }

    public OneArrayOfNullableDecimals_4 setOneArrayOfNullableDecimals(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableDecimals\" cannot be null!");
        this.oneArrayOfNullableDecimals = value;

        return this;
    }

    private java.math.BigDecimal[] calculatedOneArrayOfNullableDecimals;

    @JsonProperty("calculatedOneArrayOfNullableDecimals")
    public java.math.BigDecimal[] getCalculatedOneArrayOfNullableDecimals() {
        return this.calculatedOneArrayOfNullableDecimals;
    }

    private java.math.BigDecimal[] persistedOneArrayOfNullableDecimals;

    @JsonProperty("persistedOneArrayOfNullableDecimals")
    public java.math.BigDecimal[] getPersistedOneArrayOfNullableDecimals() {
        return this.persistedOneArrayOfNullableDecimals;
    }
}
