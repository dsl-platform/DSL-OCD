module SetOptUUIDWithSurrogateInAggregate
{
  root SetOptUUIDWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<UUID?>  setOptUUID;
  }
}
