package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfOneDoubles_4 implements java.io.Serializable,
        AggregateRoot {
    public OneSetOfOneDoubles_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfOneDoubles = new java.util.HashSet<Double>();
        this.calculatedOneSetOfOneDoubles = new java.util.HashSet<Double>();
        this.persistedOneSetOfOneDoubles = new java.util.HashSet<Double>();
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
        final OneSetOfOneDoubles_4 other = (OneSetOfOneDoubles_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfOneDoubles_4(" + URI + ')'
                : "new OneSetOfOneDoubles_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfOneDoubles_4(
            final java.util.Set<Double> oneSetOfOneDoubles) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfOneDoubles(oneSetOfOneDoubles);
    }

    @JsonCreator
    private OneSetOfOneDoubles_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfOneDoubles") final java.util.Set<Double> oneSetOfOneDoubles,
            @JsonProperty("calculatedOneSetOfOneDoubles") final java.util.Set<Double> calculatedOneSetOfOneDoubles,
            @JsonProperty("persistedOneSetOfOneDoubles") final java.util.Set<Double> persistedOneSetOfOneDoubles) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfOneDoubles = oneSetOfOneDoubles == null
                ? new java.util.HashSet<Double>()
                : oneSetOfOneDoubles;
        this.calculatedOneSetOfOneDoubles = calculatedOneSetOfOneDoubles;
        this.persistedOneSetOfOneDoubles = persistedOneSetOfOneDoubles;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfOneDoubles_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfOneDoubles_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfOneDoubles_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfOneDoubles_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneDoubles_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneDoubles_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfOneDoubles_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneDoubles_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneDoubles_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfOneDoubles_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneDoubles_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfOneDoubles_4.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneDoubles_4> search(
            final Specification<OneSetOfOneDoubles_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneDoubles_4> search(
            final Specification<OneSetOfOneDoubles_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfOneDoubles_4> search(
            final Specification<OneSetOfOneDoubles_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneDoubles_4> search(
            final Specification<OneSetOfOneDoubles_4> specification,
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
                    .count(OneSetOfOneDoubles_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfOneDoubles_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfOneDoubles_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneDoubles_4 result) {
        this.URI = result.URI;

        this.oneSetOfOneDoubles = result.oneSetOfOneDoubles;
        this.calculatedOneSetOfOneDoubles = result.calculatedOneSetOfOneDoubles;
        this.persistedOneSetOfOneDoubles = result.persistedOneSetOfOneDoubles;
        this.ID = result.ID;
    }

    public OneSetOfOneDoubles_4 persist() throws java.io.IOException {
        final OneSetOfOneDoubles_4 result;
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

    public OneSetOfOneDoubles_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfOneDoubles_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<Double> oneSetOfOneDoubles;

    @JsonProperty("oneSetOfOneDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Double> getOneSetOfOneDoubles() {
        return oneSetOfOneDoubles;
    }

    public OneSetOfOneDoubles_4 setOneSetOfOneDoubles(
            final java.util.Set<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneDoubles\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneDoubles = value;

        return this;
    }

    private java.util.Set<Double> calculatedOneSetOfOneDoubles;

    @JsonProperty("calculatedOneSetOfOneDoubles")
    public java.util.Set<Double> getCalculatedOneSetOfOneDoubles() {
        return this.calculatedOneSetOfOneDoubles;
    }

    private java.util.Set<Double> persistedOneSetOfOneDoubles;

    @JsonProperty("persistedOneSetOfOneDoubles")
    public java.util.Set<Double> getPersistedOneSetOfOneDoubles() {
        return this.persistedOneSetOfOneDoubles;
    }
}
