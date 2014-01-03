module OptSetOptDateWithSurrogateInAggregate
{
  root OptSetOptDateWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Date?>? optSetOptDate;
  }
}
