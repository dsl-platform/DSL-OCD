module OneUUIDWithSurrogateInAggregate
{
  root OneUUIDWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    UUID  oneUUID;
  }
}
