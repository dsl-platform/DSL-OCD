module OptSetOptStringWithSurrogateInAggregate
{
  root OptSetOptStringWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<String?>? optSetOptString;
  }
}
