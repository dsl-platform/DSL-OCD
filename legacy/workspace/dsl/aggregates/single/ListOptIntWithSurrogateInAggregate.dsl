module ListOptIntWithSurrogateInAggregate
{
  root ListOptIntWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Int?>  listOptInt;
  }
}
