module OptListOptXMLWithSurrogateInAggregate
{
  root OptListOptXMLWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<XML?>? optListOptXML;
  }
}
