module ListStringWithSurrogateInAggregate
{
  root ListStringWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<String>  listString;
  }
}
