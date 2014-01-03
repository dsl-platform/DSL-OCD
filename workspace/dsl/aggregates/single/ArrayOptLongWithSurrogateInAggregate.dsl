module ArrayOptLongWithSurrogateInAggregate
{
  root ArrayOptLongWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Long?[]  arrayOptLong;
  }
}
