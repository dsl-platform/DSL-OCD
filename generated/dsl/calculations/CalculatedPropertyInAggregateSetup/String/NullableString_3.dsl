module CalculatedPropertyInAggregateSetup
{
  aggregate NullableString_3 {
    String? nullableString;

    calculated String? calculatedNullableString from 'it => it.nullableString';

    calculated String? persistedNullableString from 'it => it.nullableString' { persisted; }
  }
}
