module CalculatedPropertyInValueSetup
{
  value NullableListOfOneMonies_4 {
    List<Money>? nullableListOfOneMonies;

    calculated List<Money>? calculatedNullableListOfOneMonies from 'it => it.nullableListOfOneMonies';

    calculated List<Money>? persistedNullableListOfOneMonies from 'it => it.nullableListOfOneMonies' { persisted; }
  }
}
