module SetOptTimestampWithSurrogateInAggregate
{
  root SetOptTimestampWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Timestamp?>  setOptTimestamp;
  }
}
