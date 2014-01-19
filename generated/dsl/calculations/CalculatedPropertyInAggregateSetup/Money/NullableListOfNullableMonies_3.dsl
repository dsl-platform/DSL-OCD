module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableMonies_3 {
    List<Money?>? nullableListOfNullableMonies;

    calculated List<Money?>? calculatedNullableListOfNullableMonies from 'it => it.nullableListOfNullableMonies';

    calculated List<Money?>? persistedNullableListOfNullableMonies from 'it => it.nullableListOfNullableMonies' { persisted; }
  }
}
