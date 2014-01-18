module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfOneDoubles_4 {
    Array<Double> oneArrayOfOneDoubles;

    calculated Array<Double> calculatedOneArrayOfOneDoubles from 'it => it.oneArrayOfOneDoubles';

    calculated Array<Double> persistedOneArrayOfOneDoubles from 'it => it.oneArrayOfOneDoubles' { persisted; }
  }
}
