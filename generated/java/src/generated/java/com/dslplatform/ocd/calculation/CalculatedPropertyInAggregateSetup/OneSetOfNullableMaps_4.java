package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfNullableMaps_4 implements java.io.Serializable,
        AggregateRoot {
    public OneSetOfNullableMaps_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfNullableMaps = new java.util.HashSet<java.util.Map<String, String>>();
        this.calculatedOneSetOfNullableMaps = new java.util.HashSet<java.util.Map<String, String>>();
        this.persistedOneSetOfNullableMaps = new java.util.HashSet<java.util.Map<String, String>>();
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
        final OneSetOfNullableMaps_4 other = (OneSetOfNullableMaps_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfNullableMaps_4(" + URI + ')'
                : "new OneSetOfNullableMaps_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfNullableMaps_4(
            final java.util.Set<java.util.Map<String, String>> oneSetOfNullableMaps) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfNullableMaps(oneSetOfNullableMaps);
    }

    @JsonCreator
    private OneSetOfNullableMaps_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfNullableMaps") final java.util.Set<java.util.Map<String, String>> oneSetOfNullableMaps,
            @JsonProperty("calculatedOneSetOfNullableMaps") final java.util.Set<java.util.Map<String, String>> calculatedOneSetOfNullableMaps,
            @JsonProperty("persistedOneSetOfNullableMaps") final java.util.Set<java.util.Map<String, String>> persistedOneSetOfNullableMaps) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfNullableMaps = oneSetOfNullableMaps == null
                ? new java.util.HashSet<java.util.Map<String, String>>()
                : oneSetOfNullableMaps;
        this.calculatedOneSetOfNullableMaps = calculatedOneSetOfNullableMaps;
        this.persistedOneSetOfNullableMaps = persistedOneSetOfNullableMaps;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfNullableMaps_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfNullableMaps_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfNullableMaps_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfNullableMaps_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableMaps_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableMaps_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfNullableMaps_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableMaps_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableMaps_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfNullableMaps_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableMaps_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfNullableMaps_4.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableMaps_4> search(
            final Specification<OneSetOfNullableMaps_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableMaps_4> search(
            final Specification<OneSetOfNullableMaps_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfNullableMaps_4> search(
            final Specification<OneSetOfNullableMaps_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableMaps_4> search(
            final Specification<OneSetOfNullableMaps_4> specification,
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
                    .count(OneSetOfNullableMaps_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfNullableMaps_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfNullableMaps_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableMaps_4 result) {
        this.URI = result.URI;

        this.oneSetOfNullableMaps = result.oneSetOfNullableMaps;
        this.calculatedOneSetOfNullableMaps = result.calculatedOneSetOfNullableMaps;
        this.persistedOneSetOfNullableMaps = result.persistedOneSetOfNullableMaps;
        this.ID = result.ID;
    }

    public OneSetOfNullableMaps_4 persist() throws java.io.IOException {
        final OneSetOfNullableMaps_4 result;
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

    public OneSetOfNullableMaps_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfNullableMaps_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<java.util.Map<String, String>> oneSetOfNullableMaps;

    @JsonProperty("oneSetOfNullableMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.util.Map<String, String>> getOneSetOfNullableMaps() {
        return oneSetOfNullableMaps;
    }

    public OneSetOfNullableMaps_4 setOneSetOfNullableMaps(
            final java.util.Set<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableMaps\" cannot be null!");
        this.oneSetOfNullableMaps = value;

        return this;
    }

    private java.util.Set<java.util.Map<String, String>> calculatedOneSetOfNullableMaps;

    @JsonProperty("calculatedOneSetOfNullableMaps")
    public java.util.Set<java.util.Map<String, String>> getCalculatedOneSetOfNullableMaps() {
        return this.calculatedOneSetOfNullableMaps;
    }

    private java.util.Set<java.util.Map<String, String>> persistedOneSetOfNullableMaps;

    @JsonProperty("persistedOneSetOfNullableMaps")
    public java.util.Set<java.util.Map<String, String>> getPersistedOneSetOfNullableMaps() {
        return this.persistedOneSetOfNullableMaps;
    }
}
