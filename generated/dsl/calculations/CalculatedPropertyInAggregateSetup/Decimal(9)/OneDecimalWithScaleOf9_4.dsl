module CalculatedPropertyInAggregateSetup
{
  aggregate OneDecimalWithScaleOf9_4 {
    Decimal(9) oneDecimalWithScaleOf9;

    calculated Decimal(9) calculatedOneDecimalWithScaleOf9 from 'it => it.oneDecimalWithScaleOf9';

    calculated Decimal(9) persistedOneDecimalWithScaleOf9 from 'it => it.oneDecimalWithScaleOf9' { persisted; }
  }
}
