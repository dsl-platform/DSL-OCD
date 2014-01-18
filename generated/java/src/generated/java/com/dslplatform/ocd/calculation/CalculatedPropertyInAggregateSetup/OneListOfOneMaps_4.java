package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneListOfOneMaps_4 implements java.io.Serializable, AggregateRoot {
    public OneListOfOneMaps_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneListOfOneMaps = new java.util.ArrayList<java.util.Map<String, String>>();
        this.calculatedOneListOfOneMaps = new java.util.ArrayList<java.util.Map<String, String>>();
        this.persistedOneListOfOneMaps = new java.util.ArrayList<java.util.Map<String, String>>();
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
        final OneListOfOneMaps_4 other = (OneListOfOneMaps_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneListOfOneMaps_4(" + URI + ')'
                : "new OneListOfOneMaps_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneListOfOneMaps_4(
            final java.util.List<java.util.Map<String, String>> oneListOfOneMaps) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneListOfOneMaps(oneListOfOneMaps);
    }

    @JsonCreator
    private OneListOfOneMaps_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneListOfOneMaps") final java.util.List<java.util.Map<String, String>> oneListOfOneMaps,
            @JsonProperty("calculatedOneListOfOneMaps") final java.util.List<java.util.Map<String, String>> calculatedOneListOfOneMaps,
            @JsonProperty("persistedOneListOfOneMaps") final java.util.List<java.util.Map<String, String>> persistedOneListOfOneMaps) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneListOfOneMaps = oneListOfOneMaps == null
                ? new java.util.ArrayList<java.util.Map<String, String>>()
                : oneListOfOneMaps;
        this.calculatedOneListOfOneMaps = calculatedOneListOfOneMaps;
        this.persistedOneListOfOneMaps = persistedOneListOfOneMaps;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneListOfOneMaps_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneListOfOneMaps_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneListOfOneMaps_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfOneMaps_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneMaps_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneMaps_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfOneMaps_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneMaps_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneMaps_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfOneMaps_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneMaps_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfOneMaps_4.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneMaps_4> search(
            final Specification<OneListOfOneMaps_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneMaps_4> search(
            final Specification<OneListOfOneMaps_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfOneMaps_4> search(
            final Specification<OneListOfOneMaps_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneMaps_4> search(
            final Specification<OneListOfOneMaps_4> specification,
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
                    .resolve(DomainProxy.class).count(OneListOfOneMaps_4.class)
                    .get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfOneMaps_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfOneMaps_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneMaps_4 result) {
        this.URI = result.URI;

        this.oneListOfOneMaps = result.oneListOfOneMaps;
        this.calculatedOneListOfOneMaps = result.calculatedOneListOfOneMaps;
        this.persistedOneListOfOneMaps = result.persistedOneListOfOneMaps;
        this.ID = result.ID;
    }

    public OneListOfOneMaps_4 persist() throws java.io.IOException {
        final OneListOfOneMaps_4 result;
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

    public OneListOfOneMaps_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneListOfOneMaps_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<java.util.Map<String, String>> oneListOfOneMaps;

    @JsonProperty("oneListOfOneMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.Map<String, String>> getOneListOfOneMaps() {
        return oneListOfOneMaps;
    }

    public OneListOfOneMaps_4 setOneListOfOneMaps(
            final java.util.List<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneMaps\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneMaps = value;

        return this;
    }

    private java.util.List<java.util.Map<String, String>> calculatedOneListOfOneMaps;

    @JsonProperty("calculatedOneListOfOneMaps")
    public java.util.List<java.util.Map<String, String>> getCalculatedOneListOfOneMaps() {
        return this.calculatedOneListOfOneMaps;
    }

    private java.util.List<java.util.Map<String, String>> persistedOneListOfOneMaps;

    @JsonProperty("persistedOneListOfOneMaps")
    public java.util.List<java.util.Map<String, String>> getPersistedOneListOfOneMaps() {
        return this.persistedOneListOfOneMaps;
    }
}
