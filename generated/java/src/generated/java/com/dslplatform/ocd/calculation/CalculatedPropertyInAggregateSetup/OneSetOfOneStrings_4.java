package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfOneStrings_4 implements java.io.Serializable,
        AggregateRoot {
    public OneSetOfOneStrings_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfOneStrings = new java.util.HashSet<String>();
        this.calculatedOneSetOfOneStrings = new java.util.HashSet<String>();
        this.persistedOneSetOfOneStrings = new java.util.HashSet<String>();
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
        final OneSetOfOneStrings_4 other = (OneSetOfOneStrings_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfOneStrings_4(" + URI + ')'
                : "new OneSetOfOneStrings_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfOneStrings_4(
            final java.util.Set<String> oneSetOfOneStrings) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfOneStrings(oneSetOfOneStrings);
    }

    @JsonCreator
    private OneSetOfOneStrings_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfOneStrings") final java.util.Set<String> oneSetOfOneStrings,
            @JsonProperty("calculatedOneSetOfOneStrings") final java.util.Set<String> calculatedOneSetOfOneStrings,
            @JsonProperty("persistedOneSetOfOneStrings") final java.util.Set<String> persistedOneSetOfOneStrings) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfOneStrings = oneSetOfOneStrings == null
                ? new java.util.HashSet<String>()
                : oneSetOfOneStrings;
        this.calculatedOneSetOfOneStrings = calculatedOneSetOfOneStrings;
        this.persistedOneSetOfOneStrings = persistedOneSetOfOneStrings;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfOneStrings_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfOneStrings_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfOneStrings_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfOneStrings_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneStrings_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneStrings_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfOneStrings_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneStrings_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneStrings_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfOneStrings_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneStrings_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfOneStrings_4.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneStrings_4> search(
            final Specification<OneSetOfOneStrings_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneStrings_4> search(
            final Specification<OneSetOfOneStrings_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfOneStrings_4> search(
            final Specification<OneSetOfOneStrings_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneStrings_4> search(
            final Specification<OneSetOfOneStrings_4> specification,
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
                    .count(OneSetOfOneStrings_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfOneStrings_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfOneStrings_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneStrings_4 result) {
        this.URI = result.URI;

        this.oneSetOfOneStrings = result.oneSetOfOneStrings;
        this.calculatedOneSetOfOneStrings = result.calculatedOneSetOfOneStrings;
        this.persistedOneSetOfOneStrings = result.persistedOneSetOfOneStrings;
        this.ID = result.ID;
    }

    public OneSetOfOneStrings_4 persist() throws java.io.IOException {
        final OneSetOfOneStrings_4 result;
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

    public OneSetOfOneStrings_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfOneStrings_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<String> oneSetOfOneStrings;

    @JsonProperty("oneSetOfOneStrings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getOneSetOfOneStrings() {
        return oneSetOfOneStrings;
    }

    public OneSetOfOneStrings_4 setOneSetOfOneStrings(
            final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneStrings\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneStrings = value;

        return this;
    }

    private java.util.Set<String> calculatedOneSetOfOneStrings;

    @JsonProperty("calculatedOneSetOfOneStrings")
    public java.util.Set<String> getCalculatedOneSetOfOneStrings() {
        return this.calculatedOneSetOfOneStrings;
    }

    private java.util.Set<String> persistedOneSetOfOneStrings;

    @JsonProperty("persistedOneSetOfOneStrings")
    public java.util.Set<String> getPersistedOneSetOfOneStrings() {
        return this.persistedOneSetOfOneStrings;
    }
}
