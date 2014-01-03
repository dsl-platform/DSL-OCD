module OptListMapWithSurrogateInAggregate
{
  root OptListMapWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Map>? optListMap;
  }
}
