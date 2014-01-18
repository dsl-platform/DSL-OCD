package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneArrayOfOneDoubles_4 implements java.io.Serializable,
        AggregateRoot {
    public OneArrayOfOneDoubles_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneArrayOfOneDoubles = new double[] {};
        this.calculatedOneArrayOfOneDoubles = new double[] {};
        this.persistedOneArrayOfOneDoubles = new double[] {};
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
        final OneArrayOfOneDoubles_4 other = (OneArrayOfOneDoubles_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneArrayOfOneDoubles_4(" + URI + ')'
                : "new OneArrayOfOneDoubles_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneArrayOfOneDoubles_4(
            final double[] oneArrayOfOneDoubles) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneArrayOfOneDoubles(oneArrayOfOneDoubles);
    }

    @JsonCreator
    private OneArrayOfOneDoubles_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneArrayOfOneDoubles") final double[] oneArrayOfOneDoubles,
            @JsonProperty("calculatedOneArrayOfOneDoubles") final double[] calculatedOneArrayOfOneDoubles,
            @JsonProperty("persistedOneArrayOfOneDoubles") final double[] persistedOneArrayOfOneDoubles) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneArrayOfOneDoubles = oneArrayOfOneDoubles == null
                ? new double[] {}
                : oneArrayOfOneDoubles;
        this.calculatedOneArrayOfOneDoubles = calculatedOneArrayOfOneDoubles;
        this.persistedOneArrayOfOneDoubles = persistedOneArrayOfOneDoubles;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneArrayOfOneDoubles_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneArrayOfOneDoubles_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneArrayOfOneDoubles_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneArrayOfOneDoubles_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfOneDoubles_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneDoubles_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneArrayOfOneDoubles_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfOneDoubles_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneDoubles_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneArrayOfOneDoubles_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneDoubles_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneArrayOfOneDoubles_4.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfOneDoubles_4> search(
            final Specification<OneArrayOfOneDoubles_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneDoubles_4> search(
            final Specification<OneArrayOfOneDoubles_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneArrayOfOneDoubles_4> search(
            final Specification<OneArrayOfOneDoubles_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneDoubles_4> search(
            final Specification<OneArrayOfOneDoubles_4> specification,
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
                    .count(OneArrayOfOneDoubles_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneArrayOfOneDoubles_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneArrayOfOneDoubles_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneDoubles_4 result) {
        this.URI = result.URI;

        this.oneArrayOfOneDoubles = result.oneArrayOfOneDoubles;
        this.calculatedOneArrayOfOneDoubles = result.calculatedOneArrayOfOneDoubles;
        this.persistedOneArrayOfOneDoubles = result.persistedOneArrayOfOneDoubles;
        this.ID = result.ID;
    }

    public OneArrayOfOneDoubles_4 persist() throws java.io.IOException {
        final OneArrayOfOneDoubles_4 result;
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

    public OneArrayOfOneDoubles_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneArrayOfOneDoubles_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private double[] oneArrayOfOneDoubles;

    @JsonProperty("oneArrayOfOneDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public double[] getOneArrayOfOneDoubles() {
        return oneArrayOfOneDoubles;
    }

    public OneArrayOfOneDoubles_4 setOneArrayOfOneDoubles(final double[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneDoubles\" cannot be null!");
        this.oneArrayOfOneDoubles = value;

        return this;
    }

    private double[] calculatedOneArrayOfOneDoubles;

    @JsonProperty("calculatedOneArrayOfOneDoubles")
    public double[] getCalculatedOneArrayOfOneDoubles() {
        return this.calculatedOneArrayOfOneDoubles;
    }

    private double[] persistedOneArrayOfOneDoubles;

    @JsonProperty("persistedOneArrayOfOneDoubles")
    public double[] getPersistedOneArrayOfOneDoubles() {
        return this.persistedOneArrayOfOneDoubles;
    }
}
