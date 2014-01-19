module CalculatedPropertyInValueSetup
{
  value NullableSetOfNullableDoubles_4 {
    Set<Double?>? nullableSetOfNullableDoubles;

    calculated Set<Double?>? calculatedNullableSetOfNullableDoubles from 'it => it.nullableSetOfNullableDoubles';

    calculated Set<Double?>? persistedNullableSetOfNullableDoubles from 'it => it.nullableSetOfNullableDoubles' { persisted; }
  }
}
