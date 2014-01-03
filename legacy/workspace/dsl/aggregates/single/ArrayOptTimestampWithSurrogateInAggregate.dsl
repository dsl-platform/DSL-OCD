module ArrayOptTimestampWithSurrogateInAggregate
{
  root ArrayOptTimestampWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Timestamp?[]  arrayOptTimestamp;
  }
}
