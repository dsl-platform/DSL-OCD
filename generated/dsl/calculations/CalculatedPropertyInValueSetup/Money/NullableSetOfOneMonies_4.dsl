module CalculatedPropertyInValueSetup
{
  value NullableSetOfOneMonies_4 {
    Set<Money>? nullableSetOfOneMonies;

    calculated Set<Money>? calculatedNullableSetOfOneMonies from 'it => it.nullableSetOfOneMonies';

    calculated Set<Money>? persistedNullableSetOfOneMonies from 'it => it.nullableSetOfOneMonies' { persisted; }
  }
}
