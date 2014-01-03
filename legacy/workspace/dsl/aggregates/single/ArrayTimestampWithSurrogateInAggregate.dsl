module ArrayTimestampWithSurrogateInAggregate
{
  root ArrayTimestampWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Timestamp[]  arrayTimestamp;
  }
}
