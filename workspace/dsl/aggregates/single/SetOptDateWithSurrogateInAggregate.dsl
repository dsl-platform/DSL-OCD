module SetOptDateWithSurrogateInAggregate
{
  root SetOptDateWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Date?>  setOptDate;
  }
}
