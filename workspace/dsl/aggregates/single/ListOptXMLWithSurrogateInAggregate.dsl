module ListOptXMLWithSurrogateInAggregate
{
  root ListOptXMLWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<XML?>  listOptXML;
  }
}
