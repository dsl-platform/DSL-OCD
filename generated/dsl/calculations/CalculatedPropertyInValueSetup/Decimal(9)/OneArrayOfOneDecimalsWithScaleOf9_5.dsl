module CalculatedPropertyInValueSetup
{
  value OneArrayOfOneDecimalsWithScaleOf9_5 {
    Array<Decimal(9)> oneArrayOfOneDecimalsWithScaleOf9;

    calculated Array<Decimal(9)> calculatedOneArrayOfOneDecimalsWithScaleOf9 from 'it => it.oneArrayOfOneDecimalsWithScaleOf9';

    calculated Array<Decimal(9)> persistedOneArrayOfOneDecimalsWithScaleOf9 from 'it => it.oneArrayOfOneDecimalsWithScaleOf9' { persisted; }
  }
}
