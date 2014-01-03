module ListXMLWithSurrogateInAggregate
{
  root ListXMLWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<XML>  listXML;
  }
}
