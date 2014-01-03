module ListIntWithSurrogateInAggregate
{
  root ListIntWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Int>  listInt;
  }
}
