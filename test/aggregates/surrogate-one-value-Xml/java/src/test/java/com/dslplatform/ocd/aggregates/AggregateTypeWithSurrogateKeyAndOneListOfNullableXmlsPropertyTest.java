package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneListOfNullableXmlsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateXml.Aggregate1L0Xm> aggregate1L0XmRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneListOfNullableXmlsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1L0XmRepository = locator.resolve(ocd.AggregateSurrogateXml.repositories.Aggregate1L0XmRepository.class);
    }

    /* Testing the "p1L0Xm" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0XmDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1L0Xm();
        final java.util.List<org.w3c.dom.Element> testValue = aggregate.getP1L0Xm();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate1L0Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Xm());
    }

    /* Testing the "p1L0Xm" Default property value after active record persist */
    @org.junit.Test
    public void testP1L0XmDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1L0Xm();
        final java.util.List<org.w3c.dom.Element> testValue = aggregate.getP1L0Xm();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Xm().getP1L0Xm());

        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1L0Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1L0Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Xm" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0XmNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<org.w3c.dom.Element> testValue = new java.util.ArrayList<org.w3c.dom.Element>() {{ add(null); }};
        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1L0Xm()
                .setP1L0Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate1L0Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Xm());
    }

    /* Testing the "p1L0Xm" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1L0XmNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<org.w3c.dom.Element> testValue = new java.util.ArrayList<org.w3c.dom.Element>() {{ add(null); }};
        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1L0Xm()
                .setP1L0Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Xm().getP1L0Xm());

        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1L0Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1L0Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Xm" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0XmNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<org.w3c.dom.Element> testValue = new java.util.ArrayList<org.w3c.dom.Element>() {{ add(com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>")); }};
        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1L0Xm()
                .setP1L0Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate1L0Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Xm());
    }

    /* Testing the "p1L0Xm" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1L0XmNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<org.w3c.dom.Element> testValue = new java.util.ArrayList<org.w3c.dom.Element>() {{ add(com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>")); }};
        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1L0Xm()
                .setP1L0Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Xm().getP1L0Xm());

        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1L0Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1L0Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Xm" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0XmNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<org.w3c.dom.Element> testValue = new java.util.ArrayList<org.w3c.dom.Element>() {{ add(com.dslplatform.ocd.test.Utils.stringToElement("<document/>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>")); }};
        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1L0Xm()
                .setP1L0Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate1L0Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Xm());
    }

    /* Testing the "p1L0Xm" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1L0XmNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<org.w3c.dom.Element> testValue = new java.util.ArrayList<org.w3c.dom.Element>() {{ add(com.dslplatform.ocd.test.Utils.stringToElement("<document/>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>")); }};
        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1L0Xm()
                .setP1L0Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Xm().getP1L0Xm());

        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1L0Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1L0Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Xm" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0XmNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<org.w3c.dom.Element> testValue = new java.util.ArrayList<org.w3c.dom.Element>() {{ add(null); add(com.dslplatform.ocd.test.Utils.stringToElement("<document/>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>")); }};
        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1L0Xm()
                .setP1L0Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate1L0Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Xm());
    }

    /* Testing the "p1L0Xm" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1L0XmNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<org.w3c.dom.Element> testValue = new java.util.ArrayList<org.w3c.dom.Element>() {{ add(null); add(com.dslplatform.ocd.test.Utils.stringToElement("<document/>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>")); }};
        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1L0Xm()
                .setP1L0Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Xm().getP1L0Xm());

        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1L0Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate1L0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1L0Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
