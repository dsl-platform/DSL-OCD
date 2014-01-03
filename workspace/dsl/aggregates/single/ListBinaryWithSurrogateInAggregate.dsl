module ListBinaryWithSurrogateInAggregate
{
  root ListBinaryWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Binary>  listBinary;
  }
}
