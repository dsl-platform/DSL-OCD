module CalculatedPropertyInValueSetup
{
  value NullableSetOfNullableMonies_4 {
    Set<Money?>? nullableSetOfNullableMonies;

    calculated Set<Money?>? calculatedNullableSetOfNullableMonies from 'it => it.nullableSetOfNullableMonies';

    calculated Set<Money?>? persistedNullableSetOfNullableMonies from 'it => it.nullableSetOfNullableMonies' { persisted; }
  }
}
