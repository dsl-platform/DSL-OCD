module ListMapWithSurrogateInAggregate
{
  root ListMapWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Map>  listMap;
  }
}
