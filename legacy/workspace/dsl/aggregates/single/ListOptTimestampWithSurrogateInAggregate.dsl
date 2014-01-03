module ListOptTimestampWithSurrogateInAggregate
{
  root ListOptTimestampWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Timestamp?>  listOptTimestamp;
  }
}
