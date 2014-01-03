module ArrayUUIDWithSurrogateInAggregate
{
  root ArrayUUIDWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    UUID[]  arrayUUID;
  }
}
