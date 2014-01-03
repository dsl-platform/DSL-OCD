module SetStringWithSurrogateInAggregate
{
  root SetStringWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<String>  setString;
  }
}
