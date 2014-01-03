module ListLongWithSurrogateInAggregate
{
  root ListLongWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Long>  listLong;
  }
}
