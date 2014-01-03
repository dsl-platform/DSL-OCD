module OptListOptStringWithSurrogateInAggregate
{
  root OptListOptStringWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<String?>? optListOptString;
  }
}
