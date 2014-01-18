module CalculatedPropertyInAggregateSetup
{
  aggregate OneDecimal_4 {
    Decimal oneDecimal;

    calculated Decimal calculatedOneDecimal from 'it => it.oneDecimal';

    calculated Decimal persistedOneDecimal from 'it => it.oneDecimal' { persisted; }
  }
}
