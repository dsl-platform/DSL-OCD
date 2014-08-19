package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneSetOfOneDecimalsWithScaleOf9PropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDecimal9.Aggregate1S1D9> aggregate1S1D9Repository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneSetOfOneDecimalsWithScaleOf9PropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1S1D9Repository = locator.resolve(ocd.AggregateSurrogateDecimal9.repositories.Aggregate1S1D9Repository.class);
    }

    /* Testing the "p1S1D9" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1D9DefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregate =
                new ocd.AggregateSurrogateDecimal9.Aggregate1S1D9();
        final java.util.Set<java.math.BigDecimal> testValue = aggregate.getP1S1D9();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1D9());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal9.Aggregate1S1D9.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1D9());
    }

    /* Testing the "p1S1D9" Default property value after active record persist */
    @org.junit.Test
    public void testP1S1D9DefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregate =
                new ocd.AggregateSurrogateDecimal9.Aggregate1S1D9();
        final java.util.Set<java.math.BigDecimal> testValue = aggregate.getP1S1D9();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1D9().getP1S1D9());

        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregateFound =
                ocd.AggregateSurrogateDecimal9.Aggregate1S1D9.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregateFound =
                ocd.AggregateSurrogateDecimal9.Aggregate1S1D9.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1D9());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S1D9" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1D9NonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO.setScale(9)); }};
        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregate =
                new ocd.AggregateSurrogateDecimal9.Aggregate1S1D9()
                .setP1S1D9(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1D9());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal9.Aggregate1S1D9.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1D9());
    }

    /* Testing the "p1S1D9" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1S1D9NonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO.setScale(9)); }};
        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregate =
                new ocd.AggregateSurrogateDecimal9.Aggregate1S1D9()
                .setP1S1D9(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1D9().getP1S1D9());

        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregateFound =
                ocd.AggregateSurrogateDecimal9.Aggregate1S1D9.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregateFound =
                ocd.AggregateSurrogateDecimal9.Aggregate1S1D9.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1D9());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S1D9" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1D9NonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(new java.math.BigDecimal("1E19")); }};
        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregate =
                new ocd.AggregateSurrogateDecimal9.Aggregate1S1D9()
                .setP1S1D9(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1D9());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal9.Aggregate1S1D9.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1D9());
    }

    /* Testing the "p1S1D9" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1S1D9NonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(new java.math.BigDecimal("1E19")); }};
        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregate =
                new ocd.AggregateSurrogateDecimal9.Aggregate1S1D9()
                .setP1S1D9(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1D9().getP1S1D9());

        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregateFound =
                ocd.AggregateSurrogateDecimal9.Aggregate1S1D9.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregateFound =
                ocd.AggregateSurrogateDecimal9.Aggregate1S1D9.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1D9());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S1D9" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1D9NonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO.setScale(9)); add(java.math.BigDecimal.ONE); add(new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)); add(new java.math.BigDecimal("-1E-9")); add(new java.math.BigDecimal("1E19")); }};
        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregate =
                new ocd.AggregateSurrogateDecimal9.Aggregate1S1D9()
                .setP1S1D9(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1D9());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal9.Aggregate1S1D9.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1D9());
    }

    /* Testing the "p1S1D9" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1S1D9NonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO.setScale(9)); add(java.math.BigDecimal.ONE); add(new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)); add(new java.math.BigDecimal("-1E-9")); add(new java.math.BigDecimal("1E19")); }};
        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregate =
                new ocd.AggregateSurrogateDecimal9.Aggregate1S1D9()
                .setP1S1D9(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1D9().getP1S1D9());

        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregateFound =
                ocd.AggregateSurrogateDecimal9.Aggregate1S1D9.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal9.Aggregate1S1D9 aggregateFound =
                ocd.AggregateSurrogateDecimal9.Aggregate1S1D9.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1D9());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
