package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneListOfNullableRectanglesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateRectangle.Aggregate1L0Re> aggregate1L0ReRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneListOfNullableRectanglesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1L0ReRepository = locator.resolve(ocd.AggregateSurrogateRectangle.repositories.Aggregate1L0ReRepository.class);
    }

    /* Testing the "p1L0Re" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0ReDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1L0Re();
        final java.util.List<java.awt.geom.Rectangle2D> testValue = aggregate.getP1L0Re();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate1L0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Re());
    }

    /* Testing the "p1L0Re" Default property value after active record persist */
    @org.junit.Test
    public void testP1L0ReDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1L0Re();
        final java.util.List<java.awt.geom.Rectangle2D> testValue = aggregate.getP1L0Re();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Re().getP1L0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1L0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1L0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Re" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0ReNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.geom.Rectangle2D> testValue = new java.util.ArrayList<java.awt.geom.Rectangle2D>() {{ add(null); }};
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1L0Re()
                .setP1L0Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate1L0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Re());
    }

    /* Testing the "p1L0Re" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1L0ReNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.geom.Rectangle2D> testValue = new java.util.ArrayList<java.awt.geom.Rectangle2D>() {{ add(null); }};
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1L0Re()
                .setP1L0Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Re().getP1L0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1L0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1L0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Re" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0ReNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.geom.Rectangle2D> testValue = new java.util.ArrayList<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Float()); }};
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1L0Re()
                .setP1L0Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate1L0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Re());
    }

    /* Testing the "p1L0Re" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1L0ReNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.geom.Rectangle2D> testValue = new java.util.ArrayList<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Float()); }};
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1L0Re()
                .setP1L0Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Re().getP1L0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1L0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1L0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Re" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0ReNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.geom.Rectangle2D> testValue = new java.util.ArrayList<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1L0Re()
                .setP1L0Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate1L0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Re());
    }

    /* Testing the "p1L0Re" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1L0ReNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.geom.Rectangle2D> testValue = new java.util.ArrayList<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1L0Re()
                .setP1L0Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Re().getP1L0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1L0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1L0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Re" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0ReNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.geom.Rectangle2D> testValue = new java.util.ArrayList<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Float()); add(new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)); add(new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)); add(new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1L0Re()
                .setP1L0Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate1L0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Re());
    }

    /* Testing the "p1L0Re" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1L0ReNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.geom.Rectangle2D> testValue = new java.util.ArrayList<java.awt.geom.Rectangle2D>() {{ add(new java.awt.geom.Rectangle2D.Float()); add(new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)); add(new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)); add(new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1L0Re()
                .setP1L0Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Re().getP1L0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1L0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1L0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Re" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0ReNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.geom.Rectangle2D> testValue = new java.util.ArrayList<java.awt.geom.Rectangle2D>() {{ add(null); add(new java.awt.geom.Rectangle2D.Float()); add(new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)); add(new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)); add(new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1L0Re()
                .setP1L0Re(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Re());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateRectangle.Aggregate1L0Re.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Re());
    }

    /* Testing the "p1L0Re" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1L0ReNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.geom.Rectangle2D> testValue = new java.util.ArrayList<java.awt.geom.Rectangle2D>() {{ add(null); add(new java.awt.geom.Rectangle2D.Float()); add(new java.awt.Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Rectangle(-1000000000, -1000000000, 1000000000, 1000000000)); add(new java.awt.geom.Rectangle2D.Float(Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)); add(new java.awt.geom.Rectangle2D.Float(-1.0000001f, -1.0000001f, 1.0000001f, 1.0000001f)); add(new java.awt.geom.Rectangle2D.Double(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE)); add(new java.awt.geom.Rectangle2D.Double(-1.000000000000001, -1.000000000000001, 1.000000000000001, 1.000000000000001)); }};
        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregate =
                new ocd.AggregateSurrogateRectangle.Aggregate1L0Re()
                .setP1L0Re(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Re().getP1L0Re());

        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1L0Re.find(aggregate.getURI());

        final ocd.AggregateSurrogateRectangle.Aggregate1L0Re aggregateFound =
                ocd.AggregateSurrogateRectangle.Aggregate1L0Re.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.RectangleAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Re());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
