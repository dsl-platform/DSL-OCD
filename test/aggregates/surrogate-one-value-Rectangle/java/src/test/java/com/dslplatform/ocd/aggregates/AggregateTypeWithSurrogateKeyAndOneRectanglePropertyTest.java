package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneRectanglePropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateRectangle.Aggregate1Re> aggregate1ReRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneRectanglePropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1ReRepository = locator.resolve(ocd.AggregateSurrogateRectangle.repositories.Aggregate1ReRepository.class);
    }

    /* Testing the "p1Re" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1ReDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1Re();
        final java.awt.geom.Rectangle2D testValue = aggregate.getP1Re();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Re());
    }

    /* Testing the "p1Re" Default property value after active record persist */
    @org.junit.Test
    public void testP1ReDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1Re();
        final java.awt.geom.Rectangle2D testValue = aggregate.getP1Re();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Re().getP1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Re" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1ReNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1Re()
                .setP1Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Re());
    }

    /* Testing the "p1Re" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1ReNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1Re()
                .setP1Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Re().getP1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Re" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1ReNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1Re()
                .setP1Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Re());
    }

    /* Testing the "p1Re" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1ReNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1Re()
                .setP1Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Re().getP1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Re" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1ReNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1Re()
                .setP1Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Re());
    }

    /* Testing the "p1Re" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1ReNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1Re()
                .setP1Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Re().getP1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Re" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1ReNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1Re()
                .setP1Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Re());
    }

    /* Testing the "p1Re" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1ReNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1Re()
                .setP1Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Re().getP1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Re" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1ReNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1Re()
                .setP1Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Re());
    }

    /* Testing the "p1Re" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1ReNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1Re()
                .setP1Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Re().getP1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Re" NonDefault6 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1ReNonDefault6PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1Re()
                .setP1Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Re());
    }

    /* Testing the "p1Re" NonDefault6 property value after active record persist */
    @org.junit.Test
    public void testP1ReNonDefault6PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D testValue = new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001);
        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1Re()
                .setP1Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Re().getP1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
