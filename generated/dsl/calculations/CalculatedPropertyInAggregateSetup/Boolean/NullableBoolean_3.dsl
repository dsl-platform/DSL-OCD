module CalculatedPropertyInAggregateSetup
{
  aggregate NullableBoolean_3 {
    Boolean? nullableBoolean;

    calculated Boolean? calculatedNullableBoolean from 'it => it.nullableBoolean';

    calculated Boolean? persistedNullableBoolean from 'it => it.nullableBoolean' { persisted; }
  }
}
