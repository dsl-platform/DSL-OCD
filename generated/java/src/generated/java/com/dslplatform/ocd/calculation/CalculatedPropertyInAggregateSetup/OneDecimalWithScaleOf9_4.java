package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneDecimalWithScaleOf9_4 implements java.io.Serializable,
        AggregateRoot {
    public OneDecimalWithScaleOf9_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneDecimalWithScaleOf9 = java.math.BigDecimal.ZERO.setScale(9);
        this.calculatedOneDecimalWithScaleOf9 = java.math.BigDecimal.ZERO
                .setScale(9);
        this.persistedOneDecimalWithScaleOf9 = java.math.BigDecimal.ZERO
                .setScale(9);
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
        final OneDecimalWithScaleOf9_4 other = (OneDecimalWithScaleOf9_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneDecimalWithScaleOf9_4(" + URI + ')'
                : "new OneDecimalWithScaleOf9_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneDecimalWithScaleOf9_4(
            final java.math.BigDecimal oneDecimalWithScaleOf9) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneDecimalWithScaleOf9(oneDecimalWithScaleOf9);
    }

    @JsonCreator
    private OneDecimalWithScaleOf9_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneDecimalWithScaleOf9") final java.math.BigDecimal oneDecimalWithScaleOf9,
            @JsonProperty("calculatedOneDecimalWithScaleOf9") final java.math.BigDecimal calculatedOneDecimalWithScaleOf9,
            @JsonProperty("persistedOneDecimalWithScaleOf9") final java.math.BigDecimal persistedOneDecimalWithScaleOf9) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneDecimalWithScaleOf9 = oneDecimalWithScaleOf9 == null
                ? java.math.BigDecimal.ZERO.setScale(9)
                : oneDecimalWithScaleOf9;
        this.calculatedOneDecimalWithScaleOf9 = calculatedOneDecimalWithScaleOf9;
        this.persistedOneDecimalWithScaleOf9 = persistedOneDecimalWithScaleOf9;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneDecimalWithScaleOf9_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneDecimalWithScaleOf9_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneDecimalWithScaleOf9_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneDecimalWithScaleOf9_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneDecimalWithScaleOf9_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneDecimalWithScaleOf9_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneDecimalWithScaleOf9_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneDecimalWithScaleOf9_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneDecimalWithScaleOf9_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneDecimalWithScaleOf9_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneDecimalWithScaleOf9_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneDecimalWithScaleOf9_4.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneDecimalWithScaleOf9_4> search(
            final Specification<OneDecimalWithScaleOf9_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneDecimalWithScaleOf9_4> search(
            final Specification<OneDecimalWithScaleOf9_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneDecimalWithScaleOf9_4> search(
            final Specification<OneDecimalWithScaleOf9_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneDecimalWithScaleOf9_4> search(
            final Specification<OneDecimalWithScaleOf9_4> specification,
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
                    .count(OneDecimalWithScaleOf9_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneDecimalWithScaleOf9_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneDecimalWithScaleOf9_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneDecimalWithScaleOf9_4 result) {
        this.URI = result.URI;

        this.oneDecimalWithScaleOf9 = result.oneDecimalWithScaleOf9;
        this.calculatedOneDecimalWithScaleOf9 = result.calculatedOneDecimalWithScaleOf9;
        this.persistedOneDecimalWithScaleOf9 = result.persistedOneDecimalWithScaleOf9;
        this.ID = result.ID;
    }

    public OneDecimalWithScaleOf9_4 persist() throws java.io.IOException {
        final OneDecimalWithScaleOf9_4 result;
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

    public OneDecimalWithScaleOf9_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneDecimalWithScaleOf9_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.math.BigDecimal oneDecimalWithScaleOf9;

    @JsonProperty("oneDecimalWithScaleOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal getOneDecimalWithScaleOf9() {
        return oneDecimalWithScaleOf9;
    }

    public OneDecimalWithScaleOf9_4 setOneDecimalWithScaleOf9(
            final java.math.BigDecimal value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneDecimalWithScaleOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.oneDecimalWithScaleOf9 = value;

        return this;
    }

    private java.math.BigDecimal calculatedOneDecimalWithScaleOf9;

    @JsonProperty("calculatedOneDecimalWithScaleOf9")
    public java.math.BigDecimal getCalculatedOneDecimalWithScaleOf9() {
        return this.calculatedOneDecimalWithScaleOf9;
    }

    private java.math.BigDecimal persistedOneDecimalWithScaleOf9;

    @JsonProperty("persistedOneDecimalWithScaleOf9")
    public java.math.BigDecimal getPersistedOneDecimalWithScaleOf9() {
        return this.persistedOneDecimalWithScaleOf9;
    }
}
