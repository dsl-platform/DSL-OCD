module SetUUIDWithSurrogateInAggregate
{
  root SetUUIDWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<UUID>  setUUID;
  }
}
