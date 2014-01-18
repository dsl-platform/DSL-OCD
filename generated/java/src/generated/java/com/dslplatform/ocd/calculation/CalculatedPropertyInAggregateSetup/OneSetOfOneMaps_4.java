package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfOneMaps_4 implements java.io.Serializable, AggregateRoot {
    public OneSetOfOneMaps_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfOneMaps = new java.util.HashSet<java.util.Map<String, String>>();
        this.calculatedOneSetOfOneMaps = new java.util.HashSet<java.util.Map<String, String>>();
        this.persistedOneSetOfOneMaps = new java.util.HashSet<java.util.Map<String, String>>();
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
        final OneSetOfOneMaps_4 other = (OneSetOfOneMaps_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfOneMaps_4(" + URI + ')'
                : "new OneSetOfOneMaps_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfOneMaps_4(
            final java.util.Set<java.util.Map<String, String>> oneSetOfOneMaps) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfOneMaps(oneSetOfOneMaps);
    }

    @JsonCreator
    private OneSetOfOneMaps_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfOneMaps") final java.util.Set<java.util.Map<String, String>> oneSetOfOneMaps,
            @JsonProperty("calculatedOneSetOfOneMaps") final java.util.Set<java.util.Map<String, String>> calculatedOneSetOfOneMaps,
            @JsonProperty("persistedOneSetOfOneMaps") final java.util.Set<java.util.Map<String, String>> persistedOneSetOfOneMaps) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfOneMaps = oneSetOfOneMaps == null
                ? new java.util.HashSet<java.util.Map<String, String>>()
                : oneSetOfOneMaps;
        this.calculatedOneSetOfOneMaps = calculatedOneSetOfOneMaps;
        this.persistedOneSetOfOneMaps = persistedOneSetOfOneMaps;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfOneMaps_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfOneMaps_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfOneMaps_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfOneMaps_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneMaps_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneMaps_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfOneMaps_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneMaps_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneMaps_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfOneMaps_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneMaps_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfOneMaps_4.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneMaps_4> search(
            final Specification<OneSetOfOneMaps_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneMaps_4> search(
            final Specification<OneSetOfOneMaps_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfOneMaps_4> search(
            final Specification<OneSetOfOneMaps_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneMaps_4> search(
            final Specification<OneSetOfOneMaps_4> specification,
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
                    .resolve(DomainProxy.class).count(OneSetOfOneMaps_4.class)
                    .get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfOneMaps_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfOneMaps_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneMaps_4 result) {
        this.URI = result.URI;

        this.oneSetOfOneMaps = result.oneSetOfOneMaps;
        this.calculatedOneSetOfOneMaps = result.calculatedOneSetOfOneMaps;
        this.persistedOneSetOfOneMaps = result.persistedOneSetOfOneMaps;
        this.ID = result.ID;
    }

    public OneSetOfOneMaps_4 persist() throws java.io.IOException {
        final OneSetOfOneMaps_4 result;
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

    public OneSetOfOneMaps_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfOneMaps_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<java.util.Map<String, String>> oneSetOfOneMaps;

    @JsonProperty("oneSetOfOneMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.util.Map<String, String>> getOneSetOfOneMaps() {
        return oneSetOfOneMaps;
    }

    public OneSetOfOneMaps_4 setOneSetOfOneMaps(
            final java.util.Set<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneMaps\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneMaps = value;

        return this;
    }

    private java.util.Set<java.util.Map<String, String>> calculatedOneSetOfOneMaps;

    @JsonProperty("calculatedOneSetOfOneMaps")
    public java.util.Set<java.util.Map<String, String>> getCalculatedOneSetOfOneMaps() {
        return this.calculatedOneSetOfOneMaps;
    }

    private java.util.Set<java.util.Map<String, String>> persistedOneSetOfOneMaps;

    @JsonProperty("persistedOneSetOfOneMaps")
    public java.util.Set<java.util.Map<String, String>> getPersistedOneSetOfOneMaps() {
        return this.persistedOneSetOfOneMaps;
    }
}
