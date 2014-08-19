package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneSetOfOneIntegersPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateInteger.Aggregate1S1In> aggregate1S1InRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneSetOfOneIntegersPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1S1InRepository = locator.resolve(ocd.AggregateSurrogateInteger.repositories.Aggregate1S1InRepository.class);
    }

    /* Testing the "p1S1In" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1InDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1S1In();
        final java.util.Set<Integer> testValue = aggregate.getP1S1In();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1S1In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1In());
    }

    /* Testing the "p1S1In" Default property value after active record persist */
    @org.junit.Test
    public void testP1S1InDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1S1In();
        final java.util.Set<Integer> testValue = aggregate.getP1S1In();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1In().getP1S1In());

        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1S1In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1S1In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S1In" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1InNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Integer> testValue = new java.util.HashSet<Integer>() {{ add(0); }};
        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1S1In()
                .setP1S1In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1S1In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1In());
    }

    /* Testing the "p1S1In" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1S1InNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Integer> testValue = new java.util.HashSet<Integer>() {{ add(0); }};
        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1S1In()
                .setP1S1In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1In().getP1S1In());

        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1S1In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1S1In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S1In" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1InNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Integer> testValue = new java.util.HashSet<Integer>() {{ add(1000000000); }};
        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1S1In()
                .setP1S1In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1S1In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1In());
    }

    /* Testing the "p1S1In" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1S1InNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Integer> testValue = new java.util.HashSet<Integer>() {{ add(1000000000); }};
        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1S1In()
                .setP1S1In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1In().getP1S1In());

        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1S1In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1S1In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S1In" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1InNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Integer> testValue = new java.util.HashSet<Integer>() {{ add(0); add(Integer.MIN_VALUE); add(Integer.MAX_VALUE); add(-1000000000); add(1000000000); }};
        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1S1In()
                .setP1S1In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1S1In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1In());
    }

    /* Testing the "p1S1In" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1S1InNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Integer> testValue = new java.util.HashSet<Integer>() {{ add(0); add(Integer.MIN_VALUE); add(Integer.MAX_VALUE); add(-1000000000); add(1000000000); }};
        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1S1In()
                .setP1S1In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1In().getP1S1In());

        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1S1In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1S1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1S1In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
