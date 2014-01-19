module CalculatedPropertyInValueSetup
{
  value NullableSetOfOneDoubles_4 {
    Set<Double>? nullableSetOfOneDoubles;

    calculated Set<Double>? calculatedNullableSetOfOneDoubles from 'it => it.nullableSetOfOneDoubles';

    calculated Set<Double>? persistedNullableSetOfOneDoubles from 'it => it.nullableSetOfOneDoubles' { persisted; }
  }
}
