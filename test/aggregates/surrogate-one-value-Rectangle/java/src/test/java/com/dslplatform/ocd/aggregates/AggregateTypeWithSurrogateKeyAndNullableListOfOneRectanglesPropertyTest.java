package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableListOfOneRectanglesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateRectangle.Aggregate0L1Re> aggregate0L1ReRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableListOfOneRectanglesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0L1ReRepository = locator.resolve(ocd.AggregateSurrogateRectangle.repositories.Aggregate0L1ReRepository.class);
    }

    /* Testing the "p0L1Re" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1ReDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0L1Re();
        final java.util.List<java.awt.geom.Rectangle2D> testValue = aggregate.getP0L1Re();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0L1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Re());
    }

    /* Testing the "p0L1Re" Default property value after active record persist */
    @org.junit.Test
    public void testP0L1ReDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0L1Re();
        final java.util.List<java.awt.geom.Rectangle2D> testValue = aggregate.getP0L1Re();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Re().getP0L1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0L1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0L1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L1Re" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1ReNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.geom.Rectangle2D> testValue = new java.util.ArrayList<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Float()); }};
        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0L1Re()
                .setP0L1Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0L1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Re());
    }

    /* Testing the "p0L1Re" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0L1ReNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.geom.Rectangle2D> testValue = new java.util.ArrayList<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Float()); }};
        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0L1Re()
                .setP0L1Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Re().getP0L1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0L1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0L1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L1Re" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1ReNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.geom.Rectangle2D> testValue = new java.util.ArrayList<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0L1Re()
                .setP0L1Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0L1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Re());
    }

    /* Testing the "p0L1Re" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0L1ReNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.geom.Rectangle2D> testValue = new java.util.ArrayList<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0L1Re()
                .setP0L1Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Re().getP0L1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0L1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0L1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L1Re" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1ReNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.geom.Rectangle2D> testValue = new java.util.ArrayList<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Float()); add(new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)); add(new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)); add(new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0L1Re()
                .setP0L1Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0L1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Re());
    }

    /* Testing the "p0L1Re" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0L1ReNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.geom.Rectangle2D> testValue = new java.util.ArrayList<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Float()); add(new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)); add(new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)); add(new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0L1Re()
                .setP0L1Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Re().getP0L1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0L1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0L1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0L1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
