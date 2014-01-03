module SetOptStringWithSurrogateInAggregate
{
  root SetOptStringWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<String?>  setOptString;
  }
}
