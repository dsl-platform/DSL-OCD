package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableRectanglePropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateRectangle.Aggregate0Re> aggregate0ReRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableRectanglePropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0ReRepository = locator.resolve(ocd.AggregateSurrogateRectangle.repositories.Aggregate0ReRepository.class);
    }

    /* Testing the "p0Re" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0ReDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0Re();
        final java.awt.geom.Rectangle2D testValue = aggregate.getP0Re();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Re());
    }

    /* Testing the "p0Re" Default property value after active record persist */
    @org.junit.Test
    public void testP0ReDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0Re();
        final java.awt.geom.Rectangle2D testValue = aggregate.getP0Re();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Re().getP0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Re" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0ReNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Float();
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0Re()
                .setP0Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Re());
    }

    /* Testing the "p0Re" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0ReNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Float();
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0Re()
                .setP0Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Re().getP0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Re" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0ReNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0Re()
                .setP0Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Re());
    }

    /* Testing the "p0Re" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0ReNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0Re()
                .setP0Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Re().getP0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Re" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0ReNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0Re()
                .setP0Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Re());
    }

    /* Testing the "p0Re" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0ReNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0Re()
                .setP0Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Re().getP0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Re" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0ReNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0Re()
                .setP0Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Re());
    }

    /* Testing the "p0Re" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0ReNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0Re()
                .setP0Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Re().getP0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Re" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0ReNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0Re()
                .setP0Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Re());
    }

    /* Testing the "p0Re" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0ReNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0Re()
                .setP0Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Re().getP0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Re" NonDefault6 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0ReNonDefault6PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0Re()
                .setP0Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Re());
    }

    /* Testing the "p0Re" NonDefault6 property value after active record persist */
    @org.junit.Test
    public void testP0ReNonDefault6PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0Re()
                .setP0Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Re().getP0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Re" NonDefault7 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0ReNonDefault7PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0Re()
                .setP0Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Re());
    }

    /* Testing the "p0Re" NonDefault7 property value after active record persist */
    @org.junit.Test
    public void testP0ReNonDefault7PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001);
        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0Re()
                .setP0Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Re().getP0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
