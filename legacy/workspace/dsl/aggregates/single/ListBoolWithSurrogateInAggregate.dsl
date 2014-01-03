module ListBoolWithSurrogateInAggregate
{
  root ListBoolWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Bool>  listBool;
  }
}
