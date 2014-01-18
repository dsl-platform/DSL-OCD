module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableDoubles_4 {
    Array<Double?> oneArrayOfNullableDoubles;

    calculated Array<Double?> calculatedOneArrayOfNullableDoubles from 'it => it.oneArrayOfNullableDoubles';

    calculated Array<Double?> persistedOneArrayOfNullableDoubles from 'it => it.oneArrayOfNullableDoubles' { persisted; }
  }
}
