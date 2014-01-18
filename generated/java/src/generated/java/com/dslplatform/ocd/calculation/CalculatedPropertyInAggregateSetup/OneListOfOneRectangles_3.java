package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneListOfOneRectangles_3 implements java.io.Serializable,
        AggregateRoot {
    public OneListOfOneRectangles_3() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneListOfOneRectangles = new java.util.ArrayList<java.awt.geom.Rectangle2D>();
        this.calculatedOneListOfOneRectangles = new java.util.ArrayList<java.awt.geom.Rectangle2D>();
        this.persistedOneListOfOneRectangles = new java.util.ArrayList<java.awt.geom.Rectangle2D>();
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
        final OneListOfOneRectangles_3 other = (OneListOfOneRectangles_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneListOfOneRectangles_3(" + URI + ')'
                : "new OneListOfOneRectangles_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneListOfOneRectangles_3(
            final java.util.List<java.awt.geom.Rectangle2D> oneListOfOneRectangles) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneListOfOneRectangles(oneListOfOneRectangles);
    }

    @JsonCreator
    private OneListOfOneRectangles_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneListOfOneRectangles") final java.util.List<java.awt.geom.Rectangle2D> oneListOfOneRectangles,
            @JsonProperty("calculatedOneListOfOneRectangles") final java.util.List<java.awt.geom.Rectangle2D> calculatedOneListOfOneRectangles,
            @JsonProperty("persistedOneListOfOneRectangles") final java.util.List<java.awt.geom.Rectangle2D> persistedOneListOfOneRectangles) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneListOfOneRectangles = oneListOfOneRectangles == null
                ? new java.util.ArrayList<java.awt.geom.Rectangle2D>()
                : oneListOfOneRectangles;
        this.calculatedOneListOfOneRectangles = calculatedOneListOfOneRectangles;
        this.persistedOneListOfOneRectangles = persistedOneListOfOneRectangles;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneListOfOneRectangles_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneListOfOneRectangles_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneListOfOneRectangles_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfOneRectangles_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneRectangles_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneRectangles_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfOneRectangles_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneRectangles_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneRectangles_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfOneRectangles_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneRectangles_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfOneRectangles_3.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneRectangles_3> search(
            final Specification<OneListOfOneRectangles_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneRectangles_3> search(
            final Specification<OneListOfOneRectangles_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfOneRectangles_3> search(
            final Specification<OneListOfOneRectangles_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneRectangles_3> search(
            final Specification<OneListOfOneRectangles_3> specification,
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
                    .count(OneListOfOneRectangles_3.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfOneRectangles_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfOneRectangles_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneRectangles_3 result) {
        this.URI = result.URI;

        this.oneListOfOneRectangles = result.oneListOfOneRectangles;
        this.calculatedOneListOfOneRectangles = result.calculatedOneListOfOneRectangles;
        this.persistedOneListOfOneRectangles = result.persistedOneListOfOneRectangles;
        this.ID = result.ID;
    }

    public OneListOfOneRectangles_3 persist() throws java.io.IOException {
        final OneListOfOneRectangles_3 result;
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

    public OneListOfOneRectangles_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneListOfOneRectangles_3.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<java.awt.geom.Rectangle2D> oneListOfOneRectangles;

    @JsonProperty("oneListOfOneRectangles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.geom.Rectangle2D> getOneListOfOneRectangles() {
        return oneListOfOneRectangles;
    }

    public OneListOfOneRectangles_3 setOneListOfOneRectangles(
            final java.util.List<java.awt.geom.Rectangle2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneRectangles\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneRectangles = value;

        return this;
    }

    private java.util.List<java.awt.geom.Rectangle2D> calculatedOneListOfOneRectangles;

    @JsonProperty("calculatedOneListOfOneRectangles")
    public java.util.List<java.awt.geom.Rectangle2D> getCalculatedOneListOfOneRectangles() {
        return this.calculatedOneListOfOneRectangles;
    }

    private java.util.List<java.awt.geom.Rectangle2D> persistedOneListOfOneRectangles;

    @JsonProperty("persistedOneListOfOneRectangles")
    public java.util.List<java.awt.geom.Rectangle2D> getPersistedOneListOfOneRectangles() {
        return this.persistedOneListOfOneRectangles;
    }
}
