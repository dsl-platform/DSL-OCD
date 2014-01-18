package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfNullablePoints_3 implements java.io.Serializable,
        AggregateRoot {
    public OneSetOfNullablePoints_3() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfNullablePoints = new java.util.HashSet<java.awt.geom.Point2D>();
        this.calculatedOneSetOfNullablePoints = new java.util.HashSet<java.awt.geom.Point2D>();
        this.persistedOneSetOfNullablePoints = new java.util.HashSet<java.awt.geom.Point2D>();
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
        final OneSetOfNullablePoints_3 other = (OneSetOfNullablePoints_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfNullablePoints_3(" + URI + ')'
                : "new OneSetOfNullablePoints_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfNullablePoints_3(
            final java.util.Set<java.awt.geom.Point2D> oneSetOfNullablePoints) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfNullablePoints(oneSetOfNullablePoints);
    }

    @JsonCreator
    private OneSetOfNullablePoints_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfNullablePoints") final java.util.Set<java.awt.geom.Point2D> oneSetOfNullablePoints,
            @JsonProperty("calculatedOneSetOfNullablePoints") final java.util.Set<java.awt.geom.Point2D> calculatedOneSetOfNullablePoints,
            @JsonProperty("persistedOneSetOfNullablePoints") final java.util.Set<java.awt.geom.Point2D> persistedOneSetOfNullablePoints) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfNullablePoints = oneSetOfNullablePoints == null
                ? new java.util.HashSet<java.awt.geom.Point2D>()
                : oneSetOfNullablePoints;
        this.calculatedOneSetOfNullablePoints = calculatedOneSetOfNullablePoints;
        this.persistedOneSetOfNullablePoints = persistedOneSetOfNullablePoints;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfNullablePoints_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfNullablePoints_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfNullablePoints_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfNullablePoints_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullablePoints_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullablePoints_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfNullablePoints_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullablePoints_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullablePoints_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfNullablePoints_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullablePoints_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfNullablePoints_3.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullablePoints_3> search(
            final Specification<OneSetOfNullablePoints_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullablePoints_3> search(
            final Specification<OneSetOfNullablePoints_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfNullablePoints_3> search(
            final Specification<OneSetOfNullablePoints_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullablePoints_3> search(
            final Specification<OneSetOfNullablePoints_3> specification,
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
                    .count(OneSetOfNullablePoints_3.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfNullablePoints_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfNullablePoints_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullablePoints_3 result) {
        this.URI = result.URI;

        this.oneSetOfNullablePoints = result.oneSetOfNullablePoints;
        this.calculatedOneSetOfNullablePoints = result.calculatedOneSetOfNullablePoints;
        this.persistedOneSetOfNullablePoints = result.persistedOneSetOfNullablePoints;
        this.ID = result.ID;
    }

    public OneSetOfNullablePoints_3 persist() throws java.io.IOException {
        final OneSetOfNullablePoints_3 result;
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

    public OneSetOfNullablePoints_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfNullablePoints_3.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<java.awt.geom.Point2D> oneSetOfNullablePoints;

    @JsonProperty("oneSetOfNullablePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Point2D> getOneSetOfNullablePoints() {
        return oneSetOfNullablePoints;
    }

    public OneSetOfNullablePoints_3 setOneSetOfNullablePoints(
            final java.util.Set<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullablePoints\" cannot be null!");
        this.oneSetOfNullablePoints = value;

        return this;
    }

    private java.util.Set<java.awt.geom.Point2D> calculatedOneSetOfNullablePoints;

    @JsonProperty("calculatedOneSetOfNullablePoints")
    public java.util.Set<java.awt.geom.Point2D> getCalculatedOneSetOfNullablePoints() {
        return this.calculatedOneSetOfNullablePoints;
    }

    private java.util.Set<java.awt.geom.Point2D> persistedOneSetOfNullablePoints;

    @JsonProperty("persistedOneSetOfNullablePoints")
    public java.util.Set<java.awt.geom.Point2D> getPersistedOneSetOfNullablePoints() {
        return this.persistedOneSetOfNullablePoints;
    }
}
