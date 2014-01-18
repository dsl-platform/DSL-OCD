package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfNullableRectangles_3 implements java.io.Serializable,
        AggregateRoot {
    public OneSetOfNullableRectangles_3() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfNullableRectangles = new java.util.HashSet<java.awt.geom.Rectangle2D>();
        this.calculatedOneSetOfNullableRectangles = new java.util.HashSet<java.awt.geom.Rectangle2D>();
        this.persistedOneSetOfNullableRectangles = new java.util.HashSet<java.awt.geom.Rectangle2D>();
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
        final OneSetOfNullableRectangles_3 other = (OneSetOfNullableRectangles_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfNullableRectangles_3(" + URI + ')'
                : "new OneSetOfNullableRectangles_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfNullableRectangles_3(
            final java.util.Set<java.awt.geom.Rectangle2D> oneSetOfNullableRectangles) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfNullableRectangles(oneSetOfNullableRectangles);
    }

    @JsonCreator
    private OneSetOfNullableRectangles_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfNullableRectangles") final java.util.Set<java.awt.geom.Rectangle2D> oneSetOfNullableRectangles,
            @JsonProperty("calculatedOneSetOfNullableRectangles") final java.util.Set<java.awt.geom.Rectangle2D> calculatedOneSetOfNullableRectangles,
            @JsonProperty("persistedOneSetOfNullableRectangles") final java.util.Set<java.awt.geom.Rectangle2D> persistedOneSetOfNullableRectangles) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfNullableRectangles = oneSetOfNullableRectangles == null
                ? new java.util.HashSet<java.awt.geom.Rectangle2D>()
                : oneSetOfNullableRectangles;
        this.calculatedOneSetOfNullableRectangles = calculatedOneSetOfNullableRectangles;
        this.persistedOneSetOfNullableRectangles = persistedOneSetOfNullableRectangles;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfNullableRectangles_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfNullableRectangles_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfNullableRectangles_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfNullableRectangles_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableRectangles_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableRectangles_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfNullableRectangles_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableRectangles_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableRectangles_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfNullableRectangles_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableRectangles_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfNullableRectangles_3.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableRectangles_3> search(
            final Specification<OneSetOfNullableRectangles_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableRectangles_3> search(
            final Specification<OneSetOfNullableRectangles_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfNullableRectangles_3> search(
            final Specification<OneSetOfNullableRectangles_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableRectangles_3> search(
            final Specification<OneSetOfNullableRectangles_3> specification,
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
                    .count(OneSetOfNullableRectangles_3.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfNullableRectangles_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfNullableRectangles_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableRectangles_3 result) {
        this.URI = result.URI;

        this.oneSetOfNullableRectangles = result.oneSetOfNullableRectangles;
        this.calculatedOneSetOfNullableRectangles = result.calculatedOneSetOfNullableRectangles;
        this.persistedOneSetOfNullableRectangles = result.persistedOneSetOfNullableRectangles;
        this.ID = result.ID;
    }

    public OneSetOfNullableRectangles_3 persist() throws java.io.IOException {
        final OneSetOfNullableRectangles_3 result;
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

    public OneSetOfNullableRectangles_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfNullableRectangles_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<java.awt.geom.Rectangle2D> oneSetOfNullableRectangles;

    @JsonProperty("oneSetOfNullableRectangles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Rectangle2D> getOneSetOfNullableRectangles() {
        return oneSetOfNullableRectangles;
    }

    public OneSetOfNullableRectangles_3 setOneSetOfNullableRectangles(
            final java.util.Set<java.awt.geom.Rectangle2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableRectangles\" cannot be null!");
        this.oneSetOfNullableRectangles = value;

        return this;
    }

    private java.util.Set<java.awt.geom.Rectangle2D> calculatedOneSetOfNullableRectangles;

    @JsonProperty("calculatedOneSetOfNullableRectangles")
    public java.util.Set<java.awt.geom.Rectangle2D> getCalculatedOneSetOfNullableRectangles() {
        return this.calculatedOneSetOfNullableRectangles;
    }

    private java.util.Set<java.awt.geom.Rectangle2D> persistedOneSetOfNullableRectangles;

    @JsonProperty("persistedOneSetOfNullableRectangles")
    public java.util.Set<java.awt.geom.Rectangle2D> getPersistedOneSetOfNullableRectangles() {
        return this.persistedOneSetOfNullableRectangles;
    }
}
