package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfOnePoints_3 implements java.io.Serializable, AggregateRoot {
    public OneSetOfOnePoints_3() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfOnePoints = new java.util.HashSet<java.awt.geom.Point2D>();
        this.calculatedOneSetOfOnePoints = new java.util.HashSet<java.awt.geom.Point2D>();
        this.persistedOneSetOfOnePoints = new java.util.HashSet<java.awt.geom.Point2D>();
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
        final OneSetOfOnePoints_3 other = (OneSetOfOnePoints_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfOnePoints_3(" + URI + ')'
                : "new OneSetOfOnePoints_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfOnePoints_3(
            final java.util.Set<java.awt.geom.Point2D> oneSetOfOnePoints) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfOnePoints(oneSetOfOnePoints);
    }

    @JsonCreator
    private OneSetOfOnePoints_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfOnePoints") final java.util.Set<java.awt.geom.Point2D> oneSetOfOnePoints,
            @JsonProperty("calculatedOneSetOfOnePoints") final java.util.Set<java.awt.geom.Point2D> calculatedOneSetOfOnePoints,
            @JsonProperty("persistedOneSetOfOnePoints") final java.util.Set<java.awt.geom.Point2D> persistedOneSetOfOnePoints) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfOnePoints = oneSetOfOnePoints == null
                ? new java.util.HashSet<java.awt.geom.Point2D>()
                : oneSetOfOnePoints;
        this.calculatedOneSetOfOnePoints = calculatedOneSetOfOnePoints;
        this.persistedOneSetOfOnePoints = persistedOneSetOfOnePoints;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfOnePoints_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfOnePoints_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfOnePoints_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfOnePoints_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOnePoints_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOnePoints_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfOnePoints_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOnePoints_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOnePoints_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfOnePoints_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOnePoints_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfOnePoints_3.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOnePoints_3> search(
            final Specification<OneSetOfOnePoints_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOnePoints_3> search(
            final Specification<OneSetOfOnePoints_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfOnePoints_3> search(
            final Specification<OneSetOfOnePoints_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOnePoints_3> search(
            final Specification<OneSetOfOnePoints_3> specification,
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
                    .count(OneSetOfOnePoints_3.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfOnePoints_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfOnePoints_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOnePoints_3 result) {
        this.URI = result.URI;

        this.oneSetOfOnePoints = result.oneSetOfOnePoints;
        this.calculatedOneSetOfOnePoints = result.calculatedOneSetOfOnePoints;
        this.persistedOneSetOfOnePoints = result.persistedOneSetOfOnePoints;
        this.ID = result.ID;
    }

    public OneSetOfOnePoints_3 persist() throws java.io.IOException {
        final OneSetOfOnePoints_3 result;
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

    public OneSetOfOnePoints_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfOnePoints_3.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<java.awt.geom.Point2D> oneSetOfOnePoints;

    @JsonProperty("oneSetOfOnePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Point2D> getOneSetOfOnePoints() {
        return oneSetOfOnePoints;
    }

    public OneSetOfOnePoints_3 setOneSetOfOnePoints(
            final java.util.Set<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOnePoints\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOnePoints = value;

        return this;
    }

    private java.util.Set<java.awt.geom.Point2D> calculatedOneSetOfOnePoints;

    @JsonProperty("calculatedOneSetOfOnePoints")
    public java.util.Set<java.awt.geom.Point2D> getCalculatedOneSetOfOnePoints() {
        return this.calculatedOneSetOfOnePoints;
    }

    private java.util.Set<java.awt.geom.Point2D> persistedOneSetOfOnePoints;

    @JsonProperty("persistedOneSetOfOnePoints")
    public java.util.Set<java.awt.geom.Point2D> getPersistedOneSetOfOnePoints() {
        return this.persistedOneSetOfOnePoints;
    }
}
