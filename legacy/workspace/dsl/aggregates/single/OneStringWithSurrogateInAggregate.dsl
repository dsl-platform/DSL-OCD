module OneStringWithSurrogateInAggregate
{
  root OneStringWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    String  oneString;
  }
}
