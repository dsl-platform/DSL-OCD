package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneSetOfOneFloatsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateFloat.Aggregate1S1Fl> aggregate1S1FlRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneSetOfOneFloatsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1S1FlRepository = locator.resolve(ocd.AggregateSurrogateFloat.repositories.Aggregate1S1FlRepository.class);
    }

    /* Testing the "p1S1Fl" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1FlDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1S1Fl();
        final java.util.Set<Float> testValue = aggregate.getP1S1Fl();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate1S1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1Fl());
    }

    /* Testing the "p1S1Fl" Default property value after active record persist */
    @org.junit.Test
    public void testP1S1FlDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1S1Fl();
        final java.util.Set<Float> testValue = aggregate.getP1S1Fl();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Fl().getP1S1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1S1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1S1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S1Fl" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1FlNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Float> testValue = new java.util.HashSet<Float>() {{ add(0.0f); }};
        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1S1Fl()
                .setP1S1Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate1S1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1Fl());
    }

    /* Testing the "p1S1Fl" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1S1FlNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Float> testValue = new java.util.HashSet<Float>() {{ add(0.0f); }};
        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1S1Fl()
                .setP1S1Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Fl().getP1S1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1S1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1S1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S1Fl" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1FlNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Float> testValue = new java.util.HashSet<Float>() {{ add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1S1Fl()
                .setP1S1Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate1S1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1Fl());
    }

    /* Testing the "p1S1Fl" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1S1FlNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Float> testValue = new java.util.HashSet<Float>() {{ add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1S1Fl()
                .setP1S1Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Fl().getP1S1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1S1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1S1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S1Fl" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1FlNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Float> testValue = new java.util.HashSet<Float>() {{ add(0.0f); add(-1.2345E-10f); add(1.2345E20f); add(-1E-5f); add(Float.NaN); add(Float.NEGATIVE_INFINITY); add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1S1Fl()
                .setP1S1Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate1S1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1Fl());
    }

    /* Testing the "p1S1Fl" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1S1FlNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Float> testValue = new java.util.HashSet<Float>() {{ add(0.0f); add(-1.2345E-10f); add(1.2345E20f); add(-1E-5f); add(Float.NaN); add(Float.NEGATIVE_INFINITY); add(Float.POSITIVE_INFINITY); }};
        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1S1Fl()
                .setP1S1Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Fl().getP1S1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1S1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate1S1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1S1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
