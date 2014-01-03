module ArrayOptUUIDWithSurrogateInAggregate
{
  root ArrayOptUUIDWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    UUID?[]  arrayOptUUID;
  }
}
