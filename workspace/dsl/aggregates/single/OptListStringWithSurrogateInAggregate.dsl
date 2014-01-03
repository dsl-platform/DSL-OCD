module OptListStringWithSurrogateInAggregate
{
  root OptListStringWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<String>? optListString;
  }
}
