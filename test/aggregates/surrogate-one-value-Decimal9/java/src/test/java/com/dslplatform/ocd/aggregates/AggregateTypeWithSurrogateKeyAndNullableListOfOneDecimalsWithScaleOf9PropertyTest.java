package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableListOfOneDecimalsWithScaleOf9PropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDecimal9.Aggregate0L1D9> aggregate0L1D9Repository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableListOfOneDecimalsWithScaleOf9PropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0L1D9Repository = locator.resolve(ocd.AggregateSurrogateDecimal9.repositories.Aggregate0L1D9Repository.class);
    }

    /* Testing the "p0L1D9" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1D9DefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregate =
                new ocd.AggregateSurrogateDecimal9.Aggregate0L1D9();
        final java.util.List<java.math.BigDecimal> testValue = aggregate.getP0L1D9();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1D9());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal9.Aggregate0L1D9.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1D9());
    }

    /* Testing the "p0L1D9" Default property value after active record persist */
    @org.junit.Test
    public void testP0L1D9DefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregate =
                new ocd.AggregateSurrogateDecimal9.Aggregate0L1D9();
        final java.util.List<java.math.BigDecimal> testValue = aggregate.getP0L1D9();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1D9().getP0L1D9());

        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregateFound =
                ocd.AggregateSurrogateDecimal9.Aggregate0L1D9.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregateFound =
                ocd.AggregateSurrogateDecimal9.Aggregate0L1D9.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1D9());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L1D9" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1D9NonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO.setScale(9)); }};
        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregate =
                new ocd.AggregateSurrogateDecimal9.Aggregate0L1D9()
                .setP0L1D9(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1D9());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal9.Aggregate0L1D9.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1D9());
    }

    /* Testing the "p0L1D9" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0L1D9NonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO.setScale(9)); }};
        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregate =
                new ocd.AggregateSurrogateDecimal9.Aggregate0L1D9()
                .setP0L1D9(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1D9().getP0L1D9());

        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregateFound =
                ocd.AggregateSurrogateDecimal9.Aggregate0L1D9.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregateFound =
                ocd.AggregateSurrogateDecimal9.Aggregate0L1D9.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1D9());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L1D9" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1D9NonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(new java.math.BigDecimal("1E19")); }};
        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregate =
                new ocd.AggregateSurrogateDecimal9.Aggregate0L1D9()
                .setP0L1D9(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1D9());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal9.Aggregate0L1D9.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1D9());
    }

    /* Testing the "p0L1D9" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0L1D9NonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(new java.math.BigDecimal("1E19")); }};
        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregate =
                new ocd.AggregateSurrogateDecimal9.Aggregate0L1D9()
                .setP0L1D9(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1D9().getP0L1D9());

        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregateFound =
                ocd.AggregateSurrogateDecimal9.Aggregate0L1D9.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregateFound =
                ocd.AggregateSurrogateDecimal9.Aggregate0L1D9.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1D9());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L1D9" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1D9NonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO.setScale(9)); add(java.math.BigDecimal.ONE); add(new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)); add(new java.math.BigDecimal("-1E-9")); add(new java.math.BigDecimal("1E19")); }};
        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregate =
                new ocd.AggregateSurrogateDecimal9.Aggregate0L1D9()
                .setP0L1D9(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1D9());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal9.Aggregate0L1D9.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1D9());
    }

    /* Testing the "p0L1D9" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0L1D9NonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO.setScale(9)); add(java.math.BigDecimal.ONE); add(new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)); add(new java.math.BigDecimal("-1E-9")); add(new java.math.BigDecimal("1E19")); }};
        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregate =
                new ocd.AggregateSurrogateDecimal9.Aggregate0L1D9()
                .setP0L1D9(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1D9().getP0L1D9());

        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregateFound =
                ocd.AggregateSurrogateDecimal9.Aggregate0L1D9.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal9.Aggregate0L1D9 aggregateFound =
                ocd.AggregateSurrogateDecimal9.Aggregate0L1D9.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalWithScaleOf9Asserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1D9());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}