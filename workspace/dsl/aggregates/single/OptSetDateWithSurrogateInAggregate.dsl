module OptSetDateWithSurrogateInAggregate
{
  root OptSetDateWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Date>? optSetDate;
  }
}
