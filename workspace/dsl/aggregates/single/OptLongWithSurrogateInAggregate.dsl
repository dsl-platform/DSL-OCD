module OptLongWithSurrogateInAggregate
{
  root OptLongWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Long? optLong;
  }
}
