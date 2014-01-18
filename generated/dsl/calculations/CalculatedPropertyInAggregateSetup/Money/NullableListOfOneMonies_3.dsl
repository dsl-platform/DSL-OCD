module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfOneMonies_3 {
    List<Money>? nullableListOfOneMonies;

    calculated List<Money>? calculatedNullableListOfOneMonies from 'it => it.nullableListOfOneMonies';

    calculated List<Money>? persistedNullableListOfOneMonies from 'it => it.nullableListOfOneMonies' { persisted; }
  }
}
