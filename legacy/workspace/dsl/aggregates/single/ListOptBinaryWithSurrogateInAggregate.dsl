module ListOptBinaryWithSurrogateInAggregate
{
  root ListOptBinaryWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Binary?>  listOptBinary;
  }
}
