module ListTimestampWithSurrogateInAggregate
{
  root ListTimestampWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Timestamp>  listTimestamp;
  }
}
