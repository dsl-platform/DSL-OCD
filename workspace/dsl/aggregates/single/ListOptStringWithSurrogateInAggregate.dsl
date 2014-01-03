module ListOptStringWithSurrogateInAggregate
{
  root ListOptStringWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<String?>  listOptString;
  }
}
