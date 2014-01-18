package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneArrayOfOneIntegers_4 implements java.io.Serializable,
        AggregateRoot {
    public OneArrayOfOneIntegers_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneArrayOfOneIntegers = new int[] {};
        this.calculatedOneArrayOfOneIntegers = new int[] {};
        this.persistedOneArrayOfOneIntegers = new int[] {};
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
        final OneArrayOfOneIntegers_4 other = (OneArrayOfOneIntegers_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneArrayOfOneIntegers_4(" + URI + ')'
                : "new OneArrayOfOneIntegers_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneArrayOfOneIntegers_4(
            final int[] oneArrayOfOneIntegers) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneArrayOfOneIntegers(oneArrayOfOneIntegers);
    }

    @JsonCreator
    private OneArrayOfOneIntegers_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneArrayOfOneIntegers") final int[] oneArrayOfOneIntegers,
            @JsonProperty("calculatedOneArrayOfOneIntegers") final int[] calculatedOneArrayOfOneIntegers,
            @JsonProperty("persistedOneArrayOfOneIntegers") final int[] persistedOneArrayOfOneIntegers) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneArrayOfOneIntegers = oneArrayOfOneIntegers == null
                ? new int[] {}
                : oneArrayOfOneIntegers;
        this.calculatedOneArrayOfOneIntegers = calculatedOneArrayOfOneIntegers;
        this.persistedOneArrayOfOneIntegers = persistedOneArrayOfOneIntegers;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneArrayOfOneIntegers_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneArrayOfOneIntegers_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneArrayOfOneIntegers_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneArrayOfOneIntegers_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfOneIntegers_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneIntegers_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneArrayOfOneIntegers_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfOneIntegers_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneIntegers_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneArrayOfOneIntegers_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneIntegers_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneArrayOfOneIntegers_4.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfOneIntegers_4> search(
            final Specification<OneArrayOfOneIntegers_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneIntegers_4> search(
            final Specification<OneArrayOfOneIntegers_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneArrayOfOneIntegers_4> search(
            final Specification<OneArrayOfOneIntegers_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneIntegers_4> search(
            final Specification<OneArrayOfOneIntegers_4> specification,
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
                    .count(OneArrayOfOneIntegers_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneArrayOfOneIntegers_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneArrayOfOneIntegers_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneIntegers_4 result) {
        this.URI = result.URI;

        this.oneArrayOfOneIntegers = result.oneArrayOfOneIntegers;
        this.calculatedOneArrayOfOneIntegers = result.calculatedOneArrayOfOneIntegers;
        this.persistedOneArrayOfOneIntegers = result.persistedOneArrayOfOneIntegers;
        this.ID = result.ID;
    }

    public OneArrayOfOneIntegers_4 persist() throws java.io.IOException {
        final OneArrayOfOneIntegers_4 result;
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

    public OneArrayOfOneIntegers_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneArrayOfOneIntegers_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private int[] oneArrayOfOneIntegers;

    @JsonProperty("oneArrayOfOneIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int[] getOneArrayOfOneIntegers() {
        return oneArrayOfOneIntegers;
    }

    public OneArrayOfOneIntegers_4 setOneArrayOfOneIntegers(final int[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneIntegers\" cannot be null!");
        this.oneArrayOfOneIntegers = value;

        return this;
    }

    private int[] calculatedOneArrayOfOneIntegers;

    @JsonProperty("calculatedOneArrayOfOneIntegers")
    public int[] getCalculatedOneArrayOfOneIntegers() {
        return this.calculatedOneArrayOfOneIntegers;
    }

    private int[] persistedOneArrayOfOneIntegers;

    @JsonProperty("persistedOneArrayOfOneIntegers")
    public int[] getPersistedOneArrayOfOneIntegers() {
        return this.persistedOneArrayOfOneIntegers;
    }
}
