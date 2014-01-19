module CalculatedPropertyInValueSetup
{
  value OneDecimal_5 {
    Decimal oneDecimal;

    calculated Decimal calculatedOneDecimal from 'it => it.oneDecimal';

    calculated Decimal persistedOneDecimal from 'it => it.oneDecimal' { persisted; }
  }
}
