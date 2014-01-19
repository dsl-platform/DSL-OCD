module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfNullableMonies_3 {
    Set<Money?>? nullableSetOfNullableMonies;

    calculated Set<Money?>? calculatedNullableSetOfNullableMonies from 'it => it.nullableSetOfNullableMonies';

    calculated Set<Money?>? persistedNullableSetOfNullableMonies from 'it => it.nullableSetOfNullableMonies' { persisted; }
  }
}
