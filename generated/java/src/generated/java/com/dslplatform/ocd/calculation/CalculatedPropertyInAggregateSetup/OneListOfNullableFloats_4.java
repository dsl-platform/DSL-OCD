package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneListOfNullableFloats_4 implements java.io.Serializable,
        AggregateRoot {
    public OneListOfNullableFloats_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneListOfNullableFloats = new java.util.ArrayList<Float>();
        this.calculatedOneListOfNullableFloats = new java.util.ArrayList<Float>();
        this.persistedOneListOfNullableFloats = new java.util.ArrayList<Float>();
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
        final OneListOfNullableFloats_4 other = (OneListOfNullableFloats_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneListOfNullableFloats_4(" + URI + ')'
                : "new OneListOfNullableFloats_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneListOfNullableFloats_4(
            final java.util.List<Float> oneListOfNullableFloats) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneListOfNullableFloats(oneListOfNullableFloats);
    }

    @JsonCreator
    private OneListOfNullableFloats_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneListOfNullableFloats") final java.util.List<Float> oneListOfNullableFloats,
            @JsonProperty("calculatedOneListOfNullableFloats") final java.util.List<Float> calculatedOneListOfNullableFloats,
            @JsonProperty("persistedOneListOfNullableFloats") final java.util.List<Float> persistedOneListOfNullableFloats) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneListOfNullableFloats = oneListOfNullableFloats == null
                ? new java.util.ArrayList<Float>()
                : oneListOfNullableFloats;
        this.calculatedOneListOfNullableFloats = calculatedOneListOfNullableFloats;
        this.persistedOneListOfNullableFloats = persistedOneListOfNullableFloats;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneListOfNullableFloats_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneListOfNullableFloats_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneListOfNullableFloats_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfNullableFloats_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableFloats_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableFloats_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfNullableFloats_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableFloats_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableFloats_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfNullableFloats_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableFloats_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfNullableFloats_4.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableFloats_4> search(
            final Specification<OneListOfNullableFloats_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableFloats_4> search(
            final Specification<OneListOfNullableFloats_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfNullableFloats_4> search(
            final Specification<OneListOfNullableFloats_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableFloats_4> search(
            final Specification<OneListOfNullableFloats_4> specification,
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
                    .count(OneListOfNullableFloats_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfNullableFloats_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfNullableFloats_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableFloats_4 result) {
        this.URI = result.URI;

        this.oneListOfNullableFloats = result.oneListOfNullableFloats;
        this.calculatedOneListOfNullableFloats = result.calculatedOneListOfNullableFloats;
        this.persistedOneListOfNullableFloats = result.persistedOneListOfNullableFloats;
        this.ID = result.ID;
    }

    public OneListOfNullableFloats_4 persist() throws java.io.IOException {
        final OneListOfNullableFloats_4 result;
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

    public OneListOfNullableFloats_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneListOfNullableFloats_4.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<Float> oneListOfNullableFloats;

    @JsonProperty("oneListOfNullableFloats")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Float> getOneListOfNullableFloats() {
        return oneListOfNullableFloats;
    }

    public OneListOfNullableFloats_4 setOneListOfNullableFloats(
            final java.util.List<Float> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableFloats\" cannot be null!");
        this.oneListOfNullableFloats = value;

        return this;
    }

    private java.util.List<Float> calculatedOneListOfNullableFloats;

    @JsonProperty("calculatedOneListOfNullableFloats")
    public java.util.List<Float> getCalculatedOneListOfNullableFloats() {
        return this.calculatedOneListOfNullableFloats;
    }

    private java.util.List<Float> persistedOneListOfNullableFloats;

    @JsonProperty("persistedOneListOfNullableFloats")
    public java.util.List<Float> getPersistedOneListOfNullableFloats() {
        return this.persistedOneListOfNullableFloats;
    }
}
