package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneArrayOfOneDoublesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDouble.Aggregate1A1Do> aggregate1A1DoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneArrayOfOneDoublesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1A1DoRepository = locator.resolve(ocd.AggregateSurrogateDouble.repositories.Aggregate1A1DoRepository.class);
    }

    /* Testing the "p1A1Do" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1DoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1A1Do();
        final double[] testValue = aggregate.getP1A1Do();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1A1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Do());
    }

    /* Testing the "p1A1Do" Default property value after active record persist */
    @org.junit.Test
    public void testP1A1DoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1A1Do();
        final double[] testValue = aggregate.getP1A1Do();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Do().getP1A1Do());

        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1A1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1A1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A1Do" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1DoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final double[] testValue = new double[] { 0.0 };
        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1A1Do()
                .setP1A1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1A1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Do());
    }

    /* Testing the "p1A1Do" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1A1DoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final double[] testValue = new double[] { 0.0 };
        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1A1Do()
                .setP1A1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Do().getP1A1Do());

        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1A1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1A1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A1Do" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1DoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final double[] testValue = new double[] { Double.NaN };
        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1A1Do()
                .setP1A1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1A1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Do());
    }

    /* Testing the "p1A1Do" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1A1DoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final double[] testValue = new double[] { Double.NaN };
        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1A1Do()
                .setP1A1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Do().getP1A1Do());

        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1A1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1A1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A1Do" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1DoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final double[] testValue = new double[] { 0.0, 1E-307, 9E307, -1.23456789012345E-10, 1.23456789012345E20, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NaN };
        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1A1Do()
                .setP1A1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1A1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Do());
    }

    /* Testing the "p1A1Do" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1A1DoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final double[] testValue = new double[] { 0.0, 1E-307, 9E307, -1.23456789012345E-10, 1.23456789012345E20, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NaN };
        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1A1Do()
                .setP1A1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Do().getP1A1Do());

        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1A1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1A1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1A1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
