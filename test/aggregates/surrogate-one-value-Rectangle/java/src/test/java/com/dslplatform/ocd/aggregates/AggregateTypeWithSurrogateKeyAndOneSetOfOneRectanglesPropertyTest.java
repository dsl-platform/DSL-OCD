package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneSetOfOneRectanglesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateRectangle.Aggregate1S1Re> aggregate1S1ReRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneSetOfOneRectanglesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1S1ReRepository = locator.resolve(ocd.AggregateSurrogateRectangle.repositories.Aggregate1S1ReRepository.class);
    }

    /* Testing the "p1S1Re" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1ReDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1S1Re();
        final java.util.Set<java.awt.geom.Rectangle2D> testValue = aggregate.getP1S1Re();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate1S1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1Re());
    }

    /* Testing the "p1S1Re" Default property value after active record persist */
    @org.junit.Test
    public void testP1S1ReDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1S1Re();
        final java.util.Set<java.awt.geom.Rectangle2D> testValue = aggregate.getP1S1Re();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Re().getP1S1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1S1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1S1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S1Re" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1ReNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Rectangle2D> testValue = new java.util.HashSet<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Float()); }};
        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1S1Re()
                .setP1S1Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate1S1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1Re());
    }

    /* Testing the "p1S1Re" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1S1ReNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Rectangle2D> testValue = new java.util.HashSet<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Float()); }};
        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1S1Re()
                .setP1S1Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Re().getP1S1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1S1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1S1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S1Re" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1ReNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Rectangle2D> testValue = new java.util.HashSet<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1S1Re()
                .setP1S1Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate1S1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1Re());
    }

    /* Testing the "p1S1Re" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1S1ReNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Rectangle2D> testValue = new java.util.HashSet<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1S1Re()
                .setP1S1Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Re().getP1S1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1S1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1S1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S1Re" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1ReNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Rectangle2D> testValue = new java.util.HashSet<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Float()); add(new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)); add(new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)); add(new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1S1Re()
                .setP1S1Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate1S1Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1Re());
    }

    /* Testing the "p1S1Re" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1S1ReNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.awt.geom.Rectangle2D> testValue = new java.util.HashSet<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Float()); add(new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)); add(new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)); add(new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1S1Re()
                .setP1S1Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Re().getP1S1Re());

        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1S1Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate1S1Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1S1Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
