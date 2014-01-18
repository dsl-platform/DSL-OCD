package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneListOfOneLocations_3 implements java.io.Serializable,
        AggregateRoot {
    public OneListOfOneLocations_3() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneListOfOneLocations = new java.util.ArrayList<java.awt.geom.Point2D>();
        this.calculatedOneListOfOneLocations = new java.util.ArrayList<java.awt.geom.Point2D>();
        this.persistedOneListOfOneLocations = new java.util.ArrayList<java.awt.geom.Point2D>();
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
        final OneListOfOneLocations_3 other = (OneListOfOneLocations_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneListOfOneLocations_3(" + URI + ')'
                : "new OneListOfOneLocations_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneListOfOneLocations_3(
            final java.util.List<java.awt.geom.Point2D> oneListOfOneLocations) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneListOfOneLocations(oneListOfOneLocations);
    }

    @JsonCreator
    private OneListOfOneLocations_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneListOfOneLocations") final java.util.List<java.awt.geom.Point2D> oneListOfOneLocations,
            @JsonProperty("calculatedOneListOfOneLocations") final java.util.List<java.awt.geom.Point2D> calculatedOneListOfOneLocations,
            @JsonProperty("persistedOneListOfOneLocations") final java.util.List<java.awt.geom.Point2D> persistedOneListOfOneLocations) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneListOfOneLocations = oneListOfOneLocations == null
                ? new java.util.ArrayList<java.awt.geom.Point2D>()
                : oneListOfOneLocations;
        this.calculatedOneListOfOneLocations = calculatedOneListOfOneLocations;
        this.persistedOneListOfOneLocations = persistedOneListOfOneLocations;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneListOfOneLocations_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneListOfOneLocations_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneListOfOneLocations_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfOneLocations_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneLocations_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneLocations_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfOneLocations_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneLocations_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneLocations_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfOneLocations_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneLocations_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfOneLocations_3.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneLocations_3> search(
            final Specification<OneListOfOneLocations_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneLocations_3> search(
            final Specification<OneListOfOneLocations_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfOneLocations_3> search(
            final Specification<OneListOfOneLocations_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneLocations_3> search(
            final Specification<OneListOfOneLocations_3> specification,
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
                    .count(OneListOfOneLocations_3.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfOneLocations_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfOneLocations_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneLocations_3 result) {
        this.URI = result.URI;

        this.oneListOfOneLocations = result.oneListOfOneLocations;
        this.calculatedOneListOfOneLocations = result.calculatedOneListOfOneLocations;
        this.persistedOneListOfOneLocations = result.persistedOneListOfOneLocations;
        this.ID = result.ID;
    }

    public OneListOfOneLocations_3 persist() throws java.io.IOException {
        final OneListOfOneLocations_3 result;
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

    public OneListOfOneLocations_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneListOfOneLocations_3.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<java.awt.geom.Point2D> oneListOfOneLocations;

    @JsonProperty("oneListOfOneLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.geom.Point2D> getOneListOfOneLocations() {
        return oneListOfOneLocations;
    }

    public OneListOfOneLocations_3 setOneListOfOneLocations(
            final java.util.List<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneLocations\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneLocations = value;

        return this;
    }

    private java.util.List<java.awt.geom.Point2D> calculatedOneListOfOneLocations;

    @JsonProperty("calculatedOneListOfOneLocations")
    public java.util.List<java.awt.geom.Point2D> getCalculatedOneListOfOneLocations() {
        return this.calculatedOneListOfOneLocations;
    }

    private java.util.List<java.awt.geom.Point2D> persistedOneListOfOneLocations;

    @JsonProperty("persistedOneListOfOneLocations")
    public java.util.List<java.awt.geom.Point2D> getPersistedOneListOfOneLocations() {
        return this.persistedOneListOfOneLocations;
    }
}
