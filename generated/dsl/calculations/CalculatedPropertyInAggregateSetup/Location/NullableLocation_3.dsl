module CalculatedPropertyInAggregateSetup
{
  aggregate NullableLocation_3 {
    Location? nullableLocation;

    calculated Location? calculatedNullableLocation from 'it => it.nullableLocation';

    calculated Location? persistedNullableLocation from 'it => it.nullableLocation' { persisted; }
  }
}
