module CalculatedPropertyInValueSetup
{
  value OneListOfNullableDoubles_5 {
    List<Double?> oneListOfNullableDoubles;

    calculated List<Double?> calculatedOneListOfNullableDoubles from 'it => it.oneListOfNullableDoubles';

    calculated List<Double?> persistedOneListOfNullableDoubles from 'it => it.oneListOfNullableDoubles' { persisted; }
  }
}
