module SetOptBinaryWithSurrogateInAggregate
{
  root SetOptBinaryWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Binary?>  setOptBinary;
  }
}
