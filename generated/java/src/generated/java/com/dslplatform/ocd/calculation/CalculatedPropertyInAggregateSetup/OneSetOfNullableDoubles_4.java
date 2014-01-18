package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfNullableDoubles_4 implements java.io.Serializable,
        AggregateRoot {
    public OneSetOfNullableDoubles_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfNullableDoubles = new java.util.HashSet<Double>();
        this.calculatedOneSetOfNullableDoubles = new java.util.HashSet<Double>();
        this.persistedOneSetOfNullableDoubles = new java.util.HashSet<Double>();
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
        final OneSetOfNullableDoubles_4 other = (OneSetOfNullableDoubles_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfNullableDoubles_4(" + URI + ')'
                : "new OneSetOfNullableDoubles_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfNullableDoubles_4(
            final java.util.Set<Double> oneSetOfNullableDoubles) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfNullableDoubles(oneSetOfNullableDoubles);
    }

    @JsonCreator
    private OneSetOfNullableDoubles_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfNullableDoubles") final java.util.Set<Double> oneSetOfNullableDoubles,
            @JsonProperty("calculatedOneSetOfNullableDoubles") final java.util.Set<Double> calculatedOneSetOfNullableDoubles,
            @JsonProperty("persistedOneSetOfNullableDoubles") final java.util.Set<Double> persistedOneSetOfNullableDoubles) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfNullableDoubles = oneSetOfNullableDoubles == null
                ? new java.util.HashSet<Double>()
                : oneSetOfNullableDoubles;
        this.calculatedOneSetOfNullableDoubles = calculatedOneSetOfNullableDoubles;
        this.persistedOneSetOfNullableDoubles = persistedOneSetOfNullableDoubles;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfNullableDoubles_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfNullableDoubles_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfNullableDoubles_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfNullableDoubles_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableDoubles_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableDoubles_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfNullableDoubles_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableDoubles_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableDoubles_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfNullableDoubles_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableDoubles_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfNullableDoubles_4.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableDoubles_4> search(
            final Specification<OneSetOfNullableDoubles_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableDoubles_4> search(
            final Specification<OneSetOfNullableDoubles_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfNullableDoubles_4> search(
            final Specification<OneSetOfNullableDoubles_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableDoubles_4> search(
            final Specification<OneSetOfNullableDoubles_4> specification,
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
                    .count(OneSetOfNullableDoubles_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfNullableDoubles_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfNullableDoubles_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableDoubles_4 result) {
        this.URI = result.URI;

        this.oneSetOfNullableDoubles = result.oneSetOfNullableDoubles;
        this.calculatedOneSetOfNullableDoubles = result.calculatedOneSetOfNullableDoubles;
        this.persistedOneSetOfNullableDoubles = result.persistedOneSetOfNullableDoubles;
        this.ID = result.ID;
    }

    public OneSetOfNullableDoubles_4 persist() throws java.io.IOException {
        final OneSetOfNullableDoubles_4 result;
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

    public OneSetOfNullableDoubles_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfNullableDoubles_4.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<Double> oneSetOfNullableDoubles;

    @JsonProperty("oneSetOfNullableDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Double> getOneSetOfNullableDoubles() {
        return oneSetOfNullableDoubles;
    }

    public OneSetOfNullableDoubles_4 setOneSetOfNullableDoubles(
            final java.util.Set<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableDoubles\" cannot be null!");
        this.oneSetOfNullableDoubles = value;

        return this;
    }

    private java.util.Set<Double> calculatedOneSetOfNullableDoubles;

    @JsonProperty("calculatedOneSetOfNullableDoubles")
    public java.util.Set<Double> getCalculatedOneSetOfNullableDoubles() {
        return this.calculatedOneSetOfNullableDoubles;
    }

    private java.util.Set<Double> persistedOneSetOfNullableDoubles;

    @JsonProperty("persistedOneSetOfNullableDoubles")
    public java.util.Set<Double> getPersistedOneSetOfNullableDoubles() {
        return this.persistedOneSetOfNullableDoubles;
    }
}
