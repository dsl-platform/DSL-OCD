package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneMoneyPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateMoney.Aggregate1Mo> aggregate1MoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneMoneyPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1MoRepository = locator.resolve(ocd.AggregateSurrogateMoney.repositories.Aggregate1MoRepository.class);
    }

    /* Testing the "p1Mo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1MoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1Mo();
        final java.math.BigDecimal testValue = aggregate.getP1Mo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Mo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMoney.Aggregate1Mo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Mo());
    }

    /* Testing the "p1Mo" Default property value after active record persist */
    @org.junit.Test
    public void testP1MoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1Mo();
        final java.math.BigDecimal testValue = aggregate.getP1Mo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Mo().getP1Mo());

        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1Mo.find(aggregate.getURI());

        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1Mo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Mo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Mo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1MoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.math.BigDecimal testValue = java.math.BigDecimal.ONE;
        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1Mo()
                .setP1Mo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Mo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMoney.Aggregate1Mo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Mo());
    }

    /* Testing the "p1Mo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1MoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.math.BigDecimal testValue = java.math.BigDecimal.ONE;
        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1Mo()
                .setP1Mo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Mo().getP1Mo());

        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1Mo.find(aggregate.getURI());

        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1Mo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Mo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Mo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1MoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.math.BigDecimal testValue = new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(2, java.math.BigDecimal.ROUND_HALF_UP);
        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1Mo()
                .setP1Mo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Mo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMoney.Aggregate1Mo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Mo());
    }

    /* Testing the "p1Mo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1MoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.math.BigDecimal testValue = new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(2, java.math.BigDecimal.ROUND_HALF_UP);
        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1Mo()
                .setP1Mo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Mo().getP1Mo());

        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1Mo.find(aggregate.getURI());

        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1Mo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Mo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Mo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1MoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.math.BigDecimal testValue = new java.math.BigDecimal("-1E-2");
        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1Mo()
                .setP1Mo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Mo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMoney.Aggregate1Mo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Mo());
    }

    /* Testing the "p1Mo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1MoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.math.BigDecimal testValue = new java.math.BigDecimal("-1E-2");
        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1Mo()
                .setP1Mo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Mo().getP1Mo());

        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1Mo.find(aggregate.getURI());

        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1Mo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Mo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Mo" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1MoNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.math.BigDecimal testValue = new java.math.BigDecimal("1E19");
        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1Mo()
                .setP1Mo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Mo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMoney.Aggregate1Mo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Mo());
    }

    /* Testing the "p1Mo" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1MoNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.math.BigDecimal testValue = new java.math.BigDecimal("1E19");
        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate1Mo()
                .setP1Mo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Mo().getP1Mo());

        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1Mo.find(aggregate.getURI());

        final ocd.AggregateSurrogateMoney.Aggregate1Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate1Mo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Mo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
