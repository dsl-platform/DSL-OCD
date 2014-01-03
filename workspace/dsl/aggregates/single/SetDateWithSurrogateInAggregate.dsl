module SetDateWithSurrogateInAggregate
{
  root SetDateWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Date>  setDate;
  }
}
