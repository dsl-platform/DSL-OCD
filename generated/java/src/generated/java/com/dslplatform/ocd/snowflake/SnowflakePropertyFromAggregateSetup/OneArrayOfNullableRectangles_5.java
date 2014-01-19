package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneArrayOfNullableRectangles_5 implements java.io.Serializable,
        AggregateRoot {
    public OneArrayOfNullableRectangles_5() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneArrayOfNullableRectangles = new java.awt.geom.Rectangle2D[] {};
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
        final OneArrayOfNullableRectangles_5 other = (OneArrayOfNullableRectangles_5) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneArrayOfNullableRectangles_5(" + URI + ')'
                : "new OneArrayOfNullableRectangles_5(" + super.hashCode()
                        + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneArrayOfNullableRectangles_5(
            final java.awt.geom.Rectangle2D[] oneArrayOfNullableRectangles) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneArrayOfNullableRectangles(oneArrayOfNullableRectangles);
    }

    @JsonCreator
    private OneArrayOfNullableRectangles_5(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneArrayOfNullableRectangles") final java.awt.geom.Rectangle2D[] oneArrayOfNullableRectangles) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneArrayOfNullableRectangles = oneArrayOfNullableRectangles == null
                ? new java.awt.geom.Rectangle2D[] {}
                : oneArrayOfNullableRectangles;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneArrayOfNullableRectangles_5 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneArrayOfNullableRectangles_5 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneArrayOfNullableRectangles_5 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneArrayOfNullableRectangles_5.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableRectangles_5> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableRectangles_5> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneArrayOfNullableRectangles_5.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableRectangles_5> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableRectangles_5> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableRectangles_5> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableRectangles_5> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneArrayOfNullableRectangles_5.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableRectangles_5> search(
            final Specification<OneArrayOfNullableRectangles_5> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableRectangles_5> search(
            final Specification<OneArrayOfNullableRectangles_5> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableRectangles_5> search(
            final Specification<OneArrayOfNullableRectangles_5> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableRectangles_5> search(
            final Specification<OneArrayOfNullableRectangles_5> specification,
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
                    .count(OneArrayOfNullableRectangles_5.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneArrayOfNullableRectangles_5> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneArrayOfNullableRectangles_5> specification,
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
            final com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableRectangles_5 result) {
        this.URI = result.URI;

        this.oneArrayOfNullableRectangles = result.oneArrayOfNullableRectangles;
        this.ID = result.ID;
    }

    public OneArrayOfNullableRectangles_5 persist() throws java.io.IOException {
        final OneArrayOfNullableRectangles_5 result;
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

    public OneArrayOfNullableRectangles_5 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneArrayOfNullableRectangles_5.class, URI)
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

    public OneArrayOfNullableRectangles_5 setOneArrayOfNullableRectangles(
            final java.awt.geom.Rectangle2D[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableRectangles\" cannot be null!");
        this.oneArrayOfNullableRectangles = value;

        return this;
    }
}
