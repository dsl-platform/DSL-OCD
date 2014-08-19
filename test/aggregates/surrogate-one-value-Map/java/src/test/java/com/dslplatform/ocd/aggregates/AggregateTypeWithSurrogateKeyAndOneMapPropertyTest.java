package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneMapPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateMap.Aggregate1Ma> aggregate1MaRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneMapPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1MaRepository = locator.resolve(ocd.AggregateSurrogateMap.repositories.Aggregate1MaRepository.class);
    }

    /* Testing the "p1Ma" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1MaDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate1Ma();
        final java.util.Map<String, String> testValue = aggregate.getP1Ma();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MapAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ma());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMap.Aggregate1Ma.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MapAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ma());
    }

    /* Testing the "p1Ma" Default property value after active record persist */
    @org.junit.Test
    public void testP1MaDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate1Ma();
        final java.util.Map<String, String> testValue = aggregate.getP1Ma();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MapAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ma().getP1Ma());

        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate1Ma.find(aggregate.getURI());

        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate1Ma.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MapAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ma());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Ma" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1MaNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Map<String, String> testValue = new java.util.HashMap<String, String>() {{ put("a", "b"); }};
        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate1Ma()
                .setP1Ma(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MapAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ma());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMap.Aggregate1Ma.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MapAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ma());
    }

    /* Testing the "p1Ma" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1MaNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Map<String, String> testValue = new java.util.HashMap<String, String>() {{ put("a", "b"); }};
        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate1Ma()
                .setP1Ma(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MapAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ma().getP1Ma());

        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate1Ma.find(aggregate.getURI());

        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate1Ma.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MapAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ma());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Ma" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1MaNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Map<String, String> testValue = new java.util.HashMap<String, String>() {{ put("Quote: \", Solidus /", "Backslash: \\, Aphos: ', Brackets: [] () {}"); }};
        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate1Ma()
                .setP1Ma(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MapAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ma());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMap.Aggregate1Ma.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MapAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ma());
    }

    /* Testing the "p1Ma" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1MaNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Map<String, String> testValue = new java.util.HashMap<String, String>() {{ put("Quote: \", Solidus /", "Backslash: \\, Aphos: ', Brackets: [] () {}"); }};
        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate1Ma()
                .setP1Ma(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MapAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ma().getP1Ma());

        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate1Ma.find(aggregate.getURI());

        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate1Ma.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MapAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ma());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Ma" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1MaNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Map<String, String> testValue = new java.util.HashMap<String, String>() {{ put("", "empty"); put("a", "1"); put("b", "2"); put("c", "3"); }};
        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate1Ma()
                .setP1Ma(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MapAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ma());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMap.Aggregate1Ma.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MapAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ma());
    }

    /* Testing the "p1Ma" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1MaNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Map<String, String> testValue = new java.util.HashMap<String, String>() {{ put("", "empty"); put("a", "1"); put("b", "2"); put("c", "3"); }};
        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate1Ma()
                .setP1Ma(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MapAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ma().getP1Ma());

        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate1Ma.find(aggregate.getURI());

        final ocd.AggregateSurrogateMap.Aggregate1Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate1Ma.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MapAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ma());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
