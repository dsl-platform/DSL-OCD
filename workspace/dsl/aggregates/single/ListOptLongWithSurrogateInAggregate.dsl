module ListOptLongWithSurrogateInAggregate
{
  root ListOptLongWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Long?>  listOptLong;
  }
}
