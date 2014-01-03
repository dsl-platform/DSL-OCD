module SetMapWithSurrogateInAggregate
{
  root SetMapWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Map>  setMap;
  }
}
