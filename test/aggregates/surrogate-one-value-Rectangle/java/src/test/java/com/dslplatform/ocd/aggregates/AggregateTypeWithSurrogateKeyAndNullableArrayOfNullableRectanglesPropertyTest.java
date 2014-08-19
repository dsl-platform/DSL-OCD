package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableArrayOfNullableRectanglesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateRectangle.Aggregate0A0Re> aggregate0A0ReRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableArrayOfNullableRectanglesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0A0ReRepository = locator.resolve(ocd.AggregateSurrogateRectangle.repositories.Aggregate0A0ReRepository.class);
    }

    /* Testing the "p0A0Re" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0ReDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A0Re();
        final java.awt.geom.Rectangle2D[] testValue = aggregate.getP0A0Re();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0A0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Re());
    }

    /* Testing the "p0A0Re" Default property value after active record persist */
    @org.junit.Test
    public void testP0A0ReDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A0Re();
        final java.awt.geom.Rectangle2D[] testValue = aggregate.getP0A0Re();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Re().getP0A0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Re" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0ReNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D[] testValue = new java.awt.geom.Rectangle2D[] { null };
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A0Re()
                .setP0A0Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0A0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Re());
    }

    /* Testing the "p0A0Re" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0A0ReNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D[] testValue = new java.awt.geom.Rectangle2D[] { null };
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A0Re()
                .setP0A0Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Re().getP0A0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Re" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0ReNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D[] testValue = new java.awt.geom.Rectangle2D[] { new java.awt.geom.Rectangle2D.Float() };
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A0Re()
                .setP0A0Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0A0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Re());
    }

    /* Testing the "p0A0Re" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0A0ReNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D[] testValue = new java.awt.geom.Rectangle2D[] { new java.awt.geom.Rectangle2D.Float() };
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A0Re()
                .setP0A0Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Re().getP0A0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Re" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0ReNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D[] testValue = new java.awt.geom.Rectangle2D[] { new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001) };
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A0Re()
                .setP0A0Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0A0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Re());
    }

    /* Testing the "p0A0Re" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0A0ReNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D[] testValue = new java.awt.geom.Rectangle2D[] { new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001) };
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A0Re()
                .setP0A0Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Re().getP0A0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Re" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0ReNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D[] testValue = new java.awt.geom.Rectangle2D[] { new java.awt.geom.Rectangle2D.Float(), new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE), new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000), new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE), new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f), new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE), new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001) };
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A0Re()
                .setP0A0Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0A0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Re());
    }

    /* Testing the "p0A0Re" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0A0ReNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D[] testValue = new java.awt.geom.Rectangle2D[] { new java.awt.geom.Rectangle2D.Float(), new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE), new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000), new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE), new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f), new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE), new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001) };
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A0Re()
                .setP0A0Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Re().getP0A0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Re" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0ReNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.awt.geom.Rectangle2D[] testValue = new java.awt.geom.Rectangle2D[] { null, new java.awt.geom.Rectangle2D.Float(), new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE), new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000), new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE), new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f), new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE), new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001) };
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A0Re()
                .setP0A0Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate0A0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Re());
    }

    /* Testing the "p0A0Re" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0A0ReNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.awt.geom.Rectangle2D[] testValue = new java.awt.geom.Rectangle2D[] { null, new java.awt.geom.Rectangle2D.Float(), new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE), new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000), new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE), new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f), new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE), new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001) };
        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate0A0Re()
                .setP0A0Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Re().getP0A0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate0A0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate0A0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
