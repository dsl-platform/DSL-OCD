package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableArrayOfOneRectanglesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateRectangle.Aggregate0A1Re> aggregate0A1ReRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableArrayOfOneRectanglesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0A1ReRepository = locator.resolve(ocd.AggregateSurrogateRectangle.repositories.Aggregate0A1ReRepository.class);
    }

    /* Testing the "p0A1Re" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1ReDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A1Re();
        final java.awt.geom.Rectangle2D[] testValue = aggregate.getP0A1Re();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0A1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Re());
    }

    /* Testing the "p0A1Re" Default property value after active record persist */
    @org.junit.Test
    public void testP0A1ReDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A1Re();
        final java.awt.geom.Rectangle2D[] testValue = aggregate.getP0A1Re();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Re().getP0A1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Re" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1ReNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D[] testValue = new java.awt.geom.Rectangle2D[] { new java.awt.geom.Rectangle2D.Float() };
        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A1Re()
                .setP0A1Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0A1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Re());
    }

    /* Testing the "p0A1Re" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0A1ReNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D[] testValue = new java.awt.geom.Rectangle2D[] { new java.awt.geom.Rectangle2D.Float() };
        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A1Re()
                .setP0A1Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Re().getP0A1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Re" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1ReNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D[] testValue = new java.awt.geom.Rectangle2D[] { new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001) };
        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A1Re()
                .setP0A1Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0A1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Re());
    }

    /* Testing the "p0A1Re" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0A1ReNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D[] testValue = new java.awt.geom.Rectangle2D[] { new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001) };
        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A1Re()
                .setP0A1Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Re().getP0A1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Re" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1ReNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D[] testValue = new java.awt.geom.Rectangle2D[] { new java.awt.geom.Rectangle2D.Float(), new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE), new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000), new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE), new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f), new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE), new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001) };
        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A1Re()
                .setP0A1Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0A1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Re());
    }

    /* Testing the "p0A1Re" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0A1ReNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D[] testValue = new java.awt.geom.Rectangle2D[] { new java.awt.geom.Rectangle2D.Float(), new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE), new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000), new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE), new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f), new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE), new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001) };
        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A1Re()
                .setP0A1Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Re().getP0A1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0A1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
