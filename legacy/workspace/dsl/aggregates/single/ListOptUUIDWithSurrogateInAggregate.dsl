module ListOptUUIDWithSurrogateInAggregate
{
  root ListOptUUIDWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<UUID?>  listOptUUID;
  }
}
