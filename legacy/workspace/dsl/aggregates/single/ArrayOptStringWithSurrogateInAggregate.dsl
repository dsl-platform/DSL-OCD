module ArrayOptStringWithSurrogateInAggregate
{
  root ArrayOptStringWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    String?[]  arrayOptString;
  }
}
