module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfNullableDoubles_4 {
    List<Double?> oneListOfNullableDoubles;

    calculated List<Double?> calculatedOneListOfNullableDoubles from 'it => it.oneListOfNullableDoubles';

    calculated List<Double?> persistedOneListOfNullableDoubles from 'it => it.oneListOfNullableDoubles' { persisted; }
  }
}
