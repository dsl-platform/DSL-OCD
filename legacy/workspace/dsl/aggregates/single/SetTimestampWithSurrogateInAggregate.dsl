module SetTimestampWithSurrogateInAggregate
{
  root SetTimestampWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Timestamp>  setTimestamp;
  }
}
