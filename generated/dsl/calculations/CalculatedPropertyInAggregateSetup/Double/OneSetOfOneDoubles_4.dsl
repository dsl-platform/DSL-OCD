module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfOneDoubles_4 {
    Set<Double> oneSetOfOneDoubles;

    calculated Set<Double> calculatedOneSetOfOneDoubles from 'it => it.oneSetOfOneDoubles';

    calculated Set<Double> persistedOneSetOfOneDoubles from 'it => it.oneSetOfOneDoubles' { persisted; }
  }
}
