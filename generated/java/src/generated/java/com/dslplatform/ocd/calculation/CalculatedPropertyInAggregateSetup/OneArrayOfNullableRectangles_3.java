package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneArrayOfNullableRectangles_3 implements java.io.Serializable,
        AggregateRoot {
    public OneArrayOfNullableRectangles_3() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneArrayOfNullableRectangles = new java.awt.geom.Rectangle2D[] {};
        this.calculatedOneArrayOfNullableRectangles = new java.awt.geom.Rectangle2D[] {};
        this.persistedOneArrayOfNullableRectangles = new java.awt.geom.Rectangle2D[] {};
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
        final OneArrayOfNullableRectangles_3 other = (OneArrayOfNullableRectangles_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneArrayOfNullableRectangles_3(" + URI + ')'
                : "new OneArrayOfNullableRectangles_3(" + super.hashCode()
                        + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneArrayOfNullableRectangles_3(
            final java.awt.geom.Rectangle2D[] oneArrayOfNullableRectangles) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneArrayOfNullableRectangles(oneArrayOfNullableRectangles);
    }

    @JsonCreator
    private OneArrayOfNullableRectangles_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneArrayOfNullableRectangles") final java.awt.geom.Rectangle2D[] oneArrayOfNullableRectangles,
            @JsonProperty("calculatedOneArrayOfNullableRectangles") final java.awt.geom.Rectangle2D[] calculatedOneArrayOfNullableRectangles,
            @JsonProperty("persistedOneArrayOfNullableRectangles") final java.awt.geom.Rectangle2D[] persistedOneArrayOfNullableRectangles) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneArrayOfNullableRectangles = oneArrayOfNullableRectangles == null
                ? new java.awt.geom.Rectangle2D[] {}
                : oneArrayOfNullableRectangles;
        this.calculatedOneArrayOfNullableRectangles = calculatedOneArrayOfNullableRectangles;
        this.persistedOneArrayOfNullableRectangles = persistedOneArrayOfNullableRectangles;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneArrayOfNullableRectangles_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneArrayOfNullableRectangles_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneArrayOfNullableRectangles_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneArrayOfNullableRectangles_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableRectangles_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableRectangles_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneArrayOfNullableRectangles_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableRectangles_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableRectangles_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableRectangles_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableRectangles_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneArrayOfNullableRectangles_3.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableRectangles_3> search(
            final Specification<OneArrayOfNullableRectangles_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableRectangles_3> search(
            final Specification<OneArrayOfNullableRectangles_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableRectangles_3> search(
            final Specification<OneArrayOfNullableRectangles_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableRectangles_3> search(
            final Specification<OneArrayOfNullableRectangles_3> specification,
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
                    .count(OneArrayOfNullableRectangles_3.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneArrayOfNullableRectangles_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneArrayOfNullableRectangles_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableRectangles_3 result) {
        this.URI = result.URI;

        this.oneArrayOfNullableRectangles = result.oneArrayOfNullableRectangles;
        this.calculatedOneArrayOfNullableRectangles = result.calculatedOneArrayOfNullableRectangles;
        this.persistedOneArrayOfNullableRectangles = result.persistedOneArrayOfNullableRectangles;
        this.ID = result.ID;
    }

    public OneArrayOfNullableRectangles_3 persist() throws java.io.IOException {
        final OneArrayOfNullableRectangles_3 result;
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

    public OneArrayOfNullableRectangles_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneArrayOfNullableRectangles_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.awt.geom.Rectangle2D[] oneArrayOfNullableRectangles;

    @JsonProperty("oneArrayOfNullableRectangles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Rectangle2D[] getOneArrayOfNullableRectangles() {
        return oneArrayOfNullableRectangles;
    }

    public OneArrayOfNullableRectangles_3 setOneArrayOfNullableRectangles(
            final java.awt.geom.Rectangle2D[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableRectangles\" cannot be null!");
        this.oneArrayOfNullableRectangles = value;

        return this;
    }

    private java.awt.geom.Rectangle2D[] calculatedOneArrayOfNullableRectangles;

    @JsonProperty("calculatedOneArrayOfNullableRectangles")
    public java.awt.geom.Rectangle2D[] getCalculatedOneArrayOfNullableRectangles() {
        return this.calculatedOneArrayOfNullableRectangles;
    }

    private java.awt.geom.Rectangle2D[] persistedOneArrayOfNullableRectangles;

    @JsonProperty("persistedOneArrayOfNullableRectangles")
    public java.awt.geom.Rectangle2D[] getPersistedOneArrayOfNullableRectangles() {
        return this.persistedOneArrayOfNullableRectangles;
    }
}
