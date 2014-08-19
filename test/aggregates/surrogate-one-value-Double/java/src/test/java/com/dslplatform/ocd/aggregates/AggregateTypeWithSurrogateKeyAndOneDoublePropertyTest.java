package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneDoublePropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDouble.Aggregate1Do> aggregate1DoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneDoublePropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1DoRepository = locator.resolve(ocd.AggregateSurrogateDouble.repositories.Aggregate1DoRepository.class);
    }

    /* Testing the "p1Do" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1DoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1Do();
        final double testValue = aggregate.getP1Do();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Do());
    }

    /* Testing the "p1Do" Default property value after active record persist */
    @org.junit.Test
    public void testP1DoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1Do();
        final double testValue = aggregate.getP1Do();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Do().getP1Do());

        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Do" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1DoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final double testValue = 1E-307;
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1Do()
                .setP1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Do());
    }

    /* Testing the "p1Do" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1DoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final double testValue = 1E-307;
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1Do()
                .setP1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Do().getP1Do());

        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Do" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1DoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final double testValue = 9E307;
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1Do()
                .setP1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Do());
    }

    /* Testing the "p1Do" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1DoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final double testValue = 9E307;
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1Do()
                .setP1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Do().getP1Do());

        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Do" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1DoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final double testValue = -1.23456789012345E-10;
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1Do()
                .setP1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Do());
    }

    /* Testing the "p1Do" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1DoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final double testValue = -1.23456789012345E-10;
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1Do()
                .setP1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Do().getP1Do());

        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Do" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1DoNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final double testValue = 1.23456789012345E20;
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1Do()
                .setP1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Do());
    }

    /* Testing the "p1Do" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1DoNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final double testValue = 1.23456789012345E20;
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1Do()
                .setP1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Do().getP1Do());

        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Do" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1DoNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final double testValue = Double.NEGATIVE_INFINITY;
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1Do()
                .setP1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Do());
    }

    /* Testing the "p1Do" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1DoNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final double testValue = Double.NEGATIVE_INFINITY;
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1Do()
                .setP1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Do().getP1Do());

        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Do" NonDefault6 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1DoNonDefault6PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final double testValue = Double.POSITIVE_INFINITY;
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1Do()
                .setP1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Do());
    }

    /* Testing the "p1Do" NonDefault6 property value after active record persist */
    @org.junit.Test
    public void testP1DoNonDefault6PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final double testValue = Double.POSITIVE_INFINITY;
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1Do()
                .setP1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Do().getP1Do());

        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Do" NonDefault7 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1DoNonDefault7PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final double testValue = Double.NaN;
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1Do()
                .setP1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Do());
    }

    /* Testing the "p1Do" NonDefault7 property value after active record persist */
    @org.junit.Test
    public void testP1DoNonDefault7PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final double testValue = Double.NaN;
        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1Do()
                .setP1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Do().getP1Do());

        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
