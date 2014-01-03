module ListUUIDWithSurrogateInAggregate
{
  root ListUUIDWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<UUID>  listUUID;
  }
}
