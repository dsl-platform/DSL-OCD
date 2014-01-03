module ListOptBoolWithSurrogateInAggregate
{
  root ListOptBoolWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Bool?>  listOptBool;
  }
}
