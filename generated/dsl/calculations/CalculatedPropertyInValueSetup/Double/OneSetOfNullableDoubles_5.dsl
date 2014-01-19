module CalculatedPropertyInValueSetup
{
  value OneSetOfNullableDoubles_5 {
    Set<Double?> oneSetOfNullableDoubles;

    calculated Set<Double?> calculatedOneSetOfNullableDoubles from 'it => it.oneSetOfNullableDoubles';

    calculated Set<Double?> persistedOneSetOfNullableDoubles from 'it => it.oneSetOfNullableDoubles' { persisted; }
  }
}
