package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfOneLocations_5 implements java.io.Serializable,
        AggregateRoot {
    public OneSetOfOneLocations_5() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfOneLocations = new java.util.HashSet<java.awt.geom.Point2D>();
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
        final OneSetOfOneLocations_5 other = (OneSetOfOneLocations_5) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfOneLocations_5(" + URI + ')'
                : "new OneSetOfOneLocations_5(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfOneLocations_5(
            final java.util.Set<java.awt.geom.Point2D> oneSetOfOneLocations) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfOneLocations(oneSetOfOneLocations);
    }

    @JsonCreator
    private OneSetOfOneLocations_5(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfOneLocations") final java.util.Set<java.awt.geom.Point2D> oneSetOfOneLocations) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfOneLocations = oneSetOfOneLocations == null
                ? new java.util.HashSet<java.awt.geom.Point2D>()
                : oneSetOfOneLocations;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfOneLocations_5 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfOneLocations_5 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfOneLocations_5 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfOneLocations_5.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneLocations_5> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneLocations_5> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfOneLocations_5.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneLocations_5> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneLocations_5> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfOneLocations_5> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneLocations_5> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfOneLocations_5.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneLocations_5> search(
            final Specification<OneSetOfOneLocations_5> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneLocations_5> search(
            final Specification<OneSetOfOneLocations_5> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfOneLocations_5> search(
            final Specification<OneSetOfOneLocations_5> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneLocations_5> search(
            final Specification<OneSetOfOneLocations_5> specification,
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
                    .count(OneSetOfOneLocations_5.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfOneLocations_5> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfOneLocations_5> specification,
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
            final com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneLocations_5 result) {
        this.URI = result.URI;

        this.oneSetOfOneLocations = result.oneSetOfOneLocations;
        this.ID = result.ID;
    }

    public OneSetOfOneLocations_5 persist() throws java.io.IOException {
        final OneSetOfOneLocations_5 result;
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

    public OneSetOfOneLocations_5 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfOneLocations_5.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<java.awt.geom.Point2D> oneSetOfOneLocations;

    @JsonProperty("oneSetOfOneLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Point2D> getOneSetOfOneLocations() {
        return oneSetOfOneLocations;
    }

    public OneSetOfOneLocations_5 setOneSetOfOneLocations(
            final java.util.Set<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneLocations\" cannot be null!");
        com.dslplatform.ocd.snowflake.Guards.checkNulls(value);
        this.oneSetOfOneLocations = value;

        return this;
    }
}
